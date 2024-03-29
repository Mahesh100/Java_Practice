package Programs.LIst;

import java.util.ArrayList;
import java.util.List;

public class FindMaxMin2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(20);

        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
    }

    public static Integer findMin(List<Integer> list)
    {
        Integer min = Integer.MAX_VALUE;
        // loop through every element in the list and
        // compare min found so far with current value
        for (Integer i : list) {

            // update min if found to be more than
            // the current element
            if (min > i) {
                min = i;
            }
        }

        return min;
    }

    public static Integer findMax(List<Integer> list)
    {
        // initialize max variable to minimum value
        Integer max = Integer.MIN_VALUE;

        // loop for compare to current max value
        // with all list element and find maximum value
        for (Integer i : list) {

            // update max if found to be less than
            // the current element
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

}