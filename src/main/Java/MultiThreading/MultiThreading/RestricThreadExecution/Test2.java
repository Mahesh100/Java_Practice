package MultiThreading.MultiThreading.RestricThreadExecution;

public class Test2 implements Runnable {
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            try {
                Thread.sleep(2000);
                System.out.println(i);
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Test2 t2 = new Test2();
        Thread th = new Thread(t2);
        th.start();
    }
}
