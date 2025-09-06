import java.util.*;

public class quepractice {

//Question 1 - Count how many times vowel occured in lowercase in a string entered by user.

    public static void checkVowels(String str) {
        int count = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        checkVowels(str);
    }
}
