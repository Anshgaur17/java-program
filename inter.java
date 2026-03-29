interface A {
    void show();
}

interface B {
    void display();
}

// class implementing two interfaces
class Test implements A, B {

    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class inter {
    public static void main(String[] args) {

        Test obj = new Test();

        obj.show();
        obj.display();
    }
}