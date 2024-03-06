class Solution {
    int m[][]=   {{4,6},
                 {8,6},
                 {7,9},
                 {8,4},
                 {3,9,0},
                 {},
                 {1,7,0},
                 {6,2},
                 {1,3},
                 {2,4}
                 };

    int cache [][]=  new int [5001][10];
    public int knightDialer(int n) {
        
        int a []={0,1,2,3,4,5,6,7,8,9};
        return find(n,a);

        
    }
    public int find(int remaining,int moves[]){
        
        if(remaining==1) return moves.length;

        int count=0;

        for(int i : moves){
            
            int curr= cache[remaining][i];

            if(curr==0){
                curr= find(remaining -1, m[i]);
                cache[remaining][i]=curr;
            }
            count=count+curr;
            count=(count%1000000007);
        }
        return count;


    }
}