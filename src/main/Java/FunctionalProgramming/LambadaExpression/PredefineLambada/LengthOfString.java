package FunctionalProgramming.LambadaExpression.PredefineLambada;

// To verify length of string in an array

// Print array of elements whose size is > 4 from array

public class LengthOfString {

    public static void main(String[] args) {

    Predicate<String> pr = s->(s.length()> 4);

    String names[] = {"David","Scot","John","Smith","Mary"};

     for(String name:names)
     {
        if(pr.test(name))
        {
            System.out.println(name);
        }
     }
     
    }
}
