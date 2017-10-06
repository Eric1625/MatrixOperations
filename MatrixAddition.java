import java.util.*;
public class MatrixAddition{
 public static void main(String [] args){
     Scanner in = new Scanner(System.in);
     System.out.print("Enter dimensions in  matrix 1: ");
     int row = in.nextInt();
     int column = in.nextInt();
     int [][] matrix = new int[row][column];
     System.out.print("Enter dimensions in matrix 2: ");
     int row2 = in.nextInt();
     int column2 = in.nextInt();
     int [][] matrix2 = new int[row][column];
     boolean retry = false;
     
     if(row != row2 || column != column2)
     System.out.println("Not Possible");
     
     else{
     for(int i = 0;i<row;i++){
         System.out.print("Enter " + column + " values for row " + i+1 + " for matrix 1: ");
         for(int j = 0;j<column;j++){
             matrix[i][j]=in.nextInt();
        }
    }
        for(int i = 0;i<row;i++){
         System.out.print("Enter " + column + " values for row " + i+1 + " for matrix 2: ");
         for(int j = 0;j<column;j++){   
             matrix2[i][j]=in.nextInt();
        }
    }
     for(int i = 0;i<row;i++){
         for(int j = 0;j<column;j++){
         matrix[i][j] = matrix2[i][j] + matrix[i][j];    
             
             
             
            }
         
         
         
         
         
         
        }
        }
        
       for(int i = 0;i<row;i++){
           System.out.println("");
         for(int j = 0;j<column;j++){
         System.out.print(matrix[i][j] + " ");    
             
             
            }
        }
     
     
     
     
     
     
     
     
    }
    
    
    
    
}