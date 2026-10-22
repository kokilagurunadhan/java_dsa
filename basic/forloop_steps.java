public class forloop_steps {
     public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
        for(int i = 0 ; i<5; ) {
	        System.out.print(arr[i]);
	    }
    }
    
}//output 1 prints 1 infinitely because the loop variable i is never incremented, causing an infinite loop.
