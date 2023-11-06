package homework_week_9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Programme_4_ArrayList {
    public void arrayList(){
        ArrayList<String>colours = new ArrayList<String>();
        colours.add("White");
        colours.add("Black");
        colours.add("Brown");
        colours.add("Pink");
        colours.add("Blue");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Purple");

        for(String colour : colours){
            System.out.println(colour);
        }
    }

    public static void main(String[] args) {
        Programme_4_ArrayList obj = new Programme_4_ArrayList();
        obj.arrayList();
    }
}
