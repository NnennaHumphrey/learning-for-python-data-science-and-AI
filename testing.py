import pytest

class Calculator:
    def add(self, a, b):
        return a + b

    def subtract(self, a, b):
        return a - b

    def multiply(self, a, b):
        return a * b

    def divide(self, a, b):
        if b == 0:
            raise ZeroDivisionError
        return a / b

    def power(self, a, b):
        return a ** b


class CalculatorTest:
    @pytest.fixture
    def calculator(self):
        return Calculator()

    def test_add(self, calculator):
        result = calculator.add(1, 2)
        assert result == 3

    def test_subtract(self, calculator):
        result = calculator.subtract(1, 2)
        assert result == -1

    def test_multiply(self, calculator):
        result = calculator.multiply(1, 2)
        assert result == 3

    def test_divide(self, calculator):
        result = calculator.divide(1, 2)
        assert result == 0.5

    def test_divide_by_zero(self, calculator):
        with pytest.raises(ValueError):
            calculator.divide(1, 0)

    def test_power(self, calculator):
        result = calculator.power(1, 2)
        assert result == 2
        