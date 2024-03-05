// A PROGRAM TO CALCULATE nTH TERM  OF FIBONACCI SERIES 
import java.util.*;
public class fibonacci {
    public static int fibonacci(int n) {
        if (n <= 0) {
            System.out.println ("n must be greater than 0.");
            return -1; 
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("The " + n + "th term of the Fibonacci series is: " + fibonacci(n));
    }
}
