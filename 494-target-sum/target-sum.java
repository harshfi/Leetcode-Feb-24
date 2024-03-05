class Solution {
    int tsum=0;
    public int findTargetSumWays(int[] nums, int target) {
        tsum=0;
        for(int i=0;i<nums.length;i++) tsum+=nums[i];

        int dp[][]= new int [tsum][nums.length];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        
        return find(nums,target, 0,0,dp);

    }
    public int find(int[] nums, int target , int i,int sum,int dp[][]){

        if(i==nums.length){
            if(target-sum==0) return 1;
            return 0;
        }
        
        if(tsum-sum>=0 && tsum-sum< tsum && dp[tsum-sum][i]!=-1 ) return  dp[tsum-sum][i];
        
       int s= find(nums,target, i+1,sum-nums[i],dp)+find(nums,target, i+1,sum+nums[i],dp);
       if(tsum-sum>=0 && tsum-sum< tsum){
           dp[tsum-sum][i]=s;
       }
       return s;
        

    }
}