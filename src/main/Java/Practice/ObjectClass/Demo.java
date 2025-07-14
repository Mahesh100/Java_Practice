package Practice.ObjectClass;

class Laptop
{
    String model;
    int price;

    public String toString(){
        return model + " " + price;
    }

}
public class Demo {

    public static void main(String [] args){
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        boolean result =  obj1.equals(obj2);

        System.out.println(result);

        System.out.println("Printing object here: "+obj1);
    }
}
