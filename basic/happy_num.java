class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen =new HashSet<> ();
        while(n!=1){
            int s=0;
            if(seen.contains(n))return false;
            else seen.add(n);
            while(n>0){
                int d=n%10;
                s+=d*d;
                n/=10;
            }n=s;
        }
      return true;  
    }
}