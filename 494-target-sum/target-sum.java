class Solution {
    int cnt=0;
    public int findTargetSumWays(int[] nums, int target) {
        cnt=0;
        
        find(nums,target, 0,0);
        return cnt;

    }
    public void find(int[] nums, int target , int i,int sum){

        if(i==nums.length){
            if(target-sum==0) cnt++;
            return;
        }

        find(nums,target, i+1,sum+nums[i]);
        find(nums,target, i+1,sum-nums[i]);

    }
}