//https://www.hackerrank.com/challenges/migratory-birds/forum
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[5];
        types[0]=0;
        types[1]=0;
        types[2]=0;
        types[3]=0;
        types[4]=0;
        for(int types_i=0; types_i < n; types_i++){
            int current = in.nextInt();
            if(current == 1){
                types[0]++;
            }else if(current == 2){
                types[1]++;
            }else if(current == 3){
                types[2]++;
            }else if(current == 4){
                types[3]++;
            }else if(current == 5){
                types[4]++;
            }
        }
        int maxVal = types[0];
        int maxID = 0;
        for(int x=0;x<types.length;x++){
            if(types[x]>maxVal){
                maxID = x;
                maxVal=types[x];
            }
        }
        System.out.println(maxID+1);
  }
}
