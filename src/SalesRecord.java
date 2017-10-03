import java.util.Scanner;


public class SalesRecord {
    public static void main(String args[]) {
        int customerID = 0;
        int salesAmount = 0;
        double totalAmount = 0;
        String taxCode = "";
        String customerName = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter customer name: ");
        customerName = keyboard.nextLine();


        System.out.println("Enter customer ID: ");
        customerID = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter Sales Amount: ");
        salesAmount = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter the tax code: ");
        taxCode = keyboard.nextLine();


        System.out.println("\n\nCustomer ID :" + customerID);
        System.out.println("Customer name: " + customerName);
        System.out.println("Sales amount: $" + salesAmount);
        System.out.println("Tax code: " + taxCode.toUpperCase());

        // print total amount

        if (taxCode.equalsIgnoreCase("NRM")) {
            totalAmount = salesAmount * 1.06;
        } else if (taxCode.equalsIgnoreCase("BIZ")) {
            totalAmount = salesAmount * 1.045;
        } else if (taxCode.equalsIgnoreCase("NPF")) {
            totalAmount = salesAmount;
        } else {
            totalAmount = salesAmount;
            System.out.println("Invalid tax code");

        }

        System.out.println("Total Amount Due: $" + totalAmount);

    }
}
