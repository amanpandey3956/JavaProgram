class Bikes {
    final void run()
    {
        System.out.println("running");
    }
}
class Honda extends Bikes{
        // void run(){
        //     System.out.println("running safely with 100km");
        // }

        // if you make any class as final you cannot extend it
    
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
        
    }
}