package Task5;


	import java.time.LocalDate;
	import java.time.Period;
	import java.time.format.DateTimeFormatter;
	import java.time.format.DateTimeParseException;
	import java.util.Scanner;

	public class AgeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        try {
	           
	            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
	            String input = scanner.nextLine();
	            
	           
	            LocalDate birthdate = LocalDate.parse(input, formatter);
	            LocalDate today = LocalDate.now();
	            
	            // Calculate the age
	            Period period = Period.between(birthdate, today);
	            int years = period.getYears();
	            int months = period.getMonths();
	            int days = period.getDays();
	            
	            // Print the age
	            System.out.printf("Your age is: %d years, %d months, and %d days%n", years, months, days);
	        } catch (DateTimeParseException e) {
	            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
	        } finally {
	            scanner.close();
	        }
	    }
	}


