// a program to display numbers from 1 to n
import java.util.*;
public class oneton {
    public static void main (String args []){
         System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in); 
         int n = f.nextInt();
         int counter = 1 ;
         while (counter <= n){
            System.out.print(counter);
            counter ++;
            
         }

    }
}
