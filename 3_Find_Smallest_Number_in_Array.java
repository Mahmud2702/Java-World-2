public class FindSmallestNumber {
    public static void main(String[] args) {
        // Method 1: Using a loop
        int[] arr = {12, 45, 23, 67, 89, 34, 56};
        
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Smallest number in array: " + smallest);
        
        // Method 2: Using Java Streams (Modern approach)
        int smallestUsingStream = java.util.Arrays.stream(arr).min().orElse(0);
        System.out.println("Smallest number using Stream: " + smallestUsingStream);
    }
}
