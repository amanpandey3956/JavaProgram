class Vehicle {

    public void speedUp() {
        System.out.println("speed of the vehicle");
    }
}

class Car extends Vehicle {
    
    public void speedUp() {
        System.out.println("Speeding up the car.");
    }
}

class Bicycle extends Vehicle {

    public void speedUp() {
        System.out.println("Pedaling faster on the bicycle.");
    }
}

public class testnew1 {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.speedUp();
        bicycle.speedUp();
    }
}
