package homework_week_9;

import java.util.Scanner;

public class Programme_12_StringReverse {

    public static void stringReverse(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name or a word : ");
        String stringInput = scanner.next();

        int stringLength = stringInput.length();

        for(stringLength = stringInput.length(); stringLength > 0; -- stringLength)
            System.out.print(stringInput.charAt(stringLength - 1));

        scanner.close();
    }

    public static void main(String[] args) {
        stringReverse();
    }
}
