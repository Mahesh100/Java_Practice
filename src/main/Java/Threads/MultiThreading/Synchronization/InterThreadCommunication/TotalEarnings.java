package Threads.MultiThreading.Synchronization.InterThreadCommunication;

public class TotalEarnings extends Thread{

    int total = 0;

    public  void run(){

        for(int i=1; i<=10; i++)
        {
            total = total+100;
        }

        synchronized (this) {

            this.notify();
        }
    }
}

class MovieBookApp{
    public static void main(String[] args) throws InterruptedException{
        TotalEarnings t = new TotalEarnings();

        t.start();

        synchronized (t) {

            t.wait(1);
            System.out.println("Total Earnings is : "+t.total);
        }
    }
}
