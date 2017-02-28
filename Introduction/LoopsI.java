// https://www.hackerrank.com/challenges/java-loops-i
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        if(number >= 2 && number <= 20){
        for(int i=1;i<11;i++){
            int result = number*i;
            System.out.println(number+" x "+i+" = "+result);
            }
        }
    }
}
