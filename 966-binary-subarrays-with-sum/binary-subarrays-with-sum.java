class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int sum=0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for( int i=0;i<nums.length;i++) sum+=nums[i];

        int ps=0;
        map.put(0,1);
        int count=0;

        for( int i=0;i<nums.length;i++){

             ps+=nums[i];

             if(map.containsKey(ps-goal)){
                count+=map.get(ps-goal);
             }

             map.put(ps,map.getOrDefault(ps,0)+1);
        }

        return count;
        
    }
}