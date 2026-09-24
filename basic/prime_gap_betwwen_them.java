// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        int n=100;
        int nu=2;
        int c=0;
        int pre=0;
        int curr=0;
        int gap=0;
        while(c<n){
            boolean prime=true;
            for(int i=2;i<nu;i++){
                if(nu%i==0){
                    prime=false;
                    
                }}
                if(prime){
                    c++;
                    pre=curr;
                    curr=nu;
                }
                if(gap<(curr-pre)){
                    gap=curr-pre;
                }
            nu++;
            }
        
        System.out.println(gap);
    }
}