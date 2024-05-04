import java.util.*;
public class testnew3{
    public static void main(String[] args){
    ArrayList<Object> list = new ArrayList<>();
    list.add(1);
    list.add("Ritesh");
    list.add(null);
    list.add(15.2);
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.contains("Ritesh"));
    System.out.println(list.get(1));
    System.out.println(list.isEmpty());
    list.clear();
    System.out.println(list.isEmpty());
    }
    
}