public class TruckFareCalculation implements  FareCalculation{

    @Override
    public double calcuatefare(long duration) {
        return 30.0*duration;
    }

    
}
