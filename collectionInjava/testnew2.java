import java.util.*;
public class testnew2{
    public static void main(String[] args) {
        ArrayList<String> StdNames = new ArrayList<>();
    
        StdNames.add("John");
        StdNames.add("parth");
        StdNames.add("yash");
        
        System.out.println("list of student names before insertion: "+StdNames);
        StdNames.add(0, "ritesh");
        System.out.println("list of student names after insertion: "+StdNames);
    }
}