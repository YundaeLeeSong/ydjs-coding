/**
 * ap-quiz-02.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-02.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { copyEndy, matchUp } = require('./ap-quiz-02');
 *        console.log(copyEndy([9, 11, 90, 22, 6], 2)); // [9, 90]
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-02.test.js`
 *        (See ap-quiz-02.test.js for test setup instructions)
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 * Use ESM (`export` / `export default`) only when your project is intentionally configured
 * for modules (e.g. `package.json` has `"type": "module"` or you use a transpiler).
 */

'use strict';

/**
 * APQuiz02 contains various coding quiz problems for practice.
 *
 * This module includes functions for:
 * 1. copyEndy: Returns the first 'count' endy numbers (0..10 or 90..100).
 * 2. matchUp: Counts string pairs that start with the same character.
 * 3. scoreUp: Calculates student score from key and answers.
 * 4. wordsWithout: Returns list without target string.
 * 5. scoresSpecial: Sum of largest multiple-of-10 in two arrays.
 * 6. sumHeights: Sum of height changes between start and end indices.
 * 7. sumHeights2: Sum of height changes, counting increases double.
 * 8. bigHeights: Counts steps with height change >= 5.
 * 9. userCompare: Compares two users by name then ID.
 * 10. mergeTwo: Merges two sorted arrays and returns first n unique elements.
 * 11. triangle: Computes total blocks in triangle recursively.
 * 12. sumDigits: Returns sum of digits recursively.
 * 13. count7: Counts occurrences of digit 7 recursively.
 * 14. count8: Counts occurrences of digit 8, with consecutive 8s counting double.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     Given an array of positive integers, return a new list containing
 *     the first `count` endy numbers from the original array.
 *     An integer is endy if it is in the range 0..10 or 90..100 (inclusive).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>copyEndy([9, 11, 90, 22, 6], 2) -> [9, 90]</li>
 *   <li>copyEndy([9, 11, 90, 22, 6], 3) -> [9, 90, 6]</li>
 *   <li>copyEndy([12, 1, 1, 13, 0, 20], 2) -> [1, 1]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of positive integers to check
 * @param {number} count - The number of endy integers to return
 * @return {number[]} A list containing the first `count` endy integers
 */
function copyEndy(nums, count) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     Given two arrays of strings of the same length, compare each
 *     string in the first array to the corresponding string in the second array.
 *     Count the number of times that the two strings are non-empty
 *     and start with the same character.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) -> 1</li>
 *   <li>matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) -> 2</li>
 *   <li>matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) -> 1</li>
 * </ul>
 * </p>
 *
 * @param {string[]} a - The first list of strings to compare
 * @param {string[]} b - The second list of strings to compare
 * @return {number} The count of non-empty string pairs that start with the same character
 */
function matchUp(a, b) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Given two arrays of strings, the "key" array containing the
 *     correct answers and the "answers" array containing the student's responses,
 *     calculate the score for the student.
 *     A correct answer is worth +4 points, an incorrect answer is worth
 *     -1 point, and a blank answer ("?") is worth 0 points.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) -> 6</li>
 *   <li>scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) -> 11</li>
 *   <li>scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) -> 16</li>
 * </ul>
 * </p>
 *
 * @param {string[]} key - The list of correct answers
 * @param {string[]} answers - The list of student's answers
 * @return {number} The student's total score based on the comparison
 */
function scoreUp(key, answers) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     Given an array of strings, return a new list without
 *     the strings that are equal to the target string.
 *     The new list should contain all the strings from the
 *     original list except the ones that match the target string.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>wordsWithout(["a", "b", "c", "a"], "a") -> ["b", "c"]</li>
 *   <li>wordsWithout(["a", "b", "c", "a"], "b") -> ["a", "c", "a"]</li>
 *   <li>wordsWithout(["a", "b", "c", "a"], "c") -> ["a", "b", "a"]</li>
 * </ul>
 * </p>
 *
 * @param {string[]} words - The list of words to filter
 * @param {string} target - The target word to remove from the list
 * @return {string[]} A new list containing all words except those that are equal to the target string
 */
function wordsWithout(words, target) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Given two arrays of non-negative integer scores, a "special"
 *     score is one which is a multiple of 10 (e.g., 40 or 90).
 *     Return the sum of the largest special score in array `a` plus
 *     the largest special score in array `b`.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>scoresSpecial([12, 10, 4], [2, 20, 30]) -> 40</li>
 *   <li>scoresSpecial([20, 10, 4], [2, 20, 10]) -> 40</li>
 *   <li>scoresSpecial([12, 11, 4], [2, 20, 31]) -> 20</li>
 *   <li>scoresSpecial([1, 20, 2, 50], [3, 4, 5]) -> 50</li>
 *   <li>scoresSpecial([10, 4, 20, 30], [30, 20, 99]) -> 60</li>
 * </ul>
 * </p>
 *
 * @param {number[]} a - First list of non-negative scores
 * @param {number[]} b - Second list of non-negative scores
 * @return {number} Sum of the largest multiple-of-10 in `a` and the largest multiple-of-10 in `b`
 */
function scoresSpecial(a, b) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     We have an array of heights, representing the altitude along a walking trail.
 *     Given start/end indexes into the array, return the sum of the changes for a walk
 *     beginning at the start index and ending at the end index. For example, with the
 *     heights [5, 3, 6, 7, 2] and start=2, end=4 yields a sum of 1 + 5 = 6.
 *     The start and end indices will both be valid with start <= end.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sumHeights([5, 3, 6, 7, 2], 2, 4) -> 6</li>
 *   <li>sumHeights([5, 3, 6, 7, 2], 0, 1) -> 2</li>
 *   <li>sumHeights([5, 3, 6, 7, 2], 0, 4) -> 11</li>
 * </ul>
 * </p>
 *
 * @param {number[]} heights - List of integer altitudes along the trail
 * @param {number} start - Starting index of the walk
 * @param {number} end - Ending index of the walk
 * @return {number} The total sum of absolute height changes from start to end
 */
function sumHeights(heights, start, end) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     A variation on the sumHeights problem. We have an array of heights representing
 *     the altitude along a walking trail. Given start/end indexes into the array,
 *     return the sum of the changes for a walk beginning at the start index and ending
 *     at the end index, however increases in height count double.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sumHeights2([5, 3, 6, 7, 2], 2, 4) -> 7</li>
 *   <li>sumHeights2([5, 3, 6, 7, 2], 0, 1) -> 2</li>
 *   <li>sumHeights2([5, 3, 6, 7, 2], 0, 4) -> 15</li>
 * </ul>
 * </p>
 *
 * @param {number[]} heights - List of integer altitudes along the trail
 * @param {number} start - Starting index of the walk
 * @param {number} end - Ending index of the walk
 * @return {number} The total sum of height changes, counting each upward change twice
 */
function sumHeights2(heights, start, end) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     A variation on the sumHeights problem. We have an array of heights representing
 *     the altitude along a walking trail. Given start/end indexes into the array,
 *     return the number of "big" steps for a walk beginning at the start index and
 *     ending at the end index. A step is "big" if the change is 5 or more up or down.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>bigHeights([5, 3, 6, 7, 2], 2, 4) -> 1</li>
 *   <li>bigHeights([5, 3, 6, 7, 2], 0, 1) -> 0</li>
 *   <li>bigHeights([5, 3, 6, 7, 2], 0, 4) -> 1</li>
 *   <li>bigHeights([5, 3, 6, 7, 3], 0, 4) -> 0</li>
 * </ul>
 * </p>
 *
 * @param {number[]} heights - The list of integer altitudes along the trail
 * @param {number} start - The starting index of the walk (inclusive)
 * @param {number} end - The ending index of the walk (inclusive)
 * @return {number} The count of "big" steps (difference >= 5) between start and end
 */
function bigHeights(heights, start, end) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     We have data for two users, A and B, each with a string
 *     `name` and an integer `id`.
 *     The goal is to order the users for sorting. Return:
 *       - -1 if A comes before B
 *       -  1 if A comes after B
 *       -  0 if they are the same.
 *     Order first by name (lexicographically), and if the names
 *     are equal, order by id.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>userCompare("bb", 1, "zz", 2) -> -1</li>
 *   <li>userCompare("bb", 1, "aa", 2) -> 1</li>
 *   <li>userCompare("bb", 1, "bb", 1) -> 0</li>
 *   <li>userCompare("bb", 5, "bb", 1) -> 1</li>
 *   <li>userCompare("bb", 5, "bb", 10) -> -1</li>
 *   <li>userCompare("adam", 1, "bob", 2) -> -1</li>
 *   <li>userCompare("bob", 1, "bob", 2) -> -1</li>
 *   <li>userCompare("bzb", 1, "bob", 2) -> 1</li>
 * </ul>
 * </p>
 *
 * @param {string} aName - Name of user A
 * @param {number} aId - ID of user A
 * @param {string} bName - Name of user B
 * @param {number} bId - ID of user B
 * @return {number} -1 if A < B, 1 if A > B, 0 if they are equal
 */
function userCompare(aName, aId, bName, bId) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     Start with two arrays of strings, `a` and `b`, each sorted
 *     alphabetically and without duplicates.
 *     Return a new list containing the first `n` elements from the
 *     two arrays merged together.
 *     The result list should be in alphabetical order and
 *     without duplicates.
 *     You should make a single pass over `a` and `b`, taking
 *     advantage of their sorted order.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) -> ["a", "b", "c"]</li>
 *   <li>mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) -> ["a", "c", "f"]</li>
 *   <li>mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) -> ["c", "f", "g"]</li>
 * </ul>
 * </p>
 *
 * @param {string[]} a - First sorted list of unique strings
 * @param {string[]} b - Second sorted list of unique strings
 * @param {number} n - Number of elements to include in the merged result
 * @return {string[]} A sorted list of the first `n` unique strings from merging `a` and `b`
 */
function mergeTwo(a, b, n) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q11</h3>
 * <p>
 * Description:
 *     We have a triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
 *     the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total
 *     number of blocks in such a triangle with the given number of rows.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>triangle(0) -> 0</li>
 *   <li>triangle(1) -> 1</li>
 *   <li>triangle(2) -> 3</li>
 * </ul>
 * </p>
 *
 * @param {number} rows - The number of rows in the triangle
 * @return {number} The total number of blocks in the triangle
 */
function triangle(rows) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q12</h3>
 * <p>
 * Description:
 *     Given a non-negative int n, return the sum of its digits recursively (no loops).
 *     Note that mod (%) by 10 yields the rightmost digit (e.g., 126 % 10 is 6), while Math.floor(n / 10)
 *     removes the rightmost digit (e.g., Math.floor(126 / 10) is 12).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sumDigits(126) -> 9</li>
 *   <li>sumDigits(49) -> 13</li>
 *   <li>sumDigits(12) -> 3</li>
 * </ul>
 * </p>
 *
 * @param {number} n - A non-negative integer
 * @return {number} The sum of the digits of n
 */
function sumDigits(n) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q13</h3>
 * <p>
 * Description:
 *     Given a non-negative int n, return the count of the occurrences of 7 as a digit,
 *     so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost
 *     digit (e.g., 126 % 10 is 6), while Math.floor(n / 10) removes the rightmost digit.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>count7(717) -> 2</li>
 *   <li>count7(7) -> 1</li>
 *   <li>count7(123) -> 0</li>
 * </ul>
 * </p>
 *
 * @param {number} n - A non-negative integer
 * @return {number} The count of occurrences of the digit 7 in n
 */
function count7(n) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q14</h3>
 * <p>
 * Description:
 *     Given a non-negative int n, compute recursively (no loops) the count of the occurrences
 *     of 8 as a digit, except that an 8 with another 8 immediately to its left counts double.
 *     For example, count8(8818) yields 4 because the first 8 (from the right) is counted normally,
 *     while the 8 that immediately follows another 8 is counted twice.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>count8(8) -> 1</li>
 *   <li>count8(818) -> 2</li>
 *   <li>count8(8818) -> 4</li>
 * </ul>
 * </p>
 *
 * @param {number} n - A non-negative integer
 * @return {number} The count of occurrences of 8 in n, with an 8 immediately following another 8 counted double
 */
function count8(n) {
  // TODO: Implement your solution here
  return 0;
}

module.exports = {
  copyEndy,
  matchUp,
  scoreUp,
  wordsWithout,
  scoresSpecial,
  sumHeights,
  sumHeights2,
  bigHeights,
  userCompare,
  mergeTwo,
  triangle,
  sumDigits,
  count7,
  count8
};
