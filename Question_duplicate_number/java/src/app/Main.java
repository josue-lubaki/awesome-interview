package Question_duplicate_number.java.src.app;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test the method
        int[] numbers = { 1, 7, 3, 4, 5, 3, 4, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }

        System.out.println(findDuplicateNumberByJosueLubaki(list)); // 3, 4, 7
    }

    /**
     * find_duplicate element into ArrayList, return list of duplicates
     * 
     * @param list ArrayList of integers
     * @return ArrayList of duplicates
     * @author Josue Lubaki
     */
    public static ArrayList<Integer> findDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    duplicates.add(list.get(i));
                }
            }
        }
        return duplicates;
    }

    /**
     * find_duplicate element into ArrayList, return list of duplicates
     * 
     * @param list ArrayList of integers
     * @return ArrayList of duplicates
     * @author Josue Lubaki
     */
    public static ArrayList<Integer> findDuplicateNumberByJosueLubaki(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        list.forEach(element -> {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        });

        return map.keySet().stream().filter(key -> map.get(key) > 1).collect(ArrayList::new, ArrayList::add,
                ArrayList::addAll);
    }

    /**
     * find_duplicate element into ArrayList, return list of duplicates
     * 
     * @param list ArrayList of integers
     * @return ArrayList of duplicates
     * @author Josue Lubaki
     */
    public static ArrayList<Integer> findDuplicateByJosueLubaki(ArrayList<Integer> list) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) != i)
                duplicates.add(list.get(i));
        }
        return duplicates;
    }

}
