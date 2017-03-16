// https://www.hackerrank.com/challenges/repeated-string
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long counter = 0;
        for(int x=0;x<s.length();x++){
            if(s.charAt(x)=='a'){
                counter++;
            }
        }
        long answer = 0;
        long divide = n/s.length();
       
        if(counter==0){
            answer=0;
        }
        else if(s.length()==1){
           answer = n;
        }else{
            
            int remains=0;
            long remainder = n%s.length();
            for(int x=0;x<remainder;x++){
                if(s.charAt(x)=='a'){
                    remains++;
                }
            }
            answer = counter*divide+remains;
        }
        System.out.print(answer);
    }
}
