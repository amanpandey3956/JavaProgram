// Encapsulation in java using constructor

class car{
    private int cost;

    public car(int cost){
        this.cost=cost;
    }

    public int getcost() {
        return cost;
    }

    public void setcost(int cost) {
        this.cost=cost;
    }

}
public class encapsulation{
    public static void main(String[] args) {
        car cost = new car(3000);
        System.out.println("cost of car is :" + cost.getcost());

        // modified using setter method

        cost.setcost(5000);
        System.out.println("modified cost is :" + cost.getcost());
    }
    
}
