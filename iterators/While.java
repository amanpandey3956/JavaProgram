public class While {
    public static void main(String[] args){
        // int i=1;
        // while (i<=10) {
        //     System.out.println(i);
        //     i++;
        // }
        // *******************************************************************************

        int i=1;
        int sum =0;
        while (i<=10) {
            if(i%2!=0){

                sum = sum+i;
                System.out.println(i);
            }
            i++;
            
        }
        System.out.println("sum of odd no from 1-10 is :" + sum);

        
    }
    
}
