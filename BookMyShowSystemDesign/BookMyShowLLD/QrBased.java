public class QrBased implements  Payment {
    @Override
    public void pay(double amount) {
        System.out.print("Thankyou for making Payment" + amount);
    }
    
}
