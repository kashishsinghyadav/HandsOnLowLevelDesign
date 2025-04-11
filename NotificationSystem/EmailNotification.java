public class EmailNotification implements INotification{

    @Override
    public void notify(String message){
        System.out.println("Sending EMAIL: " + message);


    }

}
