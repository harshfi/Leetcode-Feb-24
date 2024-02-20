class Solution {
    public int missingNumber(int[] nums) 
    {
        Arrays.sort(nums);
        int i=0;
        int idx=0;
        for( i=nums[0];i<=nums[nums.length-1];i++,idx++)
        {
          if(nums[idx]!=i) return i;
        }
        if( nums[0]>0)
{
        return nums[0]-1;
         
}


        return i;
        
    }
}