package DesignPattern.CreationalDesignPattern.FactoryMethodDesign.SingletonDesign1;

public class DatabaseLayer {

    private static DatabaseLayer db = new DatabaseLayer();

    private DatabaseLayer(){

    }

    public static DatabaseLayer getInstance(){
        return db;
    }
}

class Main{
    public static void main(String[] args) {
        DatabaseLayer obj1 = DatabaseLayer.getInstance();
        System.out.println(obj1);

        DatabaseLayer obj2 = DatabaseLayer.getInstance();
        System.out.println(obj2);

    }
}
