//https://www.numpyninja.com/post/all-you-need-to-know-about-java-collections-framework(link for all the topics of colllection frameworks)

import java.util.*;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<String> StdNames = new ArrayList<>();
        // Adding elements to the list using add() method
        StdNames.add("John");
        StdNames.add("parth");
        StdNames.add("yash");
        
        System.out.println("list of student names : "+StdNames);
    }
}