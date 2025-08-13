import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CorporateBuildingFactory corporateBuildingFactory = new CorporateBuildingFactory();
        Building equelusTower = setupBuilding(corporateBuildingFactory, "Equelustower");

        TechBuildingFactory techBuildingFactory = new TechBuildingFactory();
        Building techTower = setupBuilding(techBuildingFactory, "Techtower");

        BookingService bookingService = new BookingService();

        // Example booking
        bookingService.bookRoom(equelusTower,
                equelusTower.getFloors().get(0),
                equelusTower.getFloors().get(0).getRooms().get(0),
                9, 11, 8);

        // Overlapping booking test
        bookingService.bookRoom(equelusTower,
                equelusTower.getFloors().get(0),
                equelusTower.getFloors().get(0).getRooms().get(0),
                10, 12, 8);
    }

    private static Building setupBuilding(BuildingFactory factory, String towerName) {

        Building building = factory.createBuilding(towerName);

        Floor floor1 = factory.createFloor(1);
        Floor floor2 = factory.createFloor(2);
        Floor floor3 = factory.createFloor(3);

        Room room1 = factory.createRoom("Room1", 10);
        Room room2 = factory.createRoom("Room2", 10);
        Room room3 = factory.createRoom("Room3", 10);
        Room room4 = factory.createRoom("Room4", 10);

        System.out.println("Building Name: " + building.getBuildingName());

        building.addFloortoBuilding(floor1);
        building.addFloortoBuilding(floor2);
        building.addFloortoBuilding(floor3);

        floor1.addRoom(room1);
        floor1.addRoom(room2);
        floor2.addRoom(room3);
        floor2.addRoom(room4);

        System.out.println("Building is setup");
        System.out.println("Floor 1 has " + floor1.getRooms().size() + " rooms");
        System.out.println("Floor 2 has " + floor2.getRooms().size() + " rooms");
        System.out.println("Floor 3 has " + floor3.getRooms().size() + " rooms");

        return building;
    }
}
