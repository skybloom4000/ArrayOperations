import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part (a): Initialize and print array
        int[] numbers = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Values stored in the array:");
        System.out.println(Arrays.toString(numbers));

        // Part (b): Search for a number in the array
        System.out.println("Enter a number to search:");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < 15; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("The number " + searchNumber + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The number " + searchNumber + " not found in this array.");
        }

        // Part (c): Create and print reverse array
        int[] reverseArray = new int[15];
        for (int i = 0, j = 14; i < 15; i++, j--) {
            reverseArray[j] = numbers[i];
        }
        System.out.println("Values stored in the reverse array:");
        System.out.println(Arrays.toString(reverseArray));

        // Part (d): Calculate sum and product of elements
        int sum = 0;
        long product = 1;
        for (int num : numbers) {
            sum += num;
            product *= num;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
}

