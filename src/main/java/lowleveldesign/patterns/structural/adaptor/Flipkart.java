package lowleveldesign.patterns.structural.adaptor;

public class Flipkart {
    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void payViaCC(String creditCardNo, int cvv, int expiryMonth, int expiryYear) {
        Long transactionId = paymentGateway.payViaCC(creditCardNo, cvv, expiryMonth, expiryYear);
        while (!PaymentStatus.SUCCCES.equals(paymentGateway.getStatus(transactionId))) {
            System.out.println("waiting");
        }
    }
}
