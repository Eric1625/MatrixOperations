import java.util.Scanner;

public class ScalarMult {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the matrix dimensions: ");
		int row = in.nextInt();
		int column = in.nextInt();
		int[][] result = new int[row][column];
		for(int i = 0; i < row; i++) {
			System.out.print("Enter " + column + " values for row " + (i + 1) + ": ");
			for(int j = 0; j < column; j++) {
				result[i][j] = in.nextInt();
			}
		}
		System.out.print("Enter the scalar mutliple: ");
		int scalar = in.nextInt();
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(scalar * result[i][j] + " ");
			}
			System.out.println("");
		}
	}
}