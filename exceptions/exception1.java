public class exception1

{
    static void work() throws ArithmeticException {
        System.out.println(10 / 0);
    }

    public static void main(String[] args) {
        try {
            work();
        } catch (Exception e) {
            System.out.println("Handle the Exception");
        }
    }
}