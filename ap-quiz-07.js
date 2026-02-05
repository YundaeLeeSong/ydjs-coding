/**
 * ap-quiz-07.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-07.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { sumDigits, linearIn } = require('./ap-quiz-07');
 *        console.log(sumDigits('aa1bc2d3')); // 6
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-07.test.js`
 *        (See ap-quiz-07.test.js for test setup instructions)
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 * Use ESM (`export` / `export default`) only when your project is intentionally configured
 * for modules (e.g. `package.json` has `"type": "module"` or you use a transpiler).
 */

'use strict';

/**
 * APQuiz07 contains various coding quiz problems for practice.
 *
 * This module includes functions for:
 * 1. sumDigits: Sum all digits 0-9 that appear in a string, ignoring other characters.
 * 2. linearIn: Check if all elements in an inner sorted list appear in an outer sorted list.
 * 3. either24: Check if a list contains a 2-2 pair or a 4-4 pair, but not both.
 * 4. matchUp: Count positions where two lists differ by at most 2 but are not equal.
 * 5. has77: Check if a list contains two 7's next to each other or separated by one element.
 * 6. has12: Check if a list contains a 1 followed by a 2 somewhere later.
 * 7. modThree: Check if a list contains three consecutive even or odd values.
 * 8. prefixAgain: Check if the first n characters of a string appear again later.
 * 9. xyzMiddle: Check if "xyz" appears in the middle of a string (left/right differ by at most 1).
 * 10. closeFar: Check if one of b or c is close to a while the other is far from both.
 * 11. countHi2: Recursively count occurrences of "hi" in a string, excluding "xhi".
 * 12. parenBit: Recursively extract the substring enclosed in parentheses.
 * 13. nestParen: Recursively check if a string is a valid nesting of parentheses.
 * 14. strCount: Recursively count non-overlapping occurrences of a substring.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     Given a string, return the sum of the digits 0-9 that appear in the string,
 *     ignoring all other characters. Return 0 if there are no digits.
 *     (Note: Character.isDigit() tests for '0'-'9'.)
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sumDigits("aa1bc2d3") -> 6   # 1 + 2 + 3</li>
 *   <li>sumDigits("aa11b33") -> 8   # 1 + 1 + 3 + 3</li>
 *   <li>sumDigits("123abc123") -> 12  # 1+2+3 + 1+2+3</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string potentially containing digits
 * @return {number} The sum of all digit characters found in the string
 */
function sumDigits(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     Given two lists of integers sorted in increasing order, `outer` and `inner`,
 *     return true if all of the numbers in `inner` appear in `outer`. The optimal
 *     solution makes a single linear pass through both lists, taking advantage
 *     of their sorted order.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>linearIn([1, 2, 4, 6], [2, 4]) -> true</li>
 *   <li>linearIn([1, 2, 4, 6], [2, 3, 4]) -> false</li>
 *   <li>linearIn([1, 2, 4, 4, 6], [2, 4]) -> true</li>
 * </ul>
 * </p>
 *
 * @param {number[]} outer - A sorted list of integers (the superset)
 * @param {number[]} inner - A sorted list of integers to check for membership in `outer`
 * @return {boolean} true if every element of `inner` appears in `outer`, false otherwise
 */
function linearIn(outer, inner) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if the list contains a 2 next to a 2
 *     or a 4 next to a 4, but not both.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>either24([1, 2, 2]) -> true</li>
 *   <li>either24([4, 4, 1]) -> true</li>
 *   <li>either24([4, 4, 1, 2, 2]) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to examine
 * @return {boolean} true if there's a 2-2 pair or a 4-4 pair (exclusively), false otherwise
 */
function either24(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     Given two lists of integers of the same length, for every element in `nums1`,
 *     consider the corresponding element in `nums2` at the same index. Count how many
 *     times the two elements differ by 2 or less, but are not equal.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>matchUp([1, 2, 3], [2, 3, 10]) -> 2   # pairs (1,2) and (2,3)</li>
 *   <li>matchUp([1, 2, 3], [2, 3, 5]) -> 3    # (1,2), (2,3), (3,5)</li>
 *   <li>matchUp([1, 2, 3], [2, 3, 3]) -> 2    # (1,2), (2,3)</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums1 - First list of integers
 * @param {number[]} nums2 - Second list of integers, same length as nums1
 * @return {number} The count of positions where the values differ by at most 2 but are not equal
 */
function matchUp(nums1, nums2) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if the list contains two 7's next to each other,
 *     or if there are two 7's separated by exactly one element (e.g. [7, x, 7]).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>has77([1, 7, 7]) -> true</li>
 *   <li>has77([1, 7, 1, 7]) -> true</li>
 *   <li>has77([1, 7, 1, 1, 7]) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @return {boolean} true if there is a '77' pair or a '7_x_7' pattern, false otherwise
 */
function has77(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if there is a 1 in the list with a 2 somewhere later in the list.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>has12([1, 3, 2]) -> true    # 1 appears at index 0, 2 appears later</li>
 *   <li>has12([3, 1, 2]) -> true    # 1 at index 1, 2 at index 2</li>
 *   <li>has12([3, 1, 4, 1, 6, 2]) -> true # the second 1 has a 2 after</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to check
 * @return {boolean} true if a 1 is found with a 2 somewhere after it, false otherwise
 */
function has12(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     Given a list of integers, return true if the list contains either
 *     three even values in a row or three odd values in a row.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>modThree([2, 1, 3, 5]) -> true    # 1,3,5 are three odds in a row</li>
 *   <li>modThree([2, 4, 2, 5]) -> true    # 2,4,2 are three evens in a row</li>
 *   <li>modThree([9, 9, 9]) -> true       # three odds</li>
 *   <li>modThree([2, 1, 2, 5]) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number[]} nums - The list of integers to examine
 * @return {boolean} true if there exists a run of three consecutive evens or three consecutive odds, false otherwise
 */
function modThree(nums) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     Consider the prefix string made of the first `n` characters of `s`.
 *     Return true if that prefix appears again somewhere else in `s`.
 *     You may assume `s` is non-empty and 1 <= n <= len(s).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>prefixAgain("abXYabc", 1) -> true   # prefix "a" appears later</li>
 *   <li>prefixAgain("abXYabc", 2) -> true   # prefix "ab" appears at index 4</li>
 *   <li>prefixAgain("Hi12345Hi6789Hi10", 3) -> true   # "Hi1"</li>
 *   <li>prefixAgain("Hi12345Hi6789Hi10", 4) -> false  # "Hi12" only at start</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @param {number} n - The length of the prefix to check
 * @return {boolean} true if the prefix of length `n` appears again in `s`, false otherwise
 */
function prefixAgain(s, n) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     Given a string, return true if "xyz" appears in the middle of the string.
 *     To be in the middle, the number of characters to the left and right of "xyz"
 *     must differ by at most one.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>xyzMiddle("AAxyzBB") -> true    # left="AA", right="BB" (2 vs 2)</li>
 *   <li>xyzMiddle("AxyzBB") -> true     # left="A", right="BB" (1 vs 2) diff=1</li>
 *   <li>xyzMiddle("AxyzBBB") -> false   # left="A", right="BBB" (1 vs 3) diff=2</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {boolean} true if "xyz" appears in the middle by the above definition, false otherwise
 */
function xyzMiddle(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     Given three integers a, b, c, return true if one of b or c is "close" to a
 *     (differing from a by at most 1), while the other is "far" from both of the others
 *     (differing by 2 or more from each).
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>closeFar(1, 2, 10) -> true   # b is close to a, c is far from both</li>
 *   <li>closeFar(8, 9, 10) -> false  # both b and c are close</li>
 *   <li>closeFar(8, 9, 7) -> false   # b is close but c is not far from b</li>
 *   <li>closeFar(8, 6, 9) -> true    # c close to a, b far from both</li>
 * </ul>
 * </p>
 *
 * @param {number} a - The reference integer
 * @param {number} b - The first integer to compare
 * @param {number} c - The second integer to compare
 * @return {boolean} true if exactly one of b or c is within 1 of a and the other differs by at least 2 from both, false otherwise
 */
function closeFar(a, b, c) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q11</h3>
 * <p>
 * Description:
 *     Recursively computes the number of times the lowercase "hi" appears in the string,
 *     but does not count "hi" if it is immediately preceded by an 'x'.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>countHi2("ahixhi") -> 1</li>
 *   <li>countHi2("ahibhi") -> 2</li>
 *   <li>countHi2("xhixhi") -> 0</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {number} The count of valid "hi" occurrences
 */
function countHi2(s) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q12</h3>
 * <p>
 * Description:
 *     Recursively extracts and returns the substring enclosed in parentheses
 *     from a given string containing exactly one pair of parentheses.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>parenBit("xyz(abc)123") -> "(abc)"</li>
 *   <li>parenBit("x(hello)") -> "(hello)"</li>
 *   <li>parenBit("(xy)1") -> "(xy)"</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {string} The substring enclosed within parentheses
 */
function parenBit(s) {
  // TODO: Implement your solution here
  return '';
}

/**
 * <h3>Q13</h3>
 * <p>
 * Description:
 *     Recursively checks if a string is a valid nesting of zero or more pairs
 *     of parentheses. A valid nesting consists only of matching '(' and ')' pairs.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>nestParen("(())") -> true</li>
 *   <li>nestParen("((()))") -> true</li>
 *   <li>nestParen("(((x))") -> false</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @return {boolean} true if the string is a valid nesting of parentheses, false otherwise
 */
function nestParen(s) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q14</h3>
 * <p>
 * Description:
 *     Recursively computes the number of times a non-empty substring 'sub' appears
 *     in the given string 's', without overlapping occurrences.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>strCount("catcowcat", "cat") -> 2</li>
 *   <li>strCount("catcowcat", "cow") -> 1</li>
 *   <li>strCount("catcowcat", "dog") -> 0</li>
 * </ul>
 * </p>
 *
 * @param {string} s - The input string
 * @param {string} sub - The substring to count
 * @return {number} The number of non-overlapping occurrences of 'sub' in 's'
 */
function strCount(s, sub) {
  // TODO: Implement your solution here
  return 0;
}

module.exports = {
  sumDigits,
  linearIn,
  either24,
  matchUp,
  has77,
  has12,
  modThree,
  prefixAgain,
  xyzMiddle,
  closeFar,
  countHi2,
  parenBit,
  nestParen,
  strCount
};
