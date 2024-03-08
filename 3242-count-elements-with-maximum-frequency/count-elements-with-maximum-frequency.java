class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer,Integer> um=new HashMap<>();
        int max=0;
       for(int x: arr){
           um.put(x,um.getOrDefault(x,0)+1);
            max=Math.max(max,um.get(x));
       }
      int ans=0;
       for(int value:um.values()){
           if(value==max)
           ans+=value;
       }
       return ans;
    }
}