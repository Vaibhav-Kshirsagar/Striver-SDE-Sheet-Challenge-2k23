import java.io.*;
import java.security.Key;
import java.util.* ;
// import com.sun.jdi.Value;
// import com.sun.jdi.Value;
public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here. 
		int floor = n/2;
		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i=0;i<n;i++){
			if(mp.containsKey(arr[i])){
				mp.put(arr[i], mp.get(arr[i])+1);
			}else{
				mp.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer,Integer> ele : mp.entrySet()){
			if(ele.getValue() > floor){
				return ele.getKey();
			}
		} 
		return -1;
	}
}
