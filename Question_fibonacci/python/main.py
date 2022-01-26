
# Compute the first n Fibonacci numbers and return them in a list
def fibonacci_first_list(n):
    a, b = 0, 1
    fib_list = []
    for i in range(n):
        fib_list.append(a)
        a, b = b, a + b
    return fib_list

# Compute the first n Fibonacci numbers
# using recursion return them in a list
def fibonacci_first_recursion(n):
    if n == 1:
        return [0]
    elif n == 2:
        return [0, 1]

    fib_list = fibonacci_first_recursion(n - 1)
    fib_list.append(fib_list[-1] + fib_list[-2])
    return fib_list


# Compute the first n Fibonacci numbers
def fibonacci_first(n):
    a, b = 0, 1
    for i in range(n):
        print(a, end=" ")
        a, b = b, a + b


# Test the function
print(fibonacci_first_list(10))  # [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
print(fibonacci_first_recursion(10))  # [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
fibonacci_first(10)  # 0 1 1 2 3 5 8 13 21 34
