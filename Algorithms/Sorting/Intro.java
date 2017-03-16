// https://www.hackerrank.com/challenges/tutorial-intro
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> al = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int lookFor = in.nextInt();
        int size = in.nextInt();
        in.nextLine();//junk
        
        for(int x=0;x<size;x++){
            al.add(in.nextInt());
        }
        System.out.print(al.indexOf(lookFor));
    }
}
