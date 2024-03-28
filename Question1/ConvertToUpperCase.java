package Question1;
import java.util.stream.Stream;

class ConvertToUpperCase {
 public static void main(String[] args) {
    // Taking names of string With Stream
    Stream<String> names = Stream.of("aBc", "d", "ef");
   // Changing it to uppercase
        Stream<String> uppercaseNames = names.map(String::toUpperCase);
   // printing with Method Refrence in ForEach Loop
        uppercaseNames.forEach(System.out::println);
  }
}


//------------------------------OUTPUT-------------------------------
// ABC
// D
// EF