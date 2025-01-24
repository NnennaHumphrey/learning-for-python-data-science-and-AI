package com.screen_hub.constant;

import lombok.Data;

@Data
public class PaymentConstants {
    // Payment related messages
    public static final String PAYMENT_SUCCESS = "Payment processed successfully.";
    public static final String PAYMENT_FAILED = "Payment failed. Please try again.";
    public static final String PAYMENT_CANCELED = "Payment canceled.";

    // Payment methods
    public static final String CREDIT_CARD = "Credit Card";
    public static final String WALLET = "Wallet";
    public static final String PAYPAL = "PayPal";
    public static final String BANK_TRANSFER = "Bank Transfer";
}
