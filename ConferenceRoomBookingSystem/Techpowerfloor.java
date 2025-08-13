import java.util.ArrayList;
import java.util.List;

public class Techpowerfloor implements Floor{
    public  int floorNumber;
    List<Room> roomList;
    public Techpowerfloor(int floorNumber) {
        this.floorNumber = floorNumber;
        roomList = new ArrayList<>();
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
