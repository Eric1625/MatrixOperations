import java.util.*;
public class MatrixMultiplication{
 public static void main(String [] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter dimensions in  matrix 1: ");
     int row = in.nextInt();
     int column = in.nextInt();
     int [][] matrix = new int[row][column];
     System.out.print("Enter dimensions in matrix 2: ");
     int row2 = in.nextInt();
     int column2 = in.nextInt();
     int [][] matrix2 = new int[row2][column2];
     boolean retry = false;
     int [][] matrix3 = new int[row][column2];
     int sum = 0;
     
     if(row != column2 || column != row2)
     System.out.println("Not Possible");
     
     else{
     for(int i = 0;i<row;i++){
         System.out.print("Enter " + column + " values for row " + i + " for matrix 1: ");
         for(int j = 0;j<column;j++){
             matrix[i][j]=in.nextInt();
        }
    }
        for(int i = 0;i<row2;i++){
         System.out.print("Enter " + column + " values for row " + i + " for matrix 2: ");
         for(int j = 0;j<column2;j++){   
             matrix2[i][j] = in.nextInt();

        }
    }
     for(int i = 0;i<row;i++){
         for(int j = 0;j<column2;j++){
             sum = 0;
             for( int k =0;k<column;k++){
                 sum += matrix[i][k]*matrix2[k][j];
                 
                 
                }
                matrix3[i][j] = sum;
            }
            
        }
         
         
         
         
         
         
   
        
       for(int i = 0;i<row;i++){
           System.out.println("");
         for(int j = 0;j<column2;j++){
         System.out.print(matrix3[i][j] + " ");    
             
             
            }
        }
    }
        
    
}
     }
     
 
    
     
     
     
     
     
    
    
    
    

