package Threads.MultiThreading.Yield;

public class Test extends  Thread{

    public void  run(){
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
          //  System.out.println(i);
        }


    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();

        for(int i=0; i<5; i++)
        {
            Thread.yield();
            System.out.println("Main Thread");
        }
    }
}
