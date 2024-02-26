class Solution {
    public int getMoneyAmount(int n) {
        int dp [][]=  new int [n+1][n+1];
        for(int i[]: dp){
            Arrays.fill(i,-1);
        }

        return solve(1,n,dp);
        
    }
    public int solve(int start, int end, int dp[][]){
        if(start>=end) return 0;
        

        int amt = Integer.MAX_VALUE;

        if(dp[start][end]!= -1) return dp[start][end];

        for( int i= start; i<=end;i++){
           amt=Math.min(amt,i + Math.max(solve(start,i-1,dp), solve(i+1, end, dp))); 
        }
        return dp[start][end]= amt;
    }
}