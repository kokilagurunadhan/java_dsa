

class Main {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=2;
        k=k%n;
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void rev(int[] arr,int s,int e){
        while(s<e){
           int  temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
            
        }
    }
}