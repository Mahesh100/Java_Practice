package CodingQuestions.Programs;



public class SumOfNaturalNumbers {

    public static void main(String [] args){


      //  System.out.println( sumOfNumbers(3));
      int totalSum =  SumOfNaturalNumbers.sumOfNumbers(3);

      System.out.println("Sum of Natural Numbers is:"+totalSum);
    }

//    public static int sumOfNumbers(int n){
//        int sum=0;
//
//        for(int i=0; i<=n; i++){
//            sum = sum+i;
//        }
//        return sum;
//    }

    public static int sumOfNumbers(int n)
    {
        int sum =0;
        for(int i=0; i<=n; i++)
        {
            sum = sum+i;
        }
        return sum;
    }
}
