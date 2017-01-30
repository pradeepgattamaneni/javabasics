import java.util.Scanner;

class Customer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name :");
		String name = input.nextLine();
	
		System.out.print("Enter the price of the product: ");
		double price = input.nextDouble();
		System.out.print("Enter the quantity of the product: ");
		int quantity = input.nextInt();

		double pur = price*quantity;
		double salary = 10000;
		double spent = (pur/salary)*100;
		System.out.println("You have spent "+spent+"% of your salary "+
							"on the purchase");
	}
}