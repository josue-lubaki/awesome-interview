import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "abCd";
        String s2 = "DacB";
        String s3 = "dbAC";
        String[] arr = new String[] { s1, s2, s3, s1, s3 };
        System.out.println(isAnagramByJosueLubaki(s1, s2)); // true
        System.out.println(isAnagramByJosueLubaki(arr)); // True
        System.out.println(isAnagrams(s1, s3)); // True
        // ADD YOUR METHOD HERE
    }

    /**
     * Function that checks if two strings are anagrams of each other.
     * 
     * @param s1 first string
     * @param s2 second string
     * @return true if the strings are anagrams of each other, false otherwise
     * @author Josue Lubaki
     */
    public static boolean isAnagramByJosueLubaki(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.substring(i, i + 1).toLowerCase());
        }

        for (int i = 0; i < s2.length(); i++) {
            set.remove(s2.substring(i, i + 1).toLowerCase());
        }

        return set.isEmpty();
    }

    /**
     * Function that checks if two strings are anagrams of each other.
     * 
     * @param arr array of strings
     * @return true if the strings are anagrams of each other, false otherwise
     * @author Josue Lubaki
     */
    public static boolean isAnagramByJosueLubaki(String[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        List.of(arr).forEach(it -> { // for each string in the array
            for (char c : it.toCharArray()) {
                c = Character.toLowerCase(c); // convert character to LowerCase
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        });

        // the map must contain the same value for all the keys
        return map.entrySet().stream().allMatch(e -> e.getValue() == arr.length);
    }

    /**
     * Function that checks if two strings are anagrams of each other.
     * 
     * @param s1 first string
     * @param s2 second string
     * @return true if the strings are anagrams of each other, false otherwise
     * @author Josue Lubaki
     */
    public static boolean isAnagramStringByJosueLubaki(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.substring(i, i + 1).toLowerCase());
            set2.add(s2.substring(i, i + 1).toLowerCase());
        }

        return set1.equals(set2);
    }

    /**
     * Function that checks if two strings are anagrams of each other.
     * 
     * @param s1 first string
     * @param s2 second string
     * @return true if the strings are anagrams of each other, false otherwise
     * @throws IllegalArgumentException if either of the strings is null
     * @throws IllegalArgumentException if either of the strings is empty
     * @throws IllegalArgumentException if either of the strings is whitespace
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        if (s1.length() == 0 || s2.length() == 0) {
            throw new IllegalArgumentException("Strings cannot be empty");
        }
        if (s1.trim().length() == 0 || s2.trim().length() == 0) {
            throw new IllegalArgumentException("Strings cannot be whitespace");
        }

        // Convert strings to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Sort strings
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted strings
        return Arrays.equals(s1Array, s2Array);
    }

    /**
     * This method checks if two strings are anagrams of each other.
     * 
     * @param str1 the first string
     * @param str2 the second string
     * @return true if the two strings are anagrams of each other, false otherwise
     *         Method for checking if is anagrams (Recursive)
     *         Complexity: O(n)
     */
    public static boolean isAnagrams(String str1, String str2) {

        // if one of the string is empty, then return false
        if (str1.length() == 0 || str2.length() == 0) {
            return false;
        }

        // if one of the string is a single character, then check if
        // they are equal
        if (str1.length() == 1 && str2.length() == 1) {
            // toLowerCase()
            return str1.toLowerCase().charAt(0) == str2.toLowerCase().charAt(0);
        }

        // sort the strings
        char[] str1Char = str1.toLowerCase().toCharArray();
        char[] str2Char = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Char);
        Arrays.sort(str2Char);
        str1 = new String(str1Char);
        str2 = new String(str2Char);

        // if the first character of the first string is not equal to the
        // first character of the second string, then return false
        if (str1.charAt(0) != str2.charAt(0)) {
            return false;
        }

        // if the first character of the first string is equal to the first
        // character of the second string, then remove the first character
        // from the first string and the first character from the second
        // string and call the method recursively
        return isAnagrams(str1.substring(1), str2.substring(1));
    }

}