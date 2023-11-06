package homework_week_9;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8_HashSet {

    public void methodHashSet(){

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        for(int i = 1; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println((i + " was not found in the set. "));
            }
        }
    }

    public static void main(String[] args) {

        Programme_8_HashSet obj = new Programme_8_HashSet();
        obj.methodHashSet();
    }
}
