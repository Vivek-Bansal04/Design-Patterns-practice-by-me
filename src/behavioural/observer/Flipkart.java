package behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Flipkart {
    private static Map<Events, List<Subsriber>> subsribers;

    public static void registerSubscriber(Events event, Subsriber subsriber){
        if(!subsribers.containsKey(event)){
            subsribers.put(event,new ArrayList<>());
        }
        subsribers.get(event).add(subsriber);
    }

    public static void unRegister(Events event, Subsriber subsriber){
        subsribers.get(event).remove(subsriber);
    }

    public void notify(Events events,Order order){
        for (Subsriber subsriber:subsribers.get(events)){
            subsriber.listen(order);
        }
    }
    public void placeOrder(Order order){
        notify(Events.ORDER_PLACED,order);
    }
}
