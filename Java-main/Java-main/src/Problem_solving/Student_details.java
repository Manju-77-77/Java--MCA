package Problem_solving;

import java.util.Scanner;

public class Student_details {
    public static void main() {
        String name;
        int id;
        float CGPA;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        System.out.println("Enter CGPA: ");
        CGPA = sc.nextFloat();
        
        System.out.println("name: " + name + "\n" + "ID: " + id + "\n" + "CGPA: " + CGPA);
    }
}
