package Task1;

import java.util.Scanner;

public class Sign {
	
	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter a number: ");
	        // Read the number from the user
	        double number = scanner.nextDouble();

	        // Check if the number is positive, negative, or zero
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	        
	        scanner.close();
	    }
	}




