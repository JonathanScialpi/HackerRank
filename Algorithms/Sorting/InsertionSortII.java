// https://www.hackerrank.com/challenges/insertionsort2
import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {      
        //1 4 3 5 6 2 
        //1 4 3 5 6 2 
        for(int x=1;x<ar.length;x++){
            for(int y=0;y<x;y++)
                if(ar[x]<ar[y]){
                int temp = ar[y];
                ar[y] =ar[x];
                ar[x] = temp;
            }
            printArray(ar);
        }
    }
   
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
