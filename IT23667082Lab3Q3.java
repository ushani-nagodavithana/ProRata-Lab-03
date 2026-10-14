import java.util.Scanner;

public class IT23667082Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = input.nextInt();

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

       	for (int i = 0; i < denominations.length; i++) { 
	//int i = 0 → start at the first element (5000),i < denominations.length → continue until the end of the array,i++ → increase i by 1 after each iteration//

        	int count = amount / denominations[i];
		//how many notes/coins of the current denomination fit into the remaining amount//
            
		amount = amount % denominations[i];
		//calculates the remainder after taking out the notes/coins we just counted//


            System.out.println(denominations[i] + " Notes - " + count);
        }

        input.close();
    }
}