import java.util.*;

public class stringque {

    //Check if a String is palindrome or not . 
    //Palindrome is a word jo ki starting or end dono se same hota hai ...eg: madam,etc.

    public static void checkpalindrome(String name) {
        int end = name.length() - 1;
        for (int start = 0 ; start < name.length()/2 ; start++) {
            if (name.charAt(start) != name.charAt(end)) {
                System.out.println("This is not a palindrome");
                return;
            }
            end--;
        }
        System.out.println("This word is palindrome");
    }

    //Find the sshortest distance
    public static void shortestDistance(String distance) {
        int x = 0 , y = 0 ;
        for (int i = 0 ; i < distance.length() ; i++) {
            if (distance.charAt(i) == 'W') {
                x--; 
            }
            else if (distance.charAt(i) == 'E') {
                x++;
            }
            else if (distance.charAt(i) == 'N') {
                y++;
            }
            else if (distance.charAt(i) == 'S') {
                y--;
            }
        }
        double displacement = Math.sqrt(x*x + y*y);
        System.out.println(displacement);
    }
    public static void main (String arg[]) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // checkpalindrome(name);
        String distance = "WNEENESENNN" ;
        shortestDistance(distance);

    }
}
