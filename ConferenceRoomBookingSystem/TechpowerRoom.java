public class TechpowerRoom implements Room{
    public String roomName;
    public int roomCapacity;
    public Roomstatus roomstatus;
    public TechpowerRoom(String roomName,int roomCapacity){
        this.roomCapacity = roomCapacity;
        this.roomName = roomName;
        this.roomstatus = Roomstatus.FREE;


    }

    @Override
    public String getRoomName() {
        return  this.roomName;
    }
    @Override
    public int roomCapacity() {
        return this.roomCapacity;
    }
    @Override
    public void setRoomStatus(Roomstatus roomstatus) {
        this.roomstatus = roomstatus;
    }
    @Override
    public Roomstatus  getRoomStatus(){
        return this.roomstatus;

    }
}
