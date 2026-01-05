package model;

public class Booking {
    private Student student;
    private Room room;

    //The date duration for the booking period
    private String startDate;
    private String endDate;

    //Checks if the booking is confirmed or not
    private boolean confirmed;

    public Booking(Student student, Room room, String startDate, String endDate) {
        this.student = student;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.confirmed = false;
    }

    public Student getStudent() {
        return student;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    //confirms that the booking is successful
    public void confirmBooking() {
        this.confirmed = true;
    }


    @Override
    public String toString() {
        return "Booking:" + student.getName() + "booked" + room.getLocation() + "from" + startDate + "till" + endDate + "| Confirmed:" + confirmed; 
    }
}
