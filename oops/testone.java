// constructor chaining on another class using super() keyword

class Vehicl {
    Vehicl(int cost){
        System.out.println("vehicle cost :"+cost);
    }
}
class carnew extends Vehicl{
    carnew(String color){
    super(500000);
    System.out.println("car color :"+color);
    
    }
}
public class testone {
    public static void main(String[] args) {
        carnew c1 = new carnew("red");
        System.out.println(c1);
    }
}
