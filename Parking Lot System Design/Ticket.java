import java.util.Date;
import java.util.UUID;

public class Ticket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot spot;
    private final Date entryTime;
    private Date exitTime;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = new Date();
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public long getDurationInHours() {
        if (exitTime == null) return 0;
        long millis = exitTime.getTime() - entryTime.getTime();
        return Math.max(1, millis / (1000 * 60 * 60));
    }

    public Vehicle getVehicle() { return vehicle; }
    public ParkingSpot getSpot() { return spot; }
    public String getTicketId() { return ticketId; }

}
