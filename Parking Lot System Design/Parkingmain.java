public class Parkingmain {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot lot = ParkingLot.getInstance();

        ParkingFloor floor1 = new ParkingFloor(1);
        floor1.addSpot(new CompactSpot("C1"));
        floor1.addSpot(new LargeSpot("L1"));
        floor1.addSpot(new BikeSpot("B1"));
        lot.addFloor(floor1);

        Vehicle bike = VehicleFactory.creatVehicle("BIKE","KA-01-1234");
        Ticket ticket=null;

        try {
            ticket = lot.parkVehicle(bike);
            System.out.println("Vehicle parked at spot: " + ticket.getSpot().getId());
        } catch (RuntimeException e) {
            System.out.println("Parking failed: " + e.getMessage());
        }

        if (ticket != null) {
            Thread.sleep(2000); // Sleep for 2 seconds to simulate duration

            FareCalculation calc = new BikeFareCalculation(); // Fixed
            PaymentStrategy payment = new CashPayment();
            lot.unparkVehicle(ticket, calc, payment);
        }
    }
}
