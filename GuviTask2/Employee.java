package GuviTask2;


	public class Employee extends Personinfo {
	    private String employeeId;
	    private double salary;

	    // Parameterized constructor for Employee
	    public Employee(String name, int age, String employeeId, double salary) {
	        // Call the constructor of the base class Person
	        super(name, age);
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getter methods
	    public String getEmployeeId() {
	        return employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Setter methods
	    public void setEmployeeId(String employeeId) {
	        this.employeeId = employeeId;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Method to display employee's information
	    @Override
	    public void displayPersonInfo() {
	        // Call the base class method to display person information
	        super.displayPersonInfo();
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	    }
	}


