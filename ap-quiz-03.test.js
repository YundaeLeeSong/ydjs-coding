/**
 * ap-quiz-03.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-03.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-03.js module.
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
 *         npx jest ap-quiz-03.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-03')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  commonTwo,
  doubleChar,
  countHi,
  countEvens,
  bigDiff,
  centeredAverage,
  makeBricks,
  countYZ,
  maxSpan,
  catDog,
  powerN,
  countX,
  countHiRecursive,
  changeXY
} = require('./ap-quiz-03');

describe('APQuiz03', () => {

  // Q1
  test('commonTwo', () => {
    expect(commonTwo(['a', 'c', 'x'], ['b', 'c', 'd', 'x'])).toBe(2);
    expect(commonTwo(['a', 'c', 'x'], ['a', 'b', 'c', 'x', 'z'])).toBe(3);
    expect(commonTwo(['a', 'b', 'c'], ['a', 'b', 'c'])).toBe(3);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['a', 'b', 'c'])).toBe(3);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['a', 'b', 'b', 'b', 'c'])).toBe(3);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['a', 'b', 'b', 'c', 'c'])).toBe(3);
    expect(commonTwo(['b', 'b', 'b', 'b', 'c'], ['a', 'b', 'b', 'b', 'c'])).toBe(2);
    expect(commonTwo(['a', 'b', 'c', 'c', 'd'], ['a', 'b', 'b', 'c', 'd', 'd'])).toBe(4);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['b', 'b', 'b'])).toBe(1);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['c', 'c'])).toBe(1);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['b', 'b', 'b', 'x'])).toBe(1);
    expect(commonTwo(['a', 'a', 'b', 'b', 'c'], ['b', 'b'])).toBe(1);
    expect(commonTwo(['a'], ['a', 'b'])).toBe(1);
    expect(commonTwo(['a'], ['b'])).toBe(0);
    expect(commonTwo(['a', 'a'], ['b', 'b'])).toBe(0);
    expect(commonTwo(['a', 'b'], ['a', 'b'])).toBe(2);
  });

  // Q2
  test('doubleChar', () => {
    expect(doubleChar('The')).toBe('TThhee');
    expect(doubleChar('AAbb')).toBe('AAAAbbbb');
    expect(doubleChar('Hi-There')).toBe('HHii--TThheerree');
    expect(doubleChar('Word!')).toBe('WWoorrdd!!');
    expect(doubleChar('!!')).toBe('!!!!');
    expect(doubleChar(')')).toBe('))');
    expect(doubleChar('a')).toBe('aa');
    expect(doubleChar('.')).toBe('..');
    expect(doubleChar('aa')).toBe('aaaa');
  });

  // Q3
  test('countHi', () => {
    expect(countHi('abc hi ho')).toBe(1);
    expect(countHi('ABChi hi')).toBe(2);
    expect(countHi('hihi')).toBe(2);
    expect(countHi('hiHIhi')).toBe(2);
    expect(countHi('')).toBe(0);
    expect(countHi('h')).toBe(0);
    expect(countHi('hi')).toBe(1);
    expect(countHi('Hi is no HI on ahI')).toBe(0);
    expect(countHi('hiho not HOHIhi')).toBe(2);
  });

  // Q4
  test('countEvens', () => {
    expect(countEvens([2, 1, 2, 3, 4])).toBe(3);
    expect(countEvens([2, 2, 0])).toBe(3);
    expect(countEvens([1, 3, 5])).toBe(0);
    expect(countEvens([])).toBe(0);
    expect(countEvens([11, 9, 0, 1])).toBe(1);
    expect(countEvens([2, 11, 9, 0])).toBe(2);
    expect(countEvens([2])).toBe(1);
    expect(countEvens([2, 5, 12])).toBe(2);
  });

  // Q5
  test('bigDiff', () => {
    expect(bigDiff([10, 3, 5, 6])).toBe(7);
    expect(bigDiff([7, 2, 10, 9])).toBe(8);
    expect(bigDiff([2, 10, 7, 2])).toBe(8);
    expect(bigDiff([2, 10])).toBe(8);
    expect(bigDiff([10, 2])).toBe(8);
    expect(bigDiff([10, 0])).toBe(10);
    expect(bigDiff([2, 3])).toBe(1);
    expect(bigDiff([2, 2])).toBe(0);
    expect(bigDiff([2])).toBe(0);
    expect(bigDiff([5, 1, 6, 1, 9, 9])).toBe(8);
    expect(bigDiff([7, 6, 8, 5])).toBe(3);
    expect(bigDiff([7, 7, 6, 8, 5, 5, 6])).toBe(3);
  });

  // Q6
  test('centeredAverage', () => {
    expect(centeredAverage([1, 2, 3, 4, 100])).toBe(3);
    expect(centeredAverage([1, 1, 5, 5, 10, 8, 7])).toBe(5);
    expect(centeredAverage([-10, -4, -2, -4, -2, 0])).toBe(-3);
    expect(centeredAverage([5, 3, 4, 6, 2])).toBe(4);
    expect(centeredAverage([5, 3, 4, 0, 100])).toBe(4);
    expect(centeredAverage([100, 0, 5, 3, 4])).toBe(4);
    expect(centeredAverage([4, 0, 100])).toBe(4);
    expect(centeredAverage([0, 2, 3, 4, 100])).toBe(3);
    expect(centeredAverage([1, 1, 100])).toBe(1);
    expect(centeredAverage([7, 7, 7])).toBe(7);
    expect(centeredAverage([1, 7, 8])).toBe(7);
    expect(centeredAverage([1, 1, 99, 99])).toBe(50);
    expect(centeredAverage([1000, 0, 1, 99])).toBe(50);
    expect(centeredAverage([4, 4, 4, 4, 5])).toBe(4);
    expect(centeredAverage([4, 4, 4, 1, 5])).toBe(4);
    expect(centeredAverage([6, 4, 8, 12, 3])).toBe(6);
  });

  // Q7
  test('makeBricks', () => {
    expect(makeBricks(3, 1, 8)).toBe(true);
    expect(makeBricks(3, 1, 9)).toBe(false);
    expect(makeBricks(3, 2, 10)).toBe(true);
    expect(makeBricks(3, 2, 8)).toBe(true);
    expect(makeBricks(3, 2, 9)).toBe(false);
    expect(makeBricks(6, 1, 11)).toBe(true);
    expect(makeBricks(6, 0, 11)).toBe(false);
    expect(makeBricks(1, 4, 11)).toBe(true);
    expect(makeBricks(0, 3, 10)).toBe(true);
    expect(makeBricks(1, 4, 12)).toBe(false);
    expect(makeBricks(3, 1, 7)).toBe(true);
    expect(makeBricks(1, 1, 7)).toBe(false);
    expect(makeBricks(2, 1, 7)).toBe(true);
    expect(makeBricks(7, 1, 11)).toBe(true);
    expect(makeBricks(7, 1, 8)).toBe(true);
    expect(makeBricks(7, 1, 13)).toBe(false);
    expect(makeBricks(43, 1, 46)).toBe(true);
    expect(makeBricks(40, 1, 46)).toBe(false);
    expect(makeBricks(40, 2, 47)).toBe(true);
    expect(makeBricks(40, 2, 50)).toBe(true);
    expect(makeBricks(40, 2, 52)).toBe(false);
    expect(makeBricks(22, 2, 33)).toBe(false);
    expect(makeBricks(0, 2, 10)).toBe(true);
    expect(makeBricks(1000000, 1000, 1000100)).toBe(true);
    expect(makeBricks(2, 1000000, 100003)).toBe(false);
    expect(makeBricks(20, 0, 19)).toBe(true);
    expect(makeBricks(20, 0, 21)).toBe(false);
    expect(makeBricks(20, 4, 51)).toBe(false);
    expect(makeBricks(20, 4, 39)).toBe(true);
  });

  // Q8
  test('countYZ', () => {
    expect(countYZ('fez day')).toBe(2);
    expect(countYZ('day fez')).toBe(2);
    expect(countYZ('day fyyyz')).toBe(2);
    expect(countYZ('day yak')).toBe(1);
    expect(countYZ('day:yak')).toBe(1);
    expect(countYZ('!!day--yaz!!')).toBe(2);
    expect(countYZ('yak zak')).toBe(0);
    expect(countYZ('DAY abc XYZ')).toBe(2);
    expect(countYZ('aaz yyz my')).toBe(3);
    expect(countYZ('y2bz')).toBe(2);
    expect(countYZ('zxyx')).toBe(0);
  });

  // Q9
  test('maxSpan', () => {
    expect(maxSpan([1, 2, 1, 1, 3])).toBe(4);
    expect(maxSpan([1, 4, 2, 1, 4, 1, 4])).toBe(6);
    expect(maxSpan([1, 4, 2, 1, 4, 4, 4])).toBe(6);
    expect(maxSpan([3, 3, 3])).toBe(3);
    expect(maxSpan([3, 9, 3])).toBe(3);
    expect(maxSpan([3, 9, 9])).toBe(2);
    expect(maxSpan([3, 9])).toBe(1);
    expect(maxSpan([3, 3])).toBe(2);
    expect(maxSpan([])).toBe(0);
    expect(maxSpan([1])).toBe(1);
  });

  // Q10
  test('catDog', () => {
    expect(catDog('catdog')).toBe(true);
    expect(catDog('catcat')).toBe(false);
    expect(catDog('1cat1cadodog')).toBe(true);
    expect(catDog('catxxdogxxxdog')).toBe(false);
    expect(catDog('catxdogxdogxcat')).toBe(true);
    expect(catDog('catxdogxdogxca')).toBe(false);
    expect(catDog('dogdogcat')).toBe(false);
    expect(catDog('dogogcat')).toBe(true);
    expect(catDog('dog')).toBe(false);
    expect(catDog('cat')).toBe(false);
    expect(catDog('ca')).toBe(true);
    expect(catDog('c')).toBe(true);
    expect(catDog('')).toBe(true);
  });

  // Q11
  test('powerN', () => {
    expect(powerN(3, 1)).toBe(3);
    expect(powerN(3, 2)).toBe(9);
    expect(powerN(3, 3)).toBe(27);
    expect(powerN(2, 1)).toBe(2);
    expect(powerN(2, 2)).toBe(4);
    expect(powerN(2, 3)).toBe(8);
    expect(powerN(2, 4)).toBe(16);
    expect(powerN(2, 5)).toBe(32);
    expect(powerN(10, 1)).toBe(10);
    expect(powerN(10, 2)).toBe(100);
    expect(powerN(10, 3)).toBe(1000);
  });

  // Q12
  test('countX', () => {
    expect(countX('xxhixx')).toBe(4);
    expect(countX('xhixhix')).toBe(3);
    expect(countX('hi')).toBe(0);
    expect(countX('h')).toBe(0);
    expect(countX('x')).toBe(1);
    expect(countX('')).toBe(0);
    expect(countX('hihi')).toBe(0);
    expect(countX('hiAAhi12hi')).toBe(0);
  });

  // Q13
  test('countHiRecursive', () => {
    expect(countHiRecursive('xxhixx')).toBe(1);
    expect(countHiRecursive('xhixhix')).toBe(2);
    expect(countHiRecursive('hi')).toBe(1);
    expect(countHiRecursive('hihih')).toBe(2);
    expect(countHiRecursive('h')).toBe(0);
    expect(countHiRecursive('')).toBe(0);
    expect(countHiRecursive('ihihihihih')).toBe(4);
    expect(countHiRecursive('ihihihihihi')).toBe(5);
    expect(countHiRecursive('hiAAhi12hi')).toBe(3);
    expect(countHiRecursive('xhixhxihihhhih')).toBe(3);
    expect(countHiRecursive('ship')).toBe(1);
  });

  // Q14
  test('changeXY', () => {
    expect(changeXY('codex')).toBe('codey');
    expect(changeXY('xxhixx')).toBe('yyhiyy');
    expect(changeXY('xhixhix')).toBe('yhiyhiy');
    expect(changeXY('hiy')).toBe('hiy');
    expect(changeXY('h')).toBe('h');
    expect(changeXY('x')).toBe('y');
    expect(changeXY('')).toBe('');
    expect(changeXY('xxx')).toBe('yyy');
    expect(changeXY('yyhxyi')).toBe('yyhyyi');
    expect(changeXY('hihi')).toBe('hihi');
  });
});
