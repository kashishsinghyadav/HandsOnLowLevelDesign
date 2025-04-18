public interface RatelimiterStrategy {

    void processRequest(String userid);
    
}
