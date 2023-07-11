class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        while(n!=0){

            int rem=n%10;
            n=n/10;
            sum+=rem;
            mul*=rem;

        }
        int result= mul-sum;
        return result;
        
    }
}