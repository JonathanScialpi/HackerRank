// https://www.hackerrank.com/challenges/30-interfaces
//Write your code here
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum =0;
        for(int x=n; x>0; x--){
            if(n%x==0){
                sum+=x;
            }
        }
        return sum;
    }
}
