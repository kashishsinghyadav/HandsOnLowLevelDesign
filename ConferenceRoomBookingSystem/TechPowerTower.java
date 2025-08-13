import java.util.ArrayList;
import java.util.List;

public class TechPowerTower implements Building{
    public String buildingName;
    List<Floor> floorList;
    public TechPowerTower(String buildingName){
        this.buildingName=buildingName;
        floorList = new ArrayList<>();
    }
    @Override
    public String getBuildingName() {
        return this.buildingName;
    }

    @Override
    public void addFloortoBuilding(Floor floor){
        floorList.add(floor);
    }
    @Override
    public List<Floor> getFloors() {
        return floorList;
    }

}
