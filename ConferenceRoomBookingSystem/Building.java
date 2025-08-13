import java.util.List;

public interface Building {
     String getBuildingName();
     void addFloortoBuilding(Floor floor);
     List<Floor> getFloors();
}
