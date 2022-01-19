// Test
let myList: number[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let MySum = 10;
console.log(find_pairs(myList, MySum)); // [1,9], [2,8], [3,7], [4,6]

function find_pairs(list, sum) {
  let pairs: number[] = [];
  for (let i = 0; i < list.length; i++) {
    for (let j = i + 1; j < list.length; j++) {
      if (list[i] + list[j] === sum) {
        pairs.push(list[i], list[j]);
      }
    }
  }
  return pairs;
}
