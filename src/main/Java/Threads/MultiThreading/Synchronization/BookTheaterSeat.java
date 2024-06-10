package Threads.MultiThreading.Synchronization;

public class BookTheaterSeat {
    int total_seats = 10;
    void bookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println("Seats booked successfully");
            total_seats =total_seats-seats;
            System.out.println("Left seats: "+total_seats);
        }else {
            System.out.println("Seats can not be booked");
            System.out.println("Seats Left "+total_seats);
        }
    }
}
