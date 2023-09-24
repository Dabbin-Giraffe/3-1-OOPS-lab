import java.util.Scanner;  //Scanner object helps for taking input


public class NumberCalculator {

    private int[] Numbers; //initializing Numbers array

    public NumberCalculator(int[] Numbers) 
    //Constructor to inits Numbers array
    { 
        this.Numbers = Numbers;
    }


    //Method to calculate mean

    public double calculateAverage() {
        int sum = 0;

        for (int Number : this.Numbers) {
            sum += Number; //sum of elements
        }
        return (double) sum / (this.Numbers).length; //mean using length method
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int n = scanner.nextInt();

        int[] numsArray = new int[n];

        for (int i = 0; i < n; i++) {
            numsArray[i] = scanner.nextInt();
        }

        NumberCalculator calc = new NumberCalculator(numsArray);
        double mean = calc.calculateAverage();

        System.out.println("The average for given array of elements is : " + mean);
        scanner.close();
    }
}