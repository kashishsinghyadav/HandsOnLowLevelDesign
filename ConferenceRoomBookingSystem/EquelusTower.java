import java.util.ArrayList;
import java.util.List;
public class EquelusTower implements Building{
    public  List<Floor> floors;
    public  String buildingName;

    public EquelusTower(String buildingName){
        this.buildingName = buildingName;
        floors = new ArrayList<>();

    }
    @Override
    public String getBuildingName() {
        return this.buildingName;
    }
    @Override
    public void addFloortoBuilding(Floor floor) {
        floors.add(floor);
    }
    @Override
    public List<Floor> getFloors() {
        return floors;
    }

}
