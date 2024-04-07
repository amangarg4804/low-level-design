package lowleveldesign.patterns.behavioral.observer;

public class InvoiceManagementService implements Observer{

//    private final Flipkart flipkart;
    // When will an observer register itself with the class from which it is interested in events, in this case, Flipkart?
    // First of all this class requires an instance of Flipkart
    // but we could also make the register method static

    InvoiceManagementService(Flipkart flipkart) {
       Flipkart.register(Event.ORDER_PLACED, this);
    }
    @Override
    public void listen(Event event, Order order) {
        if(event ==Event.ORDER_PLACED) {
            generateInvoice(order);
        }
    }

    public void generateInvoice(Order order) {
        System.out.println("Generating invoice for Order");
    }


}
