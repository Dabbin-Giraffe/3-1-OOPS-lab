import java.util.Scanner;

public class upper_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Char num : ");
        int numCharacters = scanner.nextInt();
        scanner.nextLine();

        if (numCharacters <= 0) {
                        System.out.println("You broke the machine :(");
                        scanner.close();
                        return;
        }

        System.out.print("Enter the chars: ");
        String input = scanner.nextLine();

        if (input.length() != numCharacters) {
            System.out.println("You broke the machine :(");
            scanner.close();
            return;
        }

        String convertedInput = input.substring(0, numCharacters).toUpperCase();

        System.out.println("Uppercase Conversion Result: " + convertedInput);

        scanner.close();
    }
}
