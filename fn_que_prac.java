import java.util.*;

public class fn_que_prac {

// Question 1 : Write a Java method to compute the average of three numbers..
    public static void average(double a , double b , double c) {
        double avg = (a + b + c)/3;
        System.out.println(avg);
    }

// Question 2 : Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test your
//  method

    public static void isEven(int n) {
        boolean even = false;
        if (n%2 == 0) {
            even = true;
        }
        System.out.println(even);
    }

//  Question 3 : Write a Java program tocheckif a number is a palindrome in Java? ( 121 is a
//  palindrome, 321 is not)
//  Anumberis called a palindrome if the number is equal to the reverse of a number e.g., 121 is a
//  palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
//  palindrome because the reverse of 321 is 123, which is not equal to 321

    public static void palindrome(int n) {
        int mynum = n;
        int p = 0;
        while(n>0) {
            p = p*10 + n%10;
            n = n/10;
        }
        if ( mynum == p ) {
            System.out.println(mynum + " is palindrome i.e " + p);
        } else {
            System.out.println(mynum + " is not a palindrome i.e " + p);
        }
    }

//QUESTION 5 :  Write a Java method to compute the sum of the digits in an integer.

    public static void digitsum(int n) {
        int digit = n;
        int sum = 0;
        while( n>0) {
            sum = sum + n%10;
            n = n/10;
        }
        System.out.println("The sum of the digit of " + digit + " is " + sum);
    }

    public static void main(String arg[]) {
        // average(2, 4, 6);
        // isEven(5);
        // palindrome(124);
        // digitsum(123456789);
    }


}
          //DUE Q4

//  Question 4 : READ & CODE EXERCISE
//  Search about(Google) & use the following methods of the Math class in Java:
//  a. Math.min( )
//  b. Math.max( )
//  c. Math.sqrt( )
//  d. Math.pow( )
//  e. Math.avg( )
//  f. Math.abs( )                 