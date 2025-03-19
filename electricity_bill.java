package Problem_solving;
import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units: ");
        int unit = sc.nextInt();
        double bill;

        if (unit <= 200) {
            bill = unit * 0.50;
        } else if (unit <= 500) {
            bill = (200 * 0.50) + ((unit - 200) * 0.75);
        } else {
            bill = (200 * 0.50) + (300 * 0.75) + ((unit - 500) * 1.20);
        }

        // Add a fixed surcharge of 20%
        bill += bill * 0.20;

        // Convert the final bill to an integer for output
        int finalBill = (int) bill;

        System.out.println("Your electricity bill is: ₹" + finalBill);

        sc.close(); 
    }
}
