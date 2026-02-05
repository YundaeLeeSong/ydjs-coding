/**
 * ap-quiz-05.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-05.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-05.js module.
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
 *         npx jest ap-quiz-05.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-05')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  more14,
  luckySum,
  equalIsNot,
  fix45,
  repeatSeparator,
  repeatFront,
  fizzArray,
  only14,
  fizzArray2,
  noTeenSum,
  array220,
  allStar,
  pairStar,
  endX
} = require('./ap-quiz-05');

describe('APQuiz05', () => {

  // Q1
  test('more14', () => {
    expect(more14([1, 4, 1])).toBe(true);
    expect(more14([1, 4, 1, 4])).toBe(false);
    expect(more14([1, 1])).toBe(true);
    expect(more14([1, 6, 6])).toBe(true);
    expect(more14([1])).toBe(true);
    expect(more14([1, 4])).toBe(false);
    expect(more14([6, 1, 1])).toBe(true);
    expect(more14([1, 6, 4])).toBe(false);
    expect(more14([1, 1, 4, 4, 1])).toBe(true);
    expect(more14([1, 1, 6, 4, 4, 1])).toBe(true);
    expect(more14([])).toBe(false);
    expect(more14([4, 1, 4, 6])).toBe(false);
    expect(more14([4, 1, 4, 6, 1])).toBe(false);
    expect(more14([1, 4, 1, 4, 1, 6])).toBe(true);
  });

  // Q2
  test('luckySum', () => {
    expect(luckySum(1, 2, 3)).toBe(6);
    expect(luckySum(1, 2, 13)).toBe(3);
    expect(luckySum(1, 13, 3)).toBe(1);
    expect(luckySum(1, 13, 13)).toBe(1);
    expect(luckySum(6, 5, 2)).toBe(13);
    expect(luckySum(13, 2, 3)).toBe(0);
    expect(luckySum(13, 2, 13)).toBe(0);
    expect(luckySum(13, 13, 2)).toBe(0);
    expect(luckySum(9, 4, 13)).toBe(13);
    expect(luckySum(8, 13, 2)).toBe(8);
    expect(luckySum(7, 2, 1)).toBe(10);
    expect(luckySum(3, 3, 13)).toBe(6);
  });

  // Q3
  test('equalIsNot', () => {
    expect(equalIsNot('This is not')).toBe(false);
    expect(equalIsNot('This is notnot')).toBe(true);
    expect(equalIsNot('noisxxnotyynotxisi')).toBe(true);
    expect(equalIsNot('noisxxnotyynotxsi')).toBe(false);
    expect(equalIsNot('xxxyyyzzzintint')).toBe(true);
    expect(equalIsNot('')).toBe(true);
    expect(equalIsNot('isisnotnot')).toBe(true);
    expect(equalIsNot('isisnotno7Not')).toBe(false);
    expect(equalIsNot('isnotis')).toBe(false);
    expect(equalIsNot('mis3notpotbotis')).toBe(false);
  });

  // Q4
  test('fix45', () => {
    expect(fix45([5, 4, 9, 4, 9, 5])).toEqual([9, 4, 5, 4, 5, 9]);
    expect(fix45([1, 4, 1, 5])).toEqual([1, 4, 5, 1]);
    expect(fix45([1, 4, 1, 5, 5, 4, 1])).toEqual([1, 4, 5, 1, 1, 4, 5]);
    expect(fix45([4, 9, 4, 9, 5, 5, 4, 9, 5])).toEqual([4, 5, 4, 5, 9, 9, 4, 5, 9]);
    expect(fix45([5, 5, 4, 1, 4, 1])).toEqual([1, 1, 4, 5, 4, 5]);
    expect(fix45([4, 2, 2, 5])).toEqual([4, 5, 2, 2]);
    expect(fix45([4, 2, 4, 2, 5, 5])).toEqual([4, 5, 4, 5, 2, 2]);
    expect(fix45([4, 2, 4, 5, 5])).toEqual([4, 5, 4, 5, 2]);
    expect(fix45([1, 1, 1])).toEqual([1, 1, 1]);
    expect(fix45([4, 5])).toEqual([4, 5]);
    expect(fix45([5, 4, 1])).toEqual([1, 4, 5]);
    expect(fix45([])).toEqual([]);
    expect(fix45([5, 4, 5, 4, 1])).toEqual([1, 4, 5, 4, 5]);
    expect(fix45([4, 5, 4, 1, 5])).toEqual([4, 5, 4, 5, 1]);
    expect(fix45([3, 4, 5])).toEqual([3, 4, 5]);
    expect(fix45([4, 1, 5])).toEqual([4, 5, 1]);
    expect(fix45([5, 4, 1])).toEqual([1, 4, 5]);
    expect(fix45([2, 4, 2, 5])).toEqual([2, 4, 5, 2]);
  });

  // Q5
  test('repeatSeparator', () => {
    expect(repeatSeparator('Word', 'X', 3)).toBe('WordXWordXWord');
    expect(repeatSeparator('This', 'And', 2)).toBe('ThisAndThis');
    expect(repeatSeparator('This', 'And', 1)).toBe('This');
    expect(repeatSeparator('Hi', '-n-', 2)).toBe('Hi-n-Hi');
    expect(repeatSeparator('AAA', '', 1)).toBe('AAA');
    expect(repeatSeparator('AAA', '', 0)).toBe('');
    expect(repeatSeparator('A', 'B', 5)).toBe('ABABABABA');
    expect(repeatSeparator('abc', 'XX', 3)).toBe('abcXXabcXXabc');
    expect(repeatSeparator('abc', 'XX', 2)).toBe('abcXXabc');
    expect(repeatSeparator('abc', 'XX', 1)).toBe('abc');
    expect(repeatSeparator('XYZ', 'a', 2)).toBe('XYZaXYZ');
  });

  // Q6
  test('repeatFront', () => {
    expect(repeatFront('Chocolate', 4)).toBe('ChocChoChC');
    expect(repeatFront('Chocolate', 3)).toBe('ChoChC');
    expect(repeatFront('Ice Cream', 2)).toBe('IcI');
    expect(repeatFront('Ice Cream', 1)).toBe('I');
    expect(repeatFront('Ice Cream', 0)).toBe('');
    expect(repeatFront('xyz', 3)).toBe('xyzxyx');
    expect(repeatFront('', 0)).toBe('');
    expect(repeatFront('Java', 4)).toBe('JavaJavJaJ');
    expect(repeatFront('Java', 1)).toBe('J');
  });

  // Q7
  test('fizzArray', () => {
    expect(fizzArray(4)).toEqual([0, 1, 2, 3]);
    expect(fizzArray(1)).toEqual([0]);
    expect(fizzArray(10)).toEqual([0, 1, 2, 3, 4, 5, 6, 7, 8, 9]);
    expect(fizzArray(0)).toEqual([]);
    expect(fizzArray(2)).toEqual([0, 1]);
    expect(fizzArray(7)).toEqual([0, 1, 2, 3, 4, 5, 6]);
  });

  // Q8
  test('only14', () => {
    expect(only14([1, 4, 1, 4])).toBe(true);
    expect(only14([1, 4, 2, 4])).toBe(false);
    expect(only14([1, 1])).toBe(true);
    expect(only14([4, 1])).toBe(true);
    expect(only14([2])).toBe(false);
    expect(only14([])).toBe(true);
    expect(only14([1, 4, 1, 3])).toBe(false);
    expect(only14([3, 1, 3])).toBe(false);
    expect(only14([1])).toBe(true);
    expect(only14([4])).toBe(true);
    expect(only14([3, 4])).toBe(false);
    expect(only14([1, 3, 4])).toBe(false);
    expect(only14([1, 1, 1])).toBe(true);
    expect(only14([1, 1, 1, 5])).toBe(false);
    expect(only14([4, 1, 4, 1])).toBe(true);
  });

  // Q9
  test('fizzArray2', () => {
    expect(fizzArray2(4)).toEqual(['0', '1', '2', '3']);
    expect(fizzArray2(10)).toEqual(['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']);
    expect(fizzArray2(2)).toEqual(['0', '1']);
    expect(fizzArray2(1)).toEqual(['0']);
    expect(fizzArray2(0)).toEqual([]);
    expect(fizzArray2(7)).toEqual(['0', '1', '2', '3', '4', '5', '6']);
    expect(fizzArray2(9)).toEqual(['0', '1', '2', '3', '4', '5', '6', '7', '8']);
    expect(fizzArray2(11)).toEqual(['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10']);
  });

  // Q10
  test('noTeenSum', () => {
    expect(noTeenSum(1, 2, 3)).toBe(6);
    expect(noTeenSum(2, 13, 1)).toBe(3);
    expect(noTeenSum(2, 1, 14)).toBe(3);
    expect(noTeenSum(2, 1, 15)).toBe(18);
    expect(noTeenSum(2, 1, 16)).toBe(19);
    expect(noTeenSum(2, 1, 17)).toBe(3);
    expect(noTeenSum(17, 1, 2)).toBe(3);
    expect(noTeenSum(2, 15, 2)).toBe(19);
    expect(noTeenSum(16, 17, 18)).toBe(16);
    expect(noTeenSum(17, 18, 19)).toBe(0);
    expect(noTeenSum(15, 16, 1)).toBe(32);
    expect(noTeenSum(15, 15, 19)).toBe(30);
    expect(noTeenSum(15, 19, 16)).toBe(31);
    expect(noTeenSum(5, 17, 18)).toBe(5);
    expect(noTeenSum(17, 18, 16)).toBe(16);
    expect(noTeenSum(17, 19, 18)).toBe(0);
  });

  // Q11
  test('array220', () => {
    expect(array220([1, 2, 20], 0)).toBe(true);
    expect(array220([3, 30], 0)).toBe(true);
    expect(array220([3], 0)).toBe(false);
    expect(array220([], 0)).toBe(false);
    expect(array220([3, 3, 30, 4], 0)).toBe(true);
    expect(array220([2, 19, 4], 0)).toBe(false);
    expect(array220([20, 2, 21], 0)).toBe(false);
    expect(array220([20, 2, 21, 210], 0)).toBe(true);
    expect(array220([2, 200, 2000], 0)).toBe(true);
    expect(array220([0, 0], 0)).toBe(true);
    expect(array220([1, 2, 3, 4, 5, 6], 0)).toBe(false);
    expect(array220([1, 2, 3, 4, 5, 50, 6], 0)).toBe(true);
    expect(array220([1, 2, 3, 4, 5, 51, 6], 0)).toBe(false);
    expect(array220([1, 2, 3, 4, 4, 50, 500, 6], 0)).toBe(true);
  });

  // Q12
  test('allStar', () => {
    expect(allStar('hello')).toBe('h*e*l*l*o');
    expect(allStar('abc')).toBe('a*b*c');
    expect(allStar('ab')).toBe('a*b');
    expect(allStar('a')).toBe('a');
    expect(allStar('')).toBe('');
    expect(allStar('3.14')).toBe('3*.*1*4');
    expect(allStar('Chocolate')).toBe('C*h*o*c*o*l*a*t*e');
    expect(allStar('1234')).toBe('1*2*3*4');
  });

  // Q13
  test('pairStar', () => {
    expect(pairStar('hello')).toBe('hel*lo');
    expect(pairStar('xxyy')).toBe('x*xy*y');
    expect(pairStar('aaaa')).toBe('a*a*a*a');
    expect(pairStar('aaab')).toBe('a*a*ab');
    expect(pairStar('aa')).toBe('a*a');
    expect(pairStar('a')).toBe('a');
    expect(pairStar('')).toBe('');
    expect(pairStar('noadjacent')).toBe('noadjacent');
    expect(pairStar('abba')).toBe('ab*ba');
    expect(pairStar('abbba')).toBe('ab*b*ba');
  });

  // Q14
  test('endX', () => {
    expect(endX('xxre')).toBe('rexx');
    expect(endX('xxhixx')).toBe('hixxxx');
    expect(endX('xhixhix')).toBe('hihixxx');
    expect(endX('hiy')).toBe('hiy');
    expect(endX('h')).toBe('h');
    expect(endX('x')).toBe('x');
    expect(endX('xx')).toBe('xx');
    expect(endX('')).toBe('');
    expect(endX('bxx')).toBe('bxx');
    expect(endX('bxax')).toBe('baxx');
    expect(endX('axaxax')).toBe('aaaxxx');
    expect(endX('xxhxi')).toBe('hixxx');
  });
});
