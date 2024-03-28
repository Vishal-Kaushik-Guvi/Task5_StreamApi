package Question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculateAge {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // Take DOB as Input
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String dobString = scanner.nextLine();
    // Change String format into Date Format
        LocalDate dob = LocalDate.parse(dobString);
        LocalDate currentDate = LocalDate.now();
    //  Make a diff from current Period to the period you Born
        Period period = Period.between(dob, currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
    // Display the output
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
        
        scanner.close();
   }
}

// --------------------------------------------OUTPUT---------------------------------------------
// Enter your date of birth (yyyy-mm-dd): 2001-10-04
// Your age is: 22 years, 5 months, and 24 days.
