public class Paymentselect implements VendingMachine{

    @Override
    public void idlestate(Vedingcontext context) {
       context.setstate(new IdleState());
    }

    @Override
    public void selectProduct(Vedingcontext context) { 
    }

    @Override
    public void makepayment(Vedingcontext context) {
        System.out.println("payment ...............");
        context.pay(50);
        
        context.setstate(new Dispensory() );
    }

   
    @Override
    public void dispensory(Vedingcontext context) {
    }

    
}
