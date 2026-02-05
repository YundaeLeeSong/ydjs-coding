/**
 * ap-quiz-07.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-07.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-07.js module.
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
 *         npx jest ap-quiz-07.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-07')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
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
} = require('./ap-quiz-07');

describe('APQuiz07', () => {

  // Q1
  test('sumDigits', () => {
    expect(sumDigits('aa1bc2d3')).toBe(6);
    expect(sumDigits('aa11b33')).toBe(8);
    expect(sumDigits('Chocolate')).toBe(0);
    expect(sumDigits('5hoco1a1e')).toBe(7);
    expect(sumDigits('123abc123')).toBe(12);
    expect(sumDigits('')).toBe(0);
    expect(sumDigits('Hello')).toBe(0);
    expect(sumDigits('X1z9b2')).toBe(12);
    expect(sumDigits('5432a')).toBe(14);
  });

  // Q2
  test('linearIn', () => {
    expect(linearIn([1, 2, 4, 6], [2, 4])).toBe(true);
    expect(linearIn([1, 2, 4, 6], [2, 3, 4])).toBe(false);
    expect(linearIn([1, 2, 4, 4, 6], [2, 4])).toBe(true);
    expect(linearIn([2, 2, 4, 4, 6, 6], [2, 4])).toBe(true);
    expect(linearIn([2, 2, 2, 2, 2], [2, 2])).toBe(true);
    expect(linearIn([2, 2, 2, 2, 2], [2, 4])).toBe(false);
    expect(linearIn([2, 2, 2, 2, 4], [2, 4])).toBe(true);
    expect(linearIn([1, 2, 3], [2])).toBe(true);
    expect(linearIn([1, 2, 3], [-1])).toBe(false);
    expect(linearIn([1, 2, 3], [])).toBe(true);
    expect(linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 0, 3, 12])).toBe(true);
    expect(linearIn([-1, 0, 3, 3, 3, 10, 12], [0, 3, 12, 14])).toBe(false);
    expect(linearIn([-1, 0, 3, 3, 3, 10, 12], [-1, 10, 11])).toBe(false);
  });

  // Q3
  test('either24', () => {
    expect(either24([1, 2, 2])).toBe(true);
    expect(either24([4, 4, 1])).toBe(true);
    expect(either24([4, 4, 1, 2, 2])).toBe(false);
    expect(either24([1, 2, 3, 4])).toBe(false);
    expect(either24([3, 5, 9])).toBe(false);
    expect(either24([1, 2, 3, 4, 4])).toBe(true);
    expect(either24([2, 2, 3, 4])).toBe(true);
    expect(either24([1, 2, 3, 2, 2, 4])).toBe(true);
    expect(either24([1, 2, 3, 2, 2, 4, 4])).toBe(false);
    expect(either24([1, 2])).toBe(false);
    expect(either24([2, 2])).toBe(true);
    expect(either24([4, 4])).toBe(true);
    expect(either24([2])).toBe(false);
    expect(either24([])).toBe(false);
  });

  // Q4
  test('matchUp', () => {
    expect(matchUp([1, 2, 3], [2, 3, 10])).toBe(2);
    expect(matchUp([1, 2, 3], [2, 3, 5])).toBe(3);
    expect(matchUp([1, 2, 3], [2, 3, 3])).toBe(2);
    expect(matchUp([5, 3], [5, 5])).toBe(1);
    expect(matchUp([5, 3], [4, 4])).toBe(2);
    expect(matchUp([5, 3], [3, 3])).toBe(1);
    expect(matchUp([5, 3], [2, 2])).toBe(1);
    expect(matchUp([5, 3], [1, 1])).toBe(1);
    expect(matchUp([5, 3], [0, 0])).toBe(0);
    expect(matchUp([4], [4])).toBe(0);
    expect(matchUp([4], [5])).toBe(1);
  });

  // Q5
  test('has77', () => {
    expect(has77([1, 7, 7])).toBe(true);
    expect(has77([1, 7, 1, 7])).toBe(true);
    expect(has77([1, 7, 1, 1, 7])).toBe(false);
    expect(has77([7, 7, 1, 1, 7])).toBe(true);
    expect(has77([2, 7, 2, 2, 7, 2])).toBe(false);
    expect(has77([2, 7, 2, 2, 7, 7])).toBe(true);
    expect(has77([7, 2, 7, 2, 2, 7])).toBe(true);
    expect(has77([7, 2, 6, 2, 2, 7])).toBe(false);
    expect(has77([7, 7, 7])).toBe(true);
    expect(has77([7, 1, 7])).toBe(true);
    expect(has77([7, 1, 1])).toBe(false);
    expect(has77([1, 2])).toBe(false);
    expect(has77([1, 7])).toBe(false);
    expect(has77([7])).toBe(false);
  });

  // Q6
  test('has12', () => {
    expect(has12([1, 3, 2])).toBe(true);
    expect(has12([3, 1, 2])).toBe(true);
    expect(has12([3, 1, 4, 5, 2])).toBe(true);
    expect(has12([3, 1, 4, 5, 6])).toBe(false);
    expect(has12([3, 1, 4, 1, 6, 2])).toBe(true);
    expect(has12([2, 1, 4, 1, 6, 2])).toBe(true);
    expect(has12([2, 1, 4, 1, 6])).toBe(false);
    expect(has12([1])).toBe(false);
    expect(has12([2, 1, 3])).toBe(false);
    expect(has12([2, 1, 3, 2])).toBe(true);
    expect(has12([2])).toBe(false);
    expect(has12([3, 2])).toBe(false);
    expect(has12([3, 1, 3, 2])).toBe(true);
    expect(has12([3, 5, 9])).toBe(false);
    expect(has12([3, 5, 1])).toBe(false);
    expect(has12([3, 2, 1])).toBe(false);
    expect(has12([1, 2])).toBe(true);
  });

  // Q7
  test('modThree', () => {
    expect(modThree([2, 1, 3, 5])).toBe(true);
    expect(modThree([2, 1, 2, 5])).toBe(false);
    expect(modThree([2, 4, 2, 5])).toBe(true);
    expect(modThree([1, 2, 1, 2, 1])).toBe(false);
    expect(modThree([9, 9, 9])).toBe(true);
    expect(modThree([1, 2, 1])).toBe(false);
    expect(modThree([1, 2])).toBe(false);
    expect(modThree([1])).toBe(false);
    expect(modThree([])).toBe(false);
    expect(modThree([9, 7, 2, 9])).toBe(false);
    expect(modThree([9, 7, 2, 9, 2, 2])).toBe(false);
    expect(modThree([9, 7, 2, 9, 2, 2, 6])).toBe(true);
  });

  // Q8
  test('prefixAgain', () => {
    expect(prefixAgain('abXYabc', 1)).toBe(true);
    expect(prefixAgain('abXYabc', 2)).toBe(true);
    expect(prefixAgain('abXYabc', 3)).toBe(false);
    expect(prefixAgain('xyzxyxyxy', 2)).toBe(true);
    expect(prefixAgain('xyzxyxyxy', 3)).toBe(false);
    expect(prefixAgain('Hi12345Hi6789Hi10', 1)).toBe(true);
    expect(prefixAgain('Hi12345Hi6789Hi10', 2)).toBe(true);
    expect(prefixAgain('Hi12345Hi6789Hi10', 3)).toBe(true);
    expect(prefixAgain('Hi12345Hi6789Hi10', 4)).toBe(false);
    expect(prefixAgain('a', 1)).toBe(false);
    expect(prefixAgain('aa', 1)).toBe(true);
    expect(prefixAgain('ab', 1)).toBe(false);
  });

  // Q9
  test('xyzMiddle', () => {
    expect(xyzMiddle('AAxyzBB')).toBe(true);
    expect(xyzMiddle('AxyzBB')).toBe(true);
    expect(xyzMiddle('AxyzBBB')).toBe(false);
    expect(xyzMiddle('AxyzBBBB')).toBe(false);
    expect(xyzMiddle('AAAxyzB')).toBe(false);
    expect(xyzMiddle('AAAxyzBB')).toBe(true);
    expect(xyzMiddle('AAAAxyzBB')).toBe(false);
    expect(xyzMiddle('AAAAAxyzBBB')).toBe(false);
    expect(xyzMiddle('1x345xyz12x4')).toBe(true);
    expect(xyzMiddle('xyzAxyzBBB')).toBe(true);
    expect(xyzMiddle('xyzAxyzBxyz')).toBe(true);
    expect(xyzMiddle('xyzxyzAxyzBxyzxyz')).toBe(true);
    expect(xyzMiddle('xyzxyzxyzBxyzxyz')).toBe(true);
    expect(xyzMiddle('xyzxyzAxyzxyzxyz')).toBe(true);
    expect(xyzMiddle('xyzxyzAxyzxyzxy')).toBe(false);
    expect(xyzMiddle('AxyzxyzBB')).toBe(false);
    expect(xyzMiddle('')).toBe(false);
    expect(xyzMiddle('x')).toBe(false);
    expect(xyzMiddle('xy')).toBe(false);
    expect(xyzMiddle('xyz')).toBe(true);
    expect(xyzMiddle('xyzz')).toBe(true);
  });

  // Q10
  test('closeFar', () => {
    expect(closeFar(1, 2, 10)).toBe(true);
    expect(closeFar(1, 2, 3)).toBe(false);
    expect(closeFar(4, 1, 3)).toBe(true);
    expect(closeFar(4, 5, 3)).toBe(false);
    expect(closeFar(4, 3, 5)).toBe(false);
    expect(closeFar(-1, 10, 0)).toBe(true);
    expect(closeFar(0, -1, 10)).toBe(true);
    expect(closeFar(10, 10, 8)).toBe(true);
    expect(closeFar(10, 8, 9)).toBe(false);
    expect(closeFar(8, 9, 10)).toBe(false);
    expect(closeFar(8, 9, 7)).toBe(false);
    expect(closeFar(8, 6, 9)).toBe(true);
  });

  // Q11
  test('countHi2', () => {
    expect(countHi2('ahixhi')).toBe(1);
    expect(countHi2('ahibhi')).toBe(2);
    expect(countHi2('xhixhi')).toBe(0);
    expect(countHi2('hixhi')).toBe(1);
    expect(countHi2('hixhhi')).toBe(2);
    expect(countHi2('hihihi')).toBe(3);
    expect(countHi2('hihihix')).toBe(3);
    expect(countHi2('xhihihix')).toBe(2);
    expect(countHi2('xxhi')).toBe(0);
    expect(countHi2('hixxhi')).toBe(1);
    expect(countHi2('hi')).toBe(1);
    expect(countHi2('xxxx')).toBe(0);
    expect(countHi2('h')).toBe(0);
    expect(countHi2('x')).toBe(0);
    expect(countHi2('')).toBe(0);
    expect(countHi2('Hellohi')).toBe(1);
  });

  // Q12
  test('parenBit', () => {
    expect(parenBit('xyz(abc)123')).toBe('(abc)');
    expect(parenBit('x(hello)')).toBe('(hello)');
    expect(parenBit('(xy)1')).toBe('(xy)');
    expect(parenBit('not really (possible)')).toBe('(possible)');
    expect(parenBit('(abc)')).toBe('(abc)');
    expect(parenBit('(abc)xyz')).toBe('(abc)');
    expect(parenBit('(abc)x')).toBe('(abc)');
    expect(parenBit('(x)')).toBe('(x)');
    expect(parenBit('()')).toBe('()');
    expect(parenBit('res (ipsa) loquitor')).toBe('(ipsa)');
    expect(parenBit('hello(not really)there')).toBe('(not really)');
    expect(parenBit('ab(ab)ab')).toBe('(ab)');
  });

  // Q13
  test('nestParen', () => {
    expect(nestParen('(())')).toBe(true);
    expect(nestParen('((()))')).toBe(true);
    expect(nestParen('(((x))')).toBe(false);
    expect(nestParen('((())')).toBe(false);
    expect(nestParen('()')).toBe(true);
    expect(nestParen('')).toBe(true);
    expect(nestParen('(yy)')).toBe(false);
    expect(nestParen('(())')).toBe(true);
    expect(nestParen('(((y))')).toBe(false);
    expect(nestParen('((y)))')).toBe(false);
    expect(nestParen('((()))')).toBe(true);
    expect(nestParen('(())))')).toBe(false);
    expect(nestParen('((yy())))')).toBe(false);
    expect(nestParen('(((())))')).toBe(true);
  });

  // Q14
  test('strCount', () => {
    expect(strCount('catcowcat', 'cat')).toBe(2);
    expect(strCount('catcowcat', 'cow')).toBe(1);
    expect(strCount('catcowcat', 'dog')).toBe(0);
    expect(strCount('cacatcowcat', 'cat')).toBe(2);
    expect(strCount('xyx', 'x')).toBe(2);
    expect(strCount('iiiijj', 'i')).toBe(4);
    expect(strCount('iiiijj', 'ii')).toBe(2);
    expect(strCount('iiiijj', 'iii')).toBe(1);
    expect(strCount('iiiijj', 'j')).toBe(2);
    expect(strCount('iiiijj', 'jj')).toBe(1);
    expect(strCount('aaabababab', 'ab')).toBe(4);
    expect(strCount('aaabababab', 'aa')).toBe(1);
    expect(strCount('aaabababab', 'a')).toBe(6);
    expect(strCount('aaabababab', 'b')).toBe(4);
  });
});
