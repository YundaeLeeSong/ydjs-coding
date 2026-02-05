/**
 * quizlet01.js
 *
 * Instructions to run the code:
 *     1. Open your terminal or command prompt.
 *     2. Run the code directly with Node.js:
 *        `node quizlet01.js`
 *        (Note: This file exports the functions. To use them, require in another file.)
 *
 *     3. Example usage in Node.js REPL or another file:
 *        const { isOdd, isDivisibleBy4 } = require('./quizlet01');
 *        console.log(isOdd(3));           // true
 *        console.log(isDivisibleBy4(8));  // true
 *
 *     4. To run tests (if you add a quizlet01.test.js):
 *        `npm test` or `npx jest quizlet01.test.js`
 *
 * Prefer CommonJS exports (`module.exports`) for broad compatibility with Node.js and Jest.
 */

'use strict';

/**
 * Quizlet01 contains short coding quiz problems (fill-in-the-condition style).
 *
 * This module includes:
 * 1. isOdd: Return true if a number is odd.
 * 2. isDivisibleBy4: Return true if a number is divisible by 4.
 */

/**
 * <h3>Q1</h3>
 * <p>
 * Code segment results in "true" being returned if a number is odd.
 * Fill in the condition so the function returns true when num is odd.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>isOdd(1) -> true</li>
 *   <li>isOdd(3) -> true</li>
 *   <li>isOdd(2) -> false</li>
 *   <li>isOdd(0) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} num - an integer
 * @return {boolean} true if num is odd, false otherwise
 */
function isOdd(num) {
  if (num % 2 !== 0) {
    return true;
  } else {
    return false;
  }
}

/**
 * <h3>Q2</h3>
 * <p>
 * Code segment results in "true" being returned if a number is divisible by 4.
 * Fill in the condition so the function returns true when num is divisible by 4.
 * </p>
 * <p>
 * Examples:
 * <ul>
 *   <li>isDivisibleBy4(4) -> true</li>
 *   <li>isDivisibleBy4(8) -> true</li>
 *   <li>isDivisibleBy4(2) -> false</li>
 *   <li>isDivisibleBy4(5) -> false</li>
 * </ul>
 * </p>
 *
 * @param {number} num - an integer
 * @return {boolean} true if num is divisible by 4, false otherwise
 */
function isDivisibleBy4(num) {
  if (num % 4 === 0) {
    return true;
  } else {
    return false;
  }
}





// #3

var numbers = [5, 3, 9, 4, 11];
function changeNums(numList, addNum, subtractNum) {
  for (var i = 0; i < numList.length; i++) {
    if (numList[i] % 2 == 0) {
      // If the number is even, add the addNum
      numList[i] = numList[i] + addNum;
    } else {
      // If the number is odd, subtract the subtractNum
      numList[i] = numList[i] - subtractNum;
    }
  }
}

// Execute the function with the given arguments
changeNums(numbers, 4, 3);

// Output the result
console.log(numbers);





// #4

var numbers = [2, 9, 4, 3, 7];

function changeNums(numList, addNum, subtractNum) {
  for (var i = 0; i < numList.length; i++) {
    // Check if the current number is even
    if (numList[i] % 2 == 0) {
      numList[i] = numList[i] + addNum;
    } else {
      // If the number is odd, subtract the subtractNum
      numList[i] = numList[i] - subtractNum;
    }
  }
}

// Call the function with the array and values 2 and 8
changeNums(numbers, 2, 8);

// Print the updated array to the console
console.log(numbers);




// #5

function findMax(num1, num2) {
  // Compare the first number to the second
  if (num1 > num2) {
    // If num1 is larger, return it
    return num1;
  } else {
    // Otherwise (if num2 is larger or they are equal), return num2
    return num2;
  }
}

// Example usage:
// var largest = findMax(10, 25);
// console.log(largest); // Outputs: 25




// 














module.exports = {
  isOdd,
  isDivisibleBy4
};
