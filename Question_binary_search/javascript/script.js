/**
 * Binary Search
 * @param list list of sorted numbers
 * @param key number to search for in the list
 * @return index of the key if found, otherwise -1
 */
function binarySearch(list, key) {
  return binarySearchHelper(list, key, 0, list.length);
}

/**
 * Binary Search helper
 * @param list list of sorted numbers
 * @param key number to search for in the list
 * @param start index of the first element in the list
 * @param end index of the last element in the list
 * @return index of the key if found, otherwise -1
 */
function binarySearchHelper(list, key, start, end) {
  // find middle index
  let middle = Math.floor((start + end) / 2);

  // condition stop recursion
  if (start == end) return -1;
  else if (list[middle] > key)
    return binarySearchHelper(list, key, start, middle);
  else if (list[middle] < key) {
    return binarySearchHelper(list, key, middle + 1, end);
  } else return middle;
}

// Test binary search
var list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11];
var key = 9;
console.log("index of " + key + " is ", binarySearch(list, key)); // 8
