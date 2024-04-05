import java.util.Scanner;

public class VowelRem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all vowels from the string
        String result = input.replaceAll("[aeiouAEIOU]", "");

        // Display the modified string without vowels
        System.out.println("String without vowels: " + result);

        scanner.close();
    }
}
