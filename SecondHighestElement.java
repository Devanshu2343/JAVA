import java.util.*;

public class SecondHighestElement {
    public static void main(String[] args) {
        System.out.println("Enter the length of Array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.println(i);
        }

        int secondHighest = -1; 

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                secondHighest = arr[i];
                break; 
            }
        }

    
        System.out.println("The second highest distinct element is: " + (secondHighest != -1 ? secondHighest : -1));

        sc.close();
    }
}
