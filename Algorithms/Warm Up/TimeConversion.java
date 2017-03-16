// https://www.hackerrank.com/challenges/time-conversion
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
       String time = in.nextLine();
       String[] array = time.split(":"); 
       int hour = Integer.parseInt(array[0]);
       int min = Integer.parseInt(array[1]);
       String sec = array[2].substring(0,2);
       int seconds = Integer.parseInt(sec);
        if (seconds>60){
            min++;
            min = min-60;   
        }   
        if (min>60){
            hour++;
            min = min-60;   
        }   
        if(time.contains("AM")){
            if (hour == 12){
                hour = 0;
            }else{
                hour = hour;
            }
           }else if (time.contains("PM")){
            if(hour == 12){
                hour = hour;
            }else if(hour<12){
               hour = hour+12;
           }
           }
        String finalSec = "";
        String finalmin = "";
        String finalHr = "";
        if(seconds<10){
            finalSec = "0"+Integer.toString(seconds);
        }else{
            finalSec = Integer.toString(seconds);
        }
        if(min<10){
            finalmin = "0"+Integer.toString(min);
        }else{
            finalmin = Integer.toString(min);
        }
        if(hour<10){
            finalHr = "0"+Integer.toString(hour);
        }else{
            finalHr = Integer.toString(hour);
        }
        
        System.out.print(finalHr+":"+finalmin+":"+finalSec);
    }
}
                 
