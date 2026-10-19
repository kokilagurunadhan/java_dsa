import java.util.*;
public class char_input {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println((int)ch);
        }
        else{
            System.out.println("Not a letter");
        }
        sc.close();
    }


    }
