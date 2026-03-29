class Parent {

    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        super(); // calls Parent constructor
        System.out.println("Child Constructor");
    }
}

public class chaining {
    public static void main(String[] args) {

        Child obj = new Child();
        
    }
}