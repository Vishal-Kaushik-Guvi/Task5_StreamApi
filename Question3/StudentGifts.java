package Question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGifts {
  public static void main(String[] args) {
       List<String> studentNames = Arrays.asList("Rahul", "Vishal", "Kavya", "Anjali", "Ashu", "Shivam", "Lavish", "Abhihek","Rohan","Anjana");

        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("All Student Names: " + studentNames);
        System.out.println("Students whose names start with 'A': " + studentsWithA);
  }
}
//----------------------------------OUTPUT-------------------------------------------

// All Student Names: [Rahul, Vishal, Kavya, Anjali, Ashu, Shivam, Lavish, Abhihek, Rohan, Anjana]
// Students whose names start with 'A': [Anjali, Ashu, Abhihek, Anjana]