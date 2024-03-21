import java.util.*;
public class String_pyramid{

    public static void display(String name){
        for (int i = 0 ; i < name.length() ; i++){
            for (int j = 0; j <= i; j++) {
                 System.out.print(name.charAt(j));
             }
             System.out.println();
         }

    }
    public static void main (String [] args){
        System.out.println("Enter a word : ");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        sc.close();
        display(name);
       

    }
}
