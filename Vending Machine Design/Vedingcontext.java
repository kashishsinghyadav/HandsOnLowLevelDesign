public class Vedingcontext {
    private VendingMachine state;
    private PaymentStrategy strategy;
    private Product selectedProduct;

    public Vedingcontext(){
        this.state= new IdleState();

        
    }
    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    public void setstate(VendingMachine state){
        this.state=state;
        
    }
    public void setPayment(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void pay(double amount){
        if (strategy!=null){
            strategy.pay(selectedProduct.getPrice());

        }
    }
    public void idlestate(){
        state.idlestate(this);
    }
    public void makepayment(){
        state.makepayment(this);
    }
    public void selectProduct(){
        state.selectProduct(this);
    }
    public void dispensory(){
        state.dispensory(this);
    }
}
