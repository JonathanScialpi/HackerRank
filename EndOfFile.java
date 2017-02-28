// https://www.hackerrank.com/challenges/java-end-of-file
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String line = "";
        int counter =0;
        while(in.hasNextLine()){
            counter++;
            line = in.nextLine();
            System.out.println(counter+" "+line);
        }
    }
}
