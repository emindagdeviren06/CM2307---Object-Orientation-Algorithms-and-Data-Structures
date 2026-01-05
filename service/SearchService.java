package service;

import java.util.ArrayList;
import java.util.List;
import model.Room;

public class SearchService {
    
    //As within the requirements, the rooms can be searched by the location and the maximum rental rate
    public List<Room> searchRooms(List<Room> rooms, String location, double maxRent) {
        List<Room> results = new ArrayList<>();
        for (Room room: rooms) {
            if (room.getLocation().equalsIgnoreCase(location) && room.getRent() <= maxRent) {
                results.add(room);
            }
        }
        return results;
    }

    //The method to display the search results
    public void displayRooms(List<Room> rooms) {
        for (Room room: rooms) {
            System.out.println(room);
        }
    }
}
