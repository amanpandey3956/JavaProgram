import java.util.Scanner;

public class assign3 {
    public  static void main(String[] args) {
        int Number;
        int r =0;
        int rem=0;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your number :");  
        Number=sc.nextInt(); 
        while(Number!=0){    
            rem=Number%10;
            r=r*10+rem; 
            r=Number/10;                
        }
        sc.close();
        System.out.print("Reverse of the given number is: "+Number);

    
    }
}
