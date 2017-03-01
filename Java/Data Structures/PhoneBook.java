// https://www.hackerrank.com/challenges/phone-book
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      HashMap<String,Integer> myMap = new HashMap<String,Integer>();
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         myMap.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          if(myMap.containsKey(s)){
         System.out.println(s+"="+myMap.get(s));
          }else{
         System.out.println("Not found");
          }
      }
   }
}
