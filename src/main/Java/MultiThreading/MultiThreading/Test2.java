package MultiThreading.MultiThreading;

public class Test2 extends Thread {

   public void run(){
        System.out.println("Thread task");

       System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.start();

      //  t.start();     Leads to IllegalThreadStateException
    }
}
