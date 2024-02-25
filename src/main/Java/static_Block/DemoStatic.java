package static_Block;

public class DemoStatic {

    static int a =10;    //This is static initiliser
    static {
        System.out.println("I am running");

        System.out.println(a);
    }

    public static void main(String [] args){

    }

    static {
        System.out.println("He is swimming");
    }
}
