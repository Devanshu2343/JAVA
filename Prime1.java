// a program to check if a number is prime or not

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
         System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in);
         int n = f.nextInt();
         boolean isPrime = true;
         for (int i=2 ;i<n ; i++){
            if (n %i ==0){
                isPrime = false;
            }
           
         }
          if(isPrime==true ){
                System.out.println("prime");
            }
            else{
                System.err.println("not prime");
            }
    }
    
}
