public class switch_without_break {
    public static void main(String[] args) {
        int a = 0;
        a +=5;
        switch(a) {
            case 5: 
                System.out.print("5");
            case 10: 
                System.out.print("10");
            default: 
                System.out.print("0");
        }
    }
    
}//output: 5100
