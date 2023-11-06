package homework_week_9;

import java.util.ArrayList;

public class Programme_11_CompareArrayList {

    public void arrayListCompare(){

        ArrayList <String> c1 = new ArrayList<String>();

        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("First ArrayList c1 : " + c1);

        ArrayList<String> c2 = new ArrayList<String>();

        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println("Second ArrayList c2 : " + c2);

        boolean compare;
        compare = c1.equals(c2);
        System.out.println("Do both array list c1 and c2 contains the same colours? " + compare);

        c2.retainAll(c1);
        System.out.println("Common colour in both c1 and c2 are : " + c2);

        c1.removeAll(c2);
        System.out.println("Un-common colour in both c1 and c2 are : " + c1);

    }

    public static void main(String[] args) {
        Programme_11_CompareArrayList obj = new Programme_11_CompareArrayList();
        obj.arrayListCompare();
    }
}
