public class quepractice {

//     Question 1 : Print the number of 7's that are in the 2d array.
// Example :
// Input- int|[] array= { {4,7,8},{8,8,7} };
// Output - 2

    public static void printTimes(int array [][],int key) {
        int times = 0;
        for (int row = 0 ; row < array.length ; row++) {
            for (int col = 0 ; col < array[0].length ; col++) {
                if (key == array[row][col]) {
                    times++;
                }
            }
        }
        System.out.println("the number came " + times + " times");
    }

//     Question 2 : Print out the sum of the numbers in the second row of the "nums" array.
// Example :
// Input - int|| nums= { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

    public static void sum2row(int nums[][]) {
        int row = 1;
        int sum = 0;
        for (int col = 0 ; col < nums[1].length ; col++) {
            sum = sum + nums[1][col];
        }
        System.out.println("The sum of 2nd row is " + sum);
    }

//     Question 3 : Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

// Matrix
// a11 a12 a13
// a21 a22 a23
//     Transposed Matrix
// a11 a21
// a12 a22
// a13 a23

    public static void transpose(int nums[][]) {
        //transpose
        int matrix[][] = new int[3][3];
        for (int row = 0; row < nums.length ; row++) {
            for (int col = 0; col < nums[0].length ; col++) {
                matrix[col][row] = nums[row][col];
            }
        }
        // printing new matrix
        for (int row = 0; row < nums.length ; row++) {
            for (int col = 0; col < nums[0].length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String arg[]) {
        // int[][] array = { {4,7,8},{8,8,7} };
        // int key = 8;
        // printTimes(array, key);
        int[][] nums= { {1,4,9},{11,4,3},{2,2,3} };
        // sum2row(nums);
        transpose(nums);
    }
}