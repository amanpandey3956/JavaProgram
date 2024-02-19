public class star {
    public static void main(String[] args){
        for(int i=0; i<=4; i++){
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("**********************************************************");

        for(int i=0; i<=3; i++){
            for(int j=0; j<=4; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("********************************************************");

        for(int i=1; i<=4; i++){
            for(int j=0; j<=4; j++){
                System.out.print( i+" ");
            }
            System.out.println();
        }

        System.out.println("*******************************************************");

        for(int i=0; i<=3; i++){
            for(int j=1; j<=4; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        System.out.println("**********************************************************");

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print((i*j)+"\t");  
            }
            System.out.println();
        }
    }
    
}
