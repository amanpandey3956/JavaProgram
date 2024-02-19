import java.util.Scanner;

public class assign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int min = i < j ? i : j;
                min = min < (2 * n - i) ? min : (2 * n - i);
                min = min < (2 * n - j) ? min : (2 * n - j);
                System.out.print(n - min + 1 + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}            
