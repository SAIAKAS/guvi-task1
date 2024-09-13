package Task5;


	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class NonEmptyStrings {
	    public static void main(String[] args) {
	        // Initialize the list of strings
	        List<String> listStrings = Arrays.asList("abc", "", "be", "efg", "abcd", "", "jkl");
	        
	       
	        List<String> nonEmptyStrings = listStrings.stream()
	                                                  .filter(str -> !str.isEmpty())
	                                                  .collect(Collectors.toList());
	        
	       
	        System.out.println(nonEmptyStrings);
	    }
	}


