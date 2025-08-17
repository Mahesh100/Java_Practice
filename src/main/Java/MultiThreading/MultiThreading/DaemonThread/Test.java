package MultiThreading.MultiThreading.DaemonThread;

public class Test extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())

            System.out.println("daemon Thread");

        else
            System.out.println("Child Thread");



    }

    public static void main(String [] args)
    {
        //Thread.currentThread().setDaemon(true);   //Not possible to make main thread as Daemon thread
        System.out.println("Main2 tread");

        Test t = new Test();
       t.setDaemon(true);
        t.start();
    }
}