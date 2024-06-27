package SuperKeyword;

public class A {

    int a =10;

    void  display(){
        System.out.println("Display method");
    }

}

class B extends A
{
    int a = 20;

    public  B(){
        super.display();
    }
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        B r = new B();
        r.show();


    }
}
