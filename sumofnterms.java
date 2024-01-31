//a program to calculate sum of n numbers using while loop
import java.util.Scanner;
public class sumofnterms {  
    public static void main (String args []){
         System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in); 
         int n = f.nextInt();
         int sum =0;
         int i =1 ;
         while (i <= n){
            sum += i;
            i ++; 
         }
          System.out.println(sum);
    }
}
