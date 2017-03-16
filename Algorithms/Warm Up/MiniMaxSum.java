// https://www.hackerrank.com/challenges/mini-max-sum
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long array[] = new long[5];
        
        array[0] = b+c+d+e;
        array[1] = a+c+d+e;
        array[2] = a+b+d+e;
        array[3] = a+b+c+e;
        array[4] = a+b+c+d;
        
        Arrays.sort(array);
        System.out.print(array[0]+" "+array[4]);
        
    }
}
