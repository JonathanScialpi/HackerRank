// https://www.hackerrank.com/challenges/plus-minus
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myArray = new int[n];
        int positive =0;
        int negative =0;
        int zeroes =0;
        for(int i=0;i<n;i++){
            myArray[i] = in.nextInt();
        if(myArray[i]>0){
            positive++;
        }else if(myArray[i]<0){
            negative++;
        }else if(myArray[i]==0){
            zeroes++;
        }
        }
       
        double posPerc = ((double)positive/n);
        double negPerc= ((double)negative/n);
        double zerPerc= ((double)zeroes/n);
        System.out.println(posPerc);
        System.out.println(negPerc);
        System.out.println(zerPerc);
        
    }
}
