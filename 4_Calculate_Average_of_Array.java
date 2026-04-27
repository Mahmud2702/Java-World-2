public class CalculateAverage {
    public static void main(String[] args) {
        // Method 1: Using a loop
        int[] arr = {10, 20, 30, 40, 50};
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / (double) arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        
        // Method 2: Using Java Streams
        double averageUsingStream = java.util.Arrays.stream(arr).average().orElse(0.0);
        System.out.println("Average using Stream: " + averageUsingStream);
    }
}
