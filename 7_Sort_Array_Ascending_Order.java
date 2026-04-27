public class SortArrayAscending {
    public static void main(String[] args) {
        int[] arr = {45, 23, 67, 12, 89, 34, 56};
        
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        
        // Method 1: Using built-in Arrays.sort()
        int[] arr1 = arr.clone();
        java.util.Arrays.sort(arr1);
        System.out.println("Sorted Array (using Arrays.sort): " + java.util.Arrays.toString(arr1));
        
        // Method 2: Bubble Sort (Manual approach)
        int[] arr2 = arr.clone();
        bubbleSort(arr2);
        System.out.println("Sorted Array (using Bubble Sort): " + java.util.Arrays.toString(arr2));
    }
    
    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
