package String.StringBufferPkg;

public class StringBufferProg {

    public static void  main(String [] args)
    {
        String str = "start";

        StringBuffer sb = new StringBuffer("Mahesh");

        sb.append("k");

        sb.insert(4,"o");

        System.out.println(sb);
    }
}
