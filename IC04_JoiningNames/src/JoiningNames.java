
/*
    Nguyen, Nguyen
    CS A170
    02/09/2018

    IC04_JoiningNames
 */
import java.util.Scanner;

public class JoiningNames
{

    public static void main(String[] args)
    {
        // Variables
        String firstname, lastname, middleInitial;
        Scanner consoleScanner = new Scanner(System.in);

        // Get input from user
        firstname = Prompt("Please enter your firstname: ", consoleScanner);
        middleInitial = Prompt("Please enter your middle initial: ", consoleScanner);
        lastname = Prompt("Please enter your lastname: ", consoleScanner);

        // Close the scanner
        consoleScanner.close();

        // Display
        System.out.println();
        System.out.println(firstname + " (length=" + firstname.length() + ")");
        System.out.println(middleInitial + " (length=" + middleInitial.length() + ")");
        System.out.println(lastname + " (length=" + lastname.length() + ")");

        System.out.println();
        System.out.println(lastname.toUpperCase() + "," + firstname.toUpperCase() + "," + middleInitial.toUpperCase());
    }

    public static String Prompt(String message, Scanner scanner)
    {
        // Print the message
        System.out.print(message);

        // Return the value
        return scanner.nextLine();
    }

}
