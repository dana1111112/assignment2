public class SMSNotification implements Notification {
    private Notification notification;
    public SMSNotification(){

    }
    public SMSNotification(Notification notification) {
        this.notification=notification;

    }

    @Override
    public void send() {
        if (notification != null)notification.send();
        System.out.println("With SMS");

    }
}
