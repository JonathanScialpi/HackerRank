// https://www.hackerrank.com/challenges/30-nested-logic
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int returnDay = in.nextInt();
        int returnMonth = in.nextInt();
        int returnYear = in.nextInt();
        int expDay = in.nextInt();
        int expMonth = in.nextInt();
        int expYear = in.nextInt();
        
        int fine = 0;
        
        if (returnDay<=expDay && returnMonth<=expMonth && returnYear<=expYear){
            fine =0;
        }else if(returnDay>expDay && returnMonth==expMonth && returnYear==expYear){
            fine = 15 *(returnDay-expDay);
        }else if (returnMonth>expMonth && returnYear==expYear){
            fine = 500*(returnMonth-expMonth);
        }else if (returnYear>expYear){
            fine = 10000;
        }
        
        System.out.print(fine);
    }
}
