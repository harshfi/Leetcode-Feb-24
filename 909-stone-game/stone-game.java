class Solution {
    public boolean stoneGame(int[] piles) {

        int dp[][] = new int [piles.length][piles.length];

       return helper(0,piles.length-1, piles, dp)>0 ? true : false;

       
        
    }

    public int helper (int i, int j, int p[], int dp [][]){

        if(i>j) return 0;

        if(dp[i][j]!=0) return dp[i][j];

        return dp[i][j]=Math.max(p[i]- helper(i+1, j, p, dp), p[j]-helper(i,j-1,p,dp));
    }
}