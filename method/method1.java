import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        findevenodd(num);
        sc.close();
        
    }
    public static void findevenodd(int num) {

        //Method Body

        if (num % 2 == 0) {
            System.out.println(num +" is even");
        } else {
            System.out.println(num +" is odd");
        }

        
    }
    
}
