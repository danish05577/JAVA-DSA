import java.util.*;

public class Nested_loops_pattern {
    public static void main(String Arg[]) {
        Scanner sc = new Scanner(System.in);
// PRINT STAR PATTERN
        // for (int i = 1 ; i<=4 ; i++) {
        //     for (int n = 1 ; n <= i ; n++) {
        //         System.out.print(" *");
        //     }
        // System.out.println();
        // }
// PRINT SAME PATTERN BUT ULTA
        // for (int i = 1 ; i <= 4 ; i++) {
        //     for (int n = 4 ; n >= i ; n--) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

// PRINT HALF PYRAMID PATTERN
        // for (int i = 1 ; i<=4 ; i++) {
        //     for (int n = 1 ; n<=i ; n++) {
        //         System.out.print(" "+n);
        //     }
        //     System.out.println();
        // }

// PRINT SAME PATTERN WITH CHARACTERS
        char ch = 'A' ;
        for (int i = 1 ; i<=4 ; i++) {
            int n = 1 ; 
            while (n<=i) {
                System.out.print(ch);
                n++;
                ch++;
            }
            System.out.println();
        }
    }
}
