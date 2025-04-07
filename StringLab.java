import java.util.Scanner;

public class StringLab {

    public static void main(String[] args) {
        
        // Task 1: Working with String Methods
        String originalString = " Welcome to the Java String Lab! ";
        System.out.println("Length: " + originalString.length());
        System.out.println("Character at index 7: " + originalString.charAt(7));
        System.out.println("Substring 'Java': " + originalString.substring(16, 20));
        System.out.println("Uppercase: " + originalString.toUpperCase());
        System.out.println("Lowercase: " + originalString.toLowerCase());
        System.out.println("Index of 'Java': " + originalString.indexOf("Java"));
        System.out.println("Contains 'Lab': " + originalString.contains("Lab"));
        System.out.println("Replace 'Java' with 'Java Programming': " + originalString.replace("Java", "Java Programming"));
        
        // Split and print each word
        String[] words = originalString.trim().split(" ");
        System.out.println("Words in the string:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Task 2: Loop Challenges with Strings
        
        // 🌀 For Loop: Count Vowels
        int vowelCount = 0;
        for (int i = 0; i < originalString.length(); i++) {
            char ch = originalString.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);
        
        // 🔁 While Loop: Check for Palindrome
        String word = "radar";  // Changed from racecar to radar
        int start = 0;
        int end = word.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is 'radar' a palindrome? " + isPalindrome);
        
        // 🔂 Do...While Loop: Input Validation
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("Enter a sentence:");
            userInput = scanner.nextLine();
        } while (!userInput.contains("Java"));
        System.out.println("Thank you!");
        
        // Task 3: Working with StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(16, " is fun");
        sb.delete(18, 27);
        sb.reverse();
        System.out.println("StringBuilder output: " + sb.toString());
        
        // Task 4: Working with StringBuffer
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Concurrent Programming");
        sbf.insert(18, " is cool");
        sbf.delete(17, 34);
        sbf.reverse();
        System.out.println("StringBuffer output: " + sbf.toString());
    }
}
