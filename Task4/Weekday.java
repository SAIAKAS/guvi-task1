package Task4;


	import java.util.Scanner;

	public class Weekday {
	    public static void main(String[] args) {
	        // Array to store the names of the weekdays
	        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	      
	        Scanner scanner = new Scanner(System.in);

	        try {
	            
	            System.out.print("Enter the day position (0-6): ");
	            int dayIndex = scanner.nextInt();

	           	            System.out.println("The day is: " + weekdays[dayIndex]);

	        } catch (ArrayIndexOutOfBoundsException e) {
	           
	            System.out.println("Error: Invalid day position. Please enter a number between 0 and 6.");
	        } catch (Exception e) {
	            
	            System.out.println("Error: Please enter a valid integer.");
	        } finally {
	            scanner.close();  
	        }
	    }
	}


