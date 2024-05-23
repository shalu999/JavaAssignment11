package ErrorHandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    }
	public class Ass7InvalidAge {

	    // Method to validate age
	    public static void validateAge(int age) throws InvalidAgeException {
	        if (age < 18) {
	            throw new InvalidAgeException("Age must be at least 18.");
	        }
	        System.out.println("Age is valid.");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the age:");
	        int userAge = scanner.nextInt();  // Read the age input from the user

	        try {
	            validateAge(userAge);  // Validate the age
	        } catch (InvalidAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}