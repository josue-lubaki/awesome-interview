/**
 * Binary Search
 * @param list list of sorted numbers
 * @param key number to search for in the list
 * @return index of the key if found, otherwise -1
 */
function binarySearch_(list: number[], key: number): number {
  return binarySearchHelper_(list, key, 0, list.length);
}

/**
 * Binary Search Helper
 * @param list list of sorted numbers
 * @param key number to search for in the list
 * @param start index of the first element in the list
 * @param end index of the last element in the list
 * @return index of the key if found, otherwise -1
 */
function binarySearchHelper_(list: number[], key: number, start: number, end: number): number {
  // find middle index
  let middle = Math.floor((start + end) / 2);

  if (start == end) return -1;
  else if (list[middle] > key)
    return binarySearchHelper_(list, key, start, middle);
  else if (list[middle] < key)
    return binarySearchHelper_(list, key, middle + 1, end);
  else return middle;
}

// test binary search
let myList = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
let target = 7;
console.log("index of " + target + " is ", binarySearch_(myList, target)); // 6