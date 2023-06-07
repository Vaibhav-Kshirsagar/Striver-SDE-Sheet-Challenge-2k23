import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here. 
        int temp[] = new int[m+n];
        // System.out.print("arr1:-"+m+" arr2:-"+arr1.length);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int zeroIndex=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==0){
                zeroIndex++;
            }else{
                break;
            }
        }
        int arr2Index = 0; int count =0;
        for(int i=0;i<m+n && arr2Index<n && zeroIndex<arr1.length ;i++){
            if(arr2[arr2Index]<arr1[zeroIndex]){
                temp[i] = arr2[arr2Index];
                arr2Index++;
            }else{
                temp[i] = arr1[zeroIndex];
                zeroIndex++;
            }
            count++;
        }   
        while(zeroIndex<arr1.length){
            temp[count] = arr1[zeroIndex];
            zeroIndex++;
            count++;
        }
        while(arr2Index<n){
            temp[count] = arr2[arr2Index];
            arr2Index++;
            count++;
        }
        return temp;
    }
}
