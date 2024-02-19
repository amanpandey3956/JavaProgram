import java.util.Scanner;
public class assign2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your username :");
        String userName = sc.next();
        System.out.println("Enter your password :");
        int pass = sc.nextInt();
        System.out.println("Username: "+userName);
        System.out.println("password :"+pass);
        sc.close();

        // *************************************************************************

        // Q) count total number of words in string(using input taking Scanner class)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int wordCount = 0;
        boolean isWord = false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                if (!isWord) {
                    wordCount++;
                }
                isWord = true;
            } else {
                isWord = false;
            }
        }
        System.out.println("Total number of words: " + wordCount);
        scanner.close();


        
    }
    
}
