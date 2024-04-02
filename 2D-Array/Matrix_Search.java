//  A PROGRAM IN JAVA TO SEARCH ELEMENT IN A MATRRIX
import java.util.*;
public class array_2d_search {
    public static void search(int matrix[][], int key){
        boolean a = false ;
        int i=0, j=0;
        for (i =0 ; i < matrix.length ; i++){
            for (j =0 ; j<matrix[0].length; j++){
                if (key == matrix[i][j]){
                    a= true;
                    break;
                    
                }

                
            }
            if(a==true){
                break;
            }
            
        }
        if(a==true){
            System.out.println(key + " is present in the matrix at " +i +" row "  + j +" col ");
        }
        else{
            System.out.println(key +" is not present in the matrix");
        }
        
    }


    public static void main (String[] args){

        Scanner sc  = new Scanner(System.in);
        System.out.print(" Enter number of rows for matrix : ");
        int x = sc.nextInt();
        System.out.print(" Enter number of coloums for matrix : ");
        int y = sc.nextInt();

        int matrix [][]= new int [x][y];
        int n = matrix.length;
        int m = matrix[0].length;
        //input
        System.out.print(" Enter the elements");
        
        for (int i =0 ; i < n ; i++){
            for (int j =0 ; j<m; j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        //output
        for (int i =0 ; i < n ; i++){
            for (int j =0 ; j<m; j++){
               System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        
        System.out.print("Enter the element to search in Matrix ");
        int key = sc.nextInt();
        
        search (matrix,key);
    }
    
    
}
