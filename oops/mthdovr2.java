class Adder{
    static int add(int x, int y){
    return x + y; 
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
}

public class mthdovr2 {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers is : " +Adder.add(5,10));    
        System.out.println("Sum of three numbers is: "+Adder.add(3,7,9));  
    }

    
}
