/**
 * ap-quiz-02.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-02.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-02.js module.
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
 *         npx jest ap-quiz-02.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-02')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  copyEndy,
  matchUp,
  scoreUp,
  wordsWithout,
  scoresSpecial,
  sumHeights,
  sumHeights2,
  bigHeights,
  userCompare,
  mergeTwo,
  triangle,
  sumDigits,
  count7,
  count8
} = require('./ap-quiz-02');

describe('APQuiz02', () => {

  // Q1
  test('copyEndy', () => {
    expect(copyEndy([9, 11, 90, 22, 6], 2)).toEqual([9, 90]);
    expect(copyEndy([9, 11, 90, 22, 6], 3)).toEqual([9, 90, 6]);
    expect(copyEndy([12, 1, 1, 13, 0, 20], 2)).toEqual([1, 1]);
    expect(copyEndy([12, 1, 1, 13, 0, 20], 3)).toEqual([1, 1, 0]);
    expect(copyEndy([0], 1)).toEqual([0]);
    expect(copyEndy([10, 11, 90], 2)).toEqual([10, 90]);
    expect(copyEndy([90, 22, 100], 2)).toEqual([90, 100]);
    expect(copyEndy([12, 11, 10, 89, 101, 4], 1)).toEqual([10]);
    expect(copyEndy([13, 2, 2, 0], 2)).toEqual([2, 2]);
    expect(copyEndy([13, 2, 2, 0], 3)).toEqual([2, 2, 0]);
    expect(copyEndy([13, 2, 13, 2, 0, 30], 2)).toEqual([2, 2]);
    expect(copyEndy([13, 2, 13, 2, 0, 30], 3)).toEqual([2, 2, 0]);
  });

  // Q2
  test('matchUp', () => {
    expect(matchUp(['aa', 'bb', 'cc'], ['aaa', 'xx', 'bb'])).toBe(1);
    expect(matchUp(['aa', 'bb', 'cc'], ['aaa', 'b', 'bb'])).toBe(2);
    expect(matchUp(['aa', 'bb', 'cc'], ['', '', 'ccc'])).toBe(1);
    expect(matchUp(['', '', 'ccc'], ['aa', 'bb', 'cc'])).toBe(1);
    expect(matchUp(['', '', ''], ['', 'bb', 'cc'])).toBe(0);
    expect(matchUp(['aa', 'bb', 'cc'], ['', '', ''])).toBe(0);
    expect(matchUp(['aa', '', 'ccc'], ['', 'bb', 'cc'])).toBe(1);
    expect(matchUp(['x', 'y', 'z'], ['y', 'z', 'x'])).toBe(0);
    expect(matchUp(['', 'y', 'z'], ['', 'y', 'x'])).toBe(1);
    expect(matchUp(['x', 'y', 'z'], ['xx', 'yyy', 'zzz'])).toBe(3);
    expect(matchUp(['x', 'y', 'z'], ['xx', 'yyy', ''])).toBe(2);
    expect(matchUp(['b', 'x', 'y', 'z'], ['a', 'xx', 'yyy', 'zzz'])).toBe(3);
    expect(matchUp(['aaa', 'bb', 'c'], ['aaa', 'xx', 'bb'])).toBe(1);
  });

  // Q3
  test('scoreUp', () => {
    expect(scoreUp(['a', 'a', 'b', 'b'], ['a', 'c', 'b', 'c'])).toBe(6);
    expect(scoreUp(['a', 'a', 'b', 'b'], ['a', 'a', 'b', 'c'])).toBe(11);
    expect(scoreUp(['a', 'a', 'b', 'b'], ['a', 'a', 'b', 'b'])).toBe(16);
    expect(scoreUp(['a', 'a', 'b', 'b'], ['?', 'c', 'b', '?'])).toBe(3);
    expect(scoreUp(['a', 'a', 'b', 'b'], ['?', 'c', '?', '?'])).toBe(-1);
    expect(scoreUp(['a', 'a', 'b', 'b'], ['c', '?', 'b', 'b'])).toBe(7);
    expect(scoreUp(['a', 'a', 'b', 'b'], ['c', '?', 'b', '?'])).toBe(3);
    expect(scoreUp(['a', 'b', 'c'], ['a', 'c', 'b'])).toBe(2);
    expect(scoreUp(['a', 'a', 'b', 'b', 'c', 'c'], ['a', 'c', 'a', 'c', 'a', 'c'])).toBe(4);
    expect(scoreUp(['a', 'a', 'b', 'b', 'c', 'c'], ['a', 'c', '?', '?', 'a', 'c'])).toBe(6);
    expect(scoreUp(['a', 'a', 'b', 'b', 'c', 'c'], ['a', 'c', '?', '?', 'c', 'c'])).toBe(11);
    expect(scoreUp(['a', 'b', 'c'], ['a', 'b', 'c'])).toBe(12);
  });

  // Q4
  test('wordsWithout', () => {
    expect(wordsWithout(['a', 'b', 'c', 'a'], 'a')).toEqual(['b', 'c']);
    expect(wordsWithout(['a', 'b', 'c', 'a'], 'b')).toEqual(['a', 'c', 'a']);
    expect(wordsWithout(['a', 'b', 'c', 'a'], 'c')).toEqual(['a', 'b', 'a']);
    expect(wordsWithout(['b', 'c', 'a', 'a'], 'b')).toEqual(['c', 'a', 'a']);
    expect(wordsWithout(['xx', 'yyy', 'x', 'yy', 'x'], 'x')).toEqual(['xx', 'yyy', 'yy']);
    expect(wordsWithout(['xx', 'yyy', 'x', 'yy', 'x'], 'yy')).toEqual(['xx', 'yyy', 'x', 'x']);
    expect(wordsWithout(['aa', 'ab', 'ac', 'aa'], 'aa')).toEqual(['ab', 'ac']);
  });

  // Q5
  test('scoresSpecial', () => {
    expect(scoresSpecial([12, 10, 4], [2, 20, 30])).toBe(40);
    expect(scoresSpecial([20, 10, 4], [2, 20, 10])).toBe(40);
    expect(scoresSpecial([12, 11, 4], [2, 20, 31])).toBe(20);
    expect(scoresSpecial([1, 20, 2, 50], [3, 4, 5])).toBe(50);
    expect(scoresSpecial([3, 4, 5], [1, 50, 2, 20])).toBe(50);
    expect(scoresSpecial([10, 4, 20, 30], [20])).toBe(50);
    expect(scoresSpecial([10, 4, 20, 30], [3, 20, 99])).toBe(50);
    expect(scoresSpecial([10, 4, 20, 30], [30, 20, 99])).toBe(60);
    expect(scoresSpecial([], [2])).toBe(0);
    expect(scoresSpecial([], [20])).toBe(20);
    expect(scoresSpecial([14, 10, 4], [4, 20, 30])).toBe(40);
  });

  // Q6
  test('sumHeights', () => {
    expect(sumHeights([5, 3, 6, 7, 2], 2, 4)).toBe(6);
    expect(sumHeights([5, 3, 6, 7, 2], 0, 1)).toBe(2);
    expect(sumHeights([5, 3, 6, 7, 2], 0, 4)).toBe(11);
    expect(sumHeights([5, 3, 6, 7, 2], 1, 1)).toBe(0);
    expect(sumHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)).toBe(3);
  });

  // Q7
  test('sumHeights2', () => {
    expect(sumHeights2([5, 3, 6, 7, 2], 2, 4)).toBe(7);
    expect(sumHeights2([5, 3, 6, 7, 2], 0, 1)).toBe(2);
    expect(sumHeights2([5, 3, 6, 7, 2], 0, 4)).toBe(15);
    expect(sumHeights2([5, 3, 6, 7, 2], 1, 1)).toBe(0);
    expect(sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)).toBe(6);
    expect(sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8)).toBe(19);
    expect(sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 7, 8)).toBe(16);
    expect(sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 8, 8)).toBe(0);
    expect(sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 2, 2)).toBe(0);
    expect(sumHeights2([1, 2, 3, 4, 5, 4, 3, 2, 10], 3, 6)).toBe(4);
    expect(sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 4)).toBe(1);
    expect(sumHeights2([10, 8, 7, 7, 7, 6, 7], 1, 5)).toBe(2);
  });

  // Q8
  test('bigHeights', () => {
    expect(bigHeights([5, 3, 6, 7, 2], 2, 4)).toBe(1);
    expect(bigHeights([5, 3, 6, 7, 2], 0, 1)).toBe(0);
    expect(bigHeights([5, 3, 6, 7, 2], 0, 4)).toBe(1);
    expect(bigHeights([5, 3, 6, 7, 3], 0, 4)).toBe(0);
    expect(bigHeights([5, 3, 6, 7, 2], 1, 1)).toBe(0);
    expect(bigHeights([5, 13, 6, 7, 2], 1, 2)).toBe(1);
    expect(bigHeights([5, 13, 6, 7, 2], 0, 2)).toBe(2);
    expect(bigHeights([5, 13, 6, 7, 2], 1, 4)).toBe(2);
    expect(bigHeights([5, 13, 6, 7, 2], 0, 4)).toBe(3);
    expect(bigHeights([5, 13, 6, 7, 2], 0, 3)).toBe(2);
    expect(bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 0, 3)).toBe(0);
    expect(bigHeights([1, 2, 3, 4, 5, 4, 3, 2, 10], 4, 8)).toBe(1);
    expect(bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 0, 3)).toBe(1);
    expect(bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 7, 8)).toBe(1);
    expect(bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 3, 8)).toBe(2);
    expect(bigHeights([1, 2, 3, 14, 5, 4, 3, 2, 10], 2, 8)).toBe(3);
  });

  // Q9
  test('userCompare', () => {
    expect(userCompare('bb', 1, 'zz', 2)).toBe(-1);
    expect(userCompare('bb', 1, 'aa', 2)).toBe(1);
    expect(userCompare('bb', 1, 'bb', 1)).toBe(0);
    expect(userCompare('bb', 5, 'bb', 1)).toBe(1);
    expect(userCompare('bb', 5, 'bb', 10)).toBe(-1);
    expect(userCompare('adam', 1, 'bob', 2)).toBe(-1);
    expect(userCompare('bob', 1, 'bob', 2)).toBe(-1);
    expect(userCompare('bzb', 1, 'bob', 2)).toBe(1);
  });

  // Q10
  test('mergeTwo', () => {
    expect(mergeTwo(['a', 'c', 'z'], ['b', 'f', 'z'], 3)).toEqual(['a', 'b', 'c']);
    expect(mergeTwo(['a', 'c', 'z'], ['c', 'f', 'z'], 3)).toEqual(['a', 'c', 'f']);
    expect(mergeTwo(['f', 'g', 'z'], ['c', 'f', 'g'], 3)).toEqual(['c', 'f', 'g']);
    expect(mergeTwo(['a', 'c', 'z'], ['a', 'c', 'z'], 3)).toEqual(['a', 'c', 'z']);
    expect(mergeTwo(['a', 'b', 'c', 'z'], ['a', 'c', 'z'], 3)).toEqual(['a', 'b', 'c']);
    expect(mergeTwo(['a', 'c', 'z'], ['a', 'b', 'c', 'z'], 3)).toEqual(['a', 'b', 'c']);
    expect(mergeTwo(['a', 'c', 'z'], ['a', 'c', 'z'], 2)).toEqual(['a', 'c']);
    expect(mergeTwo(['a', 'c', 'z'], ['a', 'c', 'y', 'z'], 3)).toEqual(['a', 'c', 'y']);
    expect(mergeTwo(['x', 'y', 'z'], ['a', 'b', 'z'], 3)).toEqual(['a', 'b', 'x']);
  });

  // Q11
  test('triangle', () => {
    expect(triangle(0)).toBe(0);
    expect(triangle(1)).toBe(1);
    expect(triangle(2)).toBe(3);
    expect(triangle(3)).toBe(6);
    expect(triangle(4)).toBe(10);
    expect(triangle(5)).toBe(15);
    expect(triangle(6)).toBe(21);
    expect(triangle(7)).toBe(28);
  });

  // Q12
  test('sumDigits', () => {
    expect(sumDigits(126)).toBe(9);
    expect(sumDigits(49)).toBe(13);
    expect(sumDigits(12)).toBe(3);
    expect(sumDigits(10)).toBe(1);
    expect(sumDigits(1)).toBe(1);
    expect(sumDigits(0)).toBe(0);
    expect(sumDigits(730)).toBe(10);
    expect(sumDigits(1111)).toBe(4);
    expect(sumDigits(11111)).toBe(5);
    expect(sumDigits(10110)).toBe(3);
    expect(sumDigits(235)).toBe(10);
  });

  // Q13
  test('count7', () => {
    expect(count7(717)).toBe(2);
    expect(count7(7)).toBe(1);
    expect(count7(123)).toBe(0);
    expect(count7(77)).toBe(2);
    expect(count7(7123)).toBe(1);
    expect(count7(771237)).toBe(3);
    expect(count7(771737)).toBe(4);
    expect(count7(47571)).toBe(2);
    expect(count7(777777)).toBe(6);
    expect(count7(70701277)).toBe(4);
    expect(count7(777576197)).toBe(5);
    expect(count7(99999)).toBe(0);
    expect(count7(99799)).toBe(1);
  });

  // Q14
  test('count8', () => {
    expect(count8(8)).toBe(1);
    expect(count8(818)).toBe(2);
    expect(count8(8818)).toBe(4);
    expect(count8(8088)).toBe(4);
    expect(count8(123)).toBe(0);
    expect(count8(81238)).toBe(2);
    expect(count8(88788)).toBe(6);
    expect(count8(8234)).toBe(1);
    expect(count8(2348)).toBe(1);
    expect(count8(23884)).toBe(3);
    expect(count8(0)).toBe(0);
    expect(count8(1818188)).toBe(5);
    expect(count8(8818181)).toBe(5);
    expect(count8(1080)).toBe(1);
    expect(count8(188)).toBe(3);
    expect(count8(88888)).toBe(9);
    expect(count8(9898)).toBe(2);
    expect(count8(78)).toBe(1);
  });

});
