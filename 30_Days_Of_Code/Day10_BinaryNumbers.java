// https://www.hackerrank.com/challenges/30-binary-numbers
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String binary = Integer.toBinaryString(num);
        int index =0;
        int maxVal=0;
        for(int x=0;x<binary.length();x++){
          int counter =0;
            if(binary.charAt(x)=='1'){
              counter++;
              for(int y =x+1;y<binary.length();y++){
              if(binary.charAt(y)=='1'){
                  counter++;
              }else{
                  break;
              }
              }
          }
            if(counter>maxVal){
                    maxVal = counter;
                }
         }
                
         System.out.print(maxVal);
            }
        }
       
