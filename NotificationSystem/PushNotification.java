public class PushNotification implements INotification{

    @Override
    public void notify(String message){
        System.out.println("Sending Pushnotification: " + message);


    }
}
