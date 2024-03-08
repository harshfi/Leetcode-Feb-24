class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]= new int[101];
        int max=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(max<arr[nums[i]]){
                max=arr[nums[i]];
            }
        }
        System.out.println(max);
        int count=0;
        for(int i=1;i<=100;i++){
            if(max==arr[i])count+=arr[i];
        }
        return count;
    }
}