// a program to display all the numbers entered by user except the multiples of 10
import java.util.Scanner;
public class Continue2 {
    public static void main(String[] args) {
        
        do {
         System.out.print("Enter a number : ");
         Scanner f = new Scanner (System.in);
         int n = f.nextInt();
         if(n % 10 == 0){
            continue;
         }
        System.out.println(n);   
    }while(true);
    }
    }
    

