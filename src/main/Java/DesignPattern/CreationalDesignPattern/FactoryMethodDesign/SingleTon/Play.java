package DesignPattern.CreationalDesignPattern.FactoryMethodDesign.SingleTon;

import java.lang.reflect.Constructor;

public class Play {

    //Lazy of creating singleton pattern
    public static void main(String[] args)  {

       // new Sports();
        Sports sports =Sports.getSports();

        System.out.println(sports.hashCode());

        Sports sports1 = Sports.getSports();

        System.out.println(sports.equals(sports1));

        System.out.println(sports1.hashCode());

        System.out.println(Cricket.getCricket().hashCode());


        // another object for Sports

        Sports s1 = Sports.getSports();
        System.out.println(s1.hashCode());

        try {

            Constructor<Sports> constructor = Sports.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Sports s2 = constructor.newInstance();
            System.out.println(s2.hashCode());

        }catch (Exception e){
            System.out.println(e);
        }



    }
}
