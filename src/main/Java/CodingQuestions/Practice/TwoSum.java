package CodingQuestions.Practice;

import java.util.Arrays;

public class TwoSum {
    public static int[] getTwoSum(int[] arr, int target){

        int i=0;
        int j=arr.length-1;

        while (i<j){
            int sum = arr[i]+arr[j];

            if(sum==target){
                return new int[]{i,j};
            }else if(sum<target){
                i++;
            }else {
                j--;
            }
        }
        return new int[]{-1,-1};
    }
    //We are not returning actual element here which adds up to target
    public static void main(String [] args){
        int[] arr = {1,2,4,6,7,8};
        int target =9;
        System.out.println(Arrays.toString(getTwoSum(arr,target)));
    }
}
