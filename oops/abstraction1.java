abstract class vehiclenew{
    String color;

    abstract void start();
    vehiclenew(String color) {
        this.color=color;
    }
    void shift(int age){
        System.out.println(age);
    }
    
}
class carn1 extends vehiclenew{

    double cost;

    carn1 (String color,double cost) {
        super(color);
        this.cost=cost;
        System.out.println("color is :"+color);
        System.out.println("cost is :"+cost);
    }

    void start(){
        System.out.println("start");
    }
    void stop(){
        System.out.println("stop");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        carn1 c1 = new carn1("red",3000);
        c1.start();
        c1.stop();
        c1.shift(20);

    }
}
