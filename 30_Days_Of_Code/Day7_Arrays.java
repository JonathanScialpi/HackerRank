// https://www.hackerrank.com/challenges/30-arrays
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){//build array
            arr[i] = in.nextInt();
        }
        in.close();
        for(int x= 0;x<arr.length;x++){
            System.out.print(arr[arr.length-1-x]+" ");
        }
    }
}
