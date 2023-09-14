package CreationalDesignPatterns.FactoryMethod;

public class NotificationService {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationFactory.sendNotification("SMS").notifyUser();
        notificationFactory.sendNotification("EMAIL").notifyUser();
        notificationFactory.sendNotification("PUSH").notifyUser();
    }

}
