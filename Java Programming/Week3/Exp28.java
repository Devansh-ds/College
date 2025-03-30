// Define an interface
interface AnimalTest {
    void sound(); // Abstract method
}

// Implement the interface in Dog class
class Dog implements AnimalTest {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Implement the interface in Cat class
class Cat implements AnimalTest {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test dynamic polymorphism
public class Exp28 {
    public static void main(String[] args) {
        AnimalTest a = new Dog(); // Assign Dog object to interface reference
        a.sound(); // Calls Dog's implementation

        AnimalTest b = new Cat(); // Assign Cat object to interface reference
        b.sound(); // Calls Cat's implementation
    }
}
