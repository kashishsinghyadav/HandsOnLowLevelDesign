public class CarFareCalculation implements FareCalculation{
    


    @Override
    public double calcuatefare(long duration) {
        return 20.0*duration;
    }
}

