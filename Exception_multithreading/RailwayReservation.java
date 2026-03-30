/*
# Exception Handling & Multithreading:

18. Railway Reservation System

Create a class Railway Reservation. Use synchronization to avoid double booking.

Output: 'Ticket booked successfully' or 'No tickets available'
 
*/

class Reservation {

    int seats = 1;

    synchronized void bookTicket(String name) {

        if (seats > 0) {
            System.out.println(name + " booked ticket successfully");
            seats--;
        } else {
            System.out.println("No tickets available");
        }
    }
}

class RailwayReservation {
    public static void main(String[] args) {

        Reservation r = new Reservation();

        Thread t1 = new Thread(() -> r.bookTicket("User1"));
        Thread t2 = new Thread(() -> r.bookTicket("User2"));

        t1.start();
        t2.start();
    }
}