// https://www.hackerrank.com/challenges/30-2d-arrays
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                a[i][j] = in.nextInt();
            }
        }
        int maxVal =0;
        int current =0;
        for(int x=0;x<4;x++){ //row
            for(int y=0;y<4;y++){ //column
                
                    current = a[x][y]+a[x][y+1]+a[x][y+2]+a[x+1][y+1]+a[x+2][y]+a[x+2][y+1]+a[x+2][y+2];
                if(x==0 && y==0){
                maxVal=current; 
           }
                if (current>maxVal){
                    maxVal = current;
                }
            }
        }
        System.out.print(maxVal);
    }
}
