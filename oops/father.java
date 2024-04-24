// constructor chaining within same class using this() keyword

public class father {
    father(int age){
        System.out.println(age);
    }
    father(String name){
        this(50);
        System.out.println(name);
    }
    father(double height){
        this("aman");
        System.out.println(height);
    }
    public static void main(String[] args) {
        father f1 = new father(6.2);
        System.out.println(f1);
    }
}
