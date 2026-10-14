import java.util.Scanner;

public class IT23667082Lab3Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter price of 1kg rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter number of kilograms(kg) you want to buy: ");
        double kg = input.nextDouble();

        double total = pricePerKg * kg;
        
        System.out.println("Total bill: Rs. " + total);
	
	input.close();
    }
}


