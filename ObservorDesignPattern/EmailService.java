package FairWork.ObservorDesignPattern;

public class EmailService implements CreateOrderObservor {
    EmailService(){
        // this instance will be received via web services
        Amazon amazon = Amazon.getInstance();
        amazon.register(this);
    }

    @Override
    public void orderCreated(OrderDetails od) {
        System.out.println("Order created, sending emails");
    }
}
