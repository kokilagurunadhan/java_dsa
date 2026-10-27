
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }sc.close();
        System.out.println("square numbers");
        for(int i=0;i<n;i++){
        if(square(arr[i]))System.out.println(arr[i]);}
    }
    public static boolean square(int x){
        
       for(int i=1;i*i<=x;i++){
           if(i*i==x){
               return true;
       }
           
    }return false;
    
}}