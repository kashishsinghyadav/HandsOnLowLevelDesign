

public class Ratelimitmain {
    public static void main(String[] args) throws InterruptedException {
       RatelimiterStrategy strategy = RatelimiterFactory.createratelimiter("leaky");
       Ratecontext context = new Ratecontext(strategy);
       for (int idx = 0; idx < 10; idx++) {
            context.handleRequest("1");
            Thread.sleep(100);
            
           
           
       }
       context.setRate(RatelimiterFactory.createratelimiter("token"));
       for (int idx = 0; idx < 10; idx++) {
        context.handleRequest("1");
        Thread.sleep(100);
        
       
       
   }

      
      
    }
}
