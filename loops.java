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
        // int x = 1;
        // int sum = 0;
        // int n = sc.nextInt();
        // while (x <= n) {
        //     sum += x;
        //     x++;
        // }
        // System.out.println(sum);
//FOR LOOP
        // for (int i = 0 ; i <= 10 ; i+=2) {
        //     System.out.println("Hello World");
        // }

//PRINT SQUARE PATTERN
        // for ( int i = 1 ; i<5 ; i++){
        //     System.out.println("****");
        // }
        // int i = 0;
        // while (i<4) {
        //     System.out.println("****");
        //     i++;
        // }

//FIND REVERSE OF A NUMBER
        // int n = 10897;
        // while ( n > 0) {
        //     System.out.print(n%10);
        //     n = n/10;
        // }
        
//REVERSE THE GIVEN NUMBER
        // int n = sc.nextInt();
        // int rev = 0;
        // while ( n>0) {
        //         rev = rev*10 + n%10;
        //         n = n/10;
        //         if (n==0){
        //                 System.out.println(rev);
        //         }
        // }

//DO WHILE LOOP
        // int i = 0;
        // do{
        //         System.out.println("Hello World");
        //         i++;
        // } while (i<5);

//KEEP ENTERING THE NUMBER TILL USER ENTERS A MULTIPLE OF 10
        // int n = sc.nextInt();
        // while ( n > 0 ) {
        //         if (n%10 == 0){
        //                 break;
        //         }
        //         System.out.println("Try again");
        //         n =sc.nextInt(); 
        // }
        // System.out.println("HEHE");

//PRINT ODD NUMBER 
        // for ( int i =0 ; i <= 10 ; i++){
        //         if ( i%2 == 0) {
        //                 continue;
        //         }
        //         System.out.println(i);
        // }

//DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLE OF 10
        // for ( int n = sc.nextInt() ; true ; n= sc.nextInt() ) {
        //         if ( n%10==0 ) {
        //                 System.out.println("Try again");
        //                 continue;
        //         }
        //         System.out.println("NICE");
        // }                   
        
//CHECK IF NUMBER IS PRIME OR NOT
        // int n = sc.nextInt();
        // for ( int i = 2 ; i <= Math.sqrt(n) ; i++) {
        //         if ( n%i ==0 && i!=n ) {
        //                 System.out.println("NOT PRIME");
        //                 break;
        //         } else {
        //                 System.out.println("Prime");
        //                 break;
        //         }
        // }

//  Question2: Writeaprogramthatreadsasetof integers,andthenprintsthesumofthe
//  even and odd integers
        int sum = 0;
        for ( int n = sc.nextInt() ; true ; n = sc.nextInt()) {
                sum = sum + n;
                System.out.println(sum);
        }
    }
}
