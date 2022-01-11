let s1 = "hello";
let s2 = "ollEh";
let s3 = "hLelO";
console.log(isAnagram(s1, s2));
console.log(isAnagrams([s1, s2, s3]));
// ADD YOUR CONSOLE LOG HERE

/**
 *  function that checks if two strings are anagrams
 * @param {string} a string to check
 * @param {string} b string to check
 * @returns {boolean} true if anagrams, false if not
 * @author: Josue Lubaki
 * */
function isAnagram(a, b) {
  if (a == null || b == null) return false;
  if (a.length !== b.length) return false;

  let a_sorted = a.toLowerCase().split("").sort().join("");
  let b_sorted = b.toLowerCase().split("").sort().join("");

  return a_sorted === b_sorted;
}

/**
 *  function that checks if two strings are anagrams
 * @param {array} list list of string to check
 * @returns {boolean} true if anagrams, false if not
 * @author: Josue Lubaki
 * */
function isAnagrams(list) {
  if (list == null) return false;
  if (list.length < 2) return false;
  let sorted = list.map((word) => word.toLowerCase().split("").sort().join(""));
  return sorted.every((word) => word === sorted[0]);
}

/**
 *  function that checks if two strings are anagrams
 * @param {string} a string to check
 * @param {string} b string to check
 * @returns {boolean} true if anagrams, false if not
 * @author: ???
 * */
// WRITE YOUR CODE HERE
