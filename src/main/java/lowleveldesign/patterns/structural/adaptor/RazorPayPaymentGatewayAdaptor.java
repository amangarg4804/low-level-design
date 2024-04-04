package lowleveldesign.patterns.structural.adaptor;

import lowleveldesign.patterns.structural.adaptor.razorpay.RazorpayGateway;

public class RazorPayPaymentGatewayAdaptor implements PaymentGateway{
    RazorpayGateway razorpayGateway = new RazorpayGateway();
    @Override
    public Long payViaCC(String creditCardNo, int cvv, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(cvv);
        String expiry = expiryMonth + "/" + expiryYear;
        String transactionId = razorpayGateway.payByCreditCard(creditCardNo,String.valueOf(cvv), expiry);
        return Long.parseLong(transactionId);
    }

    @Override
    public PaymentStatus getStatus(Long transactionId) {
        return razorpayGateway.checkPaymentStatus(String.valueOf(transactionId))? PaymentStatus.SUCCCES : PaymentStatus.FAILED;
    }
}
