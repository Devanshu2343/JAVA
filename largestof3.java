// program to find largest of 3 numbers 
import java.util.* ;
public class largestof3 {
    public static void main (String args []){

        System.out.println("Enter 1st number : ");
        Scanner f = new Scanner (System.in); 
        int a = f.nextInt();

        System.out.println("Enter 2nd number : ");
        Scanner g = new Scanner (System.in);
        int b = g.nextInt();

        System.out.println("Enter 3rd number : ");
        Scanner h = new Scanner (System.in);
        int c = h.nextInt();

        if (a>b && a >c){
            System.out.println("Largest number is " + a );
        }

        else if (b>c){
            System.out.println("Largest number is " + b );
        }

        else{
            System.out.println("Largest number is " + c );
        }


    }
    
}
