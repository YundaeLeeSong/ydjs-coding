/**
 * ap-quiz-08.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-08.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { sameEnds, mirrorEnds } = require('./ap-quiz-08');
 *        console.log(sameEnds('abXYab')); // 'ab'
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-08.test.js`
 *        (See ap-quiz-08.test.js for test setup instructions)
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 * Use ESM (`export` / `export default`) only when your project is intentionally configured
 * for modules (e.g. `package.json` has `"type": "module"` or you use a transpiler).
 */

'use strict';

/**
 * APQuiz08 contains various coding quiz problems for practice.
 *
 * This module includes functions for:
 * 1. sameEnds (string): Find the longest non-overlapping substring at both start and end.
 * 2. mirrorEnds: Find the longest prefix that equals its reverse at the end.
 * 3. squareUp: Generate a square-up pattern array of length n*n.
 * 4. getSandwich: Extract the filling between first and last "bread".
 * 5. sameStarChar: Check if every '*' has identical characters before and after it.
 * 6. haveThree: Check if 3 appears exactly three times with no adjacent 3's.
 * 7. twoTwo: Check if every 2 is adjacent to at least one other 2.
 * 8. sameEnds (array): Check if first `length` elements equal last `length` elements.
 * 9. tripleUp: Check if the array contains three increasing adjacent numbers.
 * 10. fizzArray3: Generate array of integers from start up to but not including end.
 * 11. strCopies: Recursively determine if at least n copies of a substring appear.
 * 12. strDist: Recursively compute length of largest substring that starts and ends with sub.
 * 13. groupSum: Recursively determine if a group of elements can sum to target.
 * 14. groupSum6: Like groupSum but all 6's must be chosen.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     Return the longest non-overlapping substring that appears at both
 *     the start and end of the string `s`.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sameEnds("abXYab") -> "ab"</li>
 *   <li>sameEnds("javaXYZjava") -> "java"</li>
 *   <li>sameEnds("javajava") -> "java"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} The longest substring appearing at both start and end without overlap
 */
function sameEndsString(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     Given a string, look for a mirror-image (backwards) string at both the beginning
 *     and end of the string. Return the longest such prefix. In other words, find the
 *     largest prefix of `s` which equals its reverse at the end of `s`.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>mirrorEnds("abXYZba") -> "ab"</li>
 *   <li>mirrorEnds("abca") -> "a"</li>
 *   <li>mirrorEnds("123and then 321") -> "123"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} The longest prefix which is the reverse of the corresponding suffix
 */
function mirrorEnds(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Given a non-negative integer `n`, return an array of length `n*n` following a square-up pattern.
 *     For each i from 1 to n, you create a group of length n consisting of (n-i) zeros followed by the numbers
 *     i down to 1. Concatenate all groups in order.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>squareUp(3) -> [0, 0, 1, 0, 2, 1, 3, 2, 1]</li>
 *   <li>squareUp(2) -> [0, 1, 2, 1]</li>
 *   <li>squareUp(4) -> [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]</li>
 * </ul>
 * </p>
 *
 * @param {number} n - The dimension of the square pattern (number of groups)
 * @return {number[]} A flat array representing the square-up pattern of length n*n
 */
function squareUp(n) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     A "sandwich" is defined by two occurrences of the substring "bread" with
 *     some filling in between. Return the filling between the first and last
 *     appearance of "bread" in the input string `s`. If there are fewer than
 *     two occurrences of "bread", return an empty string "".
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>getSandwich("breadjambread") -> "jam"</li>
 *   <li>getSandwich("xxbreadjambreadyy") -> "jam"</li>
 *   <li>getSandwich("xxbreadbreadjambreadyy") -> "breadjam"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string to search for "bread"
 * @return {string} The substring between the first and last "bread", or "" if none
 */
function getSandwich(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Return true if for every '*' in the string, whenever there are characters
 *     immediately before and after the star, those characters are the same.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sameStarChar("xy*yzz") -> true</li>
 *   <li>sameStarChar("xy*zzz") -> false</li>
 *   <li>sameStarChar("*xa*az") -> true</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string to check
 * @return {boolean} true if all '*' that have neighbors are surrounded by identical chars, false otherwise
 */
function sameStarChar(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     Given an array of integers, return true if the value 3 appears exactly three times
 *     and no two 3's are adjacent to each other.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>haveThree([3, 1, 3, 1, 3]) -> true</li>
 *   <li>haveThree([3, 1, 3, 3]) -> false</li>
 *   <li>haveThree([3, 4, 3, 3, 4]) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @return {boolean} true if there are exactly three 3's and none are adjacent, false otherwise
 */
function haveThree(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     Given an array of integers, return true if every 2 in the array is adjacent to
 *     at least one other 2. In other words, for each occurrence of 2, there must be
 *     another 2 either immediately before or after it.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>twoTwo([4, 2, 2, 3]) -> true</li>
 *   <li>twoTwo([2, 2, 4]) -> true</li>
 *   <li>twoTwo([2, 2, 4, 2]) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @return {boolean} true if every 2 has at least one adjacent 2, false otherwise
 */
function twoTwo(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     Return true if the group of `length` numbers at the start and end of the array are the same.
 *     You may assume that 0 <= length <= nums.length.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sameEnds([5, 6, 45, 99, 13, 5, 6], 1) -> false</li>
 *   <li>sameEnds([5, 6, 45, 99, 13, 5, 6], 2) -> true</li>
 *   <li>sameEnds([5, 6, 45, 99, 13, 5, 6], 3) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @param {number} length - The number of elements to compare at both ends
 * @return {boolean} true if the first `length` elements and the last `length` elements are identical, false otherwise
 */
function sameEndsList(nums, length) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     Return true if the array contains, somewhere, three increasing adjacent numbers,
 *     like ...4, 5, 6... or 23, 24, 25.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>tripleUp([1, 4, 5, 6, 2]) -> true</li>
 *   <li>tripleUp([1, 2, 3]) -> true</li>
 *   <li>tripleUp([1, 2, 4]) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @return {boolean} true if there is any run of three consecutive increasing ints, false otherwise
 */
function tripleUp(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     Given start and end numbers, return a new array containing the sequence of integers
 *     from start up to but not including end. The end number will be greater than or equal
 *     to the start number. A length-0 array is valid if start === end.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>fizzArray3(5, 10) -> [5, 6, 7, 8, 9]</li>
 *   <li>fizzArray3(11, 18) -> [11, 12, 13, 14, 15, 16, 17]</li>
 *   <li>fizzArray3(1, 1) -> []</li>
 *   <li>fizzArray3(1000, 1005) -> [1000, 1001, 1002, 1003, 1004]</li>
 * </ul>
 * </p>
 *
 * @param {number} start - The starting integer (inclusive)
 * @param {number} end - The ending integer (exclusive)
 * @return {number[]} An array of integers from start up to end-1
 */
function fizzArray3(start, end) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q11</h3>
 * <p>
 * Description:
 *     Recursively determines if at least 'n' copies of a non-empty substring 'sub'
 *     appear in the given string 's', allowing overlapping occurrences.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>strCopies("catcowcat", "cat", 2) -> true</li>
 *   <li>strCopies("catcowcat", "cow", 2) -> false</li>
 *   <li>strCopies("catcowcat", "cow", 1) -> true</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @param {string} sub - The substring to search for
 * @param {number} n - The required number of occurrences
 * @return {boolean} true if 'sub' appears at least 'n' times, false otherwise
 */
function strCopies(s, sub, n) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q12</h3>
 * <p>
 * Description:
 *     Recursively computes the length of the largest substring in 's' that starts
 *     and ends with the given non-empty substring 'sub'.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>strDist("catcowcat", "cat") -> 9</li>
 *   <li>strDist("catcowcat", "cow") -> 3</li>
 *   <li>strDist("cccatcowcatxx", "cat") -> 9</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @param {string} sub - The substring to find
 * @return {number} The length of the largest substring that starts and ends with 'sub'
 */
function strDist(s, sub) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q13</h3>
 * <p>
 * Description:
 *     Given an array of integers `nums`, determine recursively whether it's
 *     possible to choose a group of elements starting from index `start`
 *     such that their sum equals `target`.
 *
 *     This is a classic backtracking problem. At each index, there are two choices:
 *     - Include nums[start] in the group
 *     - Exclude nums[start] from the group
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>groupSum(0, [2, 4, 8], 10) -> true</li>
 *   <li>groupSum(0, [2, 4, 8], 14) -> true</li>
 *   <li>groupSum(0, [2, 4, 8], 9) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} start - The starting index to consider elements from `nums`
 * @param {number[]} nums - The list of integers
 * @param {number} target - The sum to achieve
 * @return {boolean} true if a valid group exists, false otherwise
 */
function groupSum(start, nums, target) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q14</h3>
 * <p>
 * Description:
 *     Given an array of integers `nums`, determine recursively whether it's possible to choose
 *     a group of elements beginning at index `start` such that their sum equals `target`. However,
 *     there is an additional constraint: all 6's in the array must be chosen.
 *
 *     At each step, if the current element is a 6, it must be included in the sum. Otherwise, you
 *     have the option to either include or exclude the current element.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>groupSum6(0, [5,6,2], 8) -> true</li>
 *   <li>groupSum6(0, [5,6,2], 9) -> false</li>
 *   <li>groupSum6(0, [5,6,2], 7) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} start - The starting index from which to consider elements in `nums`
 * @param {number[]} nums - The list of integers
 * @param {number} target - The target sum to achieve
 * @return {boolean} true if a valid group (meeting the constraints) exists, false otherwise
 */
function groupSum6(start, nums, target) {
  // TODO: Implement your solution here
  return false;
}

module.exports = {
  sameEndsString,
  mirrorEnds,
  squareUp,
  getSandwich,
  sameStarChar,
  haveThree,
  twoTwo,
  sameEndsList,
  tripleUp,
  fizzArray3,
  strCopies,
  strDist,
  groupSum,
  groupSum6
};
