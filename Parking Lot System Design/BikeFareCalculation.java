public class BikeFareCalculation implements FareCalculation{
    @Override
    public double calcuatefare(long duration){
        return 10.0*duration;
    }
    
}
