public class doWhile {
    public static void main(String[] args){
        int i=1;
        do{
            if (i%2==0){
                System.out.println(i + " is even");
            }else{
                System.out.println(i + " is odd");

            }i++; 
        }
        while(i<=10);
    }
    
}
