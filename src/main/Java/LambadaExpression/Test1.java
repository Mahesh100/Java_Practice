package LambadaExpression;


@FunctionalInterface
interface Cab {

    public void bookCab();  //abstract method

        }


// class Ola implements Cab{
////    public void bookCab()
////    {
////        System.out.println("Ola cab is booked");
////    }
//
//     //Using lambada expression
//
//     () -> System.out.println("Ola cab is booked");
//
// }


 //Instead of writing whole class we can write lambda expression for same.

public class Test1 {


    public static void main(String[] args) {


  //      Ola cab = new Ola();

        Cab cab = () -> System.out.println("Ola Cab is Booked");
        cab.bookCab();

    }
}
