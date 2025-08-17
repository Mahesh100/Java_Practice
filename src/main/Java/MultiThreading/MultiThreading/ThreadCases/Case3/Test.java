package MultiThreading.MultiThreading.ThreadCases.Case3;


//Performing multiple task from multiple threads
class MyThread1 extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+ " Task1");
    }
}

class  MyThread2 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " Task2");
    }
}

class MyThread3 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " Task3");
    }
}

public class Test {

    public static void main(String[] args) {


        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();

        MyThread3 t3 = new MyThread3();
        t3.start();
    }

}


