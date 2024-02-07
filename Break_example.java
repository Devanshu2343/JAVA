// a program to break the loop when user enters the multiple of 10

import java.util.Scanner;

public class Break_example {
    public static void main(String[] args) {
         

         do {
            System.out.print("Enter a number : ");
            Scanner f = new Scanner (System.in); 
            int n = f.nextInt();
            if (n % 10 ==0 ){
                break ;
            }
            System.out.println(n);
            
         } while (true);
         
        

          
    }
    
}
