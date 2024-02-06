import java.util.Scanner;

public class Reverse2.java {
    public static void main(String[] args) {
         System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in); 
         int n = f.nextInt();

         int rev = 0;
         while (n>0){
            int lastd = n % 10 ;
            rev = (rev * 10) + lastd ;
            n /= 10 ;
         }
         System.out.println(rev);
    }
    
}
