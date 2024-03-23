package Constructor;

public class ClassConstructor {


        int a;
        String name;

        ClassConstructor()
        {
            a=1;
            name=null;
        }

        void show()
        {
            System.out.println(a+"  "+name);
        }

}

class B{
    public static void main(String[] args) {
        ClassConstructor ref = new ClassConstructor();  //default constructor
        ref.show();
    }
}
