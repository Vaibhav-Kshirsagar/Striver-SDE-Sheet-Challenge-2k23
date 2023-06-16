import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here. 
        int floor = arr.size()/3;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        // HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<arr.size();i++){
            if(!mp.containsKey(arr.get(i))){
                mp.put(arr.get(i), 1);
            }else{
                mp.put(arr.get(i), mp.get(arr.get(i))+1);
            }
        } 
        for(Map.Entry<Integer,Integer> ele : mp.entrySet()){
			if(ele.getValue() > floor){
				ans.add(ele.getKey());
			}
		}
        return ans;
    }
}
