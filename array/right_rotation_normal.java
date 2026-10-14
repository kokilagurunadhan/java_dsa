// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        int n[]={2,3,4,5,1};
        int k=6;
        for(int i=0;i<k;i++){
            int temp=n[n.length-1];
            for(int j=n.length-1;j>0;j--){
                n[j]=n[j-1];
            }
            n[0]=temp;
            
        }
        for(int i=0;i<5;i++){
        System.out.println(n[i]);
    }
    }
}