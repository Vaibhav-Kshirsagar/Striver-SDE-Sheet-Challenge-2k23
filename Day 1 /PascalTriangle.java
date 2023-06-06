import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> LL = new ArrayList<>();
        ArrayList<Long> L = new ArrayList<>();
		// not only 1 add 1L due to long type.
        L.add(1L);
        LL.add(L); 
        if(n==1){
            return LL;
        }
        ArrayList<Long> L1 = new ArrayList<>();
        L1.add(1L);
        L1.add(1L);
        LL.add(L1);
         if(n==2){
            return LL;
        } 
        for(int i=3;i<=n;i++){
            ArrayList<Long> l = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0){
                    l.add(1L);
                    continue;
                }
                if(j==i-1){
                    l.add(1L);
                    continue;
                } 
                l.add(LL.get(i-2).get(j-1) + LL.get(i-2).get(j));
            } 
            LL.add(l);
        } 
        return LL;
	}
}
