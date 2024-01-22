// a program to find whether a number is odd or even using ternary operator
import java.util.* ;
public class odd_even {

public static void main(String args[]){
    
    System.out.print("Enter a number : ");
    Scanner f = new Scanner (System.in); 
    int a = f.nextInt();

    String num = (a % 2 ==0) ? "even " : "odd" ;

    System.out.println(a + " is " + num);
}
    
}
