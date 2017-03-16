// https://www.hackerrank.com/challenges/a-very-big-sum
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = in.nextInt();
        long sum = 0;
        long myArray[] = new long[arraySize];
        while(in.hasNextLong()){
            for(int i = 0; i<=myArray.length-1;i++){
                myArray[i] = in.nextLong();
                sum += myArray[i];
            }
        }
        System.out.print(sum);
    }
}
