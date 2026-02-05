/**
 * ap-quiz-09.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-09.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-09.js module.
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
 *         npx jest ap-quiz-09.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-09')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  shiftLeft,
  tenRun,
  pre4,
  blackjack,
  maxBlock,
  seriesUp,
  oneTwo,
  zipZap,
  post4,
  notAlone,
  groupNoAdj,
  groupSum5,
  groupSumClump,
  splitArray
} = require('./ap-quiz-09');

describe('APQuiz09', () => {

  test('shiftLeft', () => {
    expect(shiftLeft([6, 2, 5, 3])).toEqual([2, 5, 3, 6]);
    expect(shiftLeft([1, 2])).toEqual([2, 1]);
    expect(shiftLeft([1])).toEqual([1]);
    expect(shiftLeft([])).toEqual([]);
    expect(shiftLeft([1, 1, 2, 2, 4])).toEqual([1, 2, 2, 4, 1]);
    expect(shiftLeft([1, 1, 1])).toEqual([1, 1, 1]);
    expect(shiftLeft([1, 2, 3])).toEqual([2, 3, 1]);
  });

  test('tenRun', () => {
    expect(tenRun([2, 10, 3, 4, 20, 5])).toEqual([2, 10, 10, 10, 20, 20]);
    expect(tenRun([10, 1, 20, 2])).toEqual([10, 10, 20, 20]);
    expect(tenRun([10, 1, 9, 20])).toEqual([10, 10, 10, 20]);
    expect(tenRun([1, 2, 50, 1])).toEqual([1, 2, 50, 50]);
    expect(tenRun([1, 20, 50, 1])).toEqual([1, 20, 50, 50]);
    expect(tenRun([10, 10])).toEqual([10, 10]);
    expect(tenRun([10, 2])).toEqual([10, 10]);
    expect(tenRun([0, 2])).toEqual([0, 0]);
    expect(tenRun([1, 2])).toEqual([1, 2]);
    expect(tenRun([1])).toEqual([1]);
    expect(tenRun([])).toEqual([]);
  });

  test('pre4', () => {
    expect(pre4([1, 2, 4, 1])).toEqual([1, 2]);
    expect(pre4([3, 1, 4])).toEqual([3, 1]);
    expect(pre4([1, 4, 4])).toEqual([1]);
    expect(pre4([1, 4, 4, 2])).toEqual([1]);
    expect(pre4([1, 3, 4, 2, 4])).toEqual([1, 3]);
    expect(pre4([4, 4])).toEqual([]);
    expect(pre4([3, 3, 4])).toEqual([3, 3]);
    expect(pre4([1, 2, 1, 4])).toEqual([1, 2, 1]);
    expect(pre4([2, 1, 4, 2])).toEqual([2, 1]);
    expect(pre4([2, 1, 2, 1, 4, 2])).toEqual([2, 1, 2, 1]);
  });

  test('blackjack', () => {
    expect(blackjack(19, 21)).toBe(21);
    expect(blackjack(21, 19)).toBe(21);
    expect(blackjack(19, 22)).toBe(19);
    expect(blackjack(22, 19)).toBe(19);
    expect(blackjack(22, 50)).toBe(0);
    expect(blackjack(22, 22)).toBe(0);
    expect(blackjack(33, 1)).toBe(1);
    expect(blackjack(1, 2)).toBe(2);
    expect(blackjack(34, 33)).toBe(0);
    expect(blackjack(17, 19)).toBe(19);
    expect(blackjack(18, 17)).toBe(18);
    expect(blackjack(16, 23)).toBe(16);
    expect(blackjack(3, 4)).toBe(4);
    expect(blackjack(3, 2)).toBe(3);
    expect(blackjack(21, 20)).toBe(21);
  });

  test('maxBlock', () => {
    expect(maxBlock('hoopla')).toBe(2);
    expect(maxBlock('abbCCCddBBBxx')).toBe(3);
    expect(maxBlock('')).toBe(0);
    expect(maxBlock('xyz')).toBe(1);
    expect(maxBlock('xxyz')).toBe(2);
    expect(maxBlock('xyzz')).toBe(2);
    expect(maxBlock('abbbcbbbxbbbx')).toBe(3);
    expect(maxBlock('XXBBBbbxx')).toBe(3);
    expect(maxBlock('XXBBBBbbxx')).toBe(4);
    expect(maxBlock('XXBBBbbxxXXXX')).toBe(4);
    expect(maxBlock('XX2222BBBbbXX2222')).toBe(4);
  });

  test('seriesUp', () => {
    expect(seriesUp(3)).toEqual([1, 1, 2, 1, 2, 3]);
    expect(seriesUp(4)).toEqual([1, 1, 2, 1, 2, 3, 1, 2, 3, 4]);
    expect(seriesUp(2)).toEqual([1, 1, 2]);
    expect(seriesUp(1)).toEqual([1]);
    expect(seriesUp(0)).toEqual([]);
    expect(seriesUp(6)).toEqual([
      1, 1, 2, 1, 2, 3, 1, 2, 3, 4,
      1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6
    ]);
  });

  test('oneTwo', () => {
    expect(oneTwo('abc')).toBe('bca');
    expect(oneTwo('tca')).toBe('cat');
    expect(oneTwo('tcagdo')).toBe('catdog');
    expect(oneTwo('chocolate')).toBe('hocolctea');
    expect(oneTwo('1234567890')).toBe('231564897');
    expect(oneTwo('xabxabxabxabxabxabxab')).toBe('abxabxabxabxabxabxabx');
    expect(oneTwo('abcdefx')).toBe('bcaefd');
    expect(oneTwo('abcdefxy')).toBe('bcaefd');
    expect(oneTwo('abcdefxyz')).toBe('bcaefdyzx');
    expect(oneTwo('')).toBe('');
    expect(oneTwo('x')).toBe('');
    expect(oneTwo('xy')).toBe('');
    expect(oneTwo('xyz')).toBe('yzx');
    const longInput = 'abcdefghijklkmnopqrstuvwxyz1234567890';
    const longExpected = 'bcaefdhigkljmnkpqostrvwuyzx231564897';
    expect(oneTwo(longInput)).toBe(longExpected);
    expect(oneTwo(longInput.substring(0, longInput.length - 1))).toBe(longExpected);
    expect(oneTwo(longInput.substring(0, longInput.length - 2))).toBe(longExpected.substring(0, longExpected.length - 3));
  });

  test('zipZap', () => {
    expect(zipZap('zipXzap')).toBe('zpXzp');
    expect(zipZap('zopzop')).toBe('zpzp');
    expect(zipZap('zzzopzop')).toBe('zzzpzp');
    expect(zipZap('zibzap')).toBe('zibzp');
    expect(zipZap('zip')).toBe('zp');
    expect(zipZap('zi')).toBe('zi');
    expect(zipZap('z')).toBe('z');
    expect(zipZap('')).toBe('');
    expect(zipZap('zzp')).toBe('zp');
    expect(zipZap('abcppp')).toBe('abcppp');
    expect(zipZap('azbcppp')).toBe('azbcppp');
    expect(zipZap('azbcpzpp')).toBe('azbcpzp');
  });

  test('post4', () => {
    expect(post4([2, 4, 1, 2])).toEqual([1, 2]);
    expect(post4([4, 1, 4, 2])).toEqual([2]);
    expect(post4([4, 4, 1, 2, 3])).toEqual([1, 2, 3]);
    expect(post4([4, 2])).toEqual([2]);
    expect(post4([4, 4, 3])).toEqual([3]);
    expect(post4([4, 4])).toEqual([]);
    expect(post4([4])).toEqual([]);
    expect(post4([2, 4, 1, 4, 3, 2])).toEqual([3, 2]);
    expect(post4([4, 1, 4, 2, 2, 2])).toEqual([2, 2, 2]);
    expect(post4([3, 4, 3, 2])).toEqual([3, 2]);
  });

  test('notAlone', () => {
    expect(notAlone([1, 2, 3], 2)).toEqual([1, 3, 3]);
    expect(notAlone([1, 2, 3, 2, 5, 2], 2)).toEqual([1, 3, 3, 5, 5, 2]);
    expect(notAlone([3, 4], 3)).toEqual([3, 4]);
    expect(notAlone([3, 3], 3)).toEqual([3, 3]);
    expect(notAlone([1, 3, 1, 2], 1)).toEqual([1, 3, 3, 2]);
    expect(notAlone([3], 3)).toEqual([3]);
    expect(notAlone([], 3)).toEqual([]);
    expect(notAlone([7, 1, 6], 1)).toEqual([7, 7, 6]);
    expect(notAlone([1, 1, 1], 1)).toEqual([1, 1, 1]);
    expect(notAlone([1, 1, 1, 2], 1)).toEqual([1, 1, 1, 2]);
  });

  test('groupNoAdj', () => {
    expect(groupNoAdj(0, [2, 5, 10, 4], 12)).toBe(true);
    expect(groupNoAdj(0, [2, 5, 10, 4], 14)).toBe(false);
    expect(groupNoAdj(0, [2, 5, 10, 4], 7)).toBe(false);
    expect(groupNoAdj(0, [2, 5, 10, 4, 2], 7)).toBe(true);
    expect(groupNoAdj(0, [2, 5, 10, 4], 9)).toBe(true);
    expect(groupNoAdj(0, [10, 2, 2, 3, 3], 15)).toBe(true);
    expect(groupNoAdj(0, [10, 2, 2, 3, 3], 7)).toBe(false);
    expect(groupNoAdj(0, [], 0)).toBe(true);
    expect(groupNoAdj(0, [1], 1)).toBe(true);
    expect(groupNoAdj(0, [9], 1)).toBe(false);
    expect(groupNoAdj(0, [9], 0)).toBe(true);
    expect(groupNoAdj(0, [5, 10, 4, 1], 11)).toBe(true);
  });

  test('groupSum5', () => {
    expect(groupSum5(0, [2, 5, 10, 4], 19)).toBe(true);
    expect(groupSum5(0, [2, 5, 10, 4], 17)).toBe(true);
    expect(groupSum5(0, [2, 5, 10, 4], 12)).toBe(false);
    expect(groupSum5(0, [2, 5, 4, 10], 12)).toBe(false);
    expect(groupSum5(0, [3, 5, 1], 4)).toBe(false);
    expect(groupSum5(0, [3, 5, 1], 5)).toBe(true);
    expect(groupSum5(0, [1, 3, 5], 5)).toBe(true);
    expect(groupSum5(0, [3, 5, 1], 9)).toBe(false);
    expect(groupSum5(0, [2, 5, 10, 4], 7)).toBe(false);
    expect(groupSum5(0, [2, 5, 10, 4], 15)).toBe(true);
    expect(groupSum5(0, [2, 5, 10, 4], 11)).toBe(false);
    expect(groupSum5(0, [1], 1)).toBe(true);
    expect(groupSum5(0, [9], 1)).toBe(false);
    expect(groupSum5(0, [9], 0)).toBe(true);
    expect(groupSum5(0, [], 0)).toBe(true);
  });

  test('groupSumClump', () => {
    expect(groupSumClump(0, [2, 4, 8], 10)).toBe(true);
    expect(groupSumClump(0, [1, 2, 4, 8, 1], 14)).toBe(true);
    expect(groupSumClump(0, [2, 4, 4, 8], 14)).toBe(false);
    expect(groupSumClump(0, [8, 2, 2, 1], 9)).toBe(true);
    expect(groupSumClump(0, [8, 2, 2, 1], 11)).toBe(false);
    expect(groupSumClump(0, [1], 1)).toBe(true);
    expect(groupSumClump(0, [9], 1)).toBe(false);
  });

  test('splitArray', () => {
    expect(splitArray([2, 2])).toBe(true);
    expect(splitArray([2, 3])).toBe(false);
    expect(splitArray([5, 2, 3])).toBe(true);
    expect(splitArray([5, 2, 2])).toBe(false);
    expect(splitArray([1, 1, 1, 1, 1, 1])).toBe(true);
    expect(splitArray([1, 1, 1, 1, 1])).toBe(false);
    expect(splitArray([])).toBe(true);
    expect(splitArray([1])).toBe(false);
    expect(splitArray([3, 5])).toBe(false);
    expect(splitArray([5, 3, 2])).toBe(true);
    expect(splitArray([2, 2, 10, 10, 1, 1])).toBe(true);
    expect(splitArray([1, 2, 2, 10, 10, 1, 1])).toBe(false);
    expect(splitArray([1, 2, 3, 10, 10, 1, 1])).toBe(true);
  });
});
