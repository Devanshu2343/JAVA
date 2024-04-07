import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for array length
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Creating an array 
        int[] array = new int[length];

        // input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

      //displaying output
        System.out.println("Elements of array :");
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + (i + 1) + ": " + array[i]);
        }
      
        //  length of the array
        System.out.println("Length of the array: " + array.length);

        // Close the scanner
        scanner.close();
    }
}
