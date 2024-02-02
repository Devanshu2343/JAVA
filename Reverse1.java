// A program to reverse the number by taking input from user

import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
         System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in); 
         int n = f.nextInt();
        

         while(n>0){
            int lastd = n % 10 ;
            System.out.print(lastd);
            n /= 10;
         }
         System.out.println();
    }
}
