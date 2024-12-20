package relationship;
/*
 * 
 * if there is home then it will have rooms 
 * and if there is a one room then also it will be considered as house
 * 
 * */
class House {
    String houseName;
    Room room;
}

class Room {
    String roomName;
}

public class Composition {
    public static void main(String[] args) {
        House house = new House();
        house.houseName = "Dream House";

        Room room = new Room();
        room.roomName = "Living Room";

        // Composition - The Room cannot exist without the House
        house.room = room;

        System.out.println("House: " + house.houseName + " has a room named " + house.room.roomName);
    }
}
