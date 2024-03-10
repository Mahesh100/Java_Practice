package Threads;

public class Thread_1 {

    public static void main(String [] args){
        Thread t = new Thread();
        t.start();
        try {
            t.start();
        } catch (Exception e){
            System.out.println(e);

        }

    }
}
