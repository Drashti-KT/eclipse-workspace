package loops;

public class SumofSeries {

    public static void main(String[] args) {
        double sum = 0.0; // Initialize sum to 0.0

        // Calculate the sum of the series
        for (int i = 1; i <= 50; i++) {
            sum += 1.0 / i; // Add the reciprocal of i to sum
        }

        // Print the result
        System.out.println("The sum of the series is: " + sum);
    }
}
