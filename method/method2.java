import java.util.Scanner;
public class method2 {
    public static void main(String[] args) {

        // Write a Java method to find the smallest number among three numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter second number:");
        int n2 = sc.nextInt();
        System.out.println("Enter third number:");
        int n3 = sc.nextInt();
        System.out.println("smallest number is : "+ SmallestNumber(n1, n2, n3));
        sc.close();
        
    }
    public static int SmallestNumber(int n1, int n2, int n3){
        if (n1 <= n2 && n1 <= n3)  return n1;
        else if (n2 <= n1 && n2 <= n3) return n2;
        else return n3;
    }
    
}
