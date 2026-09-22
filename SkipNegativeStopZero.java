import java.util.ArrayList;
import java.util.List;

public class SkipNegativeStopZero {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-4);
        numbers.add(25);
        numbers.add(-7);
        numbers.add(0);   // This will stop the loop
        numbers.add(50);  // This will never be reached

        // Step 2: Use foreach loop
        for (int num : numbers) {
            if (num < 0) {
                // Skip negative numbers
                continue;
            }
            if (num == 0) {
                // Stop completely if zero is found
                System.out.println("Zero found! Loop stopped.");
                break;
            }
            // Print positive numbers
            System.out.println(num);
        }
    }
}
