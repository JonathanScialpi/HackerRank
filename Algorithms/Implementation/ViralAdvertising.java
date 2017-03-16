// https://www.hackerrank.com/challenges/strange-advertising
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 5;
        int sum = 0;
        for(int i = 0; i < n; i++)
            {
            res = res/2;
            sum +=res;
            res = res * 3;
        }
        System.out.println(sum);
    }
}
