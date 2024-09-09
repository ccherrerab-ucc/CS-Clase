package Factory_Method;

public class NotificationService {

    private NotificationCreator creator;

    public NotificationService(NotificationCreator creator) {
        this.creator = creator;
    }

    public void sendNotification(String message) {
        Notification notification = creator.createNotification();
        notification.send(message);
    }

    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        NotificationService emailService = new NotificationService(emailCreator);
        emailService.sendNotification("Hello via Email!");

        NotificationCreator smsCreator = new SMSNotificationCreator();
        NotificationService smsService = new NotificationService(smsCreator);
        smsService.sendNotification("Hello via SMS!");
    }
}