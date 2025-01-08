//A PROGRAM IN JAVA TO SHOW AUTO TYPE-CASTING OF INTEGER TO DOUBLE

import java.util.*;
public class auto_type_casting {
    public static void main(String[] args) {
        System.out.println ("Enter the number");
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = myInt; // Automatic casting -> int to double
    
        System.out.println(myInt);      // Outputs = myInt
        System.out.println(myDouble);   // Outputs in float 
      }
    
}
