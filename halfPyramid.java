/*
 * 1
 * 12
 * 123
 * 1234
 * ......
 */


public class halfPyramid {
    
    public static void main (String args []){
        int k=10;
        for (int i =1 ; i <=k ;i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
