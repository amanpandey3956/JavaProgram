public class testnew {
    private double length;
    private double width;

    // Constructor
    public testnew(double length, double width) {
        this.length = length;
        this.width = width;
    }

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

    public static void main(String[] args) {

        testnew rectangle = new testnew(5, 10);

        System.out.println("Length is: " + rectangle.getLength());
        System.out.println("Width is: " + rectangle.getWidth());
        System.out.println("Area is: " + rectangle.calculateArea());

        // Modifying the length and width using setter methods
        
        rectangle.setLength(7);
        rectangle.setWidth(12);
        System.out.println("\nModified Length is: " + rectangle.getLength());
        System.out.println("Modified Width is: " + rectangle.getWidth());
        System.out.println("Modified Area is: " + rectangle.calculateArea());

    }
}
