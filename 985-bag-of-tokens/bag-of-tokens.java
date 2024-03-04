class Solution {
    public int bagOfTokensScore(int[] t, int p) {

        Arrays.sort(t);

        int i=0,j= t.length-1,s=0;
        int max=0;
        while(i<t.length &&j>=0){

            if(p>=t[i]){
                s=s+1;
                p-=t[i];
                i++;
            }
            else if (s>=1){
                s=s-1;
                p=p+t[j];
                j--;
            }
            else break;
            max=Math.max(max,s);
        }
        return max;
        
    }
}