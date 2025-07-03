package CodingQuestions.Programs;

import java.util.*;

class demo{

    public static void main(String[] args) {
//        int x =10;
//        System.out.println(x);


        try{

            ArrayList<String> al = new ArrayList<>();

            al.add("z");
            al.add("Mango");
            al.add("Mango");
            al.add(null);
            al.add(null);

            System.out.println(al);



            Set<String> set = new HashSet<>();

            set.add("z");
            set.add("Mango");
            set.add("Mango");
            set.add(null);
            set.add(null);

            System.out.println(set);


            Map<String, Integer> mp = new HashMap<>();

            mp.put("demo",1);

        }catch (Exception e)
        {

        }finally
        {
            System.exit(0);
            System.out.println("Finally 1");
        }
//        finally
//        {
//            System.out.println("Finally 2");
//        }


    }

//     static {
//         System.out.println("Hello World!");
//     }
}
