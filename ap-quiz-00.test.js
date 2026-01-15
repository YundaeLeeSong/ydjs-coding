/**
 * ap-quiz-00.test.js
 *
 * JUnit-style tests for the twoSum function in ap-quiz-00.js
 *
 * INSTRUCTIONS:
 *     The ap-quiz-00.test.js file provides Jest tests for the twoSum
 *     method in the ap-quiz-00.js module.
 *
 * DEPENDENCIES:
 *     This test file requires Jest testing framework.
 *     Install dependencies:
 *         npm init -y
 *         npm install --save-dev jest
 *
 * COMPILE & EXECUTE & CLEANUP:
 *
 *     Run all tests:
 *         npm test
 *         OR
 *         npx jest ap-quiz-00.test.js
 *
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-00')
 *     - If the file is in a src directory, use: require('../src/ap-quiz-00')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */

const { twoSum } = require('./ap-quiz-00');

test('basic example', () => {
  expect(twoSum([2, 7, 11, 15], 9)).toEqual([0, 1]);
});

test('duplicates and negative numbers', () => {
  expect(twoSum([3, 2, 4], 6)).toEqual([1, 2]); // 2 + 4 = 6
  expect(twoSum([-3, 4, 3, 90], 0)).toEqual([0, 2]); // -3 + 3 = 0
});

test('no solution returns null', () => {
  expect(twoSum([1, 2, 3], 7)).toBeNull();
});

test('single element returns null', () => {
  expect(twoSum([5], 5)).toBeNull();
});

test('throws for invalid input', () => {
  expect(() => twoSum(null, 5)).toThrow();
});
