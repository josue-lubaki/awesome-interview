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
     * Function that checks if two strings are anagrams of each other.
     * 
     * @param s1 first string
     * @param s2 second string
     * @return true if the strings are anagrams of each other, false otherwise
     * @author ???
     */
    // WRITE YOUR CODE HERE
}