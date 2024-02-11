class Solution {
    public int climbStairs(int n) {
        int arr[]= new int [n+1];
        arr[0]=0;
        int a=1, b=0;
        if(n==1) return a;
        if(n>=2)
        b=2;
        for(int i=3;i<=n;i++){
            arr[i]= a+b;
            a=b;
            b=arr[i];
        }
        return b;
        
    }
}