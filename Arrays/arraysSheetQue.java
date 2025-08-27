import java.util.*;

public class arraysSheetQue {

//Question 1 : Checking Dupplicate elements in a given array

    //Brute force method .......Hashset method didnt studied yet
    public static void Dupplicate(int input[]) {
        boolean output = false;
        for (int i = 0 ; i< input.length-1 ; i++ ) {
            for (int j = i + 1 ; j < input.length ; j++) {
                if (input[i] == input[j]) {
                    output = true;
                }
            }
        }
        System.out.println(output);
    }



// Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

    public static void triplets(int trip[]) {
        for (int i = 0 ; i < trip.length-2 ; i++) {
            for (int j = i + 1 ; j< trip.length -1 ; j++) {
                for (int k = j + 1 ; k < trip.length ; k++) {
                    int sum = trip[i] + trip[j] + trip[k];
                    if ( sum == 0 && i!=j && j!=k && k!=i) {
                        System.out.println(trip[i] + " " + trip[j] + " " + trip[k]);
                    }
                }
            }
        }
    }


    public static void main (String arg[]) {
        int input[] = {1,2,3,1};
        int trip[] = {-1,0,1,2,-1,-4};
        // Dupplicate(input);
        triplets(trip);
    }
}



//DUE for now cuz it requires more terms knowledge that i will study further in course ...