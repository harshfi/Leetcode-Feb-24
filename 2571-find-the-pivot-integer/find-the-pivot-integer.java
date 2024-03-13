class Solution {
    public int pivotInteger(int n) {
         double sum=(double)(n*(n+1))/2;
        int ps=0;
        
        for(int i=1;i<=n;i++){
            ps+=i;
          if(i+sum-ps==ps)   return i;
        }
        return -1;
        
    }
}