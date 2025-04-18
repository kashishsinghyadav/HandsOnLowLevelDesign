public class Ratecontext {
    private RatelimiterStrategy rate;

    public Ratecontext(RatelimiterStrategy rate) {
        this.rate = rate;
    }
    public void setRate(RatelimiterStrategy rate){
        this.rate=rate;
    }
    public void handleRequest(String userId) {
        rate.processRequest(userId);
        
    }
    
}
