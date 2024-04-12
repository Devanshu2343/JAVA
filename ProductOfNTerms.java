import java.util.Scanner;

public class ProductOfNTerms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        double product = 1.0;
        
        System.out.println("Enter " + n + " terms:");
        for (int i = 0; i < n; i++) {
            double term = scanner.nextDouble();
            product *= term;
        }
        
        System.out.println("Product of " + n + " terms: " + product);
        
        scanner.close();
    }
}
