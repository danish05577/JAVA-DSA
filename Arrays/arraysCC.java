import java.util.*;

public class arraysCC {

    // public static void update(int marks[]) {
    //     for(int i = 0 ; i< marks.length ; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    //                          //Arrays works as by reference (super imp)
    // public static void main(String arg[]) {
    //     int marks[] = {95 , 96 , 98};
    //     update(marks);
    //     for (int i = 0 ; i<=marks.length ; i++) {
    //         System.out.println(marks[i]);
    //     }
    // }



//LINEAR SEARCH

    // public static void linearSearch(int numbers[] , int key){
    //     for (int i = 0 ; i< numbers.length ; i++) {
    //         if (numbers[i] == key) {
    //             System.out.println(i + 1);
    //         }
    //     }
    // }
    // public static void MenuSearch(String menu[] , String desire){
    //     for (int i = 0 ; i< menu.length ; i++) {
    //         if (menu[i] == desire) {
    //             System.out.println(i + 1);
    //         }
    //     }
    // }
    // public static void main(String arg[]){
    //     int numbers[] = {2,3,4,6,50,30,20,10,22,44,55,61};
    //     int key = 22;
    //     linearSearch(numbers, key);
    //     String menu[] = {"Idli" , "Dhosa" , "Samosa" , "Pizza" , "Chole bhature" , "Fried chicken"};
    //     String desire = "Samosa";
    //     MenuSearch(menu, desire);
    // }

//LARGEST IN ARRAYS 
    
    // public static int largest(int largest[]) {
    //     int lar = Integer.MIN_VALUE;
    //     for (int i = 0 ; i<largest.length ; i++) {
    //         if (lar < largest[i]) {
    //             lar = largest[i];
    //         }
    //     }
    //     return lar;
    // }
    // public static void main(String arg[]) {
    //     int largest[] = {2,5,3,6,8,7};
    //     System.out.println(largest(largest));
    // }


//BINARY SEARCH
    // public static int binsearch(int numbers[] , int key) {
    //     int start = 0 , end = numbers.length - 1;
    //     while(start <= end) {
    //         int mid = (start + end)/2;
    //         if (numbers[mid] == key) {
    //             return mid;
    //         } 
    //         else if (numbers[mid] > key) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String arg[]) {
    //     int numbers[] = {2,4,6,8,10,12,14};
    //     int key = 10;
    //     System.out.println("The index of key is : " + binsearch(numbers , key));
    // }



//REVERSE IN ARRAY
// public static void reverse(int numbers[]) {
//     int start = 0 , end = numbers.length -1 ;
//     while (start <= end) {
//         int temp = numbers[end];
//         numbers[end] = numbers[start];
//         numbers[start] = temp;
//         start++;
//         end--;
//     }
// }
//     public static void main(String arg[]){
//         int numbers[] = {2,4,8,10,12};
//         reverse(numbers);
//         for (int i = 0 ; i < numbers.length ; i++) {
//             System.out.print(numbers[i]+ " ");
//         }
//     }


// PAIRS IN ARRAYS

    // public static void pairs(int numbers[]) {
    //     int a = 0 , b = 0 , tp = 0;
    //     while (a < numbers.length) {
    //         b = a+1;
    //         while(b< numbers.length) {
    //             System.out.print(" (" + numbers[a] + "," + numbers[b] + ") ");
    //             b++;
    //             tp++;
    //         }
    //         System.out.println();
    //         a++;
    //     }
    //     System.out.println("Total number of pairs are : "+ tp );
    // }
    // public static void main(String arg[]) {
    //     int numbers[] = {2,4,8,10,12};
    //     pairs(numbers);
    // }

//PRINT SUBARRAYS AND FIND MAX SUM OF SUBARRAY                                                           //BRUTE FORCE
    // public static void subarrays(int numbers[]) {
    //     int start = 0 , end = 1 , ts = 0, cursum = 0;
    //     while (start < numbers.length) {
    //         end = start +1 ;
    //         while(end <=numbers.length) {
    //             int sum = 0;
    //             for (int i = start ; i < end ; i++) {
    //                 System.out.print(numbers[i] + " ");
    //                 sum = numbers[i] + sum;
    //                 if (cursum < sum) {
    //                     cursum = sum;
    //                 }
    //             }
    //             System.out.println("[Sum = " + sum);
    //             System.out.println();
    //             end++;
    //             ts++;
    //         }
    //         System.out.println();
    //         start ++;
    //     }
    //     System.out.println("Total subarrays = " + ts);
    //     System.out.println("Max Sum of SA = " + cursum);
    // }

//PREFIX SUM same question but with better time complexity
    // public static void SAprefix(int numbers[]) {
    //     int prefix[] = new int[numbers.length];
    //     prefix[0] = numbers[0];
    //     for (int i =1 ; i < prefix.length ; i++) {
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }
    //     for (int i =0 ; i < prefix.length ; i++) {
    //         System.out.print(prefix[i] + " ");
    //     }

    //     int start = 0 , end = 0 , maxsum = Integer.MIN_VALUE , cursum = Integer.MIN_VALUE;
    //     while(start < numbers.length) {
    //         end = start + 1;
    //         while(end < numbers.length) {
    //             cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
    //             if (cursum > maxsum) {
    //                 maxsum = cursum;
    //             }
    //             end++;
    //         }
    //         start++;
    //     }
    //     System.out.println();
    //     System.out.println("Max sum = " + maxsum);
    // }

    
    // public static void main(String arg[]) {
    //     // int numbers[] = {2,4,6,8,10};
    //     int numbers[] = {1,-2,6,-1,3};
    //     // subarrays(numbers);
    //     SAprefix(numbers);
    // }


//SAME Que but we can do it with only one loop by using KADANE's method
    public static void kadane(int numbers[]) {
        int cursum = 0 , maxsum = 0 ;
        for (int i = 0 ; i< numbers.length ; i++) {
            cursum = numbers[i] + cursum;
            if (cursum < 0) {
                cursum = 0;
            } 
            if (cursum > maxsum) {
                maxsum = cursum;
            }
        }
        System.out.println("Max sum is " + maxsum);
    }

    public static void main(String arg[]) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }

}




//last 3 questions are very important for placement interview
