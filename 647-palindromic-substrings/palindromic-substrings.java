class Solution {

    
    
    public int countSubstrings(String s) {
        int ans = 0;
        int n = s.length();
        boolean dp[][]= new boolean [n][n];

        for(int g=0 ;g< n; g++){

           int j=g ;

            for( int i=0;   j<n ;j++,i++)
            {
                if(g==0){
                    dp[i][j]=true;
                }
                else if( g==1) dp[i][j]=( s.charAt(i))==(s.charAt(j));

                else {
                    if((s.charAt(i))==(s.charAt(j)) && dp[i+1][j-1]==true){
                        dp[i][j]=true;
                    }
                }

                if(dp[i][j]) ans++;
            }
        }
        
        return ans;
    }
}