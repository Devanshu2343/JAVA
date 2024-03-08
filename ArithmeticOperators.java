// Description of 5 arithmetic operators:
// +	Used for addition and string concatenation
// -	Used for subtraction
// *	Used for multiplication
// /	Used for division
// %	Remainder/Modulus operator for finding remainder

import java.util.* ;
public class ArithmeticOperators {
	public static void main(String[] args) {
		   Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the value of x : ");
	    int x = sc.nextInt();
	    System.out.println("Enter the value of y : ");
	    int y = sc.nextInt();
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
	}
}
