package Factory_Method;
 //concrete
public class SMSNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
