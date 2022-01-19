// Test
let list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let sum = 10;
console.log(find_pairs_sum(list, sum)); // [[1, 9], [2, 8], [3, 7], [4, 6]]

function find_pairs_sum(list, sum) {
  let pairs = [];
  for (let i = 0; i < list.length; i++) {
    for (let j = i + 1; j < list.length; j++) {
      if (list[i] + list[j] == sum) {
        pairs.push(list[i], list[j]);
      }
    }
  }
  return pairs;
}
