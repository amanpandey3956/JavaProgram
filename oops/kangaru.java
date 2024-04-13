public class kangaru {
    
    
    int age;
    String name; 
        
    kangaru(int age , String name) {
        this.age=age;
        this.name=name;
    }
    public static void main(String[] args) {
        kangaru k1 = new kangaru(20,"aman");
        kangaru k2 = new kangaru(30,"parth");
        System.out.println(k1.age);
        System.out.println(k1.name);
        System.out.println(k2.age);
        System.out.println(k2.name);
        
    }
    
}
