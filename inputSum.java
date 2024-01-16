import java.util.* ;
public class inputSum {
    public static void main (String args []){

        System.out.println("Enter 1st number : ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();
        

        int sum = a+ b ;

        System.out.println("Sum of " + a + " and " + b + " is " + sum);

    }
    
}
