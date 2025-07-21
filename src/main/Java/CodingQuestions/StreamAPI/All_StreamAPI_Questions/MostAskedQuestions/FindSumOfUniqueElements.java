package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions;

import java.util.Arrays;
import java.util.stream.Stream;

/*
* Given an array find the sum of unique elements.
*
* int[] arr = {1,6,7,8,1,1,8,7};
*
* */
public class FindSumOfUniqueElements {
    public static void main(String [] args){
        int[] arr = {1,6,7,8,1,1,8,7};

        int ans = Arrays.stream(arr).distinct().sum();
        System.out.print(ans);
    }
}
