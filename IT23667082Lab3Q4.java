import java.util.Scanner;

public class IT23667082Lab3Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        int d1 = number / 10000;
        int d2 = (number / 1000) % 10; //% 10 gives the last digit of that result//
        int d3 = (number / 100) % 10;
        int d4 = (number / 10) % 10;
        int d5 = number % 10;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);

        input.close();
    }
}