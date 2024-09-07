package module3CTA;
import java.util.Scanner;


public class AverageWithholding {
	public static void main(String[] args) {

			// Open scanner for user input
		Scanner scanner = new Scanner(System.in);
		
			// Declare variables
		String userIncome;
		double taxRate;
		double weeklyIncome;
		double weeklyTaxWithheld;
		
			// Prompt user to enter weekly income
		System.out.print("Please enter your weekly income: $");
			
			// Store user input in userIncome
		userIncome = scanner.next();
			
			// Convert String userIncome into double weeklyIncome for mathematical comparisons in if statement conditionals
		weeklyIncome = Double.valueOf(userIncome);
		
			// Use if-then and if-else to find tax rate for user's income bracket
		if (weeklyIncome < 500.00) 
			taxRate = 0.10;
		else if (weeklyIncome >= 500.00 && weeklyIncome <= 1500.00)
			taxRate = 0.15;			
		else if (weeklyIncome >= 1500.00 && weeklyIncome < 2500.00)
			taxRate = 0.20;
		else {
			taxRate = 0.30;
		}
		
			// Calculate weekly tax withheld
		weeklyTaxWithheld = weeklyIncome * taxRate;
			
			// Print results 
		System.out.printf("The average weekly tax withheld from your income is " + "$%, .2f", weeklyTaxWithheld);
			
			// Close scanner
		scanner.close();
	}

}
