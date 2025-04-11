public class NotificationContext implements INotification{
    private INotification inotification;
    public NotificationContext(List<INotification> notifications) {
        this.notifications = notifications;
    }

    public void notify(String message){
         for ( INotification notification : notifications) {
            notification.send(message);
        }
    }
}
