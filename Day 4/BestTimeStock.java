import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here. 
         int diff = 0; int buy = prices.get(0); int profit = 0; int mini = prices.get(0);
       for(int i=1;i<prices.size();i++){
           diff = prices.get(i) - buy;
           if(diff>profit){
               profit = diff;
           }
           if(diff < 0){
               buy = prices.get(i);
           } 
       } 
       return profit;
    }
}
