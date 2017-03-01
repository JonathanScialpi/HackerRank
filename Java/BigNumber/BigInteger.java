// https://www.hackerrank.com/challenges/java-biginteger
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger first = in.nextBigInteger();
        BigInteger second = in.nextBigInteger();
        BigInteger output1 = first.add(second);
        BigInteger output2 = first.multiply(second);
        System.out.println(output1);
        System.out.println(output2);
    }
}
