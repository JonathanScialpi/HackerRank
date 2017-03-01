// https://www.hackerrank.com/challenges/java-list
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Iterator itr = list.iterator();
        int size = in.nextInt(); //size of list
        for(int i=0;i<size;i++){
            list.add(in.nextInt());
        }
        int queries = in.nextInt();
        String query ="";
        String junk ="";
        junk = in.nextLine();
        for(int m =0;m<queries;m++) {
            //System.out.println("what is your query?");
            query = in.next();
            if (query.equalsIgnoreCase("Insert")) {
                int index = in.nextInt();
                int number = in.nextInt();
                list.add(index, number);

            } else if (query.equalsIgnoreCase("Delete")) {
                list.remove(in.nextInt());
            }
           // qstart++;
        }
        for(int i:list){
            System.out.print(i+" ");
        }

    }
}
