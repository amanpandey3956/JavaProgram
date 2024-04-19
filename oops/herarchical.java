//When two or more sub-classes inherits a single super class, it is known as hierarchical inheritance. 

class vehical2{  
    String brand = "bmw";  
}  
class car2 extends vehical2{  
    int  cost = 434276856; 
    void start(){
        System.out.println("car started");
    } 
}  
class  bike2 extends vehical2{  
    String fuel="petrol";
    void stop(){System.out.println("bike stop");}  
}
  
public class herarchical {
    public static void main(String args[]){  
        bike2 b1=new bike2();  
        System.out.println(b1.fuel);
        System.out.println(b1.brand); 
        b1.stop();
        
        car2 c1=new car2();  
        System.out.println(c1.cost);
        System.out.println(c1.brand); 
        c1.start();  
        }
    
}
