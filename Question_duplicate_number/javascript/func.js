/**
 * @description: Function to find duplicate numbers in an array
 * @param {array} arr - array of numbers
 * @returns {array} - array of duplicate numbers
 * @author: Josue Lubaki
 */
function findDuplicates(arr) {
  let duplicates = [];
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] == arr[j]) {
        duplicates.push(arr[i]);
      }
    }
  }
  return duplicates;
}

/**
 * @description: Function to find duplicate numbers in an array
 * @param {array} arr - array of numbers
 * @returns {array} - array of duplicate numbers
 * @author: Josue Lubaki
 */
function findDuplicatesByJosueLubaki(arr) {
  let duplicates = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr.indexOf(arr[i]) != i) {
      duplicates.push(arr[i]);
    }
  }
  return duplicates;
}

/**
 * @description: Function to find duplicate numbers in an array
 * @param {array} arr - array of numbers
 * @returns {array} - array of duplicate numbers
 * @author: ???
 */
// WRITE YOUR CODE HERE

console.log(findDuplicatesByJosueLubaki([1, 7, 3, 4, 5, 6, 7, 3, 4])); // [7, 3, 4]
