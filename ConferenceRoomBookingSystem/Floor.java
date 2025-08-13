import java.util.List;

public interface Floor {


    void addRoom(Room room);
    List<Room> getRooms();
    int getFloorNumber();

}
