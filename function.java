import java.util.*;

public class function {
    public static int result(int num1, int num2) {   // Formal Parameter
        int sum = num1 + num2 ; 
        return sum;
    }
    
    public static int product(int a , int b) {
        int product = a*b ;
        return product;
    }

    public static int factorial(int n) {
        int r = 1;
        int p = n;
        for ( int i = 1 ; i <=p ; i++) {
            r = n*r ;
            n--;
        }
        return r;
    }

    public static int binomial(int n , int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int BC = n_fact/(r_fact * nmr_fact);
        return BC;
    }



//FUNCTION OVERLOADING for sum 
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b , int c) {
        return a+b+c;
    }

    public static boolean prime(int p) {
        boolean isprime = true;
        for (int i = 2 ; i<= Math.sqrt(p) ; i++) {
            if (p%i == 0 && i!=p) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = result(a , b);    //Actual parameter or argument
        // System.out.println("Sum is : "+sum );
        // int product = product( a, b);
        // System.out.println(product);


// FACTORIAL CALCULATION
        // int n = sc.nextInt();
        // factorial(n);

//BINOMIAL COEFFICIENT FINDING
        // int n = sc.nextInt();
        // int n_fac = factorial(n);
        // int r = sc.nextInt();
        // int r_fac = factorial(r);                                //NOT BAD...but i can do it better so lets do better 
        // int r_facts = factorial(n-r);
        // int bc = n_fac/(r_fac*r_facts);
        // System.out.println(bc);
        // System.out.println(binomial(sc.nextInt(),sc.nextInt()));               //I actually really did better.. LOL
        

        // System.out.println(sum(5,3));
        // System.out.println(sum(5,2,1));

        System.out.println(prime(2));
    }
}
