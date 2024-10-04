package payment;

public class PaymentService {
    private MockPaymentGateway paymentGateway;

    public PaymentService() {
        this.paymentGateway = new MockPaymentGateway();
    }

    public String processPayment(PaymentRequest request) {
        if (validateRequest(request)) {
            return paymentGateway.processTransaction(request);
        } else {
            return "Invalid Payment Request";
        }
    }

    private boolean validateRequest(PaymentRequest request) {
        // Basic validation (e.g., non-null fields, amounts > 0)
        return request != null && request.getAmount() > 0 && request.getPaymentMethod() != null;
    }
}
