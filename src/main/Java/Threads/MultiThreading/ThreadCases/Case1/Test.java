package Threads.MultiThreading.ThreadCases.Case1;

// Performing single task from single thread
public class Test extends  Thread {

    public void run(){

        System.out.println("Thread Name is : "+Thread.currentThread().getName()+ " is running");
    }
    
    public static  void  main(String [] args){
        Test thread1 = new Test();
        thread1.start();
    }

}
