import java.util.*;

public class function2 {
    public static boolean prime(int n) {
        boolean isprime = true;
        for (int i = 2 ; i<=Math.sqrt(n) ; i++) {
            if (n%i == 0 && i!=n) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void primeinrange(int n) {
        for (int i =2 ; i <= n ; i++) {
            if (prime(i) == true) {
                System.out.print(" " +i);
            }
        }
    }

    public static void main(String arg[]) {
        primeinrange(20);
    }
}
