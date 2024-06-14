package FunctionalProgramming.OptionalClass;

import java.util.Optional;

public class OptionalExample {

    public static  Optional<String> getName()
    {
        String name =null;
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {

        String str= null;

        // General Way

        if(str==null){
            System.out.println("This is null object");
        }
        else {
            System.out.println(str.length());
        }

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());

        System.out.println(optional.orElse("No value"));


        //Example 2



        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("Null returned"));
    }
}
