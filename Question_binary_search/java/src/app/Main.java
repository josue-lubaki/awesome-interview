package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(){
            {
                addAll(List.of(1,2,3,4,5,6,7,8,9,10,11,12));
            }
        };
        int target = 9;
        System.out.println(binarySearch(list, target)); // 8
    }

    /**
     * Binary Search Algorithm
     * @param list : list of numbers
     * @param key : number to search
     * @return index of key if found, -1 otherwise
     * */
    public static int binarySearch(List<Integer> list, int key){
        return binarySearchHelper(list, key, 0, list.size());
    }

    /**
     * Binary Search Algorithm
     * @param list : list of numbers
     * @param key : number to search
     * @param start : index of started
     * @param end : index of ending
     * @return index of key if found, -1 otherwise
     * */
    private static int binarySearchHelper(List<Integer> list, int key, int start, int end) {
        // find middle index
        int middle = (start + end) / 2;

        // condition stop
        if(start == end) return -1;
        else if(list.get(middle) > key)
            return binarySearchHelper(list, key, start, middle);
        else if(list.get(middle) < key)
            return binarySearchHelper(list, key, middle + 1, end);

        return middle;
    }
}
