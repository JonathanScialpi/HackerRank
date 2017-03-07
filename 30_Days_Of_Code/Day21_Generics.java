// https://www.hackerrank.com/challenges/30-generics
    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    void printArray (T[] a){
        for(int x=0;x<a.length;x++){
            System.out.println(a[x]);
        }
    }
