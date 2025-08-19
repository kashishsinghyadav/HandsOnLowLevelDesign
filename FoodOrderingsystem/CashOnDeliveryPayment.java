class CashOnDeliveryPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Cash on Delivery chosen. Amount to pay: ₹" + amount);
    }
}
