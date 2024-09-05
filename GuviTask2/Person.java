package GuviTask2;

public class Person {
	
	    private String name; 
	    private int age;

	    // Default constructor with default age of 18
	    public Person(String name) {
	        this.name = name;
	        this.age = 18;
	    }

	    // Constructor with both name and age
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display the name and age of the person
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    // Main method
	    public static void main(String[] args) {
	        Person person1 = new Person("Sai"); // Default age of 18
	        Person person2 = new Person("Arun", 20); // Age 20 specified

	        person1.displayInfo(); // Output: Name: Sai, Age: 18
	        person2.displayInfo(); // Output: Name: Arun, Age: 20
	    }
	}


