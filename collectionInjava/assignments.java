import java.util.*;
public class assignments{
    public static void main(String[] args) {
        //Write a Java program to create an array list, add some colors (strings) and print out the collection. 
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        System.out.println(colors); 
        Iterator<String> name = colors.iterator();
        while (name.hasNext()) {
            System.out.println("iterator function: " +name.next());
        }
            

    }
}