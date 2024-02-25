package Deepak_tutorial.Interface;

public class Test implements I1{

   public void show(){
        System.out.println("Interface shows via show method");
    }

    public static void main (String [] args){
       Test t = new Test();
       t.show();
    }
}
