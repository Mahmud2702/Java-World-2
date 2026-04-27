public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Method 1: Using traditional loop
        countVowelsConsonants(str);
        
        // Method 2: Using Java Streams
        System.out.println("\n--- Using Streams ---");
        countVowelsConsonantsStream(str);
    }
    
    // Method 1: Traditional approach
    public static void countVowelsConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        String vowelSet = "aeiouAEIOU";
        
        System.out.println("String: " + str);
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelSet.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
    // Method 2: Using Streams
    public static void countVowelsConsonantsStream(String str) {
        String vowelSet = "aeiouAEIOU";
        
        long vowels = str.chars()
                .filter(ch -> Character.isLetter(ch) && vowelSet.indexOf(ch) != -1)
                .count();
        
        long consonants = str.chars()
                .filter(ch -> Character.isLetter(ch) && vowelSet.indexOf(ch) == -1)
                .count();
        
        System.out.println("String: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
