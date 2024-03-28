package Question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {
  public static void main(String[] args) {
    // Taking List of String
    List<String> ListString = Arrays.asList("abc", "", "bc","efg", "abcd", "", "jkl");
    // Filtring list and taking list of String which is not empty
        List<String> nonEmptyList = ListString.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Original List: " + ListString);
        System.out.println("List with Non-empty Strings: " + nonEmptyList);
  }
}

// --------------------------------OUTPUT-----------------------------------------

// Original List: [abc, , bc, efg, abcd, , jkl]
// List with Non-empty Strings: [abc, bc, efg, abcd, jkl]