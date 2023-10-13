public class Main {
    public static void main(String[] args) {
        Notification EmailNotification =new EmailNotification();
        Notification smsNotification =new SMSNotification();

        Notification mesNotification =new MessengerNotification();

        sendNotification(EmailNotification);
        sendNotification(smsNotification);


        sendNotification(mesNotification);


    }
    private static void sendNotification(Notification notification) {

        notification.send();
    }
}