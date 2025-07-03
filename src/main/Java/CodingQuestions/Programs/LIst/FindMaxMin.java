package CodingQuestions.Programs.LIst;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given an unsorted list of integers find the maximum and minimum values in it.

Input list = [10,4,3,2,1,20]

Output max = 20, min = 1

Input list = [10,400,3,2,1,-1]

Output max = 400 , min = -1
 */
public class FindMaxMin {


    //Least efficient approach

    public static int findMin(List<Integer> list)
    {
        //Check if list is empty or not

        if(list==null || list.size()==0){
                return Integer.MAX_VALUE;
        }

        //create new list to avoid modification in new list

        List<Integer> sortedList = new ArrayList<Integer>(list);

        //sort list in natural order
      //  Collections.sort(sortedList);


        //First element in sorted list will be minimum element

       // return sortedList.get(0);

        return Collections.min(list);
    }

    public static int findMax(List<Integer> list)
    {
        if(list == null || list.size() == 0)
        {
                return Integer.MAX_VALUE;
        }

        //creating new list
        List<Integer> sortedList = new ArrayList<Integer>(list);
       // Collections.sort(sortedList);



      //  return sortedList.get(sortedList.size()-1);
        
        return Collections.max(list);
    }

    public static void main(String[] args)
    {
        try {
            List<Integer> list = new ArrayList<Integer>();

            list.add(10);
            list.add(4);
            list.add(3);
            list.add(2);
            list.add(1);
            list.add(20);

            System.out.println(list);

            System.out.println("Min :" + findMin(list));
            System.out.println("Max :" + findMax(list));
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
