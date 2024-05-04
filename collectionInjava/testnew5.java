import java.util.*;

class Studentnew{
    int age;
    String name;
    Studentnew(int age,String name){
        this.age=age;
        this.name=name;
    }
}

public class testnew5 {
    public static void main(String[] args) {
        Studentnew s1 = new Studentnew(20,"aman");
        Studentnew s2 = new Studentnew(21,"parth");
        Studentnew s3 = new Studentnew(22,"yash");

        ArrayList<Studentnew> A1 = new ArrayList<>();
        A1.add(s1);
        A1.add(s2);
        A1.add(s3);

        for(Studentnew i : A1){
            System.out.println(i.age +" "+ i.name);
        }
    }
    
}
