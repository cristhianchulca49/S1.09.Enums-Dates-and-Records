package Level1.E4;

public enum PaymentMethod {
    CREDIT_CARD, PAYPAL, CASH, BANK_TRANSFER;

    public static PaymentMethod validatePaymentMethod(String paymentMethod) {
        try {
            return PaymentMethod.valueOf(paymentMethod.toUpperCase().replace(" ", "_"));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid PaymentMethod");
        }
    }
}
