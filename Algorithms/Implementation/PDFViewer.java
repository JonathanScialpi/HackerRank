// https://www.hackerrank.com/challenges/designer-pdf-viewer
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       // Hashtable<Character,Integer> alpha = new Hashtable<>();
        Hashtable<Character,Integer> ht = new Hashtable<>();
        
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int h_i=0; h_i < n; h_i++){// build reference array for height
            h[h_i] = in.nextInt();
        }
        
        for(int y=0;y<n;y++){ //fill table with alphabet and their values
            ht.put(alpha[y],h[y]);
        }
        
        String word = in.next(); //take in the word
        int width = word.length();
        
        int maxValue = 0;
       for(int x =0;x<width;x++){
           if(maxValue==0){
               maxValue = ht.get(word.charAt(0));
           }else if(maxValue<ht.get(word.charAt(x))){
               maxValue = ht.get(word.charAt(x));
           }
       }
        
        System.out.print(width*maxValue);
        //System.out.print(width+" "+maxValue);
    }      
}

