package Threads.MultiThreading.ThreadName;

public class Test extends Thread
{
    public void run()
    {
        System.out.println("Task");
        System.out.println(Thread.currentThread().getName());
    }

public static void main(String [] args)
{
    //System.out.println(Thread.currentThread().getName());
    Thread.currentThread().setName("Thread-1");
    System.out.println(Thread.currentThread().getName());

    Test t = new Test();
    t.start();
    System.out.println("This  "+  Thread.currentThread().getName());
  }
}