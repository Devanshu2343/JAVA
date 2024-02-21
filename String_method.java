import java.util.*;
public class String_method {
    public static void main(String[] args) {
        System.out.println("Enter a word or a sentence : ");
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println("You Entered : " + str);
        System.out.println("Length of the word/ sentence  : " + str.length());
        System.out.println("word/ sentence in UpperCase : " + str.toUpperCase());
        System.out.println("word/ sentence in LowerCase : " + str.toLowerCase());
        

    }
    
}
