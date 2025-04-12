public class Car extends  Vehicle{
    
    public Car(String vehicleNumber) {
        super(vehicleNumber, VehicleType.car);
        System.out.println("car object created");
    }
    
}
