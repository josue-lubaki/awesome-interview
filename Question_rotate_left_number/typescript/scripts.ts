/**
 * @param arr: array of integers
 * @param d: numbers of rotations
 * @return: array of integers
 */
function rotLeft(arr: number[], d: number): number[] {
  let result = [];
  for (let i = 0; i < arr.length; i++) {
    result.push(arr[(i + d) % arr.length]);
  }
  return result;
}

// Test functions
const myList = [1, 2, 3, 4, 5, 6, 7];
const d = 4;
console.log(rotLeft(myList, d)); // [5, 6, 7, 1, 2, 3, 4]
