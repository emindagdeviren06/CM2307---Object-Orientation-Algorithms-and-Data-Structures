package app;

import model.*;
import service.*;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
    //Homeowner creation
    Homeowner homeowner = new Homeowner("H1", "Rex", "Rex@gmail.com");
    homeowner.login();

    //Room creation
    Room room1 = new Room("Cardiff", 20.0, "WiFi, Kitchen", 400.0);
    Room room2 = new Room("Cardiff", 15.0, "WiFi", 350.0);

    homeowner.addRoom(room1);
    homeowner.addRoom(room2);

    //Student creation
    Student student = new Student("S1", "Maria", "maria@gmail.com", 500.0);
    student.login();

    //Room searching 
    List<Room> allRooms = new ArrayList<>();
    allRooms.add(room1);
    allRooms.add(room2);

    SearchService searchService = new SearchService();
    List<Room> results = searchService.searchRooms(allRooms, "Cardiff", student.getBudget());



    System.out.println("Search Results:");
    searchService.displayRooms(results);





    //Booking creation
    BookingService bookingService = new BookingService();
    bookingService.createBooking(student, room1, "01-09-2025", "06-11-2025");



    //Payment processing test
    PaymentService paymentService = new PaymentService();
    paymentService.processPayment(bookingService.getBookings().get(0));

    }
}