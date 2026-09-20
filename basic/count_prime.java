class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean checkprime[]=new boolean[n];
        for(int i=2;i<n;i++){
            if(!checkprime[i]){
                c++;
                for(int j=i*2;j<n;j+=i){
                    checkprime[j]=true;
                }

            }
        }
        return c;
    }
}