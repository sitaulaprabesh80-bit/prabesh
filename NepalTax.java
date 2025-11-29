import java.util.Scanner;

public class NepalTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual income ): ");
        double income = scanner.nextDouble();
        double tax = 0;
        double rem_amt = income;
        if (rem_amt > 500000) {
            tax += 500000 * 0.01;
            rem_amt -= 500000;
        } else {
            tax += rem_amt * 0.01;
            rem_amt = 0;
        }
      
        if (rem_amt > 200000) {
            tax += 200000 * 0.10;
            rem_amt -= 200000;
        } else {
            tax += rem_amt * 0.10;
            rem_amt = 0;
        }
        
        if (rem_amt > 300000) {
            tax += 300000 * 0.20;
            rem_amt -= 300000;
        } else {
            tax += rem_amt * 0.20;
            rem_amt = 0;
        }
        
        if (rem_amt > 1000000) {
            tax += 1000000 * 0.30;
            rem_amt -= 1000000;
        } else {
            tax += rem_amt * 0.30;
            rem_amt = 0;
        }

        if (rem_amt > 3000000) {
            tax += 3000000 * 0.36;
            rem_amt -= 3000000;
        } else {
            tax += rem_amt * 0.36;
            rem_amt = 0;
        }
        
        if (rem_amt > 2000000) {
            tax += rem_amt * 0.39;
        }
        
        System.out.println("You paid Tax: " + tax+" for rs: "+income);
        
    }
}