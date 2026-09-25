// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        int temp=112233445;
        for(int i=1;i<=10;i++){
            int n=temp;
            int c=0;
            while(n>0){
                int d=n%10;
                if(d==i){
                    c++;
                }
                n/=10;
            }
            System.out.println(i+":"+c);
        }
    }
}