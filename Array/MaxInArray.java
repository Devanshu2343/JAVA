import java.util.Scanner;

public class MaxInArray {
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

        // Finding the highest element 
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if(array[i]>max){
                max= array[i] ;
            }
        }

        // Displaying the highest element 
        System.out.println("Highest element in the array : " + max);

        scanner.close();
    }
}
