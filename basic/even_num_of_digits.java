class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int ori=nums[i];
            int d=0;
            while (ori>0){
                ori/=10;
                d++;

            }
            if(d%2==0)c++;
        

        }
      return c;  
    }
}