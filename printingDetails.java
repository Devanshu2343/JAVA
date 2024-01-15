import java.util.* ;
public class printingDetails {
    public static void main (String args []){
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();


        System.out.println("Enter your age : ");
        Scanner no = new Scanner (System.in);
        int age = no.nextInt();



        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    

    }
    
}
