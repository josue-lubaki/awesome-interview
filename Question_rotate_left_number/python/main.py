"""
    Time Complexity: O(n)
    @param arr: array of integers
    @param d: numbers of rotations
    @return: array of integers
"""
def rotLeft(arr, d):
    return arr[d:] + arr[:d]

# Test
arr = [1,2,3,4,5,6,7]
d = 4
print(rotLeft(arr, d)) # [5,6,7,1,2,3,4]