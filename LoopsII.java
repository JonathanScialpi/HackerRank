import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
       for(int i=0;i<t;i++){
        int a = in.nextInt();//0
        int b = in.nextInt();//2
        int n = in.nextInt();//10
        int sum= a;//0
        for(int j=0;j<n;j++)
       {     

        sum= sum+b;//2+4
         System.out.print(sum+" ");
            b=2*b;//4
        }
            System.out.println();
         //   in.close();
        }
    }
}
