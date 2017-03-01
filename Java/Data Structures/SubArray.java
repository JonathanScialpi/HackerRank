// https://www.hackerrank.com/challenges/java-negative-subarray
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int counter = 0;
        for(int j=0; j<n; j++){
            int sum = 0;
            for(int k=j; k<n; k++){
                sum += arr[k];
                if(sum<0){
                    counter ++;
                }
            }
        }
        System.out.print(counter);
    }}
