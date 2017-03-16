// https://www.hackerrank.com/challenges/simple-array-sum
import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
     
        //variables
        int arraySize = myScanner.nextInt();
        int myArray[] = new int[arraySize];
        int sum = 0;
        
        //build the array and get the sum
        while(myScanner.hasNextInt()){
            for(int i = 0; i <= arraySize-1;i++){
                myArray[i] = myScanner.nextInt();
                sum += myArray[i];
            }
            System.out.println(sum);
        }
    }
}
