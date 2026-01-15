/**
 * ap-quiz-00.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node ap-quiz-00.js`
 *        (Note: This file exports the function. To use it, require it in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { twoSum } = require('./ap-quiz-00');
 *        console.log(twoSum([2, 7, 11, 15], 9)); // [0, 1]
 *
 *     4. To run the tests, use Jest:
 *        `npm test` or `npx jest ap-quiz-00.test.js`
 *        (See ap-quiz-00.test.js for test setup instructions)
 * 
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 * Use ESM (`export` / `export default`) only when your project is intentionally configured
 * for modules (e.g. `package.json` has `"type": "module"` or you use a transpiler).
 */

'use strict';



/**
 * APQuiz00 contains various coding quiz problems for practice.
 * 
 * This module includes functions for:
 * 1. sleepIn: Determine if we sleep in based on weekday and vacation status.
 * 2. frontBack: Return a new string where the first and last chars have been exchanged.
 * 3. mixStart: Return true if the given string begins with pattern like 'mix' (any char + 'ix').
 * 4. monkeyTrouble: Return true if both monkeys are smiling or neither is smiling.
 * 5. front3: Return a new string which is 3 copies of the first 3 chars (or less if shorter).
 * 6. startOz: Return a string made of the first 2 chars where first is included only if 'o' and second only if 'z'.
 * 7. sumDouble: Return the sum of two ints, but double it if the two values are the same.
 * 8. backAround: Return a new string with the last char added at the front and back.
 * 9. intMax: Return the largest of three int values.
 * 10. diff21: Return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Description:
 *     The parameter weekday is true if it is a weekday, and the parameter 
 *     vacation is true if we are on vacation. We sleep in if it is not a 
 *     weekday or we're on vacation. Return true if we sleep in.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sleepIn(true, true) -> true</li>
 *   <li>sleepIn(true, false) -> false</li>
 *   <li>sleepIn(false, true) -> true</li>
 * </ul>
 * </p>
 *
 * @param {boolean} weekday - true if it is a weekday, false otherwise
 * @param {boolean} vacation - true if we are on vacation, false otherwise
 * @return {boolean} true if we sleep in (not a weekday or on vacation), false otherwise
 */
function sleepIn(weekday, vacation) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q2</h3>
 * <p>
 * Description:
 *     Given a string, return a new string where the first and last chars 
 *     have been exchanged.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>frontBack("code") -> "eodc"</li>
 *   <li>frontBack("a") -> "a"</li>
 *   <li>frontBack("ab") -> "ba"</li>
 * </ul>
 * </p>
 *
 * @param {string} str - a string of any length
 * @return {string} a new string with the first and last characters exchanged
 */
function frontBack(str) {
  // TODO: Implement your solution here
  return "";
}

/**
 * <h3>Q3</h3>
 * <p>
 * Description:
 *     Return true if the given string begins with "mix", except the 'm' can 
 *     be anything, so "pix", "9ix" .. all count. The string must have at 
 *     least 3 characters and match the pattern: any character + "ix".
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>mixStart("mix snacks") -> true</li>
 *   <li>mixStart("pix snacks") -> true</li>
 *   <li>mixStart("piz snacks") -> false</li>
 * </ul>
 * </p>
 *
 * @param {string} str - a string to check
 * @return {boolean} true if the string begins with pattern (any char + "ix"), false otherwise
 */
function mixStart(str) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q4</h3>
 * <p>
 * Description:
 *     We have two monkeys, a and b, and the parameters aSmile and bSmile 
 *     indicate if each is smiling. We are in trouble if they are both smiling 
 *     or if neither of them is smiling. Return true if we are in trouble.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>monkeyTrouble(true, true) -> true</li>
 *   <li>monkeyTrouble(false, false) -> true</li>
 *   <li>monkeyTrouble(true, false) -> false</li>
 * </ul>
 * </p>
 *
 * @param {boolean} aSmile - true if monkey a is smiling, false otherwise
 * @param {boolean} bSmile - true if monkey b is smiling, false otherwise
 * @return {boolean} true if we are in trouble (both smiling or neither smiling), false otherwise
 */
function monkeyTrouble(aSmile, bSmile) {
  // TODO: Implement your solution here
  return false;
}

/**
 * <h3>Q5</h3>
 * <p>
 * Description:
 *     Given a string, we'll say that the front is the first 3 chars of the string. 
 *     If the string length is less than 3, the front is whatever is there. 
 *     Return a new string which is 3 copies of the front.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>front3("Chocolate") -> "ChoChoCho"</li>
 *   <li>front3("a") -> "aaa"</li>
 *   <li>front3("") -> ""</li>
 * </ul>
 * </p>
 *
 * @param {string} str - a string of any length
 * @return {string} a new string which is 3 copies of the front (first 3 chars, or less if string is shorter)
 */
function front3(str) {
  // TODO: Implement your solution here
  return "";
}

/**
 * <h3>Q6</h3>
 * <p>
 * Description:
 *     Given a string, return a string made of the first 2 chars (if present), 
 *     however include first char only if it is 'o' and include the second only 
 *     if it is 'z', so "ozymandias" yields "oz".
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>startOz("ozymandias") -> "oz"</li>
 *   <li>startOz("bzoo") -> "z"</li>
 *   <li>startOz("oxx") -> "o"</li>
 * </ul>
 * </p>
 *
 * @param {string} str - a string of any length
 * @return {string} a string made of 'o' (if first char is 'o') and/or 'z' (if second char is 'z')
 */
function startOz(str) {
  // TODO: Implement your solution here
  return "";
}

/**
 * <h3>Q7</h3>
 * <p>
 * Description:
 *     Given two int values, return their sum. Unless the two values are the same, 
 *     then return double their sum.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>sumDouble(1, 2) -> 3</li>
 *   <li>sumDouble(3, 2) -> 5</li>
 *   <li>sumDouble(-1, 0) -> -1</li>
 * </ul>
 * </p>
 *
 * @param {number} a - first integer value
 * @param {number} b - second integer value
 * @return {number} the sum of a and b, or double the sum if a == b
 */
function sumDouble(a, b) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q8</h3>
 * <p>
 * Description:
 *     Given a string, take the last char and return a new string with the last char 
 *     added at the front and back, so "cat" yields "tcatt". The original string 
 *     will be length 1 or more.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>backAround("cat") -> "tcatt"</li>
 *   <li>backAround("Hello") -> "oHelloo"</li>
 *   <li>backAround("a") -> "aaa"</li>
 * </ul>
 * </p>
 *
 * @param {string} str - a string of length 1 or more
 * @return {string} a new string with the last char added at the front and back
 */
function backAround(str) {
  // TODO: Implement your solution here
  return "";
}

/**
 * <h3>Q9</h3>
 * <p>
 * Description:
 *     Given three int values, a b c, return the largest.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>intMax(1, 2, 3) -> 3</li>
 *   <li>intMax(3, 9, 3) -> 9</li>
 *   <li>intMax(-3, -1, -2) -> -1</li>
 * </ul>
 * </p>
 *
 * @param {number} a - first integer value
 * @param {number} b - second integer value
 * @param {number} c - third integer value
 * @return {number} the largest of the three integers
 */
function intMax(a, b, c) {
  // TODO: Implement your solution here
  return 0;
}

/**
 * <h3>Q10</h3>
 * <p>
 * Description:
 *     Given an int n, return the absolute difference between n and 21, 
 *     except return double the absolute difference if n is over 21.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>diff21(19) -> 2</li>
 *   <li>diff21(10) -> 11</li>
 *   <li>diff21(21) -> 0</li>
 *   <li>diff21(22) -> 2</li>
 *   <li>diff21(25) -> 8</li>
 * </ul>
 * </p>
 *
 * @param {number} n - an integer value
 * @return {number} the absolute difference between n and 21, or double the absolute difference if n > 21
 */
function diff21(n) {
  // TODO: Implement your solution here
  return 0;
}

module.exports = {
  sleepIn,
  frontBack,
  mixStart,
  monkeyTrouble,
  front3,
  startOz,
  sumDouble,
  backAround,
  intMax,
  diff21
};