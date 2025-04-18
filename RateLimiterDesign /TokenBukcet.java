import java.util.HashMap;
import java.util.Map;

public class TokenBukcet implements RatelimiterStrategy  {
    

    private final int capacity;
    private final int refillRate;
    private final long refillIntervalMillis;
    private final Map<String, Integer> tokens = new HashMap<>();
    private final Map<String, Long> lastRefillTime = new HashMap<>();

    public TokenBukcet(int capacity, long refillIntervalMillis, int refillRate) {
        this.capacity = capacity;
        this.refillIntervalMillis = refillIntervalMillis;
        this.refillRate = refillRate;
    }


    @Override
    public void processRequest(String userId) {

        long currentTime = System.currentTimeMillis();
        tokens.putIfAbsent(userId, capacity);
        lastRefillTime.putIfAbsent(userId, currentTime);

        long lastRefill = lastRefillTime.get(userId);
        long timeElapsed = currentTime - lastRefill;
        int refillTokens = (int)(timeElapsed / refillIntervalMillis) * refillRate;

        if (refillTokens > 0) {
            int newTokens = Math.min(capacity, tokens.get(userId) + refillTokens);
            tokens.put(userId, newTokens);
            lastRefillTime.put(userId, currentTime);
        }

        if (tokens.get(userId) > 0) {
            tokens.put(userId, tokens.get(userId) - 1);
            System.out.println("processsed...............");
        }
        System.out.println("overflowwww wait for some time to process again!");

    }

    }

