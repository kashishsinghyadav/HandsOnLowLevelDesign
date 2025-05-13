public class Seat {
    private int seatId;
    private String seatType;
    private int totalSeat;
    public Seat(int seatId,String seatType , int totalSeat){
        this.seatId=seatId;
        this.seatType=seatType;
        this.totalSeat=totalSeat;

    }
    public int getseatId(){
        return this.seatId;
    }
    public String getSeatType(){
        return this.seatType;
    }

    public int getSeat(){
        return this.totalSeat;
    }
    
}
