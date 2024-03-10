package Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator_1 {

    public static void main(String[] args) {

        List<String> al = new ArrayList<>();

        al.add("Mahesh");
        al.add("1");
        al.add("ABCD");

        ListIterator<String> lit = al.listIterator();

        lit.add("AB");
        lit.add("DEF");

        System.out.println(lit.previousIndex());

    }
}
