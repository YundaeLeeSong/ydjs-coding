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
