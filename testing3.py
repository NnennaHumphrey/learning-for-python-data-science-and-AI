import pytest

class Product:
    def __init__(self, name, price, quantity=1):
        self.name = name
        self.price = price
        self.quantity = quantity

class Cart:
    def __init__(self):
        self.items = []

    def add_to_cart(self, product):
        self.items.append(product)

    def calculate_total_price(self, tax_rate=0.0, shipping_fee=0.0):
        subtotal = sum(item.price * item.quantity for item in self.items)
        tax = subtotal * tax_rate
        total = subtotal + shipping_fee + tax
        return total

    def apply_discount(self, discount_percentage):
        for item in self.items:
            item.price *= (1 + discount_percentage)

    def checkout(self, payment_gateway):
        total_price = self.calculate_total_price()

        # In a real application, you'd interact with the payment_gateway
        if payment_gateway.process_payment(total_price):

            #Place the order(logic not shown here
            return True
        else:
            return False


class TestProductFunctions:
    def test_add_to_cart_successful(self):
        cart = Cart()
        product = Product("Widget", 100)
        cart.add_to_cart(product)
        assert len(cart.items) == 1
        assert cart.items[0] == product

    def test_calculate_total_price_accuracy(self):
        cart = Cart()
        cart.add_to_cart(Product("Widget A", 100.0))
        cart.add_to_cart(Product("Widget B", 90.0, 2))
        total_price = cart.calculate_total_price(tax_rate=0.07, shipping_fee=5.0)
        expected_total_price = (100.0 + 90.0 * 2) * 1.07 + 5
        assert total_price == expected_total_price

    def test_apply_discount_successful(self):
        cart = Cart()
        cart.add_to_cart(Product("Discounted Item", 50.0))
        cart.apply_discount(20)
        assert cart.items[0].price == 40

    def test_checkout_successful_payment(self, mocker):

        # Mocking a payment gateway (would be a real integration in a production app)
        mock_payment_gateway = mocker.Mock()
        mock_payment_gateway.process_payment.return_value = True

        cart = Cart()
        cart.add_to_cart(Product("Widget C", 100.0))
        result = cart.checkout(mock_payment_gateway)
        assert result is True # Checkout should be successful