package FairWork.ObservorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static Amazon inst;
    public static Amazon getInstance(){
        if(inst == null){
            inst = new Amazon();
        }
        return inst;
    }

    List<CreateOrderObservor> list = new ArrayList<>();

    void register(CreateOrderObservor obs){
        list.add(obs);
    }

    void unregister(CreateOrderObservor obs){
        list.remove(obs);
    }

    void createOrder(){
        // work to create the order, which will create OrderDetails obj
        // A different object for different orders
        OrderDetails od = new OrderDetails(); // this object will be created according to the order

        for(CreateOrderObservor coo: list){
            coo.orderCreated(od);
        }
    }
}
