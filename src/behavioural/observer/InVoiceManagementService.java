package behavioural.observer;

public class InVoiceManagementService implements Subsriber<Order>{
    public InVoiceManagementService() {
        Flipkart.registerSubscriber(Events.ORDER_PLACED,this);
    }

    @Override
    public void listen(Order order) {
        generateInvoice(order);
    }

    public void generateInvoice(Order order){
        System.out.println("Generating invoice for order ");
    }
}
