/**
 * ap-quiz-09.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-09.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { shiftLeft, blackjack } = require('./ap-quiz-09');
 *        console.log(shiftLeft([6, 2, 5, 3])); // [2, 5, 3, 6]
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-09.test.js`
 *        (See ap-quiz-09.test.js for test setup instructions)
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 */

'use strict';

/**
 * APQuiz09 contains various coding quiz problems for practice.
 *
 * This module includes functions for:
 * 1. shiftLeft: Return array left-shifted by one (first element moves to end).
 * 2. tenRun: Change values after each multiple of 10 to that multiple until next.
 * 3. pre4: Return elements before the first occurrence of 4.
 * 4. blackjack: Return value closest to 21 without going over, or 0 if both exceed.
 * 5. maxBlock: Return length of largest block (run of identical consecutive chars).
 * 6. seriesUp: Create array 1, 1,2, 1,2,3, ... up to 1,2,...,n.
 * 7. oneTwo: Transform string by moving first char of each 3-char group after next two.
 * 8. zipZap: Remove middle letter from "z?p" patterns (zip/zap -> zp).
 * 9. post4: Return elements after the last occurrence of 4.
 * 10. notAlone: Replace "alone" occurrences of a value with larger of its neighbors.
 * 11. groupNoAdj: Recursive sum to target; adjacent elements cannot both be chosen.
 * 12. groupSum5: Recursive sum to target; all multiples of 5 must be chosen; 1 after 5 skipped.
 * 13. groupSumClump: Recursive sum to target; adjacent identical values all or none.
 * 14. splitArray: Recursive check if array can be split into two groups with equal sums.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     Return a list that is "left shifted" by one position.
 *     That is, the first element moves to the end, and all other elements shift left.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>shiftLeft([6, 2, 5, 3]) -> [2, 5, 3, 6]</li>
 *   <li>shiftLeft([1, 2]) -> [2, 1]</li>
 *   <li>shiftLeft([]) -> []</li>
 *   <li>shiftLeft([1, 1, 2, 2, 4]) -> [1, 2, 2, 4, 1]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to shift
 * @return {number[]} The left-shifted list
 */
function shiftLeft(nums) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     For each multiple of 10 in the given list, change all the values following it
 *     to be that multiple of 10, until encountering another multiple of 10.
 *     Values before the first multiple of 10 remain unchanged.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>tenRun([2, 10, 3, 4, 20, 5]) -> [2, 10, 10, 10, 20, 20]</li>
 *   <li>tenRun([10, 1, 20, 2]) -> [10, 10, 20, 20]</li>
 *   <li>tenRun([10, 1, 9, 20]) -> [10, 10, 10, 20]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to process
 * @return {number[]} A new list after applying the ten-run transformation
 */
function tenRun(nums) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Given a non-empty list of integers `nums`, return a new list containing the elements
 *     from `nums` that appear before the first `4`. You may assume that `nums` contains at least one `4`.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>pre4([1, 2, 4, 1]) -> [1, 2]</li>
 *   <li>pre4([3, 1, 4]) -> [3, 1]</li>
 *   <li>pre4([1, 4, 4]) -> [1]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - Non-empty list containing at least one 4
 * @return {number[]} Elements before the first 4
 */
function pre4(nums) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     Given two positive integers `a` and `b`, return whichever value is closest to 21 without going over.
 *     If both values exceed 21, return 0.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>blackjack(19, 21) -> 21</li>
 *   <li>blackjack(21, 19) -> 21</li>
 *   <li>blackjack(19, 22) -> 19</li>
 * </ul>
 * </p>
 *
 * @param {number} a - First card value (greater than 0)
 * @param {number} b - Second card value (greater than 0)
 * @return {number} Value closest to 21 without going over, or 0 if both exceed 21
 */
function blackjack(a, b) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Given a string `s`, return the length of the largest "block" in the string.
 *     A block is a run of adjacent characters that are the same.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>maxBlock("hoopla") -> 2</li>
 *   <li>maxBlock("XXBBBbbxxXXXX") -> 4</li>
 *   <li>maxBlock("XX2222BBBbbXX2222") -> 4</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {number} The length of the longest block
 */
function maxBlock(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     Given a non-negative integer `n`, create and return a list containing
 *     the sequence 1, then 1,2, then 1,2,3, … up to 1,2,...,n. The total length is n*(n+1)/2.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>seriesUp(3) -> [1, 1, 2, 1, 2, 3]</li>
 *   <li>seriesUp(4) -> [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]</li>
 *   <li>seriesUp(2) -> [1, 1, 2]</li>
 * </ul>
 * </p>
 *
 * @param {number} n - Non-negative integer up to which to build the sequence
 * @return {number[]} The expanded series list
 */
function seriesUp(n) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     Given a string, compute a new string by moving the first char of each
 *     consecutive group of 3 chars to come after the next two chars.
 *     Ignore any group of fewer than 3 chars at the end.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>oneTwo("abc") -> "bca"</li>
 *   <li>oneTwo("tca") -> "cat"</li>
 *   <li>oneTwo("tcagdo") -> "catdog"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} The transformed string after applying the oneTwo rule
 */
function oneTwo(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     Look for patterns like "zip" and "zap" in the string — length-3 substrings
 *     that start with 'z' and end with 'p'. Remove the middle letter of each such
 *     substring, leaving just "zp".
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>zipZap("zipXzap") -> "zpXzp"</li>
 *   <li>zipZap("zopzop") -> "zpzp"</li>
 *   <li>zipZap("zzzopzop") -> "zzzpzp"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} The string with all "z?p" patterns reduced to "zp"
 */
function zipZap(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     Given a non-empty list of integers `nums`, return a new list containing
 *     the elements that come after the last occurrence of 4 in `nums`.
 *     You may assume there is at least one 4 in the list.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>post4([2, 4, 1, 2]) -> [1, 2]</li>
 *   <li>post4([4, 1, 4, 2]) -> [2]</li>
 *   <li>post4([4, 4, 1, 2, 3]) -> [1, 2, 3]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - Non-empty list containing at least one 4
 * @return {number[]} Elements after the last 4
 */
function post4(nums) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     We'll say that an element in an array is "alone" if there are values before
 *     and after it, and those values are different from it. Return a version of the
 *     given array where every instance of the given value which is alone is replaced
 *     by whichever of its left or right neighbors is larger.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>notAlone([1, 2, 3], 2) -> [1, 3, 3]</li>
 *   <li>notAlone([1, 2, 3, 2, 5, 2], 2) -> [1, 3, 3, 5, 5, 2]</li>
 *   <li>notAlone([3, 4], 3) -> [3, 4]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The input list of integers
 * @param {number} val - The value to check for "alone" occurrences
 * @return {number[]} New list where alone val is replaced by larger neighbor
 */
function notAlone(nums, val) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q11</h3>
 * <p>
 * Description:
 *     Given an array of integers `nums`, determine recursively whether it's possible to choose a group
 *     of some of the ints such that the group sums to the given target with the additional constraint
 *     that if a value in the array is chosen to be in the group, the value immediately following it must not be chosen.
 *     At each index: include nums[start] (and skip next) or exclude nums[start].
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>groupNoAdj(0, [2, 5, 10, 4], 12) -> true</li>
 *   <li>groupNoAdj(0, [2, 5, 10, 4], 14) -> false</li>
 *   <li>groupNoAdj(0, [2, 5, 10, 4], 7) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} start - Starting index in nums
 * @param {number[]} nums - The list of integers
 * @param {number} target - The target sum
 * @return {boolean} true if a valid group exists
 */
function groupNoAdj(start, nums, target) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q12</h3>
 * <p>
 * Description:
 *     Given an array of integers `nums`, determine recursively whether it's possible to choose
 *     a group of some of the ints (starting at index `start`) such that the group sums to the given
 *     target with these additional constraints: All multiples of 5 must be included. If a value is chosen
 *     and it is a multiple of 5, then if the value immediately following it is 1, that 1 must not be chosen.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>groupSum5(0, [2, 5, 10, 4], 19) -> true</li>
 *   <li>groupSum5(0, [2, 5, 10, 4], 17) -> true</li>
 *   <li>groupSum5(0, [2, 5, 10, 4], 12) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} start - Starting index in nums
 * @param {number[]} nums - The list of integers
 * @param {number} target - The sum to achieve
 * @return {boolean} true if a valid group exists
 */
function groupSum5(start, nums, target) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q13</h3>
 * <p>
 * Description:
 *     Given an array of ints, determine recursively whether it's possible to choose a group
 *     of some of the ints such that the group sums to the given target, with the additional
 *     constraint that if there are numbers in the array that are adjacent and identical, they
 *     must either all be chosen or none of them.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>groupSumClump(0, [2, 4, 8], 10) -> true</li>
 *   <li>groupSumClump(0, [1, 2, 4, 8, 1], 14) -> true</li>
 *   <li>groupSumClump(0, [2, 4, 4, 8], 14) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} start - Starting index in nums
 * @param {number[]} nums - The list of integers
 * @param {number} target - The sum to achieve
 * @return {boolean} true if a valid group exists
 */
function groupSumClump(start, nums, target) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q14</h3>
 * <p>
 * Description:
 *     Given an array of ints, determine recursively if it is possible to divide the ints
 *     into two groups, so that the sums of the two groups are the same. Every int must be
 *     in one group or the other.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>splitArray([2, 2]) -> true</li>
 *   <li>splitArray([2, 3]) -> false</li>
 *   <li>splitArray([5, 2, 3]) -> true</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The input list of integers
 * @return {boolean} true if the array can be split into two groups with equal sum
 */
function splitArray(nums) {
  // TODO: Implement your solution here
  return false;
}

module.exports = {
  shiftLeft,
  tenRun,
  pre4,
  blackjack,
  maxBlock,
  seriesUp,
  oneTwo,
  zipZap,
  post4,
  notAlone,
  groupNoAdj,
  groupSum5,
  groupSumClump,
  splitArray
};
