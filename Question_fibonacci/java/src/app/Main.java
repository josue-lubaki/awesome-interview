package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test the fibonacci function
        System.out.println("Fibonacci of 10th is " + fibonacci(10));
        fibonacciListOfN(10).forEach(n -> System.out.print(n + " "));
        System.out.println();
        fibonacciListRecursion(10).forEach(n -> System.out.print(n + " "));
    }

    /**
     * Returns the nth fibonacci number using recursion
     * 
     * @param n nth fibonacci number
     * @return integer
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Returns the first n fibonacci number
     * 
     * @param n count fibonacci number
     * @return List<Integer>
     */
    public static List<Integer> fibonacciListOfN(int n) {
        List<Integer> fibonacciList = new ArrayList<>();
        if (n == 1) {
            fibonacciList.add(0);
            return fibonacciList;
        } else if (n == 2) {
            fibonacciList.add(0);
            fibonacciList.add(1);
            return fibonacciList;
        } else {
            fibonacciList.add(0);
            fibonacciList.add(1);
            for (int i = 2; i < n; i++) {
                fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
            }
            return fibonacciList;
        }
    }

    /**
     * Returns the first n fibonacci number using recursion
     * 
     * @param n count fibonacci number
     * @return List<Integer>
     */
    public static List<Integer> fibonacciListRecursion(int n) {
        if (n == 1) {
            return new ArrayList<>() {
                {
                    add(0);
                }
            };
        } else if (n == 2) {
            return new ArrayList<>() {
                {
                    add(0);
                    add(1);
                }
            };
        }

        List<Integer> fibonacciList = fibonacciListRecursion(n - 1);
        fibonacciList
                .add(fibonacciList.get((fibonacciList.size() - 1)) + fibonacciList.get((fibonacciList.size() - 2)));
        return fibonacciList;
    }
}
