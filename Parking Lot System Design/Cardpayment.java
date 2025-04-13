public class Cardpayment implements  PaymentStrategy{
    private String cardNumber;

    public Cardpayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card ending with: " + cardNumber.substring(cardNumber.length() - 4));

    }

    
}
