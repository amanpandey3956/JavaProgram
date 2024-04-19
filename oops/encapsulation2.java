// Encapsulation in java

class Area {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
public class encapsulation2 {
    public static void main(String[] args) {

        Area rectangle = new Area();
        
        rectangle.setLength(7);
        rectangle.setWidth(12);
        System.out.println("\nModified Length is: " + rectangle.getLength());
        System.out.println("Modified Width is: " + rectangle.getWidth());
        System.out.println("Modified Area is: " + rectangle.calculateArea());

    }
}
