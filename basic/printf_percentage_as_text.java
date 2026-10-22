import java.util.Scanner;

public class printf_percentage_as_text {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float b=sc.nextFloat();
        float t=sc.nextFloat();
        float f=sc.nextFloat();
        float l=sc.nextFloat();
        float tot=b+t+f+l;
        float bp=(b/tot)*100;
        float tp=(t/tot)*100;
        float fp=(f/tot)*100;
        float lp=(l/tot)*100;
        System.out.printf("Total expenses: Rs.%.2f",tot);
        System.out.println("");
        System.out.printf("Branding expenses percentage: %.2f%%",bp);
        System.out.println("");
        System.out.printf("Travel expenses percentage: %.2f%%",tp);
        System.out.println("");
        System.out.printf("Food expenses percentage: %.2f%%",fp);
        System.out.println("");
        System.out.printf("Logistics expenses percentage: %.2f%%",lp);
        sc.close();
        
    }
    
}
