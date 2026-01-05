package service;

import java.util.ArrayList;
import java.util.List;
import model.Booking;
import model.Room;
import model.Student;

public class BookingService {
    private List<Booking> bookings;

    public BookingService() {
        bookings = new ArrayList<>();
    }

    //Creating a new booking using the system
    public void createBooking(Student student, Room room, String startDate, String endDate) {
        Booking booking = new Booking(student, room, startDate, endDate);
        bookings.add(booking);
        System.out.println("Booking made:" + booking);
    }


    //Confirming a booking for the user
    public void confirmBooking(Booking booking) {
        booking.confirmBooking();
        System.out.println("Booking is confirmed:" + booking);
    }





    public void listBookings() {
        System.out.println("All bookings:");
        for (Booking b : bookings) {
            System.out.println(b);
        }
    }


    
}
