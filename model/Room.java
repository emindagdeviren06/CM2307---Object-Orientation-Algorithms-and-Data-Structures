package model;

public class Room {
    private String location;
    private double size; //size will be in square meters
    private String amenities; //amenities such as wifi, the kitchen etc...
    private double rent;


public Room(String location, double size, String amenities, double rent) {
    this.location = location;
    this.size = size;
    this.amenities = amenities;
    this.rent = rent;
}

public String getLocation() {
    return location;
}

public double getSize() {
    return size;
}

public String getAmenities() {
    return amenities;
}

public double getRent() {
    return rent;
}


//description of the room and it's description
@Override
public String toString() {
    return "Room at " + location + "| Size:" + size + " sqm | Amenities:" + amenities + " | Rent:GBP " + rent;
}

}