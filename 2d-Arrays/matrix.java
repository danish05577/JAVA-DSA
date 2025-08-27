import java.util.*;

public class matrix {

    
    
    //Print spiral matrix
    public static void printspiral(int matrix[][]) {
        int rowStart = 0, colStart = 0;
        int rowEnd = matrix.length - 1 , colEnd = matrix.length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int j = colStart ; j <= colEnd ; j++) {
                System.out.print(matrix[rowStart][j] + " ");
            }
            for (int i = rowStart + 1 ; i <= rowEnd ; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            for (int j = colEnd - 1 ; j >= colStart ; j--) {
                System.out.print(matrix[rowEnd][j] + " ");
            }
            for (int i = rowEnd - 1 ; i >= rowStart + 1 ; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
    }

    //Find the sum of its diagonals
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0 ; i < matrix.length ; i++) {
            sum = sum + matrix[i][i];
        }
        int j = matrix.length - 1;
        for (int i = 0 ; i < matrix.length ; i++) {
            if (i==j) {       //imp for odd matrix
                return;
            }
            sum = sum + matrix[j][i];
            j--;
        }
        System.out.println("Sum of its diagonal is " + sum);
    }

    //Search in sorted matrix
    public static boolean search(int matrix[][], int key) {
        int row = 0, col = matrix.length-1;
        while (row < matrix.length && col >=0) {
            if (key == matrix[row][col]) {
                System.out.println("Key found at " + "(" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        // int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // printspiral(matrix);
        // diagonalSum(matrix);
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        search(matrix,key);
    }
}
