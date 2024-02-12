class Solution {
    public int maximalSquare(char[][] m) {
        int dp[][]= new int [m.length][m[0].length];
         int max=0;
        for(int i=m.length-1;i>=0;i--){
              dp[i][m[0].length-1]=m[i][m[0].length-1]-48;
             max=Math.max(max,dp[i][m[0].length-1]);
            
        }
        for(int i=m[0].length-1;i>=0;i--){
             dp[m.length-1][i]=m[m.length-1][i]-48;
             max=Math.max(max, dp[m.length-1][i]);
            
        }
      
        for(int i=m.length-2;i>=0;i--){
            for(int j=m[0].length-2;j>=0;j--){
            
            if(m[i][j]=='1'){
             dp[i][j]= 1 + Math.min(dp[i][j+1],Math.min(dp[i+1][j+1],dp[i+1][j]));
         
}

             max=Math.max(max,dp[i][j]);

             
            }
        }
        return max*max;
        
    }
}