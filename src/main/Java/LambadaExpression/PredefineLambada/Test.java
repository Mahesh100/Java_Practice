package LambadaExpression.PredefineLambada;


interface Predicate<T>
{
    public boolean test(T t);
}

public class Test {

    public static void main(String[] args) {

        Predicate<Integer> p = i ->(i>10);
        boolean result = p.test(2);
        System.out.println(result);
    }
}
