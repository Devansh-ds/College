class Parent {
    void show() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class");
    }
}

public class Exp23 {
    public static void main(String[] args) {
        Parent obj = new Child(); // Superclass reference to subclass object
        obj.show(); // Calls overridden method in Child class (Dynamic Method Dispatch)
    }
}
