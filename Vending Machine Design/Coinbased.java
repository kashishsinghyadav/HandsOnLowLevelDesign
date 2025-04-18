public class Coinbased implements  PaymentStrategy{

    @Override
    public void pay(double amount){
        System.out.println("Coin based payment of " + amount + " cents");
    }
    
}
