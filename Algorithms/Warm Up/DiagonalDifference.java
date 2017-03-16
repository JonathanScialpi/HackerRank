// https://www.hackerrank.com/challenges/diagonal-difference
import java.io.*;
import java.util.*;

public class Solution {
    
    public static int calcDiags(int[][] array){
        int diag1=0;
        int diag2=0;
        int index = 0;
            while(index<array.length){
                diag1 += array[index][index];
                diag2 += array[index][array.length-1-index];
                index++;
            }
        return Math.abs(diag1-diag2);
    }
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int [][] myArray = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                myArray[i][j]=in.nextInt();
                
            }
        }
        in.close();
        System.out.print(calcDiags(myArray));
    }
}
