/**
 * ap-quiz-01.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-01.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-01.js module.
 *
 * DEPENDENCIES:
 *     This test file requires Jest testing framework.
 *     Install dependencies:
 *         npm init -y
 *         npm install --save-dev jest
 *
 * COMPILE & EXECUTE:
 *
 *     Run all tests:
 *         npm test
 *         OR
 *         npx jest ap-quiz-01.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-01')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  scoresIncreasing,
  scores100,
  scoresClump,
  scoresAverage,
  wordsCount,
  wordsFront,
  wordsWithoutList,
  hasOne,
  dividesSelf,
  copyEvens,
  factorial,
  bunnyEars,
  fibonacci,
  bunnyEars2
} = require('./ap-quiz-01');

describe('APQuiz01', () => {

  // Q1
  test('scoresIncreasing', () => {
    expect(scoresIncreasing([1, 3, 4])).toBe(true);
    expect(scoresIncreasing([1, 3, 2])).toBe(false);
    expect(scoresIncreasing([1, 1, 4])).toBe(true);
    expect(scoresIncreasing([1, 1, 2, 4, 4, 7])).toBe(true);
    expect(scoresIncreasing([1, 1, 2, 4, 3, 7])).toBe(false);
    expect(scoresIncreasing([-5, 4, 11])).toBe(true);
  });

  // Q2
  test('scores100', () => {
    expect(scores100([1, 100, 100])).toBe(true);
    expect(scores100([1, 100, 99, 100])).toBe(false);
    expect(scores100([100, 1, 100, 100])).toBe(true);
    expect(scores100([100, 1, 100, 1])).toBe(false);
    expect(scores100([1, 2, 3, 4, 5])).toBe(false);
    expect(scores100([1, 2, 100, 4, 5])).toBe(false);
  });

  // Q3
  test('scoresClump', () => {
    expect(scoresClump([3, 4, 5])).toBe(true);
    expect(scoresClump([3, 4, 6])).toBe(false);
    expect(scoresClump([1, 3, 5, 5])).toBe(true);
    expect(scoresClump([2, 4, 5, 6])).toBe(true);
    expect(scoresClump([2, 4, 5, 7])).toBe(false);
    expect(scoresClump([2, 4, 4, 7])).toBe(true);
    expect(scoresClump([3, 3, 6, 7, 9])).toBe(false);
    expect(scoresClump([3, 3, 7, 7, 9])).toBe(true);
    expect(scoresClump([4, 5, 8])).toBe(false);
  });

  // Q4
  test('scoresAverage', () => {
    expect(scoresAverage([2, 2, 4, 4])).toBe(4);
    expect(scoresAverage([4, 4, 4, 2, 2, 2])).toBe(4);
    expect(scoresAverage([3, 4, 5, 1, 2, 3])).toBe(4);
    expect(scoresAverage([5, 6])).toBe(6);
    expect(scoresAverage([5, 4])).toBe(5);
    expect(scoresAverage([5, 4, 5, 6, 2, 1, 2, 3])).toBe(5);
  });

  // Q5
  test('wordsCount', () => {
    expect(wordsCount(['a', 'bb', 'b', 'ccc'], 1)).toBe(2);
    expect(wordsCount(['a', 'bb', 'b', 'ccc'], 3)).toBe(1);
    expect(wordsCount(['a', 'bb', 'b', 'ccc'], 4)).toBe(0);
    expect(wordsCount(['xx', 'yyy', 'x', 'yy', 'z'], 1)).toBe(2);
    expect(wordsCount(['xx', 'yyy', 'x', 'yy', 'z'], 2)).toBe(2);
    expect(wordsCount(['xx', 'yyy', 'x', 'yy', 'z'], 3)).toBe(1);
  });

  // Q6
  test('wordsFront', () => {
    expect(wordsFront(['a', 'b', 'c', 'd'], 1)).toEqual(['a']);
    expect(wordsFront(['a', 'b', 'c', 'd'], 2)).toEqual(['a', 'b']);
    expect(wordsFront(['a', 'b', 'c', 'd'], 3)).toEqual(['a', 'b', 'c']);
    expect(wordsFront(['a', 'b', 'c', 'd'], 4)).toEqual(['a', 'b', 'c', 'd']);
    expect(wordsFront(['Hi', 'There'], 1)).toEqual(['Hi']);
    expect(wordsFront(['Hi', 'There'], 2)).toEqual(['Hi', 'There']);
  });

  // Q7
  test('wordsWithoutList', () => {
    expect(wordsWithoutList(['a', 'bb', 'b', 'ccc'], 1)).toEqual(['bb', 'ccc']);
    expect(wordsWithoutList(['a', 'bb', 'b', 'ccc'], 3)).toEqual(['a', 'bb', 'b']);
    expect(wordsWithoutList(['a', 'bb', 'b', 'ccc'], 4)).toEqual(['a', 'bb', 'b', 'ccc']);
    expect(wordsWithoutList(['xx', 'yyy', 'x', 'yy', 'z'], 1)).toEqual(['xx', 'yyy', 'yy']);
    expect(wordsWithoutList(['xx', 'yyy', 'x', 'yy', 'z'], 2)).toEqual(['yyy', 'x', 'z']);
  });

  // Q8
  test('hasOne', () => {
    expect(hasOne(10)).toBe(true);
    expect(hasOne(22)).toBe(false);
    expect(hasOne(220)).toBe(false);
    expect(hasOne(212)).toBe(true);
    expect(hasOne(1)).toBe(true);
    expect(hasOne(9)).toBe(false);
    expect(hasOne(211112)).toBe(true);
    expect(hasOne(121121)).toBe(true);
    expect(hasOne(222222)).toBe(false);
    expect(hasOne(56156)).toBe(true);
    expect(hasOne(56556)).toBe(false);
  });

  // Q9
  test('dividesSelf', () => {
    expect(dividesSelf(128)).toBe(true);
    expect(dividesSelf(12)).toBe(true);
    expect(dividesSelf(120)).toBe(false);
    expect(dividesSelf(122)).toBe(true);
    expect(dividesSelf(13)).toBe(false);
    expect(dividesSelf(32)).toBe(false);
    expect(dividesSelf(22)).toBe(true);
    expect(dividesSelf(42)).toBe(false);
    expect(dividesSelf(212)).toBe(true);
    expect(dividesSelf(213)).toBe(false);
    expect(dividesSelf(162)).toBe(true);
  });

  // Q10
  test('copyEvens', () => {
    expect(copyEvens([3, 2, 4, 5, 8], 2)).toEqual([2, 4]);
    expect(copyEvens([3, 2, 4, 5, 8], 3)).toEqual([2, 4, 8]);
    expect(copyEvens([6, 1, 2, 4, 5, 8], 3)).toEqual([6, 2, 4]);
    expect(copyEvens([6, 1, 2, 4, 5, 8], 4)).toEqual([6, 2, 4, 8]);
    expect(copyEvens([3, 1, 4, 1, 5], 1)).toEqual([4]);
    expect(copyEvens([2], 1)).toEqual([2]);
    expect(copyEvens([6, 2, 4, 8], 2)).toEqual([6, 2]);
    expect(copyEvens([6, 2, 4, 8], 3)).toEqual([6, 2, 4]);
    expect(copyEvens([6, 2, 4, 8], 4)).toEqual([6, 2, 4, 8]);
    expect(copyEvens([1, 8, 4], 1)).toEqual([8]);
    expect(copyEvens([1, 8, 4], 2)).toEqual([8, 4]);
    expect(copyEvens([2, 8, 4], 2)).toEqual([2, 8]);
  });

  // Q11
  test('factorial', () => {
    expect(factorial(1)).toBe(1);
    expect(factorial(2)).toBe(2);
    expect(factorial(3)).toBe(6);
    expect(factorial(4)).toBe(24);
    expect(factorial(5)).toBe(120);
    expect(factorial(6)).toBe(720);
    expect(factorial(7)).toBe(5040);
    expect(factorial(8)).toBe(40320);
    expect(factorial(12)).toBe(479001600);
  });

  // Q12
  test('bunnyEars', () => {
    expect(bunnyEars(0)).toBe(0);
    expect(bunnyEars(1)).toBe(2);
    expect(bunnyEars(2)).toBe(4);
    expect(bunnyEars(3)).toBe(6);
    expect(bunnyEars(4)).toBe(8);
    expect(bunnyEars(5)).toBe(10);
    expect(bunnyEars(12)).toBe(24);
    expect(bunnyEars(50)).toBe(100);
    expect(bunnyEars(234)).toBe(468);
  });

  // Q13
  test('fibonacci', () => {
    expect(fibonacci(0)).toBe(0);
    expect(fibonacci(1)).toBe(1);
    expect(fibonacci(2)).toBe(1);
    expect(fibonacci(3)).toBe(2);
    expect(fibonacci(4)).toBe(3);
    expect(fibonacci(5)).toBe(5);
    expect(fibonacci(6)).toBe(8);
    expect(fibonacci(7)).toBe(13);
  });

  // Q14
  test('bunnyEars2', () => {
    expect(bunnyEars2(0)).toBe(0);
    expect(bunnyEars2(1)).toBe(2);
    expect(bunnyEars2(2)).toBe(5);
    expect(bunnyEars2(3)).toBe(7);
    expect(bunnyEars2(4)).toBe(10);
    expect(bunnyEars2(5)).toBe(12);
    expect(bunnyEars2(6)).toBe(15);
    expect(bunnyEars2(10)).toBe(25);
  });

});
