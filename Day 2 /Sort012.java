import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here 
        int zero = 0 ; int one = 0; int two = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] == 1){
                one++;
            }
            else if(arr[i] == 2){
                two++;
            }
        } 
        for(int i=0;i<arr.length;i++){
            while(zero-->0){
               arr[i] = 0;
               i++;
            }
            while(one-->0){
               arr[i] = 1;
               i++;
            }
            while(two-->0){
               arr[i] = 2;
               i++;
            }
        }
    }
}
