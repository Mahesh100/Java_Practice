package DesignPattern.CreationalDesignPattern.BuilderDesignPattern;

public class Shop {
    public static void main(String [] args){
        Phone p = new PhoneBuilder().setOs("Android").setRAM(2).getPhone();
        System.out.println(p);
    }
}
