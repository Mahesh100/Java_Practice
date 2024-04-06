package Threads.MultiThreading;


 //Step 1 : Extends the thread class
public class Test extends Thread {

     //Step 2 : Override the run() method

     public void run(){
        //tsk
     }

     // Step 3 : Create the object of test class

     public static void main(String[] args) {

         Test t = new Test();

     // Step 4 : Start the thread

         t.start();
     }

}
