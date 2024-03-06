import java.util.Scanner;
public class method3 {
    public static void main(String[] args) {

        //Write a Java method to display the middle character of a string
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.println("middle char is : " + middlechar(s));
        sc.close();
    

    }
    public static String middlechar(String s){
        int n=s.length();
        if (n%2==0)
            return "" + s.charAt((n / 2) - 1) + s.charAt(n / 2);
        else
            return "" + s.charAt(n / 2);
    }
    
}
