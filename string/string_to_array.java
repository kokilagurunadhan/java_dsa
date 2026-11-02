package string;
import java.util.Scanner;
public class string_to_array {
    

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
        String[] arr=str.split(" ");
        String sw=arr[0];
        String lw=arr[0];
        for(int i=0;i<arr.length;i++){
            if(lw.length()<arr[i].length()){
                lw=arr[i];
            }
            else if(sw.length()>arr[i].length()){
                sw=arr[i];
            }
        }System.out.println("Smallest word: "+sw);
        System.out.println("Largest word: "+lw);s.close();
    }
}
    

