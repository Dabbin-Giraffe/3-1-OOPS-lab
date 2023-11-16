import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicate_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();

        String[] numberStrings = input.split(" ");
        for (String numberString : numberStrings) {
            try {
                int number = Integer.parseInt(numberString);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                return;
            }
        }

        if (hasDuplicates(numbers)) {
            System.out.println("Duplicates detected.");
            throw new DuplicateNumberException("Duplicate numbers found in the list.");
        } else {
            System.out.println("List is free of duplicates");
        }
    }

    public static boolean hasDuplicates(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (uniqueNumbers.contains(number)) {
                return true; 
            }
            uniqueNumbers.add(number);
        }
        return false;
    }
}

class DuplicateNumberException extends RuntimeException {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
