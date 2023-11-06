package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Programme_5_ArrayIterate {

    public static void main(String[] args) {
        Programme_5_ArrayIterate obj = new Programme_5_ArrayIterate();
        obj.arrayIterate();
    }

    public void arrayIterate(){
        ArrayList <Integer> prime = new ArrayList<>();

        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(7);
        prime.add(11);
        prime.add(13);
        prime.add(17);
        prime.add(19);

        Iterator<Integer> list = prime.iterator();
        System.out.print("Prime number between 1 and 20 : ");
        while (list.hasNext()){
            System.out.print(list.next() + " ");
        }
    }
}
