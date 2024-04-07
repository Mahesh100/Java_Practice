package LambadaExpression;


@FunctionalInterface
interface Cab2
{
    public void bookCab(String source, String destination);
}

//class Ola implements Cab2
//{
//    public void bookCab(String source, String destination)
//    {
//        System.out.println("Ola cab is booked from "+ source + "To"+ destination);
//    }
//}
public class Test3 {

    public static void main(String[] args) {
            Cab2 cab = ( source, destination) ->System.out.println("Ola cab is booked from "+ source +" "+ "To"+ " "+destination);

            cab.bookCab("Jalna","Pune");
    }

}
