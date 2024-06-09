package Threads.MultiThreading.RestricThreadExecution;

class Test
{
    public static void main(String [] args)
    {
        for(int i=1; i<=5;i++)
        {
            try{
                Thread.sleep(2000);
                System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}