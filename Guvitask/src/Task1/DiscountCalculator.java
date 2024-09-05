package Task1;
	import java.util.Scanner;

	public class DiscountCalculator {
	    public static void main(String[] args) {
	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = new Scanner(System.in).nextDouble();

	        double discount = 0.0;

	        // Applying discount based on the purchase amount
	        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
	            discount = 0.10; // 10% discount
	        } else if (purchaseAmount > 1000) {
	            discount = 0.20; // 20% discount
	        }

	        // Calculating the final payable amount
	        double discountAmount = purchaseAmount * discount;
	        double finalAmount = purchaseAmount - discountAmount;

	        // Displaying the final amount
	        System.out.printf("The final payable amount after discount is: %.2f\n", finalAmount);
	    }
	}


