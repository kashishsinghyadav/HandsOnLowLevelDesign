public class QrBased implements  Payment {
    @Override
    public void pay(int amount) {
        System.out.print("Thankyou for making Payment" + amount);
    }
    
}
