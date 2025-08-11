import java.util.*;

public class fn3binNum {

// binary to decimal
    public static int binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            decNum = decNum + (binNum%10)*(int)Math.pow(2 , pow);
            binNum = binNum /10 ;
            pow++;
        }
        return decNum;
    }


// decimal to binary
    public static void decToBin(int decNum) {
        int decimal = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum > 0) {
            binNum = binNum + (decNum%2)*(int)Math.pow(10, pow);
            pow++;
            decNum = decNum/2;
        }
        System.out.println("the binary number of " + decimal + " is " + binNum);
    }

    public static void main(String arg[]) {
        decToBin(7);
    }
}
