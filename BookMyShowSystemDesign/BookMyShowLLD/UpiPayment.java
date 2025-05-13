public class UpiPayment implements  Payment{

    @Override
    public void pay(int amount) {
        System.out.print("Thankyou for making Payment" + amount);
    }

    
}
