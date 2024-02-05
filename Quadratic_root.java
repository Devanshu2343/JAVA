//Program in Java to find roots of the Quadratic Equation
import java.util.*;

public class Quadratic_root {
    

    public static void main(String args[]){
		
		double secondRoot = 0, firstRoot = 0;
        System.out.println("Roots for a(x^2) + b(x) + c");
		
      
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a as coefficient of x^2 ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b as coefficient of x ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c as constant value"); 
        double c = sc.nextDouble();
		
		
		double determinant = (b*b)-(4*a*c);
		
		double sqrt = Math.sqrt(determinant);
		
		
		
		if(determinant>0){
			
			firstRoot = (-b + sqrt)/(2*a);
			
			secondRoot = (-b - sqrt)/(2*a);
			
			System.out.println("First root is : "+ firstRoot +" Second root is : "+secondRoot);
			
		}else if(determinant == 0){
			
			System.out.println("Roots are equal and value is : "+(-b + sqrt)/(2*a));
			
		}else {
			System.out.println("Roots are imaginary");
		}
		
	}
}
