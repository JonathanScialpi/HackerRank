// https://www.hackerrank.com/challenges/compare-the-triplets
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int scores[] = new int[6];
       while(in.hasNextInt()){
           for(int i = 0; i<=scores.length-1;i++){  
               scores[i] = in.nextInt(); 
           }
       }
    int aCounter =0;
    int bCounter =0;
        if(scores[0]>scores[3]){
            aCounter++;
        }else if(scores[0]<scores[3]){
            bCounter++;
        }
       if(scores[1]>scores[4]){
            aCounter++;
        }else if(scores[1]<scores[4]){
            bCounter++;
        }
        if(scores[2]>scores[5]){
            aCounter++;
        }else if(scores[2]<scores[5]){
            bCounter++;
        }
        System.out.print(aCounter+" "+bCounter);
    }
}
