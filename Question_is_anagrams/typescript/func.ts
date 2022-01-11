let str1 = "hello";
let str2 = "ollEh";
let str3 = "hLelO";
console.log(isAnagramString(str1, str2));
console.log(isAnagramStrings([str1, str2, str3]));

/**
 * function that checks if two strings are anagrams
 * @param {string} a string to check
 * @param {string} b string to check
 * @returns {boolean} true if anagrams, false if not
 * @author: Josue Lubaki
 * */
function isAnagramString(a: string, b: string): boolean {
  if (a.length !== b.length) {
    return false;
  }

  return (
    a.toLowerCase().split("").sort().join("") ===
    b.toLowerCase().split("").sort().join("")
  );
}

/**
 * function that checks if two strings are anagrams
 * @param {string} a string to check
 * @param {string} b string to check
 * @returns {boolean} true if anagrams, false if not
 * @author: Josue Lubaki
 * */
function isAnagramStrings(list: Array<String>): boolean {
  if (list.length < 2 || list === undefined) {
    return false;
  }

  let sortedList = list.map((word) =>
    word.toLowerCase().split("").sort().join("")
  );

  return sortedList.every((word) => word == sortedList[0]);
}
