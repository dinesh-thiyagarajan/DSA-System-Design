package CreationalDesignPatterns.FactoryMethod;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Send a Push Notification to the User");
    }
}
