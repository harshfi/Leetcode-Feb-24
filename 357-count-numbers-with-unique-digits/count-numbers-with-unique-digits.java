class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int sum=10;
        for(int i=2; i<=n;i++){
            int choice = 9;
            int diff= 1;
            int temp =i;
            while(temp>0){
                if(temp==i) diff*=choice;
                else{
                    diff*=choice;
                    choice--;
                }
                temp--;

            }
            sum+=diff;
        }
        return sum;
    }
}