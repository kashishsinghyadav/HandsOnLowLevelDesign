public class SmsNotification implements INotification{

     @Override
    public void notify(String message){
        System.out.println("Sending Sms: " + message);


    }
}
