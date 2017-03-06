// https://www.hackerrank.com/challenges/java-string-reverse
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
      
        char[] array = new char[A.length()];
        
        for(int x=0;x<A.length();x++){
            array[x]=A.charAt(A.length()-x-1);
         
        }
        boolean palindrome = true;
        for(int x= A.length()-1;x>0;x--){
            if(A.charAt(x) != array[x]){
                palindrome = false;
            }
        }
        
        if(palindrome == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}
