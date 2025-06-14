package CodingQuestions.ArrayCodingQuestions;

import java.util.Arrays;

public class TwoSum {

    public static boolean twoSum(int[] nums, int target){

        Arrays.sort(nums);

        int left=0;
        int right = nums.length-1;

        while(left<right){
            int sum = nums[left]+ nums[right];
            if(sum == target){
               return true;  //we can return indices as return new int[]{left,right}
            } else if(sum<target)
                left++;
            else{
                right--;
            }
        }
        return false;  //we can return indices as return new int[]{-left,-right}
    }
    public static void  main(String [] args){

        int[] nums = {1,2,3,4,5};

        int target = 6;

        boolean result = twoSum(nums,target);
        System.out.println(result);
    }
}
