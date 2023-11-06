package homework_week_9;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */

public class Programme_7_isArrayListEmpty {

    public void checkArrayList(){

        //empty arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(arrayList.isEmpty()){
            System.out.println("array list is empty");
        } else {
            System.out.println("array list is not empty");
        }

        System.out.println("ArrayList = " + arrayList);

        System.out.println("==============================================");

        ArrayList<String>triangles = new ArrayList<String>();
        triangles.add("Right Angle triangle");
        triangles.add("Acute triangle");
        triangles.add("Obtuse triangle");

        if(triangles.isEmpty()){
            System.out.println("array list is empty");
        } else {
            System.out.println("array list is not empty");
        }

        System.out.println("ArrayList = " + triangles );
    }

    public static void main(String[] args) {
        Programme_7_isArrayListEmpty obj = new Programme_7_isArrayListEmpty();
        obj.checkArrayList();
    }
}
