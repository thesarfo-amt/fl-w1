package amalitech;

import java.util.Scanner;

public class FizzBuzzChallenge {
    public static void main(String...args){
        int number = promptForInput();
        String answer = calculateFizzBuzz(number);
        System.out.println(answer);
    }

    private static int promptForInput() {
        Scanner scanner = new Scanner(System.in);
        int inputValue = 0;
        boolean isNumberInvalid;

        do {
            System.out.print("Enter a number: ");
            String number = scanner.nextLine();
            isNumberInvalid = !isValidInteger(number);
            if (!isNumberInvalid) {
                inputValue = Integer.parseInt(number);
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } while (isNumberInvalid);

        scanner.close();
        return inputValue;
    }

    private static boolean isValidInteger(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String calculateFizzBuzz(int number) {
        StringBuilder answer = new StringBuilder();
        if (number % 3 == 0) answer.append("Fizz");
        if (number % 5 == 0) answer.append("Buzz");
        return answer.length() > 0 ? answer.toString() : String.valueOf(number);
    }
}

/**Note:
1. Nested If are considered bad practices?
2. This is not terribly bad—the more we nest the more confusing the code become—to other people
3. The more we build the more we realize that there is no way to build ideal software
4. Programming and problem-solving always a trade-offs
5. Every solution has a degree of strength, and weakness
6. Not having repetition but duplication??
7. But having nested structure that make the code had and read and understand would be really ideal?
 */
