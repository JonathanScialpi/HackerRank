// https://www.hackerrank.com/challenges/30-recursion
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        private static int factorial(int n) {
            //base case
            int total=0;
            if(n<=1){
                return 1;
            }
            else if(n>1){
             total = n * factorial(n-1);
            }
            return total;
            //recursive case
    } 
 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print(factorial(num));
    }
}
