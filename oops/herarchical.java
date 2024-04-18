//When two or more sub-classes inherits a single super class, it is known as hierarchical inheritance. 

class vehicals{  
    String brand = "bmw";  
}  
class car extends vehicals{  
    int  cost = 434276856; 
    void start(){
        System.out.println("car started");
    } 
}  
class  bike extends vehicals{  
    String fuel="petrol";
    void stop(){System.out.println("bike stop");}  
}
  
public class herarchical {
    public static void main(String args[]){  
        bike b1=new bike();  
        System.out.println(b1.fuel);
        System.out.println(b1.brand); 
        b1.stop();
        
        car c1=new car();  
        System.out.println(c1.cost);
        System.out.println(c1.brand); 
        c1.start();  
        }
    
}
