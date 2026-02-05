/**
 * ap-quiz-06.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-06.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { gHappy, canBalance } = require('./ap-quiz-06');
 *        console.log(gHappy('xxggxx')); // true
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-06.test.js`
 *        (See ap-quiz-06.test.js for test setup instructions)
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 * Use ESM (`export` / `export default`) only when your project is intentionally configured
 * for modules (e.g. `package.json` has `"type": "module"` or you use a transpiler).
 */

'use strict';

/**
 * APQuiz06 contains various coding quiz problems for practice.
 *
 * This module includes functions for:
 * 1. gHappy: Check if all 'g' chars in the string are happy (surrounded by 'g's).
 * 2. canBalance: Determine if a list can be split into two parts with equal sums.
 * 3. no14: Check if a list contains no 1's or no 4's.
 * 4. isEverywhere: Verify if a value appears in every adjacent pair in a list.
 * 5. repeatEnd: Create a new string by repeating the last n characters of a string n times.
 * 6. mixString: Merge two strings by alternating their characters.
 * 7. xyBalance: Check if all 'x' chars in a string are followed by a 'y' char later in the string.
 * 8. bobThere: Check if a string contains the pattern 'b?b' ('b', any char, 'b').
 * 9. roundSum: Round three integers to the nearest ten and return their sum.
 * 10. countTriple: Count the number of triples (three identical chars in a row) in a string.
 * 11. countPairs: Recursively count pairs of same characters separated by exactly one character.
 * 12. countAbc: Recursively count occurrences of "abc" and "aba" substrings in a string.
 * 13. count11: Recursively count non-overlapping "11" substrings in a string.
 * 14. stringClean: Recursively remove adjacent duplicate characters from a string.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
 *     immediately to its left or right. Return true if all the 'g's in the given string
 *     are happy.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>gHappy("xxggxx") -> true</li>
 *   <li>gHappy("xxgxx") -> false</li>
 *   <li>gHappy("xxggyygxx") -> false</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {boolean} true if every 'g' in the string is happy, false otherwise
 */
function gHappy(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     Given a non-empty list of integers, return true if there is a place to split the list
 *     so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>canBalance([1, 1, 1, 2, 1]) -> true   # split after third 1: sum([1,1,1]) == sum([2,1])</li>
 *   <li>canBalance([2, 1, 1, 2, 1]) -> false</li>
 *   <li>canBalance([10, 10]) -> true</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - A non-empty list of integers
 * @return {boolean} true if there exists an index where the sum of the elements to the left equals the sum of the elements to the right, false otherwise
 */
function canBalance(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if it contains no 1's or it contains no 4's (or both).
 *     In other words, it fails only if there is at least one 1 and at least one 4.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>no14([1, 2, 3]) -> true   # has 1's but no 4's</li>
 *   <li>no14([1, 2, 3, 4]) -> false  # has both 1 and 4</li>
 *   <li>no14([2, 3, 4]) -> true   # has 4's but no 1's</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to examine
 * @return {boolean} true if the list contains no 1's or no 4's, false otherwise
 */
function no14(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     We'll say that a value is "everywhere" in a list if for every pair of adjacent elements
 *     in the list, at least one of the pair is that value. Return true if the given value is
 *     everywhere in the list. An empty list or a single-element list trivially satisfies this.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>isEverywhere([1, 2, 1, 3], 1) -> true</li>
 *   <li>isEverywhere([1, 2, 1, 3], 2) -> false</li>
 *   <li>isEverywhere([1, 2, 1, 3, 4], 1) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @param {number} val - The value to verify is "everywhere"
 * @return {boolean} true if `val` is everywhere in `nums`, false otherwise
 */
function isEverywhere(nums, val) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Given a string `s` and an integer `n`, return a new string made of `n` repetitions
 *     of the last `n` characters of `s`. You may assume that 0 ≤ n ≤ len(s).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>repeatEnd("Hello", 3) -> "llollollo"</li>
 *   <li>repeatEnd("Hello", 2) -> "lolo"</li>
 *   <li>repeatEnd("Hello", 1) -> "o"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @param {number} n - Number of characters from the end to repeat (0 ≤ n ≤ len(s))
 * @return {string} A string consisting of `n` copies of the last `n` characters of `s`
 */
function repeatEnd(s, n) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     Given two strings, `a` and `b`, create a new string by alternating characters:
 *     take the first char of `a`, then the first char of `b`, then the second char of `a`,
 *     then the second char of `b`, and so on. Any leftover characters from the longer string
 *     go at the end of the result.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>mixString("abc", "xyz") -> "axbycz"</li>
 *   <li>mixString("Hi", "There") -> "HTihere"</li>
 *   <li>mixString("xxxx", "There") -> "xTxhxexre"</li>
 * </ul>
 * </p>
 *
 * @param {string} a - First input string
 * @param {string} b - Second input string
 * @return {string} The merged string with alternating characters
 */
function mixString(a, b) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     We'll say that a string is xy-balanced if for all the 'x' characters in the string,
 *     there exists a 'y' character somewhere later in the string. One 'y' can balance multiple 'x's.
 *     Return true if the given string is xy-balanced.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>xyBalance("aaxbby") -> true    # both x's have a y after them</li>
 *   <li>xyBalance("aaxbb") -> false    # x at pos 2 has no y after</li>
 *   <li>xyBalance("yaaxbb") -> false   # same, no y after the x's</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string to check for xy-balance
 * @return {boolean} true if the string is xy-balanced, false otherwise
 */
function xyBalance(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     Return true if the given string contains a "bob" pattern—i.e. a 'b', then any character, then another 'b'.
 *     The middle character can be any char. Overlapping patterns count.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>bobThere("abcbob") -> true    # "bob" at positions 3-5</li>
 *   <li>bobThere("b9b") -> true       # "b9b"</li>
 *   <li>bobThere("bbb") -> true       # first and third 'b'</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string to search
 * @return {boolean} true if any substring of the form 'b?b' appears, false otherwise
 */
function bobThere(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     Given three integers a, b, c, round each to the nearest multiple of 10
 *     (rounding up if the rightmost digit is 5 or more, otherwise down),
 *     then return the sum of the rounded values.
 *     Use a helper function round10(num) to perform the rounding for each value.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>roundSum(16, 17, 18) -> 60   # 20 + 20 + 20</li>
 *   <li>roundSum(12, 13, 14) -> 30   # 10 + 10 + 10</li>
 *   <li>roundSum(6, 4, 4)   -> 10    # 10 + 0 + 0</li>
 * </ul>
 * </p>
 *
 * @param {number} a - First integer
 * @param {number} b - Second integer
 * @param {number} c - Third integer
 * @return {number} Sum of the three values after rounding each to nearest ten
 */
function roundSum(a, b, c) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     We'll say that a "triple" in a string is a char appearing three times in a row.
 *     Return the number of triples in the given string. Triples may overlap.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>countTriple("abcXXXabc") -> 1</li>
 *   <li>countTriple("xxxabyyyycd") -> 3</li>
 *   <li>countTriple("a") -> 0</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string to examine for triples
 * @return {number} The count of positions where a character appears three times in a row
 */
function countTriple(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q11</h3>
 * <p>
 * Description:
 *     A "pair" in a string is defined as two instances of the same character separated by exactly one character.
 *     This function recursively computes the number of such pairs in the given string.
 *     Overlapping pairs are counted.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>countPairs("axa") -> 1</li>
 *   <li>countPairs("axax") -> 2</li>
 *   <li>countPairs("axbx") -> 1</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {number} The number of pairs found in the string
 */
function countPairs(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q12</h3>
 * <p>
 * Description:
 *     Recursively counts the total number of "abc" and "aba" substrings
 *     that appear in the given string.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>countAbc("abc") -> 1</li>
 *   <li>countAbc("abcxxabc") -> 2</li>
 *   <li>countAbc("abaxxaba") -> 2</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {number} The count of occurrences of "abc" or "aba" substrings
 */
function countAbc(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q13</h3>
 * <p>
 * Description:
 *     Recursively counts the number of non-overlapping "11" substrings in the given string.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>count11("11abc11") -> 2</li>
 *   <li>count11("abc11x11x11") -> 3</li>
 *   <li>count11("111") -> 1</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {number} The count of non-overlapping "11" substrings
 */
function count11(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q14</h3>
 * <p>
 * Description:
 *     Recursively returns a "cleaned" string where adjacent duplicate characters
 *     have been reduced to a single character.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>stringClean("yyzzza") -> "yza"</li>
 *   <li>stringClean("abbbcdd") -> "abcd"</li>
 *   <li>stringClean("Hello") -> "Helo"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} The cleaned string without consecutive duplicate characters
 */
function stringClean(s) {
  // TODO: Implement your solution here
  return '';
}

module.exports = {
  gHappy,
  canBalance,
  no14,
  isEverywhere,
  repeatEnd,
  mixString,
  xyBalance,
  bobThere,
  roundSum,
  countTriple,
  countPairs,
  countAbc,
  count11,
  stringClean
};
