class Solution {
    public int secondHighest(String s) {
        int l=-1;
        int sm=-1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int d=s.charAt(i)-'0';
                if(l<d ){
                    sm=l;
                    l=d;
                } 
                else if(sm<d&& l!=d){
                    sm=d;
                }
            }
        }
      return sm;  
    }
}