import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here 
		long sum = 0; 
		long maxsum = 0;
		for(int i=0;i<n;i++){
			if(sum<0){
				sum = 0;
			}
			sum += arr[i];
			if(sum>maxsum){
				maxsum = sum ;
			} 
		} 
		return maxsum;
	}

}
