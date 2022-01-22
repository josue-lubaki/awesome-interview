// Compute the first n Fibonacci numbers
function fibonacci(n) {
  let fib = [0, 1];
  for (let i = 2; i < n; i++) {
    fib[i] = fib[i - 1] + fib[i - 2];
  }
  return fib;
}

// Fibonacci using recursive function, return list of Fibonacci numbers
function fibonacci_first(n) {
  if (n == 1) {
    return [0];
  } else if (n == 2) {
    return [0, 1];
  }
  let fib = fibonacci_first(n - 1);
  fib.push(fib[fib.length - 1] + fib[fib.length - 2]);
  return fib;
}

// Test the function of fibonacci
console.log(fibonacci(10));
console.log(fibonacci_first(10));
