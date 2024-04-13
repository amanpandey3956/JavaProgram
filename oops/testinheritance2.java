//When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, C class inherits the B class which again inherits the A class, so there is a multilevel inheritance.

//Multilevel Inheritance Example

class A{  
    void eat(){System.out.println("eating...");}  
}  
class B extends A{  
    void bark(){System.out.println("barking...");}  
}  
class C extends B{  
    void weep(){System.out.println("weeping...");}  
} 

class TestInheritance2{  
    public static void main(String args[]){  
    C d=new C();  
    d.weep();  
    d.bark();  
    d.eat();  
    }
}  