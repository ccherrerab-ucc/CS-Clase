package Factory_Method;

public class EmailNotificationCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
