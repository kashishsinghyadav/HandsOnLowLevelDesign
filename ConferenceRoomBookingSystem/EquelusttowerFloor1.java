import java.util.ArrayList;
import java.util.List;

public  class EquelusttowerFloor1 implements Floor{
    List<Room> roomList;
    public  int floorNumber;
    public EquelusttowerFloor1(int floorNumber){
        roomList = new ArrayList<>();
        this.floorNumber = floorNumber;
    }
    @Override
    public int getFloorNumber() {
        return this.floorNumber;
    }
    @Override
    public void addRoom(Room room) {
        roomList.add(room);

    }
    @Override
    public List<Room> getRooms() {
        return roomList;
    }


}
