class Solution {
    int max=0;
    public int bagOfTokensScore(int[] t, int p) {
            

        max=0;
        Arrays.sort(t);
        int dp [][]= new int [t.length][t.length];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }

        int i=0,j= t.length-1,s=0;
       
        find(i,j,s,p,t,dp);

        return max;
        
    }
    public void find(int i ,int j,int s,int p,int []t,int [][]dp){
          max=Math.max(max,s);
        if(i>=t.length  || j<0) return ;
        
         if(dp[i][j]!=-1) return ;
      
        if(p>=t[i]){
           
           find(i+1,j,s+1,p-t[i],t,dp);


        }

        if(s>=1){
            find(i,j-1,s-1,p+t[j],t,dp);
        }
        find(i+1,j,s,p,t,dp);
        dp[i][j]= max;

    }
}