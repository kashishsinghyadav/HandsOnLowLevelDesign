public class NotificationMain{
    public static void main(String [] args){
        EmailNotification email = new EmailNotification();
        PushNotification pushnoti = new PushNotification();
        SmsNotification sms = new SmsNotification();
        NotificationContext context= new NotificationContext(List.of(email,pushnoti,sms))
        context.notify("Booking is confirmed");

    }
}
