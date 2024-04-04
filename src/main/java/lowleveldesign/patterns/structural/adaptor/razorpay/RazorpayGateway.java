package lowleveldesign.patterns.structural.adaptor.razorpay;

// Assume this is Razorpay's codebase
public class RazorpayGateway {
    public String payByCreditCard(String creditCard, String CVV, String expiry) {
        System.out.println("Payment Done by Razorpay");
        return "123";
    }
    public boolean checkPaymentStatus(String transactionId) {
        return false;
    }
}
