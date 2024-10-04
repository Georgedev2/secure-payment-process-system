package payment;

public class MockPaymentGateway {
    public String processTransaction(PaymentRequest request) {
        // Simulating payment logic for various financial products like credit card, bank transfer and digital wallet
        if ("credit_card".equals(request.getPaymentMethod())) {
            return "Credit Card Payment of " + request.getCurrency() + request.getAmount()  + " processed successfully!";
        }

        if ("bank_transfer".equals(request.getPaymentMethod())) {
            return "Bank transfer Payment of " + request.getCurrency() + request.getAmount()  + " processed successfully!";
        }
        if ("digital_wallet".equals(request.getPaymentMethod())) {
            return "Digital wallet Payment of " + request.getCurrency() + request.getAmount()  + " processed successfully!";
        }
        return "Payment method not supported.";
    }
}
