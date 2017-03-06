// https://www.hackerrank.com/challenges/java-anagrams
import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) {
        boolean answer = true;
        
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();
        
        if(A.length == B.length){
        
        Arrays.sort(A);
        Arrays.sort(B);
              
        for(int x=0;x<A.length;x++){
             if(A[A.length-1-x]!=B[B.length-1-x]){
                answer = false;
                break;
            }
        }
        }else{
            answer = false;
        }
        return answer;
        
    }
       public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
