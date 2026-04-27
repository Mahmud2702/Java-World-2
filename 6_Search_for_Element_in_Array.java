public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int searchElement = 40;
        
        // Method 1: Linear Search
        int position = linearSearch(arr, searchElement);
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found in array");
        }
        
        // Method 2: Using Java Streams
        boolean foundUsingStream = java.util.Arrays.stream(arr).anyMatch(n -> n == searchElement);
        System.out.println("Element found using Stream: " + foundUsingStream);
    }
    
    // Linear Search Method
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
