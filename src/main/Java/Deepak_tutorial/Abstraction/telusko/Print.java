package Deepak_tutorial.Abstraction.telusko;

public class Print {

    void show(Number i){
        System.out.println(i);
    }

//    void show(Double i){
//        System.out.println(i);
//    }

    public static void main(String [] args){
        Print p = new Print();
        p.show(8.5);
    }
}
