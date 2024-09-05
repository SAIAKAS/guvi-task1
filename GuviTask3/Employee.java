package GuviTask3;


	class Employee implements Taxable {
	    private int employeeID;
	    private String name;
	    private double salary;

	    public Employee(int employeeID, String name, double salary) {
	        this.employeeID = employeeID;
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public double calcTax() {
	        // Calculate income tax based on the salary
	        return salary * INCOME_TAX;
	    }

	    public String toString() {
	        return "Employee ID: " + employeeID + ", Name: " + name + ", Salary: $" + salary;
	    }
	}

