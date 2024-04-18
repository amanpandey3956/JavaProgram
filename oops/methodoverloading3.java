public class methodoverloading3 {
    public static void main(String[] args) {
        System.out.println("start");
        main(20);
        main(20.5);
        System.out.println("end");
    }
    public static void main(int a) {
       System.out.println("2"+a); 
    }
    public static void main(double b) {
        System.out.println("3"+b);
    }
    
}
