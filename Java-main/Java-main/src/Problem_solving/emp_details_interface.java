package Problem_solving;

import java.util.Scanner;

interface Emp_details1{
    void emp_info();
}

class emp10 implements Emp_details1{
    @Override
    public void emp_info(){
        int emp_id;
        String emp_name;
        double Salary;
        String Email;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID =");
        emp_id = sc.nextInt();

        System.out.println("Enter Employee Name =");
        emp_name = sc.next();

        System.out.println("Enter Employee Salary =");
        Salary = sc.nextDouble();

        System.out.println("Enter Employee Email =");
        Email = sc.next();


        System.out.println("\nEmployee Details:");
        System.out.printf("Employee ID: %d\n", emp_id);
        System.out.printf("Employee Name: %s\n", emp_name);
        System.out.printf("Employee Salary: %.2f\n", Salary);
        System.out.printf("Employee Email: %s\n", Email);


    }
}
public class emp_details_interface {
    public static void main(String[] args) {
        emp10 e = new emp10();
        e.emp_info();
    }
}
