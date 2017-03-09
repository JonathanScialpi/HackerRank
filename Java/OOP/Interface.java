// https://www.hackerrank.com/challenges/java-interface
//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum =0;
        for(int x=1;x<=n;x++){
            if(n%x==0){ // 1 2 3 6
                sum+=x;
            }
        }
        return sum;
    }
}
