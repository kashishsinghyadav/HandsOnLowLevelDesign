import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String theaterName; 
    private List<Seat> seats;  

    public Theater(String theaterName) {
        this.theaterName = theaterName;
        this.seats = new ArrayList<>(); 
    }

    public String getTheaterName() {
        return this.theaterName;
    }

    // Method to add a seat to the list
    public void addSeat(Seat seatInfo) {
        seats.add(seatInfo);
    }

    public List<Seat> getSeats() {
        return seats;
    }

}

