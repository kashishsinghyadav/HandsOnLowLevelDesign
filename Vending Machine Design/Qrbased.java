public class Qrbased implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Qr based payment of " + amount + " cents");

    }
    
}
