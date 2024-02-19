import java.util.Scanner;

public class chars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the values :");
        char ch = input.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("this is an alphabet");
        }else if(ch>='0'&&ch<='9'){
            System.out.println("this is a number");
        }else{
            System.out.println("this is a special charecters");
        }
        input.close();

    }
    
}
