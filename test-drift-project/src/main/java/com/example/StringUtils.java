package com.example;

/**
 * Utility class for string operations.
 * Provides methods for string manipulation and validation.
 */
public class StringUtils {
    
    /**
     * Checks if a string is empty or null.
     * @param str the string to check
     * @return true if empty or null
     */
    public static boolean isEmpty(String str) {  // DRIFT: was instance method, now static
        return str == null || str.isEmpty();
    }
    
    /**
     * Reverses a string using StringBuilder.
     * The reverse() method internally uses a char array.
     * @param input the string to reverse
     * @return reversed string
     */
    public String flip(String input) {  // DRIFT: method renamed from reverse to flip
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Converts a string to uppercase.
     * Uses {@link String#toUpperCase()} method.
     * @param text input string
     * @return uppercase version
     */
    public String capitalize(String text) {  // DRIFT: capitalize != toUpperCase (wrong description)
        if (text == null || text.isEmpty()) return text;
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
    
    /**
     * Trims whitespace from both ends.
     * Also removes leading zeros from numeric strings.
     * @param value the string to trim
     * @return trimmed string
     */
    public String trim(String value) {  // DRIFT: doesn't remove leading zeros anymore
        return value == null ? null : value.trim();
    }
    
    /**
     * Concatenates multiple strings with a separator.
     * Example: join(",", "a", "b", "c") returns "a,b,c"
     * @param delimiter separator string
     * @param parts strings to join
     * @return concatenated result
     */
    // DRIFT: This method doesn't exist but javadoc does!
}
