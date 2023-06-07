import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer> s = new HashSet<>();
        for(Integer num : arr){
            if(s.contains(num)){
                return num;
            }
            s.add(num);
        }
        return 0;
    }
}
