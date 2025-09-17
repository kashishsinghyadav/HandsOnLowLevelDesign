 import java.util.UUID;

class IdFactory { 
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
