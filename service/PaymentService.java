package service;

import model.Booking;


//Handles, processes, and confirms the payment for the booking.
public class PaymentService {
    public void processPayment(Booking booking) {
        System.out.println("Processing the payment for booking:" + booking);
        System.out.println("Payment processed successfully for the booking of :" + booking.getStudent().getName());
    }
}
