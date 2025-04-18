public class IdleState implements  VendingMachine{

    @Override
    public void idlestate(Vedingcontext context) {
        System.out.println("Idle state");
        context.setstate(new ProductSelection());
    }

    @Override
    public void selectProduct(Vedingcontext context) { }

   
   
    @Override
    public void makepayment(Vedingcontext context) {  }

    @Override
    public void dispensory(Vedingcontext context) { }
    
}
