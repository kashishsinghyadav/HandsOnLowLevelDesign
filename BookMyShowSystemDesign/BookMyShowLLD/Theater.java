import java.util.ArrayList;
import java.util.List;

public class Theater {
    private String theaterName; 
    private List<Seat> thList;  

    // Constructor
    public Theater(String theaterName) {
        this.theaterName = theaterName;
        this.thList = new ArrayList<>(); 
    }

    // Getter method for theater name
    public String getTheaterName() {
        return this.theaterName;
    }

    // Method to add a seat to the list
    public void addSeat(Seat seatInfo) {
        thList.add(seatInfo);
    }
}
