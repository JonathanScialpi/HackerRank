// https://www.hackerrank.com/challenges/java-primality-test
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();

      in.close();
      if(n.isProbablePrime(1)){
          System.out.print("prime");
      }else{
          System.out.print("not prime");
      }
      // Write your code here.
   }
}
