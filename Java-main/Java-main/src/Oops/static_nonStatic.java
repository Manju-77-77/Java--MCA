package Oops;

public class static_nonStatic {

    public static class Example {

        public static void staticMethod() {
            System.out.println("This is a static method.");
        }

        public void nonStaticMethod() {
            System.out.println("This is a non-static method.");
        }
    }

    public static class Calculator {

        public static int add(int num1, int num2) {
            return num1 + num2;
        }

        public static int subtract(int num1, int num2) {
            return num1 - num2;
        }

        public static int multiply(int num1, int num2) {
            return num1 * num2;
        }

        public static int divide(int num1, int num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Division by zero is not allowed.");
                return 0;
            }
        }

        public static int modulo(int num1, int num2) {
            if (num2 != 0) {
                return num1 % num2;
            } else {
                System.out.println("Modulo by zero is not allowed.");
                return 0;
            }
        }

        public static int performOperation(int num1, int num2, char operator) {
            if (operator == '+') {
                return add(num1, num2);
            } else if (operator == '-') {
                return subtract(num1, num2);
            } else if (operator == '*') {
                return multiply(num1, num2);
            } else if (operator == '/') {
                return divide(num1, num2);
            } else if (operator == '%') {
                return modulo(num1, num2);
            } else {
                System.out.println("Invalid operator. Use +, -, *, /, or %.");
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        Example.staticMethod();

        Example example = new Example();
        example.nonStaticMethod();

        int num1 = 12;
        int num2 = 4;

        System.out.println("Addition: " + Calculator.performOperation(num1, num2, '+'));
        System.out.println("Subtraction: " + Calculator.performOperation(num1, num2, '-'));
        System.out.println("Multiplication: " + Calculator.performOperation(num1, num2, '*'));
        System.out.println("Division: " + Calculator.performOperation(num1, num2, '/'));
        System.out.println("Modulo: " + Calculator.performOperation(num1, num2, '%'));
    }
}
