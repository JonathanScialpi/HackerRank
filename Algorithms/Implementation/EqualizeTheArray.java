// https://www.hackerrank.com/challenges/equality-in-a-array
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        
        HashMap<Integer,Integer> tm = new HashMap<Integer,Integer>();
        
        for(int x=0;x<n;x++){ //build array
            int key = in.nextInt();
            ar[x]=key;
            if(!tm.containsKey(key)){
                tm.put(key,1);
            }else if(tm.containsKey(key)){
                 tm.put(key,tm.get(key)+1);
            }
        }

        Iterator itr = tm.entrySet().iterator();
        int maxKey =0;
        int maxVal =0;
        int current =0;
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry)itr.next();
            //maxKey = (int)pair.getKey();
            //maxVal = (int)pair.getValue();
            current = (int)pair.getValue();
            if(current>maxVal){
                maxVal=current;
                maxKey =  (int)pair.getKey();
            }
        }
       int count =0;
       count = ar.length-maxVal;
       System.out.print(count);
}
}
