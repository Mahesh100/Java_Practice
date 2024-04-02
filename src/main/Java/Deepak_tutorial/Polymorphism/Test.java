package Deepak_tutorial.Polymorphism;

public class Test {
    
    void show()
    {
        System.out.println("Show 1");
    }

    void show(String s)
    {
        System.out.println("Show 2");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show("a");
    }


}
