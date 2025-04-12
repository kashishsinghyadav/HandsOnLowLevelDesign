public class VehicleFactory {
    public static Vehicle creatVehicle(String veh){
        if(veh.equals("car")){
            return new Car("548651");
    }
    else if(veh.equals("bike")){
        return new Bike("74251");
    }
    else if(veh.equals("truck")){
        return new Truck("14651");
    }
    else{
        return null;
    }


    }
}
