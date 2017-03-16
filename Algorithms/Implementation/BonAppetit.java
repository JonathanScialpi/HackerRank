// https://www.hackerrank.com/challenges/bon-appetit
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int items = in.nextInt();
        int extra = in.nextInt();
        int sum =0;
        int[] array = new int[items];
        for(int x=0;x<items;x++){
            int nextItem=in.nextInt();
            sum += nextItem;
            array[x]=nextItem;
        }
        sum = sum - array[extra];
        int owed = sum/2;
        int charged = in.nextInt();
        if(owed==charged){
            System.out.print("Bon Appetit");
        }else{
            System.out.print(charged-owed);
        }
    }
}
