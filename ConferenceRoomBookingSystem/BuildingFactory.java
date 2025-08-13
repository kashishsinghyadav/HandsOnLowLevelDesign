public interface BuildingFactory {

    Building createBuilding(String buildingName);
    Floor createFloor(int floorNumber);
    Room createRoom(String roomName,int roomCapacity);

}
