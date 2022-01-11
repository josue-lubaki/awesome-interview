let array: Array<number> = [1, 7, 3, 4, 5, 6, 7, 3, 4];
console.log(findDuplicate(array));
// ADD YOUR CONSOLE LOG HERE

/**
 * findDuplicate : Function to find duplicate number in an array
 * @param {Array<number>} arr - array of numbers
 * @returns {Array<number>} - array of duplicate numbers
 * @author Josue Lubaki
 *  */
function findDuplicate(arr: Array<number>): Array<number> {
  let duplicates: Array<number> = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr.indexOf(arr[i]) !== i) {
      duplicates.push(arr[i]);
    }
  }
  return duplicates;
}

/**
 * findDuplicateByJosueLubaki : Function to find duplicate number in an array
 * @param {Array<number>} arr - array of numbers
 * @returns {Array<number>} - array of duplicate numbers
 * @author Josue Lubaki
 *  */
function findDuplicateByJosueLubaki(arr: Array<number>): Array<number> {
  let duplicates: Array<number> = [];
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] == arr[j]) {
        duplicates.push(arr[i]);
      }
    }
  }
  return duplicates;
}

// WRITE YOUR METHOD HERE
