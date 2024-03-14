class Solution {
    public int pivotInteger(int n) {

         double x=Math.sqrt((n*(n+1))/2);

        
        return x%1 != 0?-1 : (int)x;
        
    }
}