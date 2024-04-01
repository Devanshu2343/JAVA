import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Calculate square root
        double squareRoot = Math.sqrt(num);
        

        // Print square root value up to 2 decimal places
        System.out.printf("Square root of %d is %.2f\n", num, squareRoot);

        scanner.close();
    }
}
