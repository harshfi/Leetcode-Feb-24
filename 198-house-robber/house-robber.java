class Solution {
    public int rob(int[] nums) {
        int ans[] = new int [nums.length];

        int a=nums[0], b=0,c;
        if(nums.length==1) return nums[0];
        if(nums.length>=2)
        b= Math.max(nums[0],nums[1]);

        

        for(int i=2;i<nums.length;i++){

            c= Math.max(b,a+nums[i]);
            a=b;
            b=c;

        }
        return  b;
        
    }
}