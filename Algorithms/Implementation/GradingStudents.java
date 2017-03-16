// https://www.hackerrank.com/challenges/grading
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            int val = 5-grade%5;
            if(val<3 && grade+val>=40){
            grade = grade+val;
            }
            System.out.println(grade);
            
        }
    }
}
