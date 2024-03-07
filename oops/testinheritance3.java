//When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

//Hierarchical Inheritance Example

class Pets{  
    void eat(){System.out.println("eating...");}  
}  
class rabbit extends Pets{  
    void bark(){System.out.println("chang...");}  
}  
class Cat extends Pets{  
    void meow(){System.out.println("meowing...");}  
}

class TestInheritance3{  
public static void main(String args[]){  
    Cat c=new Cat();  
    c.meow();  
    c.eat();  
    //c.bark();//C.T.Error  
    }
}  