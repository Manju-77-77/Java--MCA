package Oops;

interface Animal2 {
    void eat();
    void sleep();
}

class Dog2 implements Animal2 {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

public class MyInterfaceExample {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.eat();
        myDog.sleep();
    }
}

