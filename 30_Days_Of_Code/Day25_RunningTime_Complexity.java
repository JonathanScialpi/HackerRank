// https://www.hackerrank.com/challenges/30-running-time-and-complexity
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int x=0;x<n;x++){
        BigInteger current = in.nextBigInteger();
            if(current.isProbablePrime(1)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
            }
                
        }
    }
