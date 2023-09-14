package CreationalDesignPatterns.FactoryMethod;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sms notification send to user");
    }
}
