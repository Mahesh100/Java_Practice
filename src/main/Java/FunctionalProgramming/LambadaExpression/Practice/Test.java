package FunctionalProgramming.LambadaExpression.Practice;

@FunctionalInterface
interface Cab{

    /*Example 1
    public void bookCab();  */


    public String bookCab(String source, String Destination);
}
/*
class Ola implements Cab{

    public void bookCab(){
        System.out.println("Ola Cab is booked...");
    }

    //Using lambda expression
    ()-> System.out.println("Ola Cab is booked...");
} */

public class Test {

    public static void main(String[] args) {
            Cab cab = (Source, Destination)-> {System.out.println("Ola Cab is booked from "+Source+ " to "+ Destination);
            return ("Price is 5k");};
        System.out.println( cab.bookCab("Jalna", "Pune"));
    }
}
