import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
       HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++){
                        if(k<=j){
                            matrix[i][k]=0;
                        } 
                        else{
                            if(matrix[i][k]==0){
                                s.add(k); 
                            }
                            matrix[i][k]=0;
                        }
                    }
                    s.add(j); 
                    break;
                }
            }
        } 
        for(Integer j : s){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j] = 0;
            }
        }   
    }

}
