package GuviTask3;


	import java.util.Scanner;

	public class DriverMain {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter Employee ID: ");
	        int empID = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.print("Enter Employee Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Employee Salary: ");
	        double salary = scanner.nextDouble();

	        // Create Employee object and calculate income tax
	        Employee employee = new Employee(empID, name, salary);
	        double incomeTax = employee.calcTax();
	        System.out.println("\nEmployee Information:");
	        System.out.println(employee);
	        System.out.println("Income Tax: $" + incomeTax);

	      
	        System.out.print("\nEnter Product ID: ");
	        int pid = scanner.nextInt();
	        System.out.print("Enter Product Price: ");
	        double price = scanner.nextDouble();
	        System.out.print("Enter Product Quantity: ");
	        int quantity = scanner.nextInt();


	        Product product = new Product(pid, price, quantity);
	        double salesTax = product.calcTax();
	        System.out.println("\nProduct Information:");
	        System.out.println(product);
	        System.out.println("Sales Tax on Unit Price: $" + salesTax);

	        scanner.close();
	    }
	}


