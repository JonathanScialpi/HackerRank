// https://www.hackerrank.com/challenges/breaking-best-and-worst-records
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        
        int lowest =score[0];
        int lowestCnt = 0;
        int highest =score[0];
        int highestCnt = 0;
        
        for(int x =1;x<score.length;x++){
            if(score[x]<lowest){
                lowest = score[x];
                lowestCnt++;
            }
            if(score[x]>highest){
                highest = score[x];
                highestCnt++;
            }
        }
        System.out.print(highestCnt+" "+lowestCnt);
        
    }
}
