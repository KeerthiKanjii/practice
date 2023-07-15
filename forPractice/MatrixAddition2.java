package forPractice;

import java.util.Scanner;

public class MatrixAddition2 {
		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        
	        System.out.print("Enter the number of rows for the matrices: ");
	        int rows = input.nextInt();
	        System.out.print("Enter the number of columns for the matrices: ");
	        int columns = input.nextInt();

	       
	        int[][] matrix1 = new int[rows][columns];
	        int[][] matrix2 = new int[rows][columns];
	        int[][] matrix3 = new int[rows][columns];
	        int[][] resultMatrix = new int[rows][columns];

	       
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
	                matrix1[i][j] = input.nextInt();
	            }
	        }

	      
	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
	                matrix2[i][j] = input.nextInt();
	            }
	        }
	        System.out.println("Enter the elements of the third matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
	                matrix3[i][j] = input.nextInt();
	            }
	        }
	   
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j] +matrix3[i][j];
	            }
	        }

	     
	        System.out.println("Resultant matrix after addition:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(resultMatrix[i][j] + "\t");
	            }
	            System.out.println();
	        }

	       
	    }
	}
