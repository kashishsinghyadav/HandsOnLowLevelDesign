import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private  List<ParkingSpot> spots = new ArrayList<>();

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canFitVehicle(vehicle)) return spot;
        }
        return null;
    }

}
