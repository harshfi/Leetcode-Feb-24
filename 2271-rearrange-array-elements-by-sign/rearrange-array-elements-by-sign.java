class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int [nums.length];
        int pos=0,neg=0;

        for( int i=0;i<  nums.length ; i++ ){
            if( nums[i]>= 0) {
                pos=i;
                break;
            }
        }
        for( int i=0;i<  nums.length ; i++ ){
            if( nums[i]< 0) {
                neg=i;
                break;
            }
        }

        for( int i =0 ; i < nums.length;i++ ){

            if(i%2==0 && pos < nums.length ){
               ans[i]= nums[pos++];
               while(pos<nums.length && nums[pos]<0) pos++;
            }
            else {
                ans[i]= nums[neg++];
                while(neg<nums.length && nums[neg]>=0) neg++;
            }
        }
        return ans;
        
    }
}