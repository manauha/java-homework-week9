package homework_week_9;

import java.util.HashMap;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

public class Programme_9_HashMap {

    public void hashMapMethod() {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Dhoni", 42);
        people.put("Kohli", 35);
        people.put("Rohit", 36);
        people.put("Bumrah", 29);

        for(String i: people.keySet()){
            System.out.println("Player : " + i + " age : " + people.get(i));
        }
    }

    public static void main(String[] args) {
        Programme_9_HashMap obj = new Programme_9_HashMap();
        obj.hashMapMethod();
    }
}
