/*
 * Budget Calculator Program
 * This program calculates monthly expenses and savings based on a fixed salary.
 * It demonstrates the use of constants, variables, calculations, and formatted output.
 */

public class BudgetCalculator {
    // Define constants (Fixed values that do not change)
    public static final double SALARY = 4000.0;         // Monthly salary
    public static final double SAVINGS_PERCENT = 0.10;  // 20% of salary saved
    public static final double RENT_PERCENT = 0.30;     // 30% of salary spent on rent
    public static final double GROCERIES_PERCENT = 0.15; // 15% of salary spent on groceries
    public static final double ENTERTAINMENT_PERCENT = 0.10; // 10% of salary for entertainment

    // Main method where the program starts execution
    public static void main(String[] args) {
        // Declare variables to store calculated values
        double monthlySalary = SALARY;  // Set monthly salary
        double savedAmount = monthlySalary * SAVINGS_PERCENT;  // Calculate savings
        double rentAmount = monthlySalary * RENT_PERCENT;  // Calculate rent cost
        double groceriesAmount = monthlySalary * GROCERIES_PERCENT;  // Calculate grocery cost
        double entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;  // Calculate entertainment cost

        // Calculate total expenses (rent + groceries + entertainment)
        double totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;

        // Calculate remaining balance (salary - total expenses)
        double remainingBalance = monthlySalary - totalExpenses;

        // Display results
        System.out.println("===== Budget Calculator Report =====");
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Amount Saved: $" + savedAmount);
        System.out.println("Amount Spent on Rent: $" + rentAmount);
        System.out.println("Amount Spent on Groceries: $" + groceriesAmount);
        System.out.println("Amount Spent on Entertainment: $" + entertainmentAmount);
        System.out.println("-----------------------------------");
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + remainingBalance);
    }
}
