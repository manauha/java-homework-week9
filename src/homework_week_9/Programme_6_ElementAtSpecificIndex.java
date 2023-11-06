package homework_week_9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme_6_ElementAtSpecificIndex {

    public static void main(String[] args) {

        System.out.println("Java Programme return name of the month, when user entered number ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12 : ");
        int number = scanner.nextInt();
        number = (number - 1);
        Programme_6_ElementAtSpecificIndex obj = new Programme_6_ElementAtSpecificIndex();
        obj.elementAtSpecificIndex(number);
    }

    public void elementAtSpecificIndex(int number) {

        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("Jun");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        String month = months.get(number);
        System.out.println(month + " is the " + (number + 1) + " month of the year");

        System.out.println("Months of the Year are : \n" + months);
    }
}
