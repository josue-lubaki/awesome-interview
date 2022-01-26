/**
 * @param arr: array of integers
 * @param d: numbers of rotations
 * @return: array of integers
 */
function rotateLeft(arr, d) {
  // write your code here
  const len = arr.length;
  const dec = d % len;
  const newArr = [];

  for (let i = 0; i < len; i++) {
    newArr.push(arr[(i + dec) % len]);
  }

  return newArr;
}

// Test the function
array = [1, 2, 3, 4, 5, 6, 7];
rotate = 4;
console.log(rotateLeft(array, rotate)); // [5, 6, 7, 1, 2, 3, 4]
