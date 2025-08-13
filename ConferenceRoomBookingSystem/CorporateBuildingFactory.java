
public  class CorporateBuildingFactory implements BuildingFactory{

    @Override
    public Building createBuilding(String buildingName) {
        return new EquelusTower( buildingName);
    }
    @Override
    public Floor createFloor(int floornumber){
        return new EquelusttowerFloor1(floornumber);

    }
    @Override
    public Room createRoom(String roomName,int roomCapacity){
        return new Equelusroom1(roomName,roomCapacity);
    }

}
