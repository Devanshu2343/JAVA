import java.util.*;

public class AssendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input size of array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Creating an array 
        int[] elements = new int[n];

        // Input 
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            elements[i] = scanner.nextInt();
        }

        //sort the array
        Arrays.sort(elements);


        // output of sorted array in asscending order
        System.out.println("Elements of array :");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ": " + elements[i]);
        }

        scanner.close();
    }
}
