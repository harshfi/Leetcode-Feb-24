class Solution {
    public int minSteps(int n) {
      int ans=0;
      for(int i=2;i*i<=n;){
          if(n%i==0){
              ans+=i;
              n/=i;
          }
          else{
              i++;
          }
      }
      if(n!=1) ans+=n;
       return  ans;
        
    }
    public int find(int screen , int n,int i,int dp[][]){

        if(n==screen) return 0;
        if(n<screen) return 1000000;
         
         if(dp[screen][i]!=-1) return dp[screen][i];
        int paste = find(screen+i,n,i,dp)+1;
        int copy_paste= find(2*screen,n,screen,dp)+2;

        return dp[screen][i]= Math.min(paste,copy_paste);

    }
}