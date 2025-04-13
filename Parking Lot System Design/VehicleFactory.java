public class VehicleFactory {
    public static Vehicle creatVehicle(String type,String veh){
        return switch (type.toUpperCase()) {
            case "CAR" -> new Car(veh);
            case "BIKE" -> new Bike(veh);
            case "TRUCK" -> new Truck(veh);
            default -> null;
        };


    }
}
