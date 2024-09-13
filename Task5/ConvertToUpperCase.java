package Task5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUpperCase {
    public static void main(String[] args) {
      
        Stream<String> names = Stream.of(" aBc ", "d", "ef");

        // Convert each string to upper case using map() and collect the results into a list
        List<String> upperCaseNames = names
            .map(String::toUpperCase)  // Convert each string to upper case
            .collect(Collectors.toList());

      
        System.out.println(upperCaseNames);
    }
}


