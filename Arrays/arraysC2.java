import java.util.*;

public class arraysC2 {

// TRAPED RAINWATER QUESTION 

    public static void trap(int height[]) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int width = 1;
        int tw = 0;
        for (int i = 0 ; i < height.length ; i++) {
            int maxleft = 0;
            int maxright = 0;
            for ( int j = i ; j >= 0 ; j--) {
                if (maxleft < height[j]) {
                    maxleft = height[j];
                }
                left[i] = maxleft;
            }
            for ( int j = i ; j < height.length ; j++) {
                if (maxright < height[j]) {
                    maxright = height[j];
                }
                right[i] = maxright;
            }
            tw = tw + (Math.min(left[i],right[i]) - height[i])*width;
        }
        System.out.println("Trapped Rainwater = " + tw + " Cubic unit");
    }

    public static void main(String arg[]) {
        int height[] = {4,2,0,6,3,2,5};
        trap(height);
    }
}
