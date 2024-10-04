package payment;

public class PaymentRequest {
    private String paymentMethod; // e.g.,payment method could either be: "credit_card", "bank_transfer", "digital_wallet"
    private double amount;
    private String currency;
    private String cardNumber; // Sensitive data

    public PaymentRequest(String paymentMethod, double amount, String currency, String cardNumber) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.currency = currency;
        this.cardNumber = cardNumber; // for real world use case, this should be tokenized
    }

    // Getters
    public String getPaymentMethod() { return paymentMethod; }
    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
    public String getCardNumber() { return cardNumber; }
}
