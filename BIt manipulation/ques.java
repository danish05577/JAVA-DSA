import java.util.*;

public class ques {

    //Check if a number is a power of two 
    public static void ispowerof2(int n) {
        boolean r = false;
        if ( (n & (n-1)) == 0) {
            r = true;
        }
        System.out.println(r);
    }

    //Count sets bit in number 
    public static void countset(int n) {
        int count = 0;
        int k = n;
        while (k > 0) {
            if ( (k & 1) == 1) {
                count++;
            }
            k = (k >> 1);
        }
        System.out.println(count);
    }


    //Concept of fast exponential
    public static void fastexpo(int a, int n) {
        int ans = 1;
        while( n > 0) {
            if ( (n & 1) == 1) {
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        // ispowerof2(n);
        // countset(n);
        fastexpo(a, n);
    }
}
