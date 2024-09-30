package module5;

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
	public static void main(String[] args) {
		// Create ArrayLists to store days and temperatures
		ArrayList<String> days = new ArrayList<>();
		ArrayList<Double> temperatures = new ArrayList<>();

		// Add days of the week to the days ArrayList
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");

		// Add week's daily average temperatures to the temperatures ArrayList
		temperatures.add(65.0);
		temperatures.add(68.8);
		temperatures.add(70.1);
		temperatures.add(72.2);
		temperatures.add(67.0);
		temperatures.add(66.5);
		temperatures.add(63.7);

		// Scanner to take user input
		Scanner scanner = new Scanner(System.in);

		// Loop to get user input and display results
		while (true) {
			System.out.print("Enter a day (Monday-Sunday) or 'week' to see the weekly summary. (Enter 'q' to Quit): ");
			String input = scanner.next();
			// Check if user quits program
			if (input.equalsIgnoreCase("q")) {
				System.out.println("Goodbye!");
				break;
			} else if (input.equalsIgnoreCase("week")) {
				// Display temperatures for all days and calculate the weekly average
				double sum = 0;
				System.out.println("\nTemperatures for the week:");
				for (int i = 0; i < days.size(); i++) {
					System.out.println(days.get(i) + ": " + temperatures.get(i) + "F");
					sum += temperatures.get(i);
				}
				double average = sum / temperatures.size();
				System.out.printf("Weekly Average Temperature: %.1fF", average);
				break;
			} else {
				// Check if the input matches any day of the week
				int i = days.indexOf(capitalize(input));
				if (i != -1) {
					System.out.println(days.get(i) + ": " + temperatures.get(i) + "F");
				} else {
					System.out.println("Invalid input, please enter a valid day or 'week'.");
				}
			}
		}

		// Close the scanner
		scanner.close();
	}

	// Helper function to capitalize the first letter of the day input
	private static String capitalize(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}
}
