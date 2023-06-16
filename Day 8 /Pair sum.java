import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here. 
        List<int[]> pairSum = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == s){
                    int[] a = new int[2];
                    a[0] = Math.min(arr[i], arr[j]);
                    a[1] = Math.max(arr[i], arr[j]);
                    pairSum.add(a);
                }
            }
        }  
        Collections.sort(pairSum, Comparator.comparingInt(ar->ar[0])); 
        // pairSum.sort(null);
        return pairSum;
    }
}
