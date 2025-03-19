package Basic;

import java.util.Scanner;

public class static_dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();

        System.out.print("Enter an int value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter a char value: ");
        char charValue = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = sc.nextBoolean();

        sc.nextLine(); // Consume newline

        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();

        System.out.println("\nUser Inputs:");
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("String: " + stringValue);
    }
}
