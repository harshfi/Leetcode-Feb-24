class Solution {
    public String maximumOddBinaryNumber(String s) {
        
        int one=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') one++;
        }    
         StringBuilder str=new StringBuilder();
           
        for(int i=0;i<s.length()-1;i++){
            if(one>1){
              str.append(1);
              one--;
            }
            else{
                str.append(0);
            }
        }
       return str.append(1).toString();

        
    }
}