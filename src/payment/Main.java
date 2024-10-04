package payment;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Create a payment request
        String cardNumber = "4789016568";
        PaymentRequest request = new PaymentRequest("credit_card", 200.00, "N",
                SecurityUtils.tokenize(cardNumber));

        // Process the payment
        String response = paymentService.processPayment(request);
        System.out.println(response);
    }
}
