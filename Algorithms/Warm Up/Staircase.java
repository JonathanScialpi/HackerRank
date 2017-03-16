// https://www.hackerrank.com/challenges/staircase
import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] myArray = new char[n][n];
        for(int row =0;row<n;row++){
            for(int column=0;column<myArray[row].length;column++){
                if(row + column >= n - 1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
   
                
            }
            System.out.println();
        }
    }
}
