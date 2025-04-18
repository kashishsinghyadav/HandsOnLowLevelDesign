import java.util.HashMap;
import java.util.Map;

public class LeakyBucket implements  RatelimiterStrategy{
    
     private final int capacity;
     private final Long leakrate;
    private final Map<String, Long> lastLeakTime = new HashMap<>();
    private final Map<String, Integer> bucket = new HashMap<>();

    public LeakyBucket(int capacity,long leakrate) {
        this.capacity = capacity;
        this.leakrate = leakrate;
    }

    
    @Override
    public void processRequest(String userid) {
        long currenttime=System.currentTimeMillis();
        lastLeakTime.putIfAbsent(userid, currenttime);
        bucket.putIfAbsent(userid, 0);

        long lastLeak = lastLeakTime.get(userid);
        long timeElapsed = currenttime - lastLeak;
        int leaked = (int)(timeElapsed / leakrate);
        if (leaked > 0) {
            int current = Math.max(0, bucket.get(userid) - leaked);
            bucket.put(userid, current);
            lastLeakTime.put(userid, currenttime);

        }
        if (bucket.get(userid) < capacity) {
            bucket.put(userid, bucket.get(userid) + 1);
            System.out.println("processsed...............");
        }
        
        System.out.println("overflowwww wait for some time to process again!");





        
    }
    
}
