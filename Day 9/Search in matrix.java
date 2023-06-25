import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here. 
       int n = mat.size();
       int m = mat.get(0).size();

        int low = 0;
        int high = ( n*m )- 1;

        while(low <= high){
            int mid = high - (high - low)/2;
            int value = mat.get(mid/m).get(mid%m);

            if(value == target) return true;

            if(value > target)
                high = mid-1;
            else
                low = mid+1;
        }

        return false;
    }
}
