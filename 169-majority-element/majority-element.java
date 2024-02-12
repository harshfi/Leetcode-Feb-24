class Solution {
    public int majorityElement(int[] nums) {

        return helper(nums,0,nums[0]);
        
    }
    public int helper(int nums[],int i, int maj){

        int count =0;
        for(; i<nums.length;i++){
            if(nums[i]== maj)count ++;

            else count--;

            if(count == -1 ) return helper(nums,i, nums[i]);
        }
        return maj;
    }
}