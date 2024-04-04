package lowleveldesign.patterns.structural.adaptor;

public interface PaymentGateway {
    Long payViaCC(String creditCardNo, int cvv, int expiryMonth, int expiryYear);
    PaymentStatus getStatus(Long transactionId);
}
