//A PROGRAM IN JAVA TO PRINT FIBBONACCI SERIES UPTO N TERMS
import java.util.*;
public class Fibo{
    public static void main(String[] args) {
        System.out.println("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t1 = 0;
        int t2 = 1 ;
        System.out.print(t1 + " " + t2 + " ");
        
        for (int i=0 ; i <n ; i++){
            int next_Term = t1+ t2;
            System.out.print(next_Term + " ");
            t1 = t2;
            t2 = next_Term;
        }
        
    }


    }
