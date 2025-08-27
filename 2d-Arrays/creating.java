import java.util.*;

public class creating {
    public static void largest(int matrix[][]) {
        int lar = 0;
        int n = matrix.length , m = matrix[0].length ;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                lar = Math.max(lar, matrix[i][j]);
            }
        }
        System.out.println("largest number in this matrix is " + lar);
    }
    public static void main(String arg[]) {
        int matrix[][] = new int [3][3];
        int n = matrix.length , m = matrix[0].length ;

        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largest(matrix);
    }
}