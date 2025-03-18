import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

Room room = new Room(7,5);
Room room1 = new Room(8, 3);
Room room2 = new Room(3, 4);

ArrayList<Room> rooms = new ArrayList<>();
rooms.add(room);
rooms.add(room1);
rooms.add(room2);

Building building = new Building(rooms, 2);

System.out.println("Total lamps in the building " + countLampsInBuilding(building));
System.out.println("Total windows in the building " + countWindowsInBuilding(building));
System.out.println("Total rooms in the building " + countRoomsInBuilding(building));
System.out.println("Is the building okay? " + isOkay(building));
    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    public static boolean isOkay(Building building) {
        return building.getNumberOfFloors() <= building.getRooms().size();
    }
}