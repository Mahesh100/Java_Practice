package MultiThreading.MultiThreading.Sleep;

public class Test extends Thread {
    public void run()
    {
        try {
            for (int i=0; i<=5; i++)
            {
                System.out.println(i+" "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
            Test t = new Test();
            t.start();

            Test t2 = new Test();
            t2.start();
    }
}
