// https://www.hackerrank.com/challenges/between-two-sets
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        
        // members of A can go into x
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            
        }
        
        // members of B can be divided by x
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        ArrayList<Integer> listX = new ArrayList<>(); //holds all the possible X values
        Arrays.sort(b);
        
        for(int x = 1; x<=b[0]; x++){
            boolean aVal = true;
            boolean bVal = true;
            for(int y=0;y<a.length;y++){
                if(x%a[y] > 0){
                aVal = false;
                break;
                }
            }
            for(int z=0;z<b.length;z++){
                if(b[z]%x > 0){
                    bVal= false;
                    break;
                }
            }
            if(aVal==true && bVal==true){
               listX.add(x);
            }
        }
       
        System.out.print(listX.size());
    }
}
