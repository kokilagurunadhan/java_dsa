class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int original=x;
        while(x>0){
            int d=x%10;
            r=r*10+d;
            x/=10;
        }
        if(r==original)return true;
        else return false;
        
    }
}