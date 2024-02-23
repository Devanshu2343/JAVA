//A PROGRAM TO SHOW EXAMPLE OF MANNUAL TYPECASTING IN JAVA

import java.util.*;
public class mannual_type_casting {

    public static void main(String[] args) {

        System.out.println ("Enter the number");
        Scanner sc = new Scanner(System.in);
        double myDouble =  sc.nextDouble();
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println ("Before Type Casting");
    
        System.out.println(myDouble);   // Outputs = myDouble
        System.out.println ("After Type Casting To Integer");
        System.out.println(myInt);      // Outputs in Integer
      }
    
}




