import java.util.Scanner;

public class MakeChange1 {
	public static void main(String[] args)

	{

		System.out.println("How much change do you need?");
		Scanner input = new Scanner(System.in);
		Double amount = input.nextDouble();

		Change(amount);



		input.close();
	}

	public static void Change(Double amount) {

		Double quarter = 0.0;
		Double dime = 0.0;
		Double nickle = 0.0;
		Double penny = 0.0;

		if (amount > 0.25) {
			quarter = Math.floor(amount/0.25);
			System.out.println("Quarters " + quarter);
			amount = amount % 0.25;
		}

		if (amount >= 0.10) {
			dime = Math.floor(amount/0.10);
			System.out.println("dimes " + dime);
			amount = amount % 0.10;
		}

		if (amount >= 0.05) {
			nickle = Math.floor(amount/0.05);
			System.out.println("nickle " + nickle);
			amount = amount % 0.05;
		}

		if (amount >= 0.01) {
			penny = Math.floor(amount/0.01);
			System.out.println("penny " + penny);
			amount = amount % 0.01;
		}
		

	}

}