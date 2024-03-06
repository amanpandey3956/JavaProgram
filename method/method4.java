import java.util.Scanner;
public class method4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Answer: " + avg(num1, num2, num3));

        scanner.close();
    }

    public static int avg(int num1, int num2, int num3) {
        int sum=num1+num2+num3;
        return sum/3;
    }

}
    

