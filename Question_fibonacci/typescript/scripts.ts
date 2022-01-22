// Compute the first n Fibonacci numbers
function fibonacci_first_n(n: number): number[] {
  let fib: number[] = [0, 1];
  for (let i = 2; i < n; i++) {
    fib[i] = fib[i - 1] + fib[i - 2];
  }
  return fib;
}

/**
 * Method to compute the first n Fibonacci number
 * @param n number of fibonacci numbers to compute
 * @returns number[]
 */
function fibonacci_first_recursion(n: number): number[] {
  if (n == 1) {
    return [0];
  } else if (n == 2) {
    return [0, 1];
  }
  let fib: number[] = fibonacci_first_recursion(n - 1);
  fib.push(fib[fib.length - 1] + fib[fib.length - 2]);
  return fib;
}

/**
 * method to compute the nth Fibonacci number
 * @param n number of fibonacci numbers to compute
 * @returns number
 */
function fibonacci_first_n_recursion(n: number): number {
  if (n == 1) {
    return 0;
  } else if (n == 2) {
    return 1;
  }
  return (
    fibonacci_first_n_recursion(n - 1) + fibonacci_first_n_recursion(n - 2)
  );
}

// Test the function
console.log(fibonacci_first_n(10));
console.log(fibonacci_first_recursion(10));
console.log(fibonacci_first_n_recursion(10));
