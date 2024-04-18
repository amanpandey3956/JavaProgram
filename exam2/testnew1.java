class Vehicle {

    public void speedUp() {
        System.out.println("speed of the vehicle");
    }
}

class Cars extends Vehicle {
    
    public void speedUp() {
        System.out.println("Speeding up the car.");
    }
}

class Bicycles extends Vehicle {

    public void speedUp() {
        System.out.println("Pedaling faster on the bicycle.");
    }
}

public class testnew1 {
    public static void main(String[] args) {

        Cars cars = new Cars();
        Bicycles bicycles = new Bicycles();
        cars.speedUp();
        bicycles.speedUp();
    }
}
