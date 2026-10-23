import java.util.Arrays;
import java.util.Random;
/**
 * This program populates an array with random numbers,
 * calculates the average, and displays the results.
 *
 * @author Yoma Ozoh
 * @version 1.0
 * @since 2026-10-22
 */
public final class PopulatingArrays {

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private PopulatingArrays() {
    }

    /**
     * Main method to loop and run the methods 5 times.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(final String[] args) {
        final int loopCount = 5;

        for (int i = 0; i < loopCount; i++) {
            final int[] numbers = populateArray();
            calculateAverage(numbers);
        }
    }

    /**
     * Creates an array of 10 random integers from 0 to 100,
     * prints them on a single line, and returns the array.
     *
     * @return an array of 10 random integers
     */
    public static int[] populateArray() {
        final int arraySize = 10;
        final int maxRandom = 101; // Generates 0 to 100 inclusive
        final int[] num = new int[arraySize];
        final Random rand = new Random();

        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(maxRandom);
            System.out.print(num[i] + " ");
        }
        System.out.println();

        return num;
    }

    /**
     * Sorts the provided array, calculates the average, and prints
     * the sorted values alongside the average rounded to 1 decimal place.
     *
     * @param arrayGiven the array of integers to process
     */
    public static void calculateAverage(final int[] arrayGiven) {
        Arrays.sort(arrayGiven);

        int sum = 0;
        for (final int value : arrayGiven) {
            System.out.print(value + " ");
            sum += value;
        }

        final double average = (double) sum / arrayGiven.length;
        System.out.printf("   Average: %.1f%n", average);
    }
}
