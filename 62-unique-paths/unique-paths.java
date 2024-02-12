class Solution {
    public int uniquePaths(int m, int n) {

        int dp[][]= new int [m][n];
        for(int i[]: dp){
            Arrays.fill(i,-1);
        }

      return   helper(0,0,dp);
        
    }
    public int helper(int i, int j, int dp[][]){
        if(i==dp.length-1 && j== dp[0].length-1){
            return 1;
        }
        if(i>=dp.length || j>=dp[0].length) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int a= helper (i+1,j,dp);
        int b= helper(i,j+1,dp);

        return dp[i][j]= a+b;
    }
}