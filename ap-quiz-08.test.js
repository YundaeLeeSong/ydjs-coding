/**
 * ap-quiz-08.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-08.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-08.js module.
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
 *         npx jest ap-quiz-08.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-08')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  sameEndsString,
  mirrorEnds,
  squareUp,
  getSandwich,
  sameStarChar,
  haveThree,
  twoTwo,
  sameEndsList,
  tripleUp,
  fizzArray3,
  strCopies,
  strDist,
  groupSum,
  groupSum6
} = require('./ap-quiz-08');

describe('APQuiz08', () => {

  // Q1 - sameEnds (string version)
  test('sameEndsString', () => {
    expect(sameEndsString('abXYab')).toBe('ab');
    expect(sameEndsString('xx')).toBe('x');
    expect(sameEndsString('xxx')).toBe('x');
    expect(sameEndsString('xxxx')).toBe('xx');
    expect(sameEndsString('javaXYZjava')).toBe('java');
    expect(sameEndsString('javajava')).toBe('java');
    expect(sameEndsString('xavaXYZjava')).toBe('');
    expect(sameEndsString('Hello! and Hello!')).toBe('Hello!');
    expect(sameEndsString('x')).toBe('');
    expect(sameEndsString('')).toBe('');
    expect(sameEndsString('abcb')).toBe('');
    expect(sameEndsString('mymmy')).toBe('my');
  });

  // Q2
  test('mirrorEnds', () => {
    expect(mirrorEnds('abXYZba')).toBe('ab');
    expect(mirrorEnds('abca')).toBe('a');
    expect(mirrorEnds('aba')).toBe('aba');
    expect(mirrorEnds('abab')).toBe('');
    expect(mirrorEnds('xxx')).toBe('xxx');
    expect(mirrorEnds('xxYxx')).toBe('xxYxx');
    expect(mirrorEnds('Hi and iH')).toBe('Hi');
    expect(mirrorEnds(' x ')).toBe(' x ');
    expect(mirrorEnds('')).toBe('');
    expect(mirrorEnds('123and then 321')).toBe('123');
    expect(mirrorEnds('band andab')).toBe('ba');
  });

  // Q3
  test('squareUp', () => {
    expect(squareUp(3)).toEqual([0, 0, 1, 0, 2, 1, 3, 2, 1]);
    expect(squareUp(2)).toEqual([0, 1, 2, 1]);
    expect(squareUp(4)).toEqual([0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]);
    expect(squareUp(1)).toEqual([1]);
    expect(squareUp(0)).toEqual([]);
    expect(squareUp(6)).toEqual([
      0, 0, 0, 0, 0, 1,
      0, 0, 0, 0, 2, 1,
      0, 0, 0, 3, 2, 1,
      0, 0, 4, 3, 2, 1,
      0, 5, 4, 3, 2, 1,
      6, 5, 4, 3, 2, 1
    ]);
  });

  // Q4
  test('getSandwich', () => {
    expect(getSandwich('breadjambread')).toBe('jam');
    expect(getSandwich('xxbreadjambreadyy')).toBe('jam');
    expect(getSandwich('xxbreadyy')).toBe('');
    expect(getSandwich('xxbreadbreadjambreadyy')).toBe('breadjam');
    expect(getSandwich('breadAbread')).toBe('A');
    expect(getSandwich('breadbread')).toBe('');
    expect(getSandwich('abcbreaz')).toBe('');
    expect(getSandwich('xyz')).toBe('');
    expect(getSandwich('')).toBe('');
    expect(getSandwich('breadbreaxbread')).toBe('breax');
    expect(getSandwich('breaxbreadybread')).toBe('y');
    expect(getSandwich('breadbreadbreadbread')).toBe('breadbread');
  });

  // Q5
  test('sameStarChar', () => {
    expect(sameStarChar('xy*yzz')).toBe(true);
    expect(sameStarChar('xy*zzz')).toBe(false);
    expect(sameStarChar('*xa*az')).toBe(true);
    expect(sameStarChar('*xa*bz')).toBe(false);
    expect(sameStarChar('*xa*a*')).toBe(true);
    expect(sameStarChar('')).toBe(true);
    expect(sameStarChar('*xa*a*a')).toBe(true);
    expect(sameStarChar('*xa*a*b')).toBe(false);
    expect(sameStarChar('*12*2*2')).toBe(true);
    expect(sameStarChar('12*2*3*')).toBe(false);
    expect(sameStarChar('abcDEF')).toBe(true);
    expect(sameStarChar('XY*YYYY*Z*')).toBe(false);
    expect(sameStarChar('*')).toBe(true);
    expect(sameStarChar('**')).toBe(true);
  });

  // Q6
  test('haveThree', () => {
    expect(haveThree([3, 1, 3, 1, 3])).toBe(true);
    expect(haveThree([3, 1, 3, 3])).toBe(false);
    expect(haveThree([3, 4, 3, 3, 4])).toBe(false);
    expect(haveThree([1, 3, 1, 3, 1, 2])).toBe(false);
    expect(haveThree([1, 3, 1, 3, 1, 3])).toBe(true);
    expect(haveThree([1, 3, 3, 1, 3])).toBe(false);
    expect(haveThree([1, 3, 1, 3, 1, 3, 4, 3])).toBe(false);
    expect(haveThree([3, 4, 3, 4, 3, 4, 4])).toBe(true);
    expect(haveThree([3, 3, 3])).toBe(false);
    expect(haveThree([1, 3])).toBe(false);
    expect(haveThree([3])).toBe(false);
    expect(haveThree([1])).toBe(false);
  });

  // Q7
  test('twoTwo', () => {
    expect(twoTwo([4, 2, 2, 3])).toBe(true);
    expect(twoTwo([2, 2, 4])).toBe(true);
    expect(twoTwo([2, 2, 4, 2])).toBe(false);
    expect(twoTwo([1, 3, 4])).toBe(true);
    expect(twoTwo([1, 2, 2, 3, 4])).toBe(true);
    expect(twoTwo([1, 2, 3, 4])).toBe(false);
    expect(twoTwo([2, 2])).toBe(true);
    expect(twoTwo([2, 2, 7])).toBe(true);
    expect(twoTwo([2, 2, 7, 2, 1])).toBe(false);
    expect(twoTwo([4, 2, 2, 2])).toBe(true);
    expect(twoTwo([2, 2, 2])).toBe(true);
    expect(twoTwo([1, 2])).toBe(false);
    expect(twoTwo([2])).toBe(false);
    expect(twoTwo([1])).toBe(true);
    expect(twoTwo([])).toBe(true);
    expect(twoTwo([5, 2, 2, 3])).toBe(true);
    expect(twoTwo([2, 2, 5, 2])).toBe(false);
  });

  // Q8 - sameEnds (list version)
  test('sameEndsList', () => {
    expect(sameEndsList([5, 6, 45, 99, 13, 5, 6], 1)).toBe(false);
    expect(sameEndsList([5, 6, 45, 99, 13, 5, 6], 2)).toBe(true);
    expect(sameEndsList([5, 6, 45, 99, 13, 5, 6], 3)).toBe(false);
    expect(sameEndsList([1, 2, 5, 2, 1], 1)).toBe(true);
    expect(sameEndsList([1, 2, 5, 2, 1], 2)).toBe(false);
    expect(sameEndsList([1, 2, 5, 2, 1], 0)).toBe(true);
    expect(sameEndsList([1, 2, 5, 2, 1], 5)).toBe(true);
    expect(sameEndsList([1, 1, 1], 0)).toBe(true);
    expect(sameEndsList([1, 1, 1], 1)).toBe(true);
    expect(sameEndsList([1, 1, 1], 2)).toBe(true);
    expect(sameEndsList([1, 1, 1], 3)).toBe(true);
    expect(sameEndsList([1], 1)).toBe(true);
    expect(sameEndsList([], 0)).toBe(true);
    expect(sameEndsList([4, 2, 4, 5], 1)).toBe(false);
  });

  // Q9
  test('tripleUp', () => {
    expect(tripleUp([1, 4, 5, 6, 2])).toBe(true);
    expect(tripleUp([1, 2, 3])).toBe(true);
    expect(tripleUp([1, 2, 4])).toBe(false);
    expect(tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6])).toBe(true);
    expect(tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6])).toBe(false);
    expect(tripleUp([1, 2])).toBe(false);
    expect(tripleUp([1])).toBe(false);
    expect(tripleUp([])).toBe(false);
    expect(tripleUp([10, 9, 8, -100, -99, -98, 100])).toBe(true);
    expect(tripleUp([10, 9, 8, -100, -99, 99, 100])).toBe(false);
    expect(tripleUp([-100, -99, -99, 100, 101, 102])).toBe(true);
    expect(tripleUp([2, 3, 5, 6, 8, 9, 2, 3])).toBe(false);
  });

  // Q10
  test('fizzArray3', () => {
    expect(fizzArray3(5, 10)).toEqual([5, 6, 7, 8, 9]);
    expect(fizzArray3(11, 18)).toEqual([11, 12, 13, 14, 15, 16, 17]);
    expect(fizzArray3(1, 3)).toEqual([1, 2]);
    expect(fizzArray3(1, 2)).toEqual([1]);
    expect(fizzArray3(1, 1)).toEqual([]);
    expect(fizzArray3(1000, 1005)).toEqual([1000, 1001, 1002, 1003, 1004]);
  });

  // Q11
  test('strCopies', () => {
    expect(strCopies('catcowcat', 'cat', 2)).toBe(true);
    expect(strCopies('catcowcat', 'cow', 2)).toBe(false);
    expect(strCopies('catcowcat', 'cow', 1)).toBe(true);
    expect(strCopies('iiijjj', 'i', 3)).toBe(true);
    expect(strCopies('iiijjj', 'i', 4)).toBe(false);
    expect(strCopies('iiijjj', 'ii', 2)).toBe(true);
    expect(strCopies('iiijjj', 'ii', 3)).toBe(false);
    expect(strCopies('iiijjj', 'x', 3)).toBe(false);
    expect(strCopies('iiijjj', 'x', 0)).toBe(true);
    expect(strCopies('iiiiiij', 'iii', 3)).toBe(true);
    expect(strCopies('iiiiiij', 'iii', 4)).toBe(false);
    expect(strCopies('ijiiiiij', 'iiii', 2)).toBe(true);
    expect(strCopies('ijiiiiij', 'iiii', 3)).toBe(false);
    expect(strCopies('dogcatdogcat', 'dog', 2)).toBe(true);
  });

  // Q12
  test('strDist', () => {
    expect(strDist('catcowcat', 'cat')).toBe(9);
    expect(strDist('catcowcat', 'cow')).toBe(3);
    expect(strDist('cccatcowcatxx', 'cat')).toBe(9);
    expect(strDist('abccatcowcatcatxyz', 'cat')).toBe(12);
    expect(strDist('xyx', 'x')).toBe(3);
    expect(strDist('xyx', 'y')).toBe(1);
    expect(strDist('xyx', 'z')).toBe(0);
    expect(strDist('z', 'z')).toBe(1);
    expect(strDist('x', 'z')).toBe(0);
    expect(strDist('', 'z')).toBe(0);
    expect(strDist('hiHellohihihi', 'hi')).toBe(13);
    expect(strDist('hiHellohihihi', 'hih')).toBe(5);
    expect(strDist('hiHellohihihi', 'o')).toBe(1);
    expect(strDist('hiHellohihihi', 'II')).toBe(2);
  });

  // Q13
  test('groupSum', () => {
    expect(groupSum(0, [2, 4, 8], 10)).toBe(true);
    expect(groupSum(0, [2, 4, 8], 14)).toBe(true);
    expect(groupSum(0, [2, 4, 8], 9)).toBe(false);
    expect(groupSum(0, [2, 4, 8], 8)).toBe(true);
    expect(groupSum(1, [2, 4, 8], 8)).toBe(true);
    expect(groupSum(1, [2, 4, 8], 2)).toBe(false);
    expect(groupSum(0, [1], 1)).toBe(true);
    expect(groupSum(0, [9], 1)).toBe(false);
    expect(groupSum(1, [9], 0)).toBe(true);
    expect(groupSum(0, [], 0)).toBe(true);
    expect(groupSum(0, [10, 2, 2, 5], 17)).toBe(true);
    expect(groupSum(0, [10, 2, 2, 5], 15)).toBe(true);
    expect(groupSum(0, [10, 2, 2, 5], 9)).toBe(true);
  });

  // Q14
  test('groupSum6', () => {
    expect(groupSum6(0, [5, 6, 2], 8)).toBe(true);
    expect(groupSum6(0, [5, 6, 2], 9)).toBe(false);
    expect(groupSum6(0, [5, 6, 2], 7)).toBe(false);
    expect(groupSum6(0, [1], 1)).toBe(true);
    expect(groupSum6(0, [9], 1)).toBe(false);
    expect(groupSum6(0, [], 0)).toBe(true);
    expect(groupSum6(0, [3, 2, 4, 6], 8)).toBe(true);
    expect(groupSum6(0, [6, 2, 4, 3], 8)).toBe(true);
    expect(groupSum6(0, [5, 2, 4, 6], 9)).toBe(false);
    expect(groupSum6(0, [6, 2, 4, 5], 9)).toBe(false);
    expect(groupSum6(0, [3, 2, 4, 6], 3)).toBe(false);
    expect(groupSum6(0, [1, 6, 2, 6, 4], 12)).toBe(true);
    expect(groupSum6(0, [1, 6, 2, 6, 4], 13)).toBe(true);
    expect(groupSum6(0, [1, 6, 2, 6, 4], 4)).toBe(false);
    expect(groupSum6(0, [1, 6, 2, 6, 4], 9)).toBe(false);
    expect(groupSum6(0, [1, 6, 2, 6, 5], 14)).toBe(true);
    expect(groupSum6(0, [1, 6, 2, 6, 5], 15)).toBe(true);
    expect(groupSum6(0, [1, 6, 2, 6, 5], 16)).toBe(false);
  });
});
