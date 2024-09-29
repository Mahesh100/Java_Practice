package ThisKeyword;

public class thisKeyword {

    void m1(){
        System.out.println("abc: "+this);
    }

    public static void main(String [] args){
        thisKeyword a1 = new thisKeyword();
        System.out.println(a1);
        a1.m1();

    }
}
