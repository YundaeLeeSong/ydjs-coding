/**
 * ap-quiz-10.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-10.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-10.js module.
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
 *         npx jest ap-quiz-10.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-10')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  evenlySpaced,
  makeChocolate,
  sumNumbers,
  maxMirror,
  starOut,
  notReplace,
  countClumps,
  evenOdd,
  fizzBuzz,
  longestConsecutive,
  splitOdd10,
  split53,
  power,
  fibonacci,
  climbStairs,
  quickSort,
  mergeSort,
  merge
} = require('./ap-quiz-10');

describe('APQuiz10', () => {
  test('evenlySpaced', () => {
    expect(evenlySpaced(2, 4, 6)).toBe(true);
    expect(evenlySpaced(4, 6, 2)).toBe(true);
    expect(evenlySpaced(4, 6, 3)).toBe(false);
    expect(evenlySpaced(6, 2, 4)).toBe(true);
    expect(evenlySpaced(6, 2, 8)).toBe(false);
    expect(evenlySpaced(2, 2, 2)).toBe(true);
    expect(evenlySpaced(2, 2, 3)).toBe(false);
    expect(evenlySpaced(9, 10, 11)).toBe(true);
    expect(evenlySpaced(10, 9, 11)).toBe(true);
    expect(evenlySpaced(10, 9, 9)).toBe(false);
    expect(evenlySpaced(2, 4, 4)).toBe(false);
    expect(evenlySpaced(2, 2, 4)).toBe(false);
    expect(evenlySpaced(3, 6, 12)).toBe(false);
    expect(evenlySpaced(12, 3, 6)).toBe(false);
  });

  test('makeChocolate', () => {
    expect(makeChocolate(4, 1, 9)).toBe(4);
    expect(makeChocolate(4, 1, 10)).toBe(-1);
    expect(makeChocolate(4, 1, 7)).toBe(2);
    expect(makeChocolate(6, 2, 7)).toBe(2);
    expect(makeChocolate(4, 1, 5)).toBe(0);
    expect(makeChocolate(4, 1, 4)).toBe(4);
    expect(makeChocolate(5, 4, 9)).toBe(4);
    expect(makeChocolate(9, 3, 18)).toBe(3);
    expect(makeChocolate(3, 1, 9)).toBe(-1);
    expect(makeChocolate(1, 2, 7)).toBe(-1);
    expect(makeChocolate(1, 2, 6)).toBe(1);
    expect(makeChocolate(1, 2, 5)).toBe(0);
    expect(makeChocolate(6, 1, 10)).toBe(5);
    expect(makeChocolate(6, 1, 11)).toBe(6);
    expect(makeChocolate(6, 1, 12)).toBe(-1);
    expect(makeChocolate(6, 1, 13)).toBe(-1);
    expect(makeChocolate(6, 2, 10)).toBe(0);
    expect(makeChocolate(6, 2, 11)).toBe(1);
    expect(makeChocolate(6, 2, 12)).toBe(2);
    expect(makeChocolate(60, 100, 550)).toBe(50);
    expect(makeChocolate(1000, 1000000, 5000006)).toBe(6);
    expect(makeChocolate(7, 1, 12)).toBe(7);
    expect(makeChocolate(7, 1, 13)).toBe(-1);
    expect(makeChocolate(7, 2, 13)).toBe(3);
  });

  test('sumNumbers', () => {
    expect(sumNumbers('abc123xyz')).toBe(123);
    expect(sumNumbers('aa11b33')).toBe(44);
    expect(sumNumbers('7 11')).toBe(18);
    expect(sumNumbers('Chocolate')).toBe(0);
    expect(sumNumbers('5hoco1a1e')).toBe(7);
    expect(sumNumbers('5$1; ;1!!')).toBe(7);
    expect(sumNumbers('a1234bb11')).toBe(1245);
    expect(sumNumbers('')).toBe(0);
    expect(sumNumbers('a22bbb3')).toBe(25);
  });

  test('maxMirror', () => {
    expect(maxMirror([1, 2, 3, 8, 9, 3, 2, 1])).toBe(3);
    expect(maxMirror([1, 2, 1, 4])).toBe(3);
    expect(maxMirror([7, 1, 2, 9, 7, 2, 1])).toBe(2);
    expect(maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9])).toBe(4);
    expect(maxMirror([1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25])).toBe(4);
    expect(maxMirror([1, 2, 3, 2, 1])).toBe(5);
    expect(maxMirror([1, 2, 3, 3, 8])).toBe(2);
    expect(maxMirror([1, 2, 7, 8, 1, 7, 2])).toBe(2);
    expect(maxMirror([1, 1, 1])).toBe(3);
    expect(maxMirror([1])).toBe(1);
    expect(maxMirror([])).toBe(0);
    expect(maxMirror([9, 1, 1, 4, 2, 1, 1, 1])).toBe(3);
    expect(maxMirror([5, 9, 9, 4, 5, 4, 9, 9, 2])).toBe(7);
    expect(maxMirror([5, 9, 9, 6, 5, 4, 9, 9, 2])).toBe(2);
    expect(maxMirror([5, 9, 1, 6, 5, 4, 1, 9, 5])).toBe(3);
  });

  test('starOut', () => {
    expect(starOut('ab*cd')).toBe('ad');
    expect(starOut('ab**cd')).toBe('ad');
    expect(starOut('sm*eilly')).toBe('silly');
    expect(starOut('sm*eil*ly')).toBe('siy');
    expect(starOut('sm**eil*ly')).toBe('siy');
    expect(starOut('sm***eil*ly')).toBe('siy');
    expect(starOut('stringy*')).toBe('string');
    expect(starOut('*stringy')).toBe('tringy');
    expect(starOut('*str*in*gy')).toBe('ty');
    expect(starOut('abc')).toBe('abc');
    expect(starOut('a*bc')).toBe('c');
    expect(starOut('ab')).toBe('ab');
    expect(starOut('a*b')).toBe('');
    expect(starOut('a')).toBe('a');
    expect(starOut('a*')).toBe('');
    expect(starOut('*a')).toBe('');
    expect(starOut('*')).toBe('');
    expect(starOut('')).toBe('');
  });

  test('notReplace', () => {
    expect(notReplace('is test')).toBe('is not test');
    expect(notReplace('is-is')).toBe('is not-is not');
    expect(notReplace('This is right')).toBe('This is not right');
    expect(notReplace('This is isabell')).toBe('This is not isabell');
    expect(notReplace('')).toBe('');
    expect(notReplace('is')).toBe('is not');
    expect(notReplace('isis')).toBe('isis');
    expect(notReplace('Dis is bliss is')).toBe('Dis is not bliss is not');
    expect(notReplace('is his')).toBe('is not his');
    expect(notReplace('xis yis')).toBe('xis yis');
    expect(notReplace('AAAis is')).toBe('AAAis is not');
  });

  test('countClumps', () => {
    expect(countClumps([1, 2, 2, 3, 4, 4])).toBe(2);
    expect(countClumps([1, 1, 2, 1, 1])).toBe(2);
    expect(countClumps([1, 1, 1, 1, 1])).toBe(1);
    expect(countClumps([1, 2, 3])).toBe(0);
    expect(countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2])).toBe(4);
    expect(countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2])).toBe(4);
    expect(countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2])).toBe(5);
    expect(countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2])).toBe(5);
    expect(countClumps([])).toBe(0);
  });

  test('evenOdd', () => {
    expect(evenOdd([1, 0, 1, 0, 0, 1, 1])).toEqual([0, 0, 0, 1, 1, 1, 1]);
    expect(evenOdd([3, 3, 2])).toEqual([2, 3, 3]);
    expect(evenOdd([2, 2, 2])).toEqual([2, 2, 2]);
    expect(evenOdd([3, 2, 2])).toEqual([2, 2, 3]);
    expect(evenOdd([1, 1, 0, 1, 0])).toEqual([0, 0, 1, 1, 1]);
    expect(evenOdd([1])).toEqual([1]);
    expect(evenOdd([1, 2])).toEqual([2, 1]);
    expect(evenOdd([2, 1])).toEqual([2, 1]);
    expect(evenOdd([])).toEqual([]);
  });

  test('fizzBuzz', () => {
    expect(fizzBuzz(1, 6)).toEqual(['1', '2', 'Fizz', '4', 'Buzz']);
    expect(fizzBuzz(1, 8)).toEqual(['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7']);
    expect(fizzBuzz(1, 11)).toEqual(['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7', '8', 'Fizz', 'Buzz']);
    expect(fizzBuzz(1, 16)).toEqual(['1', '2', 'Fizz', '4', 'Buzz', 'Fizz', '7', '8', 'Fizz', 'Buzz', '11', 'Fizz', '13', '14', 'FizzBuzz']);
    expect(fizzBuzz(1, 4)).toEqual(['1', '2', 'Fizz']);
    expect(fizzBuzz(1, 2)).toEqual(['1']);
    expect(fizzBuzz(50, 56)).toEqual(['Buzz', 'Fizz', '52', '53', 'Fizz', 'Buzz']);
    expect(fizzBuzz(15, 17)).toEqual(['FizzBuzz', '16']);
    expect(fizzBuzz(30, 36)).toEqual(['FizzBuzz', '31', '32', 'Fizz', '34', 'Buzz']);
    expect(fizzBuzz(1000, 1006)).toEqual(['Buzz', '1001', 'Fizz', '1003', '1004', 'FizzBuzz']);
    expect(fizzBuzz(99, 102)).toEqual(['Fizz', 'Buzz', '101']);
    expect(fizzBuzz(14, 20)).toEqual(['14', 'FizzBuzz', '16', '17', 'Fizz', '19']);
  });

  test('longestConsecutive', () => {
    expect(longestConsecutive([])).toBe(0);
    expect(longestConsecutive([42])).toBe(1);
    expect(longestConsecutive([1, 2, 3, 4])).toBe(4);
    expect(longestConsecutive([100, 4, 200, 1, 3, 2])).toBe(4);
    expect(longestConsecutive([0, -1, 1, 2, -2, 5])).toBe(5);
    expect(longestConsecutive([1, 1, 2, 2, 3, 3])).toBe(3);
    expect(longestConsecutive([10, 5, 6, 7, 100])).toBe(3);
  });

  test('splitOdd10', () => {
    expect(splitOdd10([5, 5, 5])).toBe(true);
    expect(splitOdd10([5, 5, 6])).toBe(false);
    expect(splitOdd10([5, 5, 6, 1])).toBe(true);
    expect(splitOdd10([6, 5, 5, 1])).toBe(true);
    expect(splitOdd10([6, 5, 5, 1, 10])).toBe(true);
    expect(splitOdd10([6, 5, 5, 5, 1])).toBe(false);
    expect(splitOdd10([1])).toBe(true);
    expect(splitOdd10([])).toBe(false);
    expect(splitOdd10([10, 7, 5, 5])).toBe(true);
    expect(splitOdd10([10, 0, 5, 5])).toBe(false);
    expect(splitOdd10([10, 7, 5, 5, 2])).toBe(true);
    expect(splitOdd10([10, 7, 5, 5, 1])).toBe(false);
  });

  test('split53', () => {
    expect(split53([1, 1])).toBe(true);
    expect(split53([1, 1, 1])).toBe(false);
    expect(split53([2, 4, 2])).toBe(true);
    expect(split53([2, 2, 2, 1])).toBe(false);
    expect(split53([3, 3, 5, 1])).toBe(true);
    expect(split53([3, 5, 8])).toBe(false);
    expect(split53([2, 4, 6])).toBe(true);
    expect(split53([3, 5, 6, 10, 3, 3])).toBe(true);
  });

  test('power', () => {
    expect(power(2, 0)).toBe(1);
    expect(power(5, 0)).toBe(1);
    expect(power(100, 0)).toBe(1);
    expect(power(2, 1)).toBe(2);
    expect(power(7, 1)).toBe(7);
    expect(power(42, 1)).toBe(42);
    expect(power(2, 2)).toBe(4);
    expect(power(2, 3)).toBe(8);
    expect(power(2, 4)).toBe(16);
    expect(power(3, 2)).toBe(9);
    expect(power(3, 3)).toBe(27);
    expect(power(5, 3)).toBe(125);
    expect(power(2, 8)).toBe(256);
    expect(power(2, 10)).toBe(1024);
    expect(power(3, 4)).toBe(81);
    expect(power(5, 6)).toBe(15625);
    expect(power(2, 7)).toBe(128);
    expect(power(2, 9)).toBe(512);
    expect(power(3, 5)).toBe(243);
    expect(power(5, 7)).toBe(78125);
    expect(power(2, 16)).toBe(65536);
    expect(power(2, 20)).toBe(1048576);
    expect(power(3, 10)).toBe(59049);
    expect(power(10, 6)).toBe(1000000);
    expect(power(0, 0)).toBe(1);
    expect(power(0, 1)).toBe(0);
    expect(power(0, 5)).toBe(0);
    expect(power(1, 0)).toBe(1);
    expect(power(1, 100)).toBe(1);
    expect(power(-1, 0)).toBe(1);
    expect(power(-1, 1)).toBe(-1);
    expect(power(-1, 2)).toBe(1);
    expect(power(-1, 3)).toBe(-1);
    expect(power(-2, 2)).toBe(4);
    expect(power(-2, 3)).toBe(-8);
    expect(power(-3, 4)).toBe(81);
    expect(power(-3, 5)).toBe(-243);
  });

  test('fibonacci', () => {
    expect(fibonacci(0)).toBe(0);
    expect(fibonacci(1)).toBe(1);
    expect(fibonacci(2)).toBe(1);
    expect(fibonacci(3)).toBe(2);
    expect(fibonacci(4)).toBe(3);
    expect(fibonacci(5)).toBe(5);
    expect(fibonacci(6)).toBe(8);
    expect(fibonacci(7)).toBe(13);
    expect(fibonacci(10)).toBe(55);
    expect(fibonacci(15)).toBe(610);
  });

  test('climbStairs', () => {
    expect(climbStairs(1)).toBe(1);
    expect(climbStairs(2)).toBe(2);
    expect(climbStairs(3)).toBe(3);
    expect(climbStairs(4)).toBe(5);
    expect(climbStairs(5)).toBe(8);
    expect(climbStairs(6)).toBe(13);
    expect(climbStairs(7)).toBe(21);
    expect(climbStairs(8)).toBe(34);
    expect(climbStairs(10)).toBe(89);
    expect(climbStairs(0)).toBe(0);
    expect(climbStairs(20)).toBe(10946);
  });

  test('quickSort', () => {
    expect(quickSort([3, 6, 8, 10, 1, 2, 1])).toEqual([1, 1, 2, 3, 6, 8, 10]);
    expect(quickSort([38, 27, 43, 3, 9, 82, 10])).toEqual([3, 9, 10, 27, 38, 43, 82]);
    expect(quickSort([5, 2, 8, 1, 9])).toEqual([1, 2, 5, 8, 9]);
    expect(quickSort([])).toEqual([]);
    expect(quickSort([1])).toEqual([1]);
    expect(quickSort([5, 5, 5, 5])).toEqual([5, 5, 5, 5]);
    expect(quickSort([1, 2, 3, 4, 5])).toEqual([1, 2, 3, 4, 5]);
    expect(quickSort([1, 2, 3])).toEqual([1, 2, 3]);
    expect(quickSort([5, 4, 3, 2, 1])).toEqual([1, 2, 3, 4, 5]);
    expect(quickSort([10, 9, 8, 7])).toEqual([7, 8, 9, 10]);
    expect(quickSort([-3, -1, -2, 0, 1])).toEqual([-3, -2, -1, 0, 1]);
    expect(quickSort([5, -3, 2, -1, 0])).toEqual([-3, -1, 0, 2, 5]);
  });

  test('mergeSort', () => {
    expect(mergeSort([38, 27, 43, 3, 9, 82, 10])).toEqual([3, 9, 10, 27, 38, 43, 82]);
    expect(mergeSort([3, 6, 8, 10, 1, 2, 1])).toEqual([1, 1, 2, 3, 6, 8, 10]);
    expect(mergeSort([5, 2, 8, 1, 9])).toEqual([1, 2, 5, 8, 9]);
    expect(mergeSort([])).toEqual([]);
    expect(mergeSort([1])).toEqual([1]);
    expect(mergeSort([5, 5, 5, 5])).toEqual([5, 5, 5, 5]);
    expect(mergeSort([1, 2, 3, 4, 5])).toEqual([1, 2, 3, 4, 5]);
    expect(mergeSort([1, 2, 3])).toEqual([1, 2, 3]);
    expect(mergeSort([5, 4, 3, 2, 1])).toEqual([1, 2, 3, 4, 5]);
    expect(mergeSort([10, 9, 8, 7])).toEqual([7, 8, 9, 10]);
    expect(mergeSort([-3, -1, -2, 0, 1])).toEqual([-3, -2, -1, 0, 1]);
    expect(mergeSort([5, -3, 2, -1, 0])).toEqual([-3, -1, 0, 2, 5]);
    const arr100 = Array.from({ length: 100 }, (_, i) => 100 - i);
    const expected100 = Array.from({ length: 100 }, (_, i) => i + 1);
    expect(mergeSort(arr100)).toEqual(expected100);
  });

  test('merge', () => {
    expect(merge([1, 3, 5], [2, 4, 6])).toEqual([1, 2, 3, 4, 5, 6]);
    expect(merge([2, 4], [1, 3, 5])).toEqual([1, 2, 3, 4, 5]);
    expect(merge([1, 3, 5], [2, 4])).toEqual([1, 2, 3, 4, 5]);
    expect(merge([], [1, 2, 3])).toEqual([1, 2, 3]);
    expect(merge([1, 2, 3], [])).toEqual([1, 2, 3]);
    expect(merge([], [])).toEqual([]);
    expect(merge([1], [2])).toEqual([1, 2]);
    expect(merge([2], [1])).toEqual([1, 2]);
    expect(merge([1], [])).toEqual([1]);
    expect(merge([], [1])).toEqual([1]);
    expect(merge([1, 1, 2], [1, 2, 2])).toEqual([1, 1, 1, 2, 2, 2]);
    expect(merge([2, 2], [1, 1])).toEqual([1, 1, 2, 2]);
    expect(merge([-3, -1], [-2, 0])).toEqual([-3, -2, -1, 0]);
    expect(merge([-1, 1], [-2, 0, 2])).toEqual([-2, -1, 0, 1, 2]);
  });
});
