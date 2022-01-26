"""
    Binary Search Algorithm
    @param list: list of numbers
    @param key: number to search
    @return: index of key if found, -1 otherwise
"""
def binary_search(list, key):
    return binary_search_helper(list, key, 0, len(list))


def binary_search_helper(list, key, start, end):
    # Find the middle index
    middle_idx = (start + end) // 2

    # check if list is empty
    if(start == end):
        return None
    elif (list[middle_idx] > key):
        return binary_search_helper(list, key, start, middle_idx)
    elif (list[middle_idx] < key):
        return binary_search_helper(list, key, middle_idx + 1, end)
    else:
        return middle_idx


# Test the binary search algorithm
list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
key = 9
print(binary_search(list, key))