import java.util.*;

public class loops {
    public static void main(String arg[]){
        // int counter = 0 ;
        // while ( counter < 5) {
        //     System.out.println("Hello World");
        //     counter +=1;
        // }

//PRINT NUMBER FROM 1 TO 10
        // int x = 1;
        // while (x < 11) {
        //     System.out.println(x);
        //     x+=1;
        // }
//PRINT NUMBER FROM 1 to n
        Scanner sc = new Scanner(System.in);
        // int x = 1;
        // int n = sc.nextInt();
        // while (x <= n ) {
        //     System.out.println(x);
        //     x += 1;
        // }

//PRINT SUM OF FIRST N NATURAL NUMBER
        int x = 1;
        int sum = 0;
        int n = sc.nextInt();
        while (x <= n) {
            sum += x;
            x++;
        }
        System.out.println(sum);
    }
    
}
