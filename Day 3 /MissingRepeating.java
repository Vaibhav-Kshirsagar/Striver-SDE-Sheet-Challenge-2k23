import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int ans[] = new int[2];
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.size();i++){
            if(s.contains(arr.get(i))){
                ans[1] = arr.get(i);
            }
            s.add(arr.get(i));
        } 
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                ans[0] = i;
            }
        } 
        return ans;
    } 
}
