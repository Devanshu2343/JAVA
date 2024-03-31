import java.util.Scanner;

public class MinInArray {
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

        // Finding the lowest element 
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if(array[i]<min){
                min= array[i] ;
            }
        }

        // Displaying the lowest element 
        System.out.println("Lowest element in the array : " + min);

        scanner.close();
    }
    
}
