class Solution {
    public int countDigits(int num) {
        int ans=0;
        int ori=num;
        while(num>0){
            int d=num%10;
            if(ori%d==0)ans++;
            num/=10;
        }
      return ans;  
    }
}