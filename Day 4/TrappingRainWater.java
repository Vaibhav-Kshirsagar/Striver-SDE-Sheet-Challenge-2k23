import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long leftMax[] = new long[n];
        long rightMax[] = new long[n];
        // long lmax = arr[0]; long rmax = arr[n-1];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        for(int i=1;i<n;i++){
            leftMax[i] = Long.max(leftMax[i-1], arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Long.max(arr[i], rightMax[i+1]);
        }
        long area = 0;
        for(int i=0;i<n;i++){
            area += Long.min(rightMax[i], leftMax[i]) - arr[i];
        } 
        return area;
    }
}
