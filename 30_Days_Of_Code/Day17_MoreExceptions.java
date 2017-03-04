// https://www.hackerrank.com/challenges/30-more-exceptions
//Write your code here
class Calculator{
    int power(int n, int p)throws Exception{
        int answer =0;
        if(n>=0 && p>=0){
         answer = (int)Math.pow(n,p);
            
        }else if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        return answer;
    }
}
