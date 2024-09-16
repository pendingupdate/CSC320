package module4CTA;

import java.util.ArrayList;
import java.util.Scanner;

public class OptionOne {
	public static void main(String[] args) {

		// Open scanner for user input
		Scanner scanner = new Scanner(System.in);

		// Declare variables
		final int NUM_VALUES = 5;
		Float totalValue;
		Float averageValue;
		Float maxValue;
		Float minValue;
		Float twentyPercentInterest;
		// user's input to be stored in userValues ArrayList
		ArrayList<Float> userValues = new ArrayList<Float>();
		// Set incrementing variable to 0
		int i = 0;

		// Prompt user to enter numbers
		System.out.println("Please enter " + NUM_VALUES + " numbers.");
		// Use while loop to prompt user for each number
		while (i < NUM_VALUES) {
			System.out.print("Number " + (i + 1) + ": ");
			// Store user's input in userValues
			userValues.add(scanner.nextFloat());
			// Increment incrementing variable to prevent endless loop
			i++;
		}

		// Close scanner
		scanner.close();

		// Initialize totalValue
		totalValue = 0f;
		// reset incrementing variable to 0
		i = 0;
		while (i < userValues.size()) {
			totalValue = totalValue + userValues.get(i);
			// Increment incrementing variable to prevent endless loop
			i++;
		}
		// Print total of user's values
		System.out.println("The total value of the numbers you entered is: " + totalValue);

		// Initialize averageValue
		averageValue = 0f;
		// find average
		averageValue = totalValue / userValues.size();
		// Print total of user's values
		System.out.println("The average value of the numbers you entered is: " + averageValue);

		// Initialize maxValue
		maxValue = userValues.get(0);
		// reset incrementing variable to 0
		i = 0;
		// iterate through values with while loop
		while (i < userValues.size()) {
			// use if-then to find maximum
			if (userValues.get(i) > maxValue) {
				maxValue = userValues.get(i);
			}
			// Increment incrementing variable to prevent endless loop
			i++;
		}
		// Print total of user's values
		System.out.println("The maximum value of the numbers you entered is: " + maxValue);

		// Initialize minValue
		minValue = userValues.get(0);
		// reset incrementing variable to 0
		i = 0;
		// iterate through values with while loop
		while (i < userValues.size()) {
			// use if-then to find minimum
			if (userValues.get(i) < minValue) {
				minValue = userValues.get(i);
			}
			// Increment incrementing variable to prevent endless loop
			i++;
		}
		// Print total of user's values
		System.out.println("The minimum value of the numbers you entered is: " + minValue);

		// Initialize twentyPercentInterest
		twentyPercentInterest = 0f;
		// find interest
		twentyPercentInterest = totalValue * 0.2f;
		// Print total of user's values
		System.out.println("20% interest on the total value of the numbers you entered is: " + twentyPercentInterest);

	}

}
