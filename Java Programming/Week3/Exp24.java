class ParentTest {
    int x = 10;

    ParentTest() {
        System.out.println("ParentTest Constructor");
    }

    void display() {
        System.out.println("ParentTest method");
    }
}

class ChildTest extends ParentTest {
    int x = 20;

    ChildTest() {
        super(); // Calls ParentTest class constructor
        System.out.println("ChildTest Constructor");
    }

    void display() {
        super.display(); // Calls ParentTest's method
        System.out.println("ChildTest method");
    }

    void show() {
        System.out.println("ChildTest x = " + x);
        System.out.println("Parent x = " + super.x); // Access Parent's variable
    }
}

public class Exp24 {
    public static void main(String[] args) {
        ChildTest obj = new ChildTest();
        obj.display();
        obj.show();
    }
}
