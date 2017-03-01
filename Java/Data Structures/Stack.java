// https://www.hackerrank.com/challenges/java-stack
import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack myStack = new Stack();
      
      
      while (sc.hasNextLine()) {
         int parenCount =0;
         int brackCount =0;
         int squareCount =0;
         int sumCount =0;
         String input=sc.nextLine();
         char[] array = new char[input.length()];
         array = input.toCharArray();
         for(int i=0;i<array.length;i++){ // start of for loop

          if(array[i]=='{' || array[i]=='}'){
              if(array[i]=='{'){
                  brackCount++;
              }else if(array[i]=='}'){
                  brackCount--;
              }
          }else if(array[i]=='(' || array[i]==')'){
            if(array[i]=='('){
                  parenCount++;
              }else if(array[i]==')'){
                  parenCount--;
              }
          }else if(array[i]=='[' || array[i]==']'){
                if(array[i]=='['){
                  squareCount++;
              }else if(array[i]==']'){
                  squareCount--;
              }
          } // end of if/else
         }// end of for loop
           sumCount =parenCount+brackCount+squareCount;
       
       if(sumCount==0){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
      }
      
      }
     
   }

