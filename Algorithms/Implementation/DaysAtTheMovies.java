// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static int reverse(int input){
       String str = Integer.toString(input);
        String rev = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(rev);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] days = new int[3];
        int count =0;
        int begin = in.nextInt();
        int last = in.nextInt();
        int divisor = in.nextInt();
        for(int x=begin;x<=last;x++){
           int value = Math.abs(x-reverse(x));
               if(value%divisor==0){
               count++;
           }
        }
        System.out.print(count);
    }
}
