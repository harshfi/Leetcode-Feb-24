class Solution {
    public int wiggleMaxLength(int[] a) {

        if(a.length==1) return 1;
        // if(a.length==2) return 2;

        int up=1;
        int down=1;

        for( int i=0;i<a.length-1;i++){
             

           if(a[i+1]-a[i]>0) up=down+1;
           else if(a[i+1]-a[i]<0) down=up+1;


            
        }
        return Math.max(up, down);
        
    }
}