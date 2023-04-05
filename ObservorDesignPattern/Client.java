package FairWork.ObservorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        amazon.createOrder();

        // will be in the main of email service
        EmailService es = new EmailService();
        // will be in the main of email service

        amazon.createOrder();

        // will be in the main of sms service
        SMSService ss = new SMSService();


        amazon.createOrder();

        // Code to be invoked when sms service goes down, will be invoked by heart-beat health check module
        amazon.unregister(ss);

        // Will notify only email service
        amazon.createOrder();
    }
}
