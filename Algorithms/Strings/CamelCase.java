// https://www.hackerrank.com/challenges/camelcase
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter =1;
        for(int x=0;x<s.length();x++){
            if(Character.isUpperCase(s.charAt(x))){
                counter++;
            }
        }
        System.out.print(counter);
    }
}
