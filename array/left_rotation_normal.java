// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        int n[]={2,3,4,5,1};
        int k=4;
        for(int i=0;i<k;i++){
            int temp=n[0];
            for(int j=0;j<5-1;j++){
                n[j]=n[j+1];
            }
            n[n.length-1]=temp;
            
        }
        for(int i=0;i<5;i++){
        System.out.println(n[i]);
    }
    }
}