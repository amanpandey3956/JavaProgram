public class For {
    public static void main(String[] args){
        int oddsum =0;
        int evensum=0;
        for (int i=1; i<=10; i++) {
            if(i%2==0){

                evensum=evensum+i;
                
            }else{
                oddsum=oddsum+i;
                
            }
               
        }
        System.out.println("sum of even no from 1-10 is :" + evensum);
        System.out.println("sum of odd no from 1-10 is :" + oddsum);
        
    }
    
}
