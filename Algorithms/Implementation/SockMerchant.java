// https://www.hackerrank.com/challenges/sock-merchant
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            if(!myMap.containsKey(c[c_i])){
            myMap.put(c[c_i],1);
            }else if(myMap.containsKey(c[c_i])){
                myMap.put(c[c_i],myMap.get(c[c_i])+1);
            }
        }
      Iterator itr = myMap.entrySet().iterator();
      int counter =0;
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry)itr.next();
            int value = (int)pair.getValue();
            int numofpairs = value/2;
            counter += numofpairs;
        }
        System.out.print(counter);   
    }
}
