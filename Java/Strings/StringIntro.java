//https://www.hackerrank.com/challenges/java-strings-introduction
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length()+B.length();
        String lex = "No";
        if (A.compareTo(B)>1){
            lex = "Yes";
        }
        System.out.println(length);
        System.out.println(lex);
        String aUp = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
        String bUp = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(aUp+" "+bUp);
    }
}
