// https://www.hackerrank.com/challenges/java-string-compare
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
       
        String valueMax = s.substring(0,n);
        String valueMin = s.substring(0,n);
       
        for(int x=0;x-1+n<s.length();x++){
            String current = s.substring(x, x+n);
            
            if(current.compareTo(valueMax)>0){
                valueMax = current;
            }
            if(current.compareTo(valueMin)<0){
                valueMin = current;
            }
           
        }
        System.out.println(valueMin);
        System.out.println(valueMax);
    }
}
