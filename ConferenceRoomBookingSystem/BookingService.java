import java.util.ArrayList;
import java.util.List;

public class BookingService { 

    private List<Booking> bookingList = new ArrayList<>();

    private boolean checkOverlap(int start1, int end1, int start2, int end2) {
        return start1 < end2 && start2 < end1;
    }

    public void bookRoom(Building building, Floor floor, Room room, int startTime, int endTime, int capacity) {

        for (Booking booking : bookingList) {
            if (booking.getRoomName().equals(room.getRoomName()) &&
                    booking.getBuildingName().equals(building.getBuildingName()) &&
                    booking.getFloorNumber() == floor.getFloorNumber()) {

                if (checkOverlap(booking.getStarttime(), booking.getEndtime(), startTime, endTime)) {
                    System.out.println("Room is already booked for this time slot");
                    return;
                }
                if (booking.getRoomCapacity() < capacity) {
                    System.out.println("Room does not have enough capacity");
                    return;
                }
            }
        }

        if (room.getRoomStatus() == Roomstatus.BOOKED) {
            System.out.println("Room is already booked");
            return;
        }

        Booking booking = new Booking(startTime, endTime, building.getBuildingName(), floor.getFloorNumber(), room.getRoomName(), capacity);
        bookingList.add(booking);
        room.setRoomStatus(Roomstatus.BOOKED);
        System.out.println("Room booked successfully");
    }
}
