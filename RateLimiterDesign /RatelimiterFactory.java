public class RatelimiterFactory {
    public static RatelimiterStrategy createratelimiter(String type){
        switch (type) {
            case "leaky":
                return new LeakyBucket(5,1000);
            case "token":
                return new TokenBukcet(5, 1,1000);
            default:
                return  null;
        }

    }
}
