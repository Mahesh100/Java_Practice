package Deepak_tutorial.Interface;

public class interfaceClass implements DemoInterface,DemoInterface2{

    public void show(){
        System.out.println("Show is going on");
    }

    public void display(){

    }

    public static void main(String [] args){
        interfaceClass I1 = new interfaceClass();
        I1.show();
    }

}
