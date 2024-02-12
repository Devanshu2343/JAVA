import java.util.*;
public class Traffic_light_system{
    public static void main (String[] args){
        System.out.println("To get the Information about Traffic light   ") ;
        System.out.println("Select 1: Red");
        System.out.println("Select 2: Yellow");
        System.out.println("Select 3: Green");
        Scanner sc = new Scanner(System.in); 
        int col = sc.nextInt();
        if (col == 1 ){
            System.out.println("Red -> Stop");
        }
        else if (col == 2 ){
            System.out.println("Yellow -> Slow Down or Get Ready");
        }
        else if (col == 3 ){
            System.out.println("Green -> Go");
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
