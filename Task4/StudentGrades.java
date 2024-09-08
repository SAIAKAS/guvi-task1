package Task4;


	import java.util.HashMap;
	import java.util.Scanner;

	public class StudentGrades {
	  
	    private HashMap<String, Integer> studentMap;

	   
	    public StudentGrades() {
	        studentMap = new HashMap<>();
	    }

	   // add student name
	    public void addStudent(String name, int grade) {
	        studentMap.put(name, grade);
	        System.out.println("Student " + name + " added with grade " + grade + ".");
	    }

	    // Method to remove a student by name
	    public void removeStudent(String name) {
	        if (studentMap.containsKey(name)) {
	            studentMap.remove(name);
	            System.out.println("Student " + name + " removed.");
	        } else {
	            System.out.println("Student " + name + " not found.");
	        }
	    }

	    // Method to display a student's grade by name
	    public void displayStudentGrade(String name) {
	        if (studentMap.containsKey(name)) {
	            System.out.println(name + "'s grade is: " + studentMap.get(name));
	        } else {
	            System.out.println("Student " + name + " not found.");
	        }
	    }

	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        StudentGrades studentGrades = new StudentGrades();

	      
	        studentGrades.addStudent("Sai", 90);
	        studentGrades.addStudent("sam", 85);
	        studentGrades.addStudent("vishnu", 92);

	        while (true) {
	           
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Add a new student");
	            System.out.println("2. Remove a student");
	            System.out.println("3. Display a student's grade");
	            System.out.println("4. Exit");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    // Add new student
	                    System.out.print("Enter student name: ");
	                    String nameToAdd = scanner.nextLine();
	                    System.out.print("Enter grade: ");
	                    int grade = scanner.nextInt();
	                    studentGrades.addStudent(nameToAdd, grade);
	                    break;
	                case 2:
	                    // Remove student
	                    System.out.print("Enter student name to remove: ");
	                    String nameToRemove = scanner.nextLine();
	                    studentGrades.removeStudent(nameToRemove);
	                    break;
	                case 3:
	                    // Display student grade
	                    System.out.print("Enter student name to display grade: ");
	                    String nameToDisplay = scanner.nextLine();
	                    studentGrades.displayStudentGrade(nameToDisplay);
	                    break;
	                case 4:
	                    // Exit
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}


