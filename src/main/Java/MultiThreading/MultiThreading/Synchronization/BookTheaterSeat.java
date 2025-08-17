package MultiThreading.MultiThreading.Synchronization;

public class BookTheaterSeat {
    int total_seats = 15;
 //  synchronized  void bookSeat(int seats)
   void bookSeat(int seats)
    {
        synchronized (this){

        if(total_seats>=seats)
        {
            System.out.println("Seats booked successfully");
            total_seats =total_seats-seats;
            System.out.println("Left seats: "+total_seats);
        }else {
            System.out.println("Seats can not be booked as seats left only : "+total_seats);

        }
        }

    }
}
