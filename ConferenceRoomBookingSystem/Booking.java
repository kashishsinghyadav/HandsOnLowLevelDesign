  

public class Booking {
    private final int starttime;
    private final int endtime;
    private final String buildingName;
    private final int floorNumber;
    private final String roomName;
    private final int roomCapacity;

    public Booking(int starttime, int endtime, String buildingName, int floorNumber, String roomName, int roomCapacity) {
        this.starttime = starttime;
        this.endtime = endtime;
        this.buildingName = buildingName;
        this.floorNumber = floorNumber;
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;
    }

    public int getStarttime() { return starttime; }
    public int getEndtime() { return endtime; }
    public String getBuildingName() { return buildingName; }
    public int getFloorNumber() { return floorNumber; }
    public String getRoomName() { return roomName; }
    public int getRoomCapacity() { return roomCapacity; }
}

