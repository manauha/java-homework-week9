package homework_week_9;

import java.util.Scanner;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ArrayReverse {

    public static void main(String[] args) {
        Programme_3_ArrayReverse obj = new Programme_3_ArrayReverse();
        obj.arrayReverse();
    }

    public void arrayReverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store : ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        int x = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element of the array, " + x + " of " + n + " : ");
            array[i] = scanner.nextInt();
            x++;
        }
        scanner.close();

        System.out.print("Entered array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nArray elements in reverse order are : ");
        for (int i = (n - 1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
