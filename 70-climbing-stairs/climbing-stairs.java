class Solution {
    public int climbStairs(int n) {
       
       
        int a=1, b=0;
        if(n==1) return a;
        if(n>=2)
        b=2;
        int c=0;
        for(int i=3;i<=n;i++){
           c= a+b;
            a=b;
            b=c;
        }
        return b;
        
    }
}