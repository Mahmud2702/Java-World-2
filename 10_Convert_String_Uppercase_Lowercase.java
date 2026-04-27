public class ConvertStringCase {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("Original String: " + str);
        
        // Method 1: Using built-in methods
        String uppercase = str.toUpperCase();
        String lowercase = str.toLowerCase();
        
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);
        
        // Method 2: Convert to Title Case (First letter uppercase)
        String titleCase = convertToTitleCase(str);
        System.out.println("Title Case: " + titleCase);
        
        // Method 3: Toggle Case (Swap uppercase and lowercase)
        String toggledCase = toggleCase(str);
        System.out.println("Toggled Case: " + toggledCase);
    }
    
    // Method 2: Convert to Title Case
    public static String convertToTitleCase(String str) {
        String[] words = str.split(" ");
        StringBuilder titleCase = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(word.substring(0, 1).toUpperCase())
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        return titleCase.toString().trim();
    }
    
    // Method 3: Toggle Case (Uppercase to lowercase and vice versa)
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        return toggled.toString();
    }
}
