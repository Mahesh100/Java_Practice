package CodingQuestions.ArrayCodingQuestions;

public class CheckIfSorted {

    public static boolean isSorted(int[] arr){
        for(int i=1;  i<arr.length; i++){
            if(arr[i]>=arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        int[] arr = {1,2,3};
        boolean result = isSorted(arr);
        System.out.println(result);
    }
}
