package MultiThreading.MultiThreading.Synchronization.StaticSynchronization;

public class BookTheaterSeat {

   static int total_seats =10;

 static synchronized void bookSeat(int seat)
    {
        if(total_seats>=seat)
        {
            System.out.println("Seats booked successfully");
            total_seats =total_seats-seat;
            System.out.println("Left seats: "+total_seats);
        }else {
         //   System.out.println(Thread.currentThread().getName());
            System.out.println("Seats can not be booked as seats left only : "+total_seats);
        }
    }
}
