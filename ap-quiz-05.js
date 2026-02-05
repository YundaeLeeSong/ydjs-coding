/**
 * ap-quiz-05.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-05.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { more14, luckySum } = require('./ap-quiz-05');
 *        console.log(more14([1, 4, 1])); // true
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-05.test.js`
 *        (See ap-quiz-05.test.js for test setup instructions)
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 * Use ESM (`export` / `export default`) only when your project is intentionally configured
 * for modules (e.g. `package.json` has `"type": "module"` or you use a transpiler).
 */

'use strict';

/**
 * APQuiz05 contains various coding quiz problems for practice.
 *
 * This module includes functions for:
 * 1. more14: Check if the array contains more 1's than 4's.
 * 2. luckySum: Sum three integers, ignoring 13 and values to its right.
 * 3. equalIsNot: Compare counts of "is" and "not" in a string.
 * 4. fix45: Rearrange list so every 4 is followed by a 5.
 * 5. repeatSeparator: Create a string with repeated words separated by a given separator.
 * 6. repeatFront: Build a string from the front of another string.
 * 7. fizzArray: Generate a list of integers from 0 to n-1.
 * 8. only14: Check if the list contains only 1's and 4's.
 * 9. fizzArray2: Generate a list of string representations of integers from 0 to n-1.
 * 10. noTeenSum: Sum three integers, treating 'teen' values as 0 (with exceptions).
 * 11. array220: Recursively check if any value in array is followed by a value 10 times larger.
 * 12. allStar: Recursively compute a string where all adjacent characters are separated by "*".
 * 13. pairStar: Recursively compute a string where adjacent identical characters are separated by "*".
 * 14. endX: Recursively move all lowercase 'x' characters to the end of the string.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if the number of 1's in the list is greater than
 *     the number of 4's.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>more14([1, 4, 1]) -> true</li>
 *   <li>more14([1, 4, 1, 4]) -> false</li>
 *   <li>more14([1, 1]) -> true</li>
 *   <li>more14([1, 6, 6]) -> true</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to examine
 * @return {boolean} true if count of 1's is greater than count of 4's, false otherwise
 */
function more14(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     Given 3 integer values, a, b, c, return their sum. However, if one of the values
 *     is 13 then it does not count toward the sum and values to its right do not count.
 *     So for example, if b is 13, then both b and c do not count.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>luckySum(1, 2, 3) -> 6</li>
 *   <li>luckySum(1, 2, 13) -> 3</li>
 *   <li>luckySum(1, 13, 3) -> 1</li>
 * </ul>
 * </p>
 *
 * @param {number} a - First integer
 * @param {number} b - Second integer
 * @param {number} c - Third integer
 * @return {number} The sum as described, skipping 13 and any values to its right
 */
function luckySum(a, b, c) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Given a string, return true if the number of appearances
 *     of "is" anywhere in the string
 *     is equal to the number of appearances of "not" anywhere in
 *     the string. The match is case-sensitive.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>equalIsNot("This is not") -> false</li>
 *   <li>equalIsNot("This is notnot") -> true</li>
 *   <li>equalIsNot("noisxxnotyynotxisi") -> true</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string to examine
 * @return {boolean} true if count of "is" equals count of "not", false otherwise
 */
function equalIsNot(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     Return a list containing exactly the same numbers as the given list, but rearranged so that every 4
 *     is immediately followed by a 5. Do not move the 4's themselves, but every other number may move.
 *     You may assume:
 *       - The list contains the same number of 4's and 5's.
 *       - Every 4 has a non-4 immediately after it.
 *       - 5's may appear anywhere in the original list.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>fix45([5, 4, 9, 4, 9, 5]) -> [9, 4, 5, 4, 5, 9]</li>
 *   <li>fix45([1, 4, 1, 5]) -> [1, 4, 5, 1]</li>
 *   <li>fix45([1, 4, 1, 5, 5, 4, 1]) -> [1, 4, 5, 1, 1, 4, 5]</li>
 *   <li>fix45([4, 2, 2, 5]) -> [4, 5, 2, 2]</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The input list of integers containing matching numbers of 4's and 5's
 * @return {number[]} A new list where each 4 is immediately followed by a 5
 */
function fix45(nums) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Return a big string made of `count` occurrences of the given `word`,
 *     separated by the given separator string `sep`.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>repeatSeparator("Word", "X", 3) -> "WordXWordXWord"</li>
 *   <li>repeatSeparator("This", "And", 2) -> "ThisAndThis"</li>
 *   <li>repeatSeparator("This", "And", 1) -> "This"</li>
 * </ul>
 * </p>
 *
 * @param {string} word - The word to repeat
 * @param {string} sep - The separator to place between words
 * @param {number} count - The number of times to repeat `word`
 * @return {string} The resulting string of repeated words separated by `sep`
 */
function repeatSeparator(word, sep, count) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     Given a string `s` and an integer `n`, return a string made of the first `n` characters
 *     of `s`, followed by the first `n-1` characters, and so on down to 1. You may assume
 *     0 ≤ n ≤ len(s).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>repeatFront("Chocolate", 4) -> "ChocChoChC"</li>
 *   <li>repeatFront("Chocolate", 3) -> "ChoChC"</li>
 *   <li>repeatFront("Ice Cream", 2) -> "IcI"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @param {number} n - Number of characters to start with (0 ≤ n ≤ len(s))
 * @return {string} The concatenated prefix sequence
 */
function repeatFront(s, n) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     Given a number n, create and return a new list of length n containing the numbers
 *     0, 1, 2, ... n-1. If n is 0, return an empty list.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>fizzArray(4) -> [0, 1, 2, 3]</li>
 *   <li>fizzArray(1) -> [0]</li>
 *   <li>fizzArray(10) -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]</li>
 * </ul>
 * </p>
 *
 * @param {number} n - Non-negative length of the array to generate
 * @return {number[]} A list of integers from 0 up to n-1
 */
function fizzArray(n) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if every element is either a 1 or a 4.
 *     An empty list counts as true since there are no disallowed elements.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>only14([1, 4, 1, 4]) -> true</li>
 *   <li>only14([1, 4, 2, 4]) -> false</li>
 *   <li>only14([1, 1]) -> true</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @return {boolean} true if every element is 1 or 4, false otherwise
 */
function only14(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     Given a non-negative integer n, create and return a new list of length n
 *     containing the string representations of the numbers 0, 1, 2, ... n-1.
 *     If n is 0, return an empty list.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>fizzArray2(4) -> ["0", "1", "2", "3"]</li>
 *   <li>fizzArray2(10) -> ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]</li>
 *   <li>fizzArray2(2) -> ["0", "1"]</li>
 * </ul>
 * </p>
 *
 * @param {number} n - The length of the array to generate (n ≥ 0)
 * @return {string[]} A list of strings "0" through str(n-1)
 */
function fizzArray2(n) {
  // TODO: Implement your solution here
  return [];
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     Given three integer values a, b, and c, return their sum.
 *     However, if any of the values is a 'teen' (in the range 13..19 inclusive),
 *     that value counts as 0, except 15 and 16 are not considered teens.
 *     Use a helper function fixTeen(n) to handle teen adjustment,
 *     avoiding repeating code.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>noTeenSum(1, 2, 3) -> 6</li>
 *   <li>noTeenSum(2, 13, 1) -> 3</li>
 *   <li>noTeenSum(2, 1, 14) -> 3</li>
 * </ul>
 * </p>
 *
 * @param {number} a - First integer value
 * @param {number} b - Second integer value
 * @param {number} c - Third integer value
 * @return {number} The sum after applying the teen rules
 */
function noTeenSum(a, b, c) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q11</h3>
 * <p>
 * Description:
 *     Given an array of integers, this function recursively checks
 *     if any value in the array
 *     is followed by a value that is exactly 10 times that value.
 *     The recursion starts from
 *     the given index and proceeds through the array.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>array220([1, 2, 20], 0) -> true</li>
 *   <li>array220([3, 30], 0) -> true</li>
 *   <li>array220([3], 0) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The input list of integers
 * @param {number} index - The current index to check
 * @return {boolean} true if the condition is met, false otherwise
 */
function array220(nums, index) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q12</h3>
 * <p>
 * Description:
 *     Given a string, this function recursively computes a
 *     new string where all adjacent
 *     characters are separated by a "*".
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>allStar("hello") -> "h*e*l*l*o"</li>
 *   <li>allStar("abc") -> "a*b*c"</li>
 *   <li>allStar("ab") -> "a*b"</li>
 *   <li>allStar("a") -> "a"</li>
 *   <li>allStar("") -> ""</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} A new string where adjacent characters are separated by "*"
 */
function allStar(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q13</h3>
 * <p>
 * Description:
 *     Given a string, this function recursively computes a new string where identical characters
 *     that are adjacent in the original string are separated by "*".
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>pairStar("hello") -> "hel*lo"</li>
 *   <li>pairStar("xxyy") -> "x*xy*y"</li>
 *   <li>pairStar("aaaa") -> "a*a*a*a"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} A new string where adjacent identical characters are separated by "*"
 */
function pairStar(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q14</h3>
 * <p>
 * Description:
 *     Given a string, this function recursively computes a new string where all the lowercase 'x'
 *     characters have been moved to the end of the string.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>endX("xxre") -> "rexx"</li>
 *   <li>endX("xxhixx") -> "hixxxx"</li>
 *   <li>endX("xhixhix") -> "hihixxx"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} A new string with all 'x' characters moved to the end
 */
function endX(s) {
  // TODO: Implement your solution here
  return '';
}

module.exports = {
  more14,
  luckySum,
  equalIsNot,
  fix45,
  repeatSeparator,
  repeatFront,
  fizzArray,
  only14,
  fizzArray2,
  noTeenSum,
  array220,
  allStar,
  pairStar,
  endX
};
