// a program to find factorial of n 

import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        
    
      System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in); 
         int n = f.nextInt();
         int fact =1;
         int i =1 ;
         while (i <= n){
            fact *= i;
            i ++; 
         }
          System.out.println(fact);
    }  
}
