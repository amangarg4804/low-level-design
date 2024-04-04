package lowleveldesign.patterns.structural.adaptor;

import lowleveldesign.patterns.structural.adaptor.razorpay.RazorpayGateway;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorPayPaymentGatewayAdaptor());
        flipkart.payViaCC("1234-3443-4343-8898", 123, 4, 2030 );
    }
}
