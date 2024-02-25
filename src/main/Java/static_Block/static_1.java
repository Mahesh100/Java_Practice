package static_Block;

public class static_1 {
    static {
        System.out.println("Static block executing");
    }

    //We can execute this static block only if we have the jdk version having 1.6 without the main method

    public static void main(String [] args){
        System.out.println("This is main method");
    }
}
