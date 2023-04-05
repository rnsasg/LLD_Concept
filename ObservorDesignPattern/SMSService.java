package FairWork.ObservorDesignPattern;

public class SMSService implements CreateOrderObservor {
    SMSService(){
        Amazon amazon = Amazon.getInstance();
        amazon.register(this);
    }

    @Override
    public void orderCreated(OrderDetails od) {
        System.out.println("Order created, sending messages");
    }


}
