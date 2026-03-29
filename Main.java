class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Ansh";
        s1.display();
    }
}