package Oops;

class Example {
    public int a = 10;
    protected int b = 20;
    int c = 30; // Default access modifier
    private int d = 40;

    public void display() {
        System.out.println("Inside Example class:");
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);
        System.out.println("Default: " + c);
        System.out.println("Private: " + d);
    }
}

public class Modifiers {
    public int a = 50;
    protected int b = 60;
    int c = 70; // Default access modifier
    private int d = 80;

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        System.out.println("Inside Modifiers class:");
        System.out.println("Public: " + obj.a);
        System.out.println("Protected: " + obj.b);
        System.out.println("Default: " + obj.c);
        System.out.println("Private: " + obj.d);
        System.out.println();

        Example ex = new Example();
        System.out.println("Accessing Example class from Modifiers class:");
        System.out.println("Public: " + ex.a);
        System.out.println("Protected: " + ex.b);
        System.out.println("Default: " + ex.c);
        // System.out.println("Private: " + ex.d); // Not accessible outside Example class
        System.out.println();

        ex.display();
    }
}
