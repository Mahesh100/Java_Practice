package Programs;

public class demo2 {

    void m1(int i)
    {
        i=i+10;
    }

    public static void main(String[] args) {
        int i =10;
        System.out.println(i);
        demo2 dm = new demo2();
        dm.m1(i);
        System.out.println(i);
    }
}
