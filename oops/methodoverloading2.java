class method {
    
    void display(int x) { 
        System.out.println("Displaying an integer : " + x); 
    }

    void display(String s) { 
        System.out.println("Displaying a String : " + s); 
    }

    int add(int x, int y) { 
        return x + y; 
    }

    double add(double x, double y) { 
        return x + y; 
    }
}
public class methodoverloading2 {

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();

        // calling the first method (display ()) using integers
        obj.display(50);
        obj.display(-34);

        // calling the second method (display ()) using strings
        obj.display("Hello World");
        obj.display("Welcome to Java Programming!");

        // calling the third method (add ()) using integers
        System.out.println("\nAddition of two integers : " + obj.add(12, 36));

        // calling the fourth method (add  ()) using doubles
        System.out.println("\nAddition of two doubles : " + obj.add(7.9, 3.8));
    }
    
}
