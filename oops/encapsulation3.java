// encapsulation using constructor

class myArea {
    private double lenth;
    private double wd;

    // Constructor
    public myArea(double lenth, double wd) {
        this.lenth = lenth;
        this.wd = wd;
    }

    public double getLenth() {
        return lenth;
    }

    public void setLenth(double lenth) {
        this.lenth = lenth;
    }

    public double getwd() {
        return wd;
    }

    public void setwd(double wd) {
        this.wd = wd;
    }

    public double calArea() {
        return lenth * wd;
    }
}

public class encapsulation3{
    public static void main(String[] args) {

        myArea rect = new myArea(5, 10);

        System.out.println("Length is: " + rect.getLenth());
        System.out.println("Width is: " + rect.getwd());
        System.out.println("Area is: " + rect.calArea());

        // Modifying the lenth and wd using setter methods
        
        rect.setLenth(7);
        rect.setwd(12);
        System.out.println("\nModified Length is: " + rect.getLenth());
        System.out.println("Modified Width is: " + rect.getwd());
        System.out.println("Modified Area is: " + rect.calArea());

    }

}

