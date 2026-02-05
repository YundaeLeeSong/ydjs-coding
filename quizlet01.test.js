/**
 * quizlet01.test.js
 *
 * JUnit-style tests for the functions in quizlet01.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for isOdd and isDivisibleBy4
 *     in the quizlet01.js module.
 *
 * DEPENDENCIES:
 *     This test file requires Jest.
 *     Install:
 *         npm init -y
 *         npm install --save-dev jest
 *
 * COMPILE & EXECUTE:
 *
 *     Run all tests:
 *         npm test
 *         OR
 *         npx jest quizlet01.test.js
 *
 *     Verbose:
 *         npx jest quizlet01.test.js --verbose
 *
 * TIP:
 *     - Same directory: require('./quizlet01')
 *     - Jest picks up files ending in .test.js or .spec.js
 */
const { isOdd, isDivisibleBy4 } = require('./quizlet01');

describe('Quizlet01', () => {

  // Q1: isOdd — return true if a number is odd
  test('isOdd', () => {
    expect(isOdd(1)).toBe(true);
    expect(isOdd(3)).toBe(true);
    expect(isOdd(2)).toBe(false);
    expect(isOdd(0)).toBe(false);
    expect(isOdd(-1)).toBe(true);
    expect(isOdd(-2)).toBe(false);
  });

  // Q2: isDivisibleBy4 — return true if a number is divisible by 4
  test('isDivisibleBy4', () => {
    expect(isDivisibleBy4(4)).toBe(true);
    expect(isDivisibleBy4(8)).toBe(true);
    expect(isDivisibleBy4(2)).toBe(false);
    expect(isDivisibleBy4(5)).toBe(false);
    expect(isDivisibleBy4(0)).toBe(true);
    expect(isDivisibleBy4(12)).toBe(true);
    expect(isDivisibleBy4(7)).toBe(false);
  });

});
