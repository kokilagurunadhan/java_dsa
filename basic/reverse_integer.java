class Solution {
    public int reverse(int x) {
        long p=Math.abs((long)x);
        long r=0;
        while(p>0){
            long d=p%10;
            r=r*10+d;
            p/=10;
        }
        if(r<Integer.MIN_VALUE || r>Integer.MAX_VALUE)return 0;
        else if(x<0)return -(int)r;
        else return (int)r;
    }
}