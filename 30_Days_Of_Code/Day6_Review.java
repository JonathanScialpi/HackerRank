// https://www.hackerrank.com/challenges/30-review-loop
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int lines =in.nextInt();
        in.nextLine();//junk
       for(int x =0;x<lines;x++){//build

           String current = in.nextLine();
           for(int y=0;y<current.length();y++){ //print even
               if(y%2==0 || y==0){
                   System.out.print(current.charAt(y));
               }
               if(y==current.length()-1){
                   System.out.print(" ");
               }
           }
           for(int y=0;y<current.length();y++){ //print even
               if(y%2>0){
                   System.out.print(current.charAt(y));
               }
              
           }
           System.out.println();
       }
        }
    }
