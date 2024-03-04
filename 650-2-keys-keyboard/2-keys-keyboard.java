class Solution {
    public int minSteps(int n) {
       if(n==1) return 0; 
       return  find(1,n, 1)+1;
        
    }
    public int find(int screen , int n,int i){
        if(n==screen) return 0;
        if(n<screen) return 1000000;
        int paste = find(screen+i,n,i)+1;
        int copy_paste= find(2*screen,n,screen)+2;

        return Math.min(paste,copy_paste);

    }
}