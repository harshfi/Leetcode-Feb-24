class Solution {
    public boolean canPartition(int[] a) {
        int sum=0;
        for( int i=0;i<a.length;i++){
            sum+=a[i];
        }
        if(sum%2!=0) return false;
        int dp[][]= new int [a.length][sum];
        for(int []i :dp){
            Arrays.fill(i,-1);
        }

        return find(0,0,sum, a, dp );
        
    }
    public boolean find(int i, int curSum, int sum, int [] a, int dp[][]){

        if(a.length<=i) return false;
        if(curSum==sum-curSum) return true;
        if(curSum> sum-curSum) return false;

        if(dp[i][curSum]!=-1) return dp[i][curSum]==1 ?true:false;

        boolean include = find(i+1 , curSum + a[i] , sum,a,dp);
        boolean doesnot= find(i+1, curSum , sum, a,dp);
         
         dp[i][curSum]=include || doesnot ?1:0;


        return include || doesnot;
    }
}