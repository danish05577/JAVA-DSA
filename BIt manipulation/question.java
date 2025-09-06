import java.util.*;

public class question {

//Question 1 - Check odd or even

    public static void checkOddEven(int n) {
        if ( (n & 1) == 1 ) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }

    //QUestion 2 - GEt ith bit

    public static void ithBit(int n , int i) {
        int mod = (n >> i - 1);                               // here 'i' starts from 1 not 0 
        System.out.println(mod & 1);
    }

    //Set ith bit
    public static void setithbit(int n , int i) {
        int bitmask = (1 << i -1);
        System.out.println(n | bitmask);
    }

    //Clear ith bit 
    public static int clearithbit(int n , int i ) {
        int bitmask = ~(1<< i - 1) ;
        int result = n & bitmask;
        return result;
        // System.out.println(n & bitmask);
    }

    //update ith bit 
    public static void updateithbit(int n , int i , int newbit) {
        //METHOD 1
        // if (newbit == 0) {
        //     clearithbit(n, i);
        // } else {
        //     setithbit(n, i);
        // }

        //MEthod 2

        int result = clearithbit(n, i);
        int bitmask = newbit<< i - 1;
        System.out.println( result | bitmask);
        
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int i = sc.nextInt();
        int newbit = sc.nextInt();
        // checkOddEven(n);
        // setithbit(n, i);
        // clearithbit(n, i);
        updateithbit(n, i, newbit);
    }
}
