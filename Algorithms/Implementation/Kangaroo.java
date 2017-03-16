// https://www.hackerrank.com/challenges/kangaroo
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();//first kang 0 
        int v1 = in.nextInt();//first kang speed 2
        int x2 = in.nextInt();// second kang 5
        int v2 = in.nextInt();// second kang speed 3
        int index =1;
        int orig1 = x1;
        int orig2 = x2;
        boolean answer =false;
        while(index<=10000){
            x1 = v1*index + orig1;
            x2 = v2*index + orig2;
            if(x1==x2){
                answer = true;
                break;
            }
            index++;
        }
        if (answer){
            System.out.print("YES");
        }else if(!answer){
            System.out.print("NO");
        }
    }
}
