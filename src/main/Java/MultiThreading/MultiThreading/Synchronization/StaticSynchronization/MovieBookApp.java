package MultiThreading.MultiThreading.Synchronization.StaticSynchronization;


public class MovieBookApp {

    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();

        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();

        MyThread2 t2 = new MyThread2(b1, 8);
        t2.start();

        BookTheaterSeat b2 = new BookTheaterSeat();
        MyThread3 t3 = new MyThread3(b1, 9);
        t3.start();
    }

}

class MyThread1 extends Thread{
      BookTheaterSeat b;
    int seats;
    MyThread1(BookTheaterSeat b, int seats)
    {
        this.b=b;
        this.seats=seats;

    }

    public void run(){
        b.bookSeat(seats);
    }
}

class MyThread2 extends  Thread{
    BookTheaterSeat b;

    int seats;

    MyThread2(BookTheaterSeat b, int seats){
        this.b =b;
        this.seats =seats;
    }

    public void run(){
        b.bookSeat(seats);
    }
}


class MyThread3 extends  Thread{
    BookTheaterSeat b;

    int seats;

    MyThread3(BookTheaterSeat b, int seats){
        this.b =b;
        this.seats =seats;
    }

    public void run(){
        b.bookSeat(seats);
    }
}
