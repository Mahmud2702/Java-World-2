public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35, 40, 45};
        
        int evenCount = 0;
        int oddCount = 0;
        
        // Method 1: Using traditional loop
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Array elements: " + java.util.Arrays.toString(arr));
        System.out.println("Count of Even numbers: " + evenCount);
        System.out.println("Count of Odd numbers: " + oddCount);
        
        // Method 2: Using Java Streams
        long evenCountStream = java.util.Arrays.stream(arr).filter(n -> n % 2 == 0).count();
        long oddCountStream = java.util.Arrays.stream(arr).filter(n -> n % 2 != 0).count();
        System.out.println("\nUsing Streams:");
        System.out.println("Even count: " + evenCountStream);
        System.out.println("Odd count: " + oddCountStream);
    }
}
