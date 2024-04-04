package lowleveldesign.patterns.structural.adaptor.payu;

// assume this is PayU's interface
public class PayUPaymentGateway {
    public String makeCCPayment(Long creditCard,
                                Long CV,
                                Long expiry) {
        System.out.println("Payment Done by Razorpay");
        return "123";
    }

    public PayUPaymentStatus checkPaymentStatus(String id) {
        return PayUPaymentStatus.FAILED;
    }
}
