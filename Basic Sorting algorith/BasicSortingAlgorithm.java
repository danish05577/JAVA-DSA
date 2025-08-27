import java.util.*;

public class BasicSortingAlgorithm {

//print arrays
    public static void printArr(Integer nums[]) {
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }

//Bubble sort

    public static void bubblesort(int nums[]) {
        int swaps = 0;
        for (int l =0 ; l < nums.length-1 ; l++) {
            for (int i = 0 ; i < nums.length-1-l ; i++ ) {
                if (nums[i] > nums[i+1]) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                    swaps++;
                }
            }
        }
        for (int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("No. of swaps = " + swaps);
    }

//Selection sort         currection required!!!

    public static void selectionsort(int nums[]) {
        for (int i = 0 ; i < nums.length ; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i ; j < nums.length ; j++) {
                if (min > nums[j]) {
                    int temp = nums[i];
                    min = nums[j];
                    nums[i] = min;
                    nums[j] = temp;
                }
            }
        System.out.print(nums[i]);
        }
    }

//Insertion sort

    public static void insertionSort(int nums[]) {
        for (int i = 1 ; i<nums.length ; i++ ) {
            int curr = nums[i] ;
            int prev = i - 1;
            while (prev>=0 && curr < nums[prev] ) {
                nums[prev +1] = nums[prev]; 
                prev--;              
            }
            nums[prev + 1] = curr;
        }
    }

// COUNTING SORT : it is used less range and it almost gives linear TC 

    public static void countingSort(Integer )

    public static void main (String arg[]) {
        Integer nums[] = {5,4,1,3,2};
        // bubblesort(nums);
        // selectionsort(nums);
        // insertionSort(nums);

//   INBUILT SORT : its an inbuilt function of java... remember its syntax..and also its TC is O(n log n)
        Arrays.sort(nums , 0 , 3 , Collections.reverseOrder());
        printArr(nums);
    }
}