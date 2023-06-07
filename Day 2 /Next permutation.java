import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> a) 
	{
		// Write your code here.
		
		if(a.size() == 1){
			return a;
		}
		else{
			int index = -1;
        int arrMin = Integer.MAX_VALUE;
        int index2 = -1;

        for (int i = a.size() - 2; i >= 0; i--) {
            if (a.get(i) < a.get(i + 1)) {
                index = i;
                break;
            }
        }
		 if (index == -1) {
            Collections.reverse(a);
        }else{
			for (int j = index + 1; j < a.size(); j++) {
                if (a.get(index) < a.get(j) && a.get(j) < arrMin) {
                    arrMin = a.get(j);
                    index2 = j;
                }
            }
		    int temp = a.get(index);
		    a.set(index,arrMin);
		    a.set(index2, temp);
		    int sze = a.size()-1;
		    for(int j=index+1;j<sze;j++){
		    	int temp2 = a.get(j);
		    	a.set(j, a.get(sze));
		    	a.set(sze,temp2);
		    	sze--;
		    } 
		 }
        }
		return a;
	}
}
