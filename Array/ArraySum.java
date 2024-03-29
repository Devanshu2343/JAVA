import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking sixe of array as input
        System.out.println("Enter the length of array:");
        int n = scanner.nextInt() ;

        // Taking input of array elements
        System.out.println("Enter the elements:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculating sum using for loop
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Displaying sum
        System.out.println("Sum of the elements: " + sum);

        scanner.close();
    }
}
