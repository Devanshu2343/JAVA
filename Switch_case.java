import java.util.Scanner;
public class Switch_case{
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
        
                System.out.print("Enter a number (1-4): ");
                int choice = scanner.nextInt();
        
                switch (choice) {
                    case 1:
                        System.out.println("You chose option 1");
                        break;
                    case 2:
                        System.out.println("You chose option 2");
                        break;
                    case 3:
                        System.out.println("You chose option 3");
                        break;
                    case 4:
                        System.out.println("You chose option 4");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
        
                scanner.close();
        
    }
    
}




