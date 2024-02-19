public class assign {
    public static void main(String[] args) {

        // Example 1

        int num1 = 5;
        int num2 = 20;
        int num3 = 15;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");

        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + " is greater");

        } else {
            System.out.println(num3 + "is greater");
        }

        // Example no.2

        int a = 5;
        int b = 10;
        if (a > b) {
            System.out.println("5 is greater");

        } else {
            System.out.println("10 is greater number");
        }

        // Example no.3

        int number = -13;
        if (number > 0) {
            System.out.println("positive");

        } else if (number < 0) {
            System.out.println("negative");

        } else {
            System.out.println("zero");
        }

        // Example no.4

        int num = 33;
        if (num % 5 == 0) {
            System.out.println("Divisible by 5");

        } else if (num % 11 == 0) {
            System.out.println("Divisible by 11");

        } else {
            System.out.println("Not divisible by 5 and 11");
        }

        // Example no.5

        int numb = 13;
        if (numb % 2 == 0) {
            System.out.println("even number");

        } else {
            System.out.println("odd number");
        }

        // Example no.6

        int year = 2020;
        if (year % 4 == 0 && year != 0 || year % 400 == 0) {
            System.out.println("leap year");

        } else {
            System.out.println("Not a leap year");

        }

        // Example no.7

        char z = 'a';
        if (z <= 122 && z >= 97 || z <= 90 && z >= 65) {
            System.out.println("Alphabet");

        } else {
            System.out.println("Not an alphabet");

        }

        // Example no.8

        char c = 'f';
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("it is vowel");

        } else {
            System.out.println("consonant");

        }

        // Example no.9

        char d = '#';
        if (d <= 122 && d >= 97 || d <= 90 && d >= 65) {
            System.out.println("Alphabet");

        } else if (d <= 57 && d >= 48) {
            System.out.println("Digit");

        } else if (d <= 47 && d >= 33 )   {
            System.out.println("special character");
        }

        // Example no.10

        char m = 'A';
        if (m <= 90 && m >= 65) {
            System.out.println("Upper case Alphabet");

        } else if (m <= 122 && m >= 97) {
            System.out.println("lower alphabet");

        }

    }

}
