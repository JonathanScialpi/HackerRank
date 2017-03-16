// https://www.hackerrank.com/challenges/divisible-sum-pairs
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//array size
        int k = in.nextInt();//positive int
        int a[] = new int[n];
        for(int i=0; i < n; i++){//build array
            a[i] = in.nextInt();
        }
        int counter=0;
        for(int x=0;x<a.length;x++){
            for(int y=x+1;y<a.length;y++){
                if((a[x]+a[y])%k==0){
                    counter++;
                }
                
            }
        }
        System.out.print(counter);
    }
}
