package Factory_Method;
//concrete
public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
