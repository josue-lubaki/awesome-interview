package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] tab = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> list = new ArrayList<>() {
            {
                this.addAll(List.of(tab));
            }
        };

        // Test function - Result : [5, 6, 7, 1, 2, 3, 4]
        rotationLeft(list, 4).forEach(n -> System.out.print(n + " "));

    }

    /**
     * Time Complexity: O(n)
     * 
     * @param arr: array of integers
     * @param d:   numbers of rotations
     * @return array of integers
     * @author: Josue Lubaki
     */
    public static List<Integer> rotationLeft(List<Integer> arr, int d) {
        return new ArrayList<>() {
            {
                for (int i = 0; i < arr.size(); i++) {
                    this.add(arr.get((i + d) % arr.size()));
                }
            }
        };
    }
}
