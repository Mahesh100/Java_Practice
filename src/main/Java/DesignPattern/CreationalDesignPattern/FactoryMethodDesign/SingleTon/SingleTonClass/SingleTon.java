package DesignPattern.CreationalDesignPattern.FactoryMethodDesign.SingleTon.SingleTonClass;

public class SingleTon
{

    public static void main(String[] args)
    {

        Abc obj1 = Abc.getInstanceOfAbc();
    }
}

class Abc{

    static Abc obj = new Abc();

    private Abc(){

    }

    public static Abc getInstanceOfAbc(){
        return obj;
    }

}
