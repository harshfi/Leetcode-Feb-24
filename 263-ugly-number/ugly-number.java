class Solution {
    public boolean isUgly(int n) {

        while(n>1){
            if(n%6==0){
                n/=6;
            }
            else if (n%2==0){
                n/=2;
            }
            else if (n%3==0) n/=3;

            else if(n%5==0) n/=5;

            else return false;
        }

        if(n<1) return false;

        return true;
        
    }
}