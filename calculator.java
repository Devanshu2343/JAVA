//calculator using switch case 
import java.util.*;
public class calculator {
    public static void main(String args []){
        System.out.println("Enter 1st number : ");
        Scanner f = new Scanner (System.in); 
        int a = f.nextInt();

        System.out.println("Enter 2nd number : ");
        Scanner g = new Scanner (System.in);
        int b = g.nextInt();

        System.out.println("Enter the operation : ");
        Scanner h = new Scanner (System.in);
        char operator = h.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Sum  is " + (a+b));               
                break;
            case '-' :   System.out.println("Difference  is " + (a-b));  
                break;
            case '*' :   System.out.println("Product  is " + (a*b));  
                break;
            case '/' :   System.out.println("Quotient  is " + (a/b));  
                break;    
            case '%' :   System.out.println("Reminder  is " + (a%b));  
                break;        
            
        
            default:  System.out.println("Invalid Operator"); 
                 
                break;
        }
    }
}
