public class Car extends  Vehicle{
    
    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.CAR);
        System.out.println("car object created");
    }
    
}
