import java.util.*;

public class Condition{
    public static void main(String arg[]){
        // int age = 15;
        // if (age >= 18) {
        //     System.out.println("You are an adult : access granted");
        // }
        // else { System.out.println("Go away kid");}

//LARGEST OF 2
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of A");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of B");
        // int b = sc.nextInt();
        // if (a>b){
        //     System.out.println("A is greater");
        // }
        // else {
        //     System.out.println("B is greater");
        // }

//PRINT ODD OR EVEN
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // if (n%2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
// INCOME TAX CALCULATOR
        // System.out.println("Enter you income in lakhs");
        // float i = sc.nextFloat();
        // if (i < 5) {
        //     System.out.println(" Tax = 0 Rs");
        // } else if ( i>=5 && i < 10 ) {
        //     double tax = 0.2 * i ;
        //     System.out.println("20% tax\n tax =" + tax+"Lakhs");
        // } else {
        //     double tax = 0.3 * i ;
        //     System.out.println("30% tax \n tax =" + tax + "Lakhs");
        // }

//PRINT THE LARGEST OF 3
        // System.out.println("Enter the first number");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number");
        // int b = sc.nextInt();
        // System.out.println("Enter the third number");
        // int c = sc.nextInt();
        // if ( a > b) {
        //     if ( a > c) {
        //         System.out.println("First number is the largest");
        //     } else {
        //         System.err.println("Third number is the largest");
        //     }
        // } else {
        //     if ( b > c) {
        //         System.out.println("Second number is the largest");
        //     } else {
        //         System.out.println("Third number is the largest");
        //     }
        // }

// TERNARY OPERATOR
        // int n = sc.nextInt();
        // String num = ((n%2 == 0)) ? "even" : "odd";
        // System.out.println(num);
        
//RESULT CHECKER ( PASS OR FAIL)
        // int marks = sc.nextInt();
        // String result = ((marks >= 33)) ? "PASS":"FAIL";
        // System.out.println(result);

//SWITCH STATEMENT
        // int n = sc.nextInt();
        // switch (n){
        //     case 1 : System.out.println("You shall die");
        //     break;
        //     case 2 : System.out.println("Wanna die");
        //     break;
        //     default : System.out.println("I am the storm that is approaching");
        // }

//CALCULATOR
        // System.out.println("CALCULATOR \n Enter your first number");
        // double a = sc.nextDouble();
        // System.out.println("What do u want to perform? \n +   -   /   *");
        // char o = sc.next().charAt(0);
        // System.out.println("Enter your second number");
        // double b = sc.nextDouble();
        // switch (o) {
        //     case '+' : System.out.println(a+b);
        //     break;
        //     case '-' : System.out.println(a-b);
        //     break;
        //     case '*' : System.out.println(a*b);
        //     break;
        //     case '/' : System.out.println(a/b);
        //     break;
        //     default : System.out.println("Please enter the valid operation");

        // }


//  Question1: Write a Java program to get a number from the user and print whether it is
//  positive or negative.
        // System.out.println("Enter your number:");
        // double n = sc.nextDouble();
        // if (n >= 0) {
        //     System.out.println("Possitive");
        // } else {
        //     System.out.println("Negative");
        // }

//  Question2: print temp above 100 fever...THERMOMETER
        // double temp = sc.nextDouble();
        // if (temp >= 100) {
        //     System.out.println("You have a fever");
        // } else {
        //     System.out.println("You are completely fine");
        // }

//  Question3: Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
//  using switch case
        // System.out.println("Enter the week number(1-7)");
        // int w = sc.nextInt();
        // switch (w) {
        //     case 1 : System.out.println("Monday");
        //     break;
        //     case 2 : System.out.println("Tuesday");
        //     break;
        //     case 3 : System.out.println("Wednesday");
        //     break;
        //     case 4 : System.out.println("Thursday");
        //     break;
        //     case 5 : System.out.println("Friday");
        //     break;
        //     case 6 : System.out.println("saturday");
        //     break;
        //     case 7 : System.out.println("Sunday");
        //     break;
        //     default: System.out.println("No day for u"); 
        // }

// Question5: WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
//  year is a leap year or not
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if ((year%4 ==0) && ((year%100!=0) || (year%400 ==0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Its not a leap year");
        }
    }
}