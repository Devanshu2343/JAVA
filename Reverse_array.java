//A PROGRAM TO REVERSE THE ELEMENT OF ARRAY
import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        //INPUT 
        System.out.println("Enter the elements of the array: ");
        for(int i=0 ; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        //OUTPUT
        System.out.println("The elements of the array are : ");
        for(int i =0 ; i <n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //REVERSE OUTPUT
        System.out.println("The elements of the array in reverse order are : ");
        for(int i =n-1 ; i >=0 ; i--){
            System.out.print(arr[i] + " ");
        }


    }
    
}
