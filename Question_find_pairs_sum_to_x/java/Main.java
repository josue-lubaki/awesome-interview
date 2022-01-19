import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // list of numbers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> numbersList = new ArrayList<Integer>();
        for (int number : numbers) {
            numbersList.add(number);
        }

        // target sum
        int targetSum = 10;

        // find pairs
        System.out.println("sum: " + targetSum);
        findPairs(numbersList, targetSum).forEach(pair -> {
            pair.forEach((key, value) -> System.out.println("(" + key + "," + value + ")"));
        });

    }

    public static List<HashMap<Integer, Integer>> findPairs(List<Integer> list, int sum) {
        List<HashMap<Integer, Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (Integer second : list) {
                if (list.get(i) + second == sum) {
                    HashMap<Integer, Integer> map = new HashMap<>();
                    map.put(list.get(i), second);

                    HashMap<Integer, Integer> mapReverse = new HashMap<>();
                    mapReverse.put(second, list.get(i));

                    if (!pairs.contains(map) && !pairs.contains(mapReverse))
                        pairs.add(map);
                }
            }
        }

        return pairs;
    }
}
