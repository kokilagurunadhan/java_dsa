class Solution {
    public int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(f<nums[i] && nums[i]!=f){
                t=s;
                s=f;
                f=nums[i];
            }
            else if(s<nums[i] && nums[i]!=s && nums[i]!=f){
                t=s;
                s=nums[i];
            }
            else if(t<nums[i] && nums[i]!=t && nums[i]!=s && nums[i]!=f){
                
                t=nums[i];
            }
        }
        if(t==Long.MIN_VALUE)return (int)f;
     return (int) t;   
    }
}