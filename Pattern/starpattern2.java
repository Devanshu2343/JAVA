/* 
 *   *
 *   **
 *   ***
 *   ****
 *   ****
 *   ***
 *   **
 *   *
*/

public class starpattern2 {
    public static void main (String args []){
        int k=4;
        for (int i =1 ; i <=k ;i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        for (int i =k ; i >=1 ;i--){
            for (int l = i ; l>=1 ; l--){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    
}
