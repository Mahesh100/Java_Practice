package DesignPattern.CreationalDesignPattern.FactoryMethodDesign.SingletonDesign1;

public class Main2 {

    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);

        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);
    }
}
