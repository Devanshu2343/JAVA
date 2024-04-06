// A program in java to make letter of every word capital

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split("\\s+");

        // Capitalize the first letter of each word
        StringBuilder modifiedString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                modifiedString.append(Character.toUpperCase(word.charAt(0)))
                               .append(word.substring(1))
                               .append(" ");
            }
        }

        // Display the modified string
        System.out.println("Modified string: " + modifiedString.toString().trim());

        scanner.close();
    }
}
