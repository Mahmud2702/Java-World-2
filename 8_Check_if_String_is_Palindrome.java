public class CheckPalindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";
        String str3 = "A man a plan a canal Panama";
        
        // Method 1: Using basic approach
        System.out.println("\"" + str1 + "\" is palindrome: " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is palindrome: " + isPalindrome(str2));
        
        // Method 2: Ignoring spaces and case
        System.out.println("\"" + str3 + "\" is palindrome: " + isPalindromeIgnoreSpaceAndCase(str3));
    }
    
    // Method 1: Check palindrome
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    // Method 2: Ignore spaces and case
    public static boolean isPalindromeIgnoreSpaceAndCase(String str) {
        // Remove spaces and convert to lowercase
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
