package Array.deepakTutorial;

public class swapTwoNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Numbers before swapping:" + " " + a + " " + b);

        int temp;
        temp = a;
        a=b;
        b=temp;

        System.out.println("Numbers after swapping:"+" "+a+" "+b);
    }
}
