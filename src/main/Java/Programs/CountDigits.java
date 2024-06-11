package Programs;



public class CountDigits {

    /*
    i/p : 124
    out: 3


     */

    public static long countDigits(long x) {

        long result = 0;

        while (x >= 0 ) {

            x = x / 10;
            result++;
            break;
        }
        return result;
    }

    public static void main(String[] args) {
       // CountDigits.countDigits(1234);
        System.out.println("Digits are: "+countDigits(43232));
    }
}