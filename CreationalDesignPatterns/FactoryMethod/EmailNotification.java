package CreationalDesignPatterns.FactoryMethod;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Send a Email Notification to the User");
    }
}
