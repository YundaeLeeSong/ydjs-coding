/**
 * ap-quiz-00.js
 *
 * Problem: Two Sum
 * Given an array of integers `nums` and an integer `target`,
 * return indices of the two numbers such that they add up to target.
 * If there is no solution, return null.
 *
 * Complexity: O(n) time, O(n) extra space (hash map)
 *
 * Exports: twoSum(nums, target)
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
 */

'use strict';

/**
 * Find two indices i, j (i < j) such that nums[i] + nums[j] === target.
 * If multiple solutions exist, returns the first found pair.
 * @param {number[]} nums
 * @param {number} target
 * @returns {number[] | null} Array [i, j] or null if no pair found.
 */
function twoSum(nums, target) {
  if (!Array.isArray(nums)) throw new TypeError('nums must be an array');
  const seen = new Map(); // value -> index

  for (let i = 0; i < nums.length; i++) {
    const need = target - nums[i];
    if (seen.has(need)) {
      return [seen.get(need), i];
    }
    // store current value -> index (keep earliest index to match typical expectations)
    if (!seen.has(nums[i])) seen.set(nums[i], i);
  }
  return null;
}

module.exports = { twoSum };
