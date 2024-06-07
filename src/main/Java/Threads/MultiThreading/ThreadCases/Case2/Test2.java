package Threads.MultiThreading.ThreadCases.Case2;

//Performing single task from multiple threads

public class Test2 extends Thread{

    public void run(){
        System.out.println("Current Running thread is: "+Thread.currentThread().getName()+" running");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.start();

        Test2 test3 = new Test2();
        test3.start();
    }

}
