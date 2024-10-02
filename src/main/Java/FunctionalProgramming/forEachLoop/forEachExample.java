package FunctionalProgramming.forEachLoop;

import java.util.*;

public class forEachExample {

    public static void main(String [] args){

        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);

        System.out.println(nums);

        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }
    }
}
