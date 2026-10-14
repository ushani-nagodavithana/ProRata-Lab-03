import java.util.Scanner;

public class IT23667082Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of 1kg rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter number of kilograms(kg) you want to buy: ");
        double kg = input.nextDouble();

        double total = pricePerKg * kg;
        
        double discount = total * 10 / 100;

        double amountToPay = total - discount;

        System.out.println("Total bill: Rs. " + total);
	System.out.println("Discount (10%): Rs. " + discount);
        System.out.println("Amount to pay: Rs. " + amountToPay);

	input.close();
    }
}


