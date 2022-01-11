""" 
    function 1 : find_duplicate_by_josueLubaki
    @param arr : list of numbers
    @return list of integers
    @author : Josue Lubaki
"""
def find_duplicate_by_josueLubaki(arr):
    duplicates, seen = set(), set()
    for element in arr:
        if element in seen:
            duplicates.add(element)
        seen.add(element)
    return duplicates


"""
    function 2 : find_duplicate_number_by_josueLubaki
    @param arr : list of numbers
    @return list of integers
    @author : Josue Lubaki
"""
def find_duplicate_number_by_josueLubaki(arr):
    duplicates = set()
    for i in range(len(arr)):
        if arr[i] in arr[i + 1 :]:
            duplicates.add(arr[i])
    return duplicates


"""
    function 3 : find_duplicate_number
    @param arr : list of numbers
    @return list of integers
    @author : Josue Lubaki
"""
def find_duplicate_integer_by_josueLubaki(arr):
    duplicates = set()
    for i in range(len(arr)):
        if arr.index(arr[i]) != i:
            duplicates.add(arr[i])
    return duplicates


"""
    function 4 : find_duplicate_number
    @param arr : list of numbers
    @return list of integers
    @author : ???
"""
# WRITE YOUR CODE HERE


# Test
list = [1, 7, 3, 4, 5, 6, 7, 3, 4]
print(find_duplicate_integer_by_josueLubaki(list))  # [3, 4, 7]
