public class ProductSelection implements  VendingMachine {
   
    @Override
    public void idlestate(Vedingcontext context) {
      
    }

    @Override
    public void selectProduct(Vedingcontext context) {
        System.out.println("select product");
    
        context.setstate(new Paymentselect());


    }

    @Override
    public void makepayment(Vedingcontext context) {
    }

    @Override
    public void dispensory(Vedingcontext context) {
    }

    
}
