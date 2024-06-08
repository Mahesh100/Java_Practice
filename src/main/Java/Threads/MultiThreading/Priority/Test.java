package Threads.MultiThreading.Priority;

public class Test extends Thread {

    public void run() {
        System.out.println("Thread task");
    }

        public static void main(String[]args)
        {
            System.out.println("Main thread priority is:" + Thread.currentThread().getPriority());
            Test t = new Test();
            t.setPriority(NORM_PRIORITY);
            System.out.println(t.getPriority());
            t.start();

            Test t2 = new Test();
            System.out.println(t2.getPriority());
            t2.start();
        }

}
