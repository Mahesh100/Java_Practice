package Threads.MultiThreading.Interruption;

public class Test extends Thread{
    
    public void run()
    {
        try {
            for (int i = 1; i <= 5; i++) {
                if(i>3){
                    Thread.interrupted();
                }else {
                    System.out.println(i);

                  //  Thread.sleep(3000);
                }
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
