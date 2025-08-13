public class TechBuildingFactory implements BuildingFactory{

    @Override
    public Building createBuilding(String buildingName) {
        return new TechPowerTower(buildingName);
    }

    @Override
    public Floor createFloor(int floorNumber) {
        return new Techpowerfloor(floorNumber);
    }

    @Override
    public Room createRoom(String roomName, int roomCapacity) {
        return new TechpowerRoom(roomName,roomCapacity);
    }
}

