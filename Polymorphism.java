package Oops;

class CompileTimePolymorphism {
    // Method Overloading (Compile-time polymorphism)
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }
}


class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

// Child class that overrides the show() method (Run-time polymorphism)
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-time polymorphism (Method Overloading)
        CompileTimePolymorphism obj1 = new CompileTimePolymorphism();
        obj1.display(10);
        obj1.display("Hello");

        // Run-time polymorphism (Method Overriding)
        Parent obj2 = new Child();
        obj2.show();
    }
}
