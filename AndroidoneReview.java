import java.util.Scanner;

class AndroidoneReview {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int rating = 0;
		int noCoustomer = 10;
		for (int i = noCoustomer; i > 0; i-- ) {
                        System.out.print("Enter your name:  ");
			String name = input.nextLine();
                        
			System.out.print("Enter your rating for android one: ");
			System.out.print("In the range 1 - 5:  ");
			int userRating  = input.nextInt();
			
			
			rating += userRating;
		}
		System.out.println(rating);
		double average = (double)rating/noCoustomer;
		System.out.println("Average rating of the product is : "+average);

	}	
}