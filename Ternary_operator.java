import java.util.* ;
public class Ternary_operator{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ") ;
        int x = sc.nextInt();
        System.out.println("Enter 2nd number : ") ;
        int y = sc.nextInt();

        int z = (x>y) ? x : y ;
        System.out.println("The greater number is : " + z);

    
    }
}
