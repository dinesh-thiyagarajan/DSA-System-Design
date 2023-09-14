package CreationalDesignPatterns.FactoryMethod;

public class NotificationFactory {
    public Notification sendNotification(String type) {
        switch (type) {
            case "SMS":
                return new SmsNotification();
            case "PUSH":
                return new PushNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                return new PushNotification();
        }
    }
}
