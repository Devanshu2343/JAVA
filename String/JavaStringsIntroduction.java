import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int a = A.length() ;
        int b = B.length() ;
        int c = a+b ;
        System.out.println(c);
        if (A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }
        else {
             System.out.println("No");
        }
        String first = A.substring(0,1).toUpperCase() + A.substring(1);
        String second = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(first+ " " + second);
    }
}



