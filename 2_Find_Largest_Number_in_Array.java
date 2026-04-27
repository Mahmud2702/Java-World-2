public class FindLargestNumber {
    public static void main(String[] args) {
        // Method 1: Using a loop
        int[] arr = {12, 45, 23, 67, 89, 34, 56};
        
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("Largest number in array: " + largest);
        
        // Method 2: Using Java Streams (Modern approach)
        int largestUsingStream = java.util.Arrays.stream(arr).max().orElse(0);
        System.out.println("Largest number using Stream: " + largestUsingStream);
    }
}
