package Array;

public class PrintArray {


    public static void main(String[] args){
//                   0 1 2 3 4
        int[] arr = {2,3,1,7,6};
        System.out.println(arr.length);  //5
        for(int i =4; i<arr.length; i++){
            System.out.print(arr[i]);   //  2,3,1,7,6


            if(i<arr.length-1){
                System.out.print(",");
            }
        }
    }
}
