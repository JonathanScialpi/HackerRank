// https://www.hackerrank.com/challenges/30-loops
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value =0;
        for(int x= 1; x<11;x++){
            value = n*x;
            System.out.println(n+" x "+x+" = "+value);
        }
    }
}
