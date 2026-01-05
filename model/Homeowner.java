package model;

import java.util.ArrayList;
import java.util.List;

public class Homeowner extends User {
//Rooms listed by the homeowner
    private List<Room> rooms;

    public Homeowner(String userId, String name, String email) {
        super(userId, name, email);
        this.rooms = new ArrayList<>();
    }


    @Override
    public void login() {
        System.out.println("Homeowner" + getName() + " has logged in");
    }

    //Homeowner lists a room 
    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room has been added by " + getName());
    }

    //Homeowner is able to see the rooms listed
    public void viewRooms() {
        System.out.println("Rooms that are listed by" + getName() + ":");
        for (Room room: rooms) {
            System.out.println(room);
        }
    }

    //returns the rooms
    public List<Room> getRooms() {
        return rooms;
    }
}
