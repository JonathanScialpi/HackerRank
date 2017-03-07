// https://www.hackerrank.com/challenges/30-regex-patterns
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> al = new ArrayList<>();
        in.nextLine();
        for(int i=0;i<n;i++){
            
            String[] current = in.nextLine().split("@");
            if(current[1].contains("gmail.com") && !current[0].contains(".")){
                current = current[0].split(" ");
                String val = current[0];
                al.add(val);
            }
        }
        Collections.sort(al);
        for(int x=0;x<al.size();x++){
            System.out.println(al.get(x));
        }
    }
}
