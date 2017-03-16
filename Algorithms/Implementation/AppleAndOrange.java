// https://www.hackerrank.com/challenges/apple-and-orange
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();// start of red
        int t = in.nextInt();// end of red
        int a = in.nextInt();//loc of apple tree
        int b = in.nextInt();//loc of orange tree
        int m = in.nextInt();// apples
        int n = in.nextInt();// oranges
        int[] apple = new int[m];
        int[] orange = new int[n];
        int appCounter = 0;
        int orgCounter = 0;
        
        for(int apple_i=0; apple_i < m; apple_i++){ //build apples
            apple[apple_i] = in.nextInt();
        }
        
        for(int orange_i=0; orange_i < n; orange_i++){ // build oranges
            orange[orange_i] = in.nextInt();
        }
        
        for(int i=0;i<apple.length;i++){
            if(apple[i]+a>=s && apple[i]+a<=t){
                appCounter++;
            }
           
        }
        System.out.println(appCounter);
        
        for(int i=0;i<orange.length;i++){
            if(orange[i]+b>=s && orange[i]+b<=t){
                orgCounter++;
            }
           
        }
        System.out.println(orgCounter);
    }
}
