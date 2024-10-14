package amalitech;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Mortgage Calculator Application
 * Requirements:
 * 1. Principal amount: $100,000
 * 2. Annual Interest Rate: 4.2%
 * 3. Loan Term: 30 years
 * 4. Monthly Payment: $?
 */

public class LoanCalculator {
    private static final byte MONTHS_IN_A_YEAR = 12;
    private static final byte PERCENTAGE = 100;
    private static final int MIN_LOAN_AMOUNT = 1000;
    private static final int MAX_LOAN_AMOUNT = 1_000_000;

    public static void main(String... args) {
        Scanner inputScanner = new Scanner(System.in);

        int loanAmount = obtainLoanAmount(inputScanner);
        float annualRate = obtainAnnualInterestRate(inputScanner);
        float monthlyRate = annualRate / PERCENTAGE / MONTHS_IN_A_YEAR;
        int loanTermInYears = obtainLoanTerm(inputScanner);
        int totalPayments = loanTermInYears * MONTHS_IN_A_YEAR;

        try {
            double monthlyPayment = loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) /
                    (Math.pow(1 + monthlyRate, totalPayments) - 1);
            String formattedPayment = NumberFormat.getCurrencyInstance().format(monthlyPayment);
            System.out.println("Monthly Payment: " + formattedPayment);
        } catch (ArithmeticException e) {
            System.out.println("Calculation error: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }

    public static int obtainLoanAmount(Scanner scanner) {
        int loanAmount = 0;
        do {
            System.out.println("Enter loan amount (between " + MIN_LOAN_AMOUNT + " and " + MAX_LOAN_AMOUNT + "): ");
            String inputAmount = scanner.nextLine();
            if (!isIntegerValid(inputAmount)) {
                System.out.println("Please enter a valid integer.");
                continue;
            }
            loanAmount = Integer.parseInt(inputAmount);
            if (!(loanAmount >= MIN_LOAN_AMOUNT && loanAmount <= MAX_LOAN_AMOUNT)) {
                System.out.println("Value must be between " + MIN_LOAN_AMOUNT + " and " + MAX_LOAN_AMOUNT + ".");
            }
        } while (!(loanAmount >= MIN_LOAN_AMOUNT && loanAmount <= MAX_LOAN_AMOUNT));
        return loanAmount;
    }

    public static float obtainAnnualInterestRate(Scanner scanner) {
        float rate = 0F;
        do {
            System.out.println("Enter annual interest rate (greater than 0): ");
            String inputRate = scanner.nextLine();
            if (!isFloatValid(inputRate)) {
                System.out.println("Interest rate must be a positive number.");
                continue;
            }
            rate = Float.parseFloat(inputRate);
            if (rate <= 0) {
                System.out.println("Interest rate must be greater than 0.");
            }
        } while (rate <= 0);
        return rate;
    }

    public static int obtainLoanTerm(Scanner scanner) {
        int years = -1;
        do {
            System.out.println("Enter loan term (in years, greater than 0): ");
            String inputYears = scanner.nextLine();
            if (!isIntegerValid(inputYears)) {
                System.out.println("Please enter a valid number of years.");
                continue;
            }
            years = Integer.parseInt(inputYears);
            if (years <= 0) {
                System.out.println("Loan term must be greater than 0.");
            }
        } while (years <= 0);
        return years;
    }

    private static boolean isIntegerValid(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isFloatValid(String value) {
        try {
            Float.parseFloat(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
