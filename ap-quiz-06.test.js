/**
 * ap-quiz-06.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-06.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-06.js module.
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
 *         npx jest ap-quiz-06.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-06')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  gHappy,
  canBalance,
  no14,
  isEverywhere,
  repeatEnd,
  mixString,
  xyBalance,
  bobThere,
  roundSum,
  countTriple,
  countPairs,
  countAbc,
  count11,
  stringClean
} = require('./ap-quiz-06');

describe('APQuiz06', () => {

  // Q1
  test('gHappy', () => {
    expect(gHappy('xxggxx')).toBe(true);
    expect(gHappy('xxgxx')).toBe(false);
    expect(gHappy('xxggyygxx')).toBe(false);
    expect(gHappy('g')).toBe(false);
    expect(gHappy('gg')).toBe(true);
    expect(gHappy('')).toBe(true);
    expect(gHappy('xxgggxyz')).toBe(true);
    expect(gHappy('xxgggxyg')).toBe(false);
    expect(gHappy('xxgggxygg')).toBe(true);
    expect(gHappy('mgm')).toBe(false);
    expect(gHappy('mggm')).toBe(true);
    expect(gHappy('yyygggxyy')).toBe(true);
  });

  // Q2
  test('canBalance', () => {
    expect(canBalance([1, 1, 1, 2, 1])).toBe(true);
    expect(canBalance([2, 1, 1, 2, 1])).toBe(false);
    expect(canBalance([10, 10])).toBe(true);
    expect(canBalance([10, 0, 1, -1, 10])).toBe(true);
    expect(canBalance([1, 1, 1, 1, 4])).toBe(true);
    expect(canBalance([2, 1, 1, 1, 4])).toBe(false);
    expect(canBalance([2, 3, 4, 1, 2])).toBe(false);
    expect(canBalance([1, 2, 3, 1, 0, 2, 3])).toBe(true);
    expect(canBalance([1, 2, 3, 1, 0, 1, 3])).toBe(false);
    expect(canBalance([1])).toBe(false);
  });

  // Q3
  test('no14', () => {
    expect(no14([1, 2, 3])).toBe(true);
    expect(no14([1, 2, 3, 4])).toBe(false);
    expect(no14([2, 3, 4])).toBe(true);
    expect(no14([1, 1, 4, 4])).toBe(false);
    expect(no14([2, 2, 4, 4])).toBe(true);
    expect(no14([2, 3, 4, 1])).toBe(false);
    expect(no14([2, 1, 1])).toBe(true);
    expect(no14([1, 4])).toBe(false);
    expect(no14([2])).toBe(true);
    expect(no14([2, 1])).toBe(true);
    expect(no14([1])).toBe(true);
    expect(no14([4])).toBe(true);
    expect(no14([])).toBe(true);
    expect(no14([1, 1, 1, 1])).toBe(true);
    expect(no14([9, 4, 4, 1])).toBe(false);
    expect(no14([4, 2, 3, 1])).toBe(false);
    expect(no14([4, 2, 3, 5])).toBe(true);
    expect(no14([4, 4, 2])).toBe(true);
    expect(no14([1, 4, 4])).toBe(false);
  });

  // Q4
  test('isEverywhere', () => {
    expect(isEverywhere([1, 2, 1, 3], 1)).toBe(true);
    expect(isEverywhere([1, 2, 1, 3], 2)).toBe(false);
    expect(isEverywhere([1, 2, 1, 3, 4], 1)).toBe(false);
    expect(isEverywhere([2, 1, 2, 1], 1)).toBe(true);
    expect(isEverywhere([2, 1, 2, 1], 2)).toBe(true);
    expect(isEverywhere([2, 1, 2, 3, 1], 2)).toBe(false);
    expect(isEverywhere([3, 1], 3)).toBe(true);
    expect(isEverywhere([3, 1], 2)).toBe(false);
    expect(isEverywhere([3], 1)).toBe(true);
    expect(isEverywhere([], 1)).toBe(true);
    expect(isEverywhere([1, 2, 1, 2, 3, 2, 5], 2)).toBe(true);
    expect(isEverywhere([1, 2, 1, 1, 1, 2], 2)).toBe(false);
    expect(isEverywhere([2, 1, 2, 1, 1, 2], 2)).toBe(false);
    expect(isEverywhere([2, 1, 2, 2, 2, 1, 1, 2], 2)).toBe(false);
    expect(isEverywhere([2, 1, 2, 2, 2, 1, 2, 1], 2)).toBe(true);
    expect(isEverywhere([2, 1, 2, 1, 2], 2)).toBe(true);
  });

  // Q5
  test('repeatEnd', () => {
    expect(repeatEnd('Hello', 3)).toBe('llollollo');
    expect(repeatEnd('Hello', 2)).toBe('lolo');
    expect(repeatEnd('Hello', 1)).toBe('o');
    expect(repeatEnd('Hello', 0)).toBe('');
    expect(repeatEnd('abc', 3)).toBe('abcabcabc');
    expect(repeatEnd('1234', 2)).toBe('3434');
    expect(repeatEnd('1234', 3)).toBe('234234234');
    expect(repeatEnd('', 0)).toBe('');
  });

  // Q6
  test('mixString', () => {
    expect(mixString('abc', 'xyz')).toBe('axbycz');
    expect(mixString('Hi', 'There')).toBe('HTihere');
    expect(mixString('xxxx', 'There')).toBe('xTxhxexre');
    expect(mixString('xxx', 'X')).toBe('xXxx');
    expect(mixString('2/', '27 around')).toBe('22/7 around');
    expect(mixString('', 'Hello')).toBe('Hello');
    expect(mixString('Abc', '')).toBe('Abc');
    expect(mixString('', '')).toBe('');
    expect(mixString('a', 'b')).toBe('ab');
    expect(mixString('ax', 'b')).toBe('abx');
    expect(mixString('a', 'bx')).toBe('abx');
    expect(mixString('So', 'Long')).toBe('SLoong');
    expect(mixString('Long', 'So')).toBe('LSoong');
  });

  // Q7
  test('xyBalance', () => {
    expect(xyBalance('aaxbby')).toBe(true);
    expect(xyBalance('aaxbb')).toBe(false);
    expect(xyBalance('yaaxbb')).toBe(false);
    expect(xyBalance('yaaxbby')).toBe(true);
    expect(xyBalance('xaxxbby')).toBe(true);
    expect(xyBalance('xaxxbbyx')).toBe(false);
    expect(xyBalance('xxbxy')).toBe(true);
    expect(xyBalance('xxbx')).toBe(false);
    expect(xyBalance('bbb')).toBe(true);
    expect(xyBalance('bxbb')).toBe(false);
    expect(xyBalance('bxyb')).toBe(true);
    expect(xyBalance('xy')).toBe(true);
    expect(xyBalance('y')).toBe(true);
    expect(xyBalance('x')).toBe(false);
    expect(xyBalance('')).toBe(true);
    expect(xyBalance('yxyxyxyx')).toBe(false);
    expect(xyBalance('yxyxyxyxy')).toBe(true);
    expect(xyBalance('12xabxxydxyxyzz')).toBe(true);
  });

  // Q8
  test('bobThere', () => {
    expect(bobThere('abcbob')).toBe(true);
    expect(bobThere('b9b')).toBe(true);
    expect(bobThere('bac')).toBe(false);
    expect(bobThere('bbb')).toBe(true);
    expect(bobThere('abcdefb')).toBe(false);
    expect(bobThere('123abcbcdbabxyz')).toBe(true);
    expect(bobThere('b12')).toBe(false);
    expect(bobThere('b1b')).toBe(true);
    expect(bobThere('b12b1b')).toBe(true);
    expect(bobThere('bbc')).toBe(false);
    expect(bobThere('bb')).toBe(false);
    expect(bobThere('b')).toBe(false);
  });

  // Q9
  test('roundSum', () => {
    expect(roundSum(16, 17, 18)).toBe(60);
    expect(roundSum(12, 13, 14)).toBe(30);
    expect(roundSum(6, 4, 4)).toBe(10);
    expect(roundSum(4, 6, 5)).toBe(20);
    expect(roundSum(4, 4, 6)).toBe(10);
    expect(roundSum(9, 4, 4)).toBe(10);
    expect(roundSum(0, 0, 1)).toBe(0);
    expect(roundSum(0, 9, 0)).toBe(10);
    expect(roundSum(10, 10, 19)).toBe(40);
    expect(roundSum(20, 30, 40)).toBe(90);
    expect(roundSum(45, 21, 30)).toBe(100);
    expect(roundSum(23, 11, 26)).toBe(60);
    expect(roundSum(23, 24, 25)).toBe(70);
    expect(roundSum(25, 24, 25)).toBe(80);
    expect(roundSum(23, 24, 29)).toBe(70);
    expect(roundSum(11, 24, 36)).toBe(70);
    expect(roundSum(24, 36, 32)).toBe(90);
    expect(roundSum(14, 12, 26)).toBe(50);
    expect(roundSum(12, 10, 24)).toBe(40);
  });

  // Q10
  test('countTriple', () => {
    expect(countTriple('abcXXXabc')).toBe(1);
    expect(countTriple('xxxabyyyycd')).toBe(3);
    expect(countTriple('a')).toBe(0);
    expect(countTriple('')).toBe(0);
    expect(countTriple('XXXabc')).toBe(1);
    expect(countTriple('XXXXabc')).toBe(2);
    expect(countTriple('XXXXXabc')).toBe(3);
    expect(countTriple('222abyyycdXXX')).toBe(3);
    expect(countTriple('abYYYabXXXXXab')).toBe(4);
    expect(countTriple('abYYXabXXYXXab')).toBe(0);
    expect(countTriple('122abhhh2')).toBe(1);
  });

  // Q11
  test('countPairs', () => {
    expect(countPairs('axa')).toBe(1);
    expect(countPairs('axax')).toBe(2);
    expect(countPairs('axbx')).toBe(1);
    expect(countPairs('hi')).toBe(0);
    expect(countPairs('hihih')).toBe(3);
    expect(countPairs('ihihhh')).toBe(3);
    expect(countPairs('ihjxhh')).toBe(0);
    expect(countPairs('')).toBe(0);
    expect(countPairs('a')).toBe(0);
    expect(countPairs('aa')).toBe(0);
    expect(countPairs('aaa')).toBe(1);
  });

  // Q12
  test('countAbc', () => {
    expect(countAbc('abc')).toBe(1);
    expect(countAbc('abcxxabc')).toBe(2);
    expect(countAbc('abaxxaba')).toBe(2);
    expect(countAbc('ababc')).toBe(2);
    expect(countAbc('abxbc')).toBe(0);
    expect(countAbc('aaabc')).toBe(1);
    expect(countAbc('hello')).toBe(0);
    expect(countAbc('')).toBe(0);
    expect(countAbc('ab')).toBe(0);
    expect(countAbc('aba')).toBe(1);
    expect(countAbc('aca')).toBe(0);
    expect(countAbc('aaa')).toBe(0);
  });

  // Q13
  test('count11', () => {
    expect(count11('11abc11')).toBe(2);
    expect(count11('abc11x11x11')).toBe(3);
    expect(count11('111')).toBe(1);
    expect(count11('1111')).toBe(2);
    expect(count11('1')).toBe(0);
    expect(count11('')).toBe(0);
    expect(count11('hi')).toBe(0);
    expect(count11('11x111x1111')).toBe(4);
    expect(count11('1x111')).toBe(1);
    expect(count11('1Hello1')).toBe(0);
    expect(count11('Hello')).toBe(0);
  });

  // Q14
  test('stringClean', () => {
    expect(stringClean('yyzzza')).toBe('yza');
    expect(stringClean('abbbcdd')).toBe('abcd');
    expect(stringClean('Hello')).toBe('Helo');
    expect(stringClean('XXabcYY')).toBe('XabcY');
    expect(stringClean('112ab445')).toBe('12ab45');
    expect(stringClean('Hello Bookkeeper')).toBe('Helo Bokeper');
  });
});
