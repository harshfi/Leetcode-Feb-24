class Solution {
    public int minimumDeleteSum(String s1, String s2) {

        int dp[][]= new int [s1.length()+1][s2.length()+1];

        for( int i=s1.length();i>=0;i--){

            for(int j=s2.length();j>=0;j--){

                if(i== s1.length() && s2.length()==j){
                    dp[i][j]=0;
                }
                else if(i==s1.length()){
                    dp[i][j]=(int)s2.charAt(j) + dp[i][j+1];
                }
                else if(j==s2.length()){
                    dp[i][j]=(int) s1.charAt(i) + dp[i+1][j];
                }
                else{
                    if(s1.charAt(i)==s2.charAt(j)){
                        dp[i][j]=dp[i+1][j+1];
                    }
                    else{
                        dp[i][j]=Math.min((int)s1.charAt(i) + dp[i+1][j],(int)s2.charAt(j) + dp[i][j+1]);
                    }
                }
            }
        }

        return dp[0][0];
        
    }
}