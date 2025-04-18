public class Dispensory implements  VendingMachine{
    @Override
    public void idlestate(Vedingcontext context) {
    }

    @Override
    public void selectProduct(Vedingcontext context) { }

   
    @Override
    public void makepayment(Vedingcontext context) {  }

 
    @Override
    public void dispensory(Vedingcontext context) {
        System.out.println("Product is despeneeeee");
        context.setstate(new IdleState());
     }
}
