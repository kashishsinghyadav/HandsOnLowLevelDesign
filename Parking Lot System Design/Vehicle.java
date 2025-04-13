public abstract class Vehicle {
    protected  VehicleType vehicletype;
    protected  String vehicleNumber;

    public Vehicle(String vehicleNumber, VehicleType vehicletype) {
        this.vehicleNumber = vehicleNumber;
        this.vehicletype = vehicletype;
    }

    public VehicleType getVehicletype() {
        return vehicletype;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

}
