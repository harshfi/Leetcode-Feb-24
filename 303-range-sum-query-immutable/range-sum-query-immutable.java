class NumArray {
    int num[];

    public NumArray(int[] nums) {
        
        num=nums;
        for(int i=1;i<nums.length;i++){
            num[i]=num[i-1]+nums[i];
        }


        
    }
    
    public int sumRange(int left, int right) {
       

       if(left!=0){
           return num[right]-num[left-1];
       }
        return num[right] ;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */