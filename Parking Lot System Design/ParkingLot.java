import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private List<ParkingFloor> floors = new ArrayList<>();

    private ParkingLot() {}

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.getAvailableSpot(vehicle);
            if (spot != null) {
                spot.assignVehicle(vehicle);
                return new Ticket(vehicle, spot);
            }
        }
        throw new RuntimeException("No available spot for vehicle type: " + vehicle.getVehicletype());
        
    }

    public void unparkVehicle(Ticket ticket, FareCalculation calc, PaymentStrategy payment) {
        ticket.setExitTime(new Date());
        double fare = calc.calcuatefare(ticket.getDurationInHours());
        payment.pay(fare);
        ticket.getSpot().removeVehicle();
        System.out.println("Unparked vehicle: " + ticket.getVehicle().getVehicleNumber());
    }

}
