class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int one=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') one++;
        }
            String str="";
        for(int i=0;i<s.length()-1;i++){
            if(one>1){
              str=str+1;
              one--;
            }
            else{
                str=str+0;
            }
        }
       return str=str+1;

        
    }
}