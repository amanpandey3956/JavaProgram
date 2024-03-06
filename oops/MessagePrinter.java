public class MessagePrinter {

    //Write a Java program to print message using class
    
    String msg; 
        
    // Constructor to initialize the message variable
    public MessagePrinter(String str) {
        msg = str;
    }
    void display(){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        // Create an object of MessagePrinter and call its method
        MessagePrinter mp1 = new MessagePrinter("Hello World");
        mp1.display();
        
        // Call another object's method by creating reference variable
        MessagePrinter mp2 = new MessagePrinter("This is a test message.");
        mp2.display();
    }
    
}
