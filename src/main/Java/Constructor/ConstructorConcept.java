package Constructor;

public class ConstructorConcept {

    String name;
    int id;

    public ConstructorConcept(){
        System.out.println("Default constructor is running");
    }


    public ConstructorConcept(String name, int id)
    {
        //this.instanceVariable = local variable

        this.name = name;
        this.id = id;
        System.out.println("124");
    }

    public static void main(String [] args)
    {
        ConstructorConcept obj = new ConstructorConcept("Mahesh", 1);

    }
}
