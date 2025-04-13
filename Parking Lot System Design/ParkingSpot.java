public abstract class ParkingSpot {
    protected Vehicle vehicle;
    protected Spottype type;
    protected String id;
    protected boolean isAvailable;
 
    public ParkingSpot(String id, Spottype type) {
        this.id = id;
        this.type = type;
        this.isAvailable = true;
    }
    public boolean canFitVehicle(Vehicle vehicle) {
        return this.isAvailable && this.type.canFit(vehicle.getVehicletype());
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getId() {
        return id;
    }


}
