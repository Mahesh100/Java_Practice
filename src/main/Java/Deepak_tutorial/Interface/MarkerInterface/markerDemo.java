package Deepak_tutorial.Interface.MarkerInterface;

public class markerDemo {

    void bark(){
        System.out.println("Dog is Barking");
    }

    public static void main(String [] args){
        markerDemo mk = new markerDemo();
        if(mk instanceof markerDemo)
            mk.bark();
        else
            System.out.println("Is not instance of");

    }

}
