public class User implements  Observer{
    private String name;
    private int id;
    public  User(String name,int id){
        this.id = id;
        this.name=name;
    }
    
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }

}
