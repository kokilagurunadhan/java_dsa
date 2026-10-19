
import java.util.Scanner;
public class using_printf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double z=x+y;
        System.out.printf("%.1f",z);
        sc.close();
    }
}
    

