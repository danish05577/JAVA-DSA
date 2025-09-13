import java.util.*;

public class quepractice {
    
    // Question 1 : What is the value of x^x for any value of x?
    public static void calculatepowvalue(int x) {
        int pow = x;
        int ans = 1;
        while (pow > 0) {
            if ((pow&1)==1) {
                ans = ans*x;
            }
            pow = pow >> 1;
            x = x*x;
        }
        System.out.println(ans);
    }

// Question 3 : Add 1 to an integer using Bit Manipulation.
// operator
// (Hint : try using Bitwise NOT Operator)
    public static void addone(int x) {
        System.out.println(-(~x));
    }

    // Question 2 - Swap two numbers without using third varriable
    // feel nhi aa rha kuch krna hoga.. :(
    public static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x  + " " + y);
    }
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // calculatepowvalue(x);
        // addone(x);
        swap(x, y);
    }
}
