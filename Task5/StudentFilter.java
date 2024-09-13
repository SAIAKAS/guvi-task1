package Task5;


	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class StudentFilter {
	    public static void main(String[] args) {
	        // Initialize the list of student names
	        List<String> students = Arrays.asList(
	            "Arun", "Balaji", "Abi", "Chinda", "Anisha",
	            "Dhanu", "Akashya", "Edwin", "Ganesh", "Andrea"
	        );
	        
	        // Use Stream API with lambda expression
	        List<String> studentsStartingWithA = students.stream()
	            .filter(name -> name.startsWith("A"))
	            .collect(Collectors.toList());
	        
	        // Print the list of students whose names start with "A"
	        System.out.println(studentsStartingWithA);
	    }
	}

