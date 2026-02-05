/**
 * ap-quiz-04.test.js
 *
 * JUnit-style tests for the functions in ap-quiz-04.js
 *
 * INSTRUCTIONS:
 *     This file provides Jest tests for the methods in the ap-quiz-04.js module.
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
 *         npx jest ap-quiz-04.test.js
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-04')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  countCode,
  sum13,
  has22,
  loneSum,
  withoutString,
  fix34,
  endOther,
  xyzThere,
  lucky13,
  sum28,
  changePi,
  noX,
  array6,
  array11
} = require('./ap-quiz-04');

describe('APQuiz04', () => {

  // Q1
  test('countCode', () => {
    expect(countCode('aaacodebbb')).toBe(1);
    expect(countCode('codexxcode')).toBe(2);
    expect(countCode('cozexxcope')).toBe(2);
    expect(countCode('cozfxxcope')).toBe(1);
    expect(countCode('xxcozeyycop')).toBe(1);
    expect(countCode('cozcop')).toBe(0);
    expect(countCode('abcxyz')).toBe(0);
    expect(countCode('code')).toBe(1);
    expect(countCode('ode')).toBe(0);
    expect(countCode('c')).toBe(0);
    expect(countCode('')).toBe(0);
    expect(countCode('AAcodeBBcoleCCccoreDD')).toBe(3);
    expect(countCode('AAcodeBBcoleCCccorfDD')).toBe(2);
    expect(countCode('coAcodeBcoleccoreDD')).toBe(3);
  });

  // Q2
  test('sum13', () => {
    expect(sum13([1, 2, 2, 1])).toBe(6);
    expect(sum13([1, 1])).toBe(2);
    expect(sum13([1, 2, 2, 1, 13])).toBe(6);
    expect(sum13([1, 2, 13, 2, 1, 13])).toBe(4);
    expect(sum13([13, 1, 2, 13, 2, 1, 13])).toBe(3);
    expect(sum13([])).toBe(0);
    expect(sum13([13])).toBe(0);
    expect(sum13([13, 13])).toBe(0);
    expect(sum13([13, 0, 13])).toBe(0);
    expect(sum13([13, 1, 13])).toBe(0);
    expect(sum13([5, 7, 2])).toBe(14);
    expect(sum13([5, 13, 2])).toBe(5);
    expect(sum13([0])).toBe(0);
    expect(sum13([13, 0])).toBe(0);
  });

  // Q3
  test('has22', () => {
    expect(has22([1, 2, 2])).toBe(true);
    expect(has22([1, 2, 1, 2])).toBe(false);
    expect(has22([2, 1, 2])).toBe(false);
    expect(has22([2, 2, 1, 2])).toBe(true);
    expect(has22([1, 3, 2])).toBe(false);
    expect(has22([1, 3, 2, 2])).toBe(true);
    expect(has22([2, 3, 2, 2])).toBe(true);
    expect(has22([4, 2, 4, 2, 2, 5])).toBe(true);
    expect(has22([1, 2])).toBe(false);
    expect(has22([2, 2])).toBe(true);
    expect(has22([2])).toBe(false);
    expect(has22([])).toBe(false);
    expect(has22([3, 3, 2, 2])).toBe(true);
    expect(has22([5, 2, 5, 2])).toBe(false);
  });

  // Q4
  test('loneSum', () => {
    expect(loneSum(1, 2, 3)).toBe(6);
    expect(loneSum(3, 2, 3)).toBe(2);
    expect(loneSum(3, 3, 3)).toBe(0);
    expect(loneSum(9, 2, 2)).toBe(9);
    expect(loneSum(2, 2, 9)).toBe(9);
    expect(loneSum(2, 9, 2)).toBe(9);
    expect(loneSum(2, 9, 3)).toBe(14);
    expect(loneSum(4, 2, 3)).toBe(9);
    expect(loneSum(1, 3, 1)).toBe(3);
  });

  // Q5
  test('withoutString', () => {
    expect(withoutString('Hello there', 'llo')).toBe('He there');
    expect(withoutString('Hello there', 'e')).toBe('Hllo thr');
    expect(withoutString('Hello there', 'x')).toBe('Hello there');
    expect(withoutString('This is a FISH', 'IS')).toBe('Th  a FH');
    expect(withoutString('THIS is a FISH', 'is')).toBe('TH  a FH');
    expect(withoutString('abxxxxab', 'xx')).toBe('abab');
    expect(withoutString('abxxxab', 'xx')).toBe('abxab');
    expect(withoutString('abxxxab', 'x')).toBe('abab');
    expect(withoutString('xxx', 'x')).toBe('');
    expect(withoutString('xxx', 'xx')).toBe('x');
    expect(withoutString('xyzzy', 'Y')).toBe('xzz');
    expect(withoutString('', 'x')).toBe('');
    expect(withoutString('abcabc', 'b')).toBe('acac');
    expect(withoutString('AA22bb', '2')).toBe('AAbb');
    expect(withoutString('1111', '1')).toBe('');
    expect(withoutString('1111', '11')).toBe('');
    expect(withoutString('MkjtMkx', 'Mk')).toBe('jtx');
    expect(withoutString('Hi HoHo', 'Ho')).toBe('Hi ');
  });

  // Q6
  test('fix34', () => {
    expect(fix34([1, 3, 1, 4])).toEqual([1, 3, 4, 1]);
    expect(fix34([1, 3, 1, 4, 4, 3, 1])).toEqual([1, 3, 4, 1, 1, 3, 4]);
    expect(fix34([3, 2, 2, 4])).toEqual([3, 4, 2, 2]);
    expect(fix34([3, 2, 3, 2, 4, 4])).toEqual([3, 4, 3, 4, 2, 2]);
    expect(fix34([2, 3, 2, 3, 2, 4, 4])).toEqual([2, 3, 4, 3, 4, 2, 2]);
    expect(fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5])).toEqual([5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]);
    expect(fix34([3, 1, 4])).toEqual([3, 4, 1]);
    expect(fix34([3, 4, 1])).toEqual([3, 4, 1]);
    expect(fix34([1, 1, 1])).toEqual([1, 1, 1]);
    expect(fix34([1])).toEqual([1]);
    expect(fix34([])).toEqual([]);
    expect(fix34([7, 3, 7, 7, 4])).toEqual([7, 3, 4, 7, 7]);
    expect(fix34([3, 1, 4, 3, 1, 4])).toEqual([3, 4, 1, 3, 4, 1]);
    expect(fix34([3, 1, 1, 3, 4, 4])).toEqual([3, 4, 1, 3, 4, 1]);
  });

  // Q7
  test('endOther', () => {
    expect(endOther('Hiabc', 'abc')).toBe(true);
    expect(endOther('AbC', 'HiaBc')).toBe(true);
    expect(endOther('abc', 'abXabc')).toBe(true);
    expect(endOther('Hiabc', 'abcd')).toBe(false);
    expect(endOther('Hiabc', 'bc')).toBe(true);
    expect(endOther('Hiabcx', 'bc')).toBe(false);
    expect(endOther('abc', 'abc')).toBe(true);
    expect(endOther('xyz', '12xyz')).toBe(true);
    expect(endOther('yz', '12xz')).toBe(false);
    expect(endOther('Z', '12xz')).toBe(true);
    expect(endOther('12', '12')).toBe(true);
    expect(endOther('abcXYZ', 'abcDEF')).toBe(false);
    expect(endOther('ab', 'ab12')).toBe(false);
    expect(endOther('ab', '12ab')).toBe(true);
  });

  // Q8
  test('xyzThere', () => {
    expect(xyzThere('abcxyz')).toBe(true);
    expect(xyzThere('abc.xyz')).toBe(false);
    expect(xyzThere('xyz.abc')).toBe(true);
    expect(xyzThere('abcxy')).toBe(false);
    expect(xyzThere('xyz')).toBe(true);
    expect(xyzThere('xy')).toBe(false);
    expect(xyzThere('x')).toBe(false);
    expect(xyzThere('')).toBe(false);
    expect(xyzThere('abc.xyzxyz')).toBe(true);
    expect(xyzThere('abc.xxyz')).toBe(true);
    expect(xyzThere('.xyz')).toBe(false);
    expect(xyzThere('12.xyz')).toBe(false);
    expect(xyzThere('12xyz')).toBe(true);
    expect(xyzThere('1.xyz.xyz2.xyz')).toBe(false);
  });

  // Q9
  test('lucky13', () => {
    expect(lucky13([0, 2, 4])).toBe(true);
    expect(lucky13([1, 2, 3])).toBe(false);
    expect(lucky13([1, 2, 4])).toBe(false);
    expect(lucky13([2, 7, 2, 8])).toBe(true);
    expect(lucky13([2, 7, 1, 8])).toBe(false);
    expect(lucky13([3, 7, 2, 8])).toBe(false);
    expect(lucky13([2, 7, 2, 1])).toBe(false);
    expect(lucky13([1, 2])).toBe(false);
    expect(lucky13([2, 2])).toBe(true);
    expect(lucky13([2])).toBe(true);
    expect(lucky13([3])).toBe(false);
    expect(lucky13([])).toBe(true);
  });

  // Q10
  test('sum28', () => {
    expect(sum28([2, 3, 2, 2, 4, 2])).toBe(true);
    expect(sum28([2, 3, 2, 2, 4, 2, 2])).toBe(false);
    expect(sum28([1, 2, 3, 4])).toBe(false);
    expect(sum28([2, 2, 2, 2])).toBe(true);
    expect(sum28([1, 2, 2, 2, 2, 4])).toBe(true);
    expect(sum28([])).toBe(false);
    expect(sum28([2])).toBe(false);
    expect(sum28([8])).toBe(false);
    expect(sum28([2, 2, 2])).toBe(false);
    expect(sum28([2, 2, 2, 2, 2])).toBe(false);
    expect(sum28([1, 2, 2, 1, 2, 2])).toBe(true);
    expect(sum28([5, 2, 2, 2, 4, 2])).toBe(true);
  });

  // Q11
  test('changePi', () => {
    expect(changePi('xpix')).toBe('x3.14x');
    expect(changePi('pipi')).toBe('3.143.14');
    expect(changePi('pip')).toBe('3.14p');
    expect(changePi('pi')).toBe('3.14');
    expect(changePi('hip')).toBe('hip');
    expect(changePi('p')).toBe('p');
    expect(changePi('x')).toBe('x');
    expect(changePi('')).toBe('');
    expect(changePi('pixx')).toBe('3.14xx');
    expect(changePi('xyzzy')).toBe('xyzzy');
  });

  // Q12
  test('noX', () => {
    expect(noX('xaxb')).toBe('ab');
    expect(noX('abc')).toBe('abc');
    expect(noX('xx')).toBe('');
    expect(noX('')).toBe('');
    expect(noX('axxbxx')).toBe('ab');
    expect(noX('Hellox')).toBe('Hello');
  });

  // Q13
  test('array6', () => {
    expect(array6([1, 6, 4], 0)).toBe(true);
    expect(array6([1, 4], 0)).toBe(false);
    expect(array6([6], 0)).toBe(true);
    expect(array6([], 0)).toBe(false);
    expect(array6([6, 2, 2], 0)).toBe(true);
    expect(array6([2, 5], 0)).toBe(false);
    expect(array6([1, 9, 4, 6, 6], 0)).toBe(true);
    expect(array6([2, 5, 6], 0)).toBe(true);
  });

  // Q14
  test('array11', () => {
    expect(array11([1, 2, 11], 0)).toBe(1);
    expect(array11([11, 11], 0)).toBe(2);
    expect(array11([1, 2, 3, 4], 0)).toBe(0);
    expect(array11([1, 11, 3, 11, 11], 0)).toBe(3);
    expect(array11([11], 0)).toBe(1);
    expect(array11([1], 0)).toBe(0);
    expect(array11([], 0)).toBe(0);
    expect(array11([11, 2, 3, 4, 11, 5], 0)).toBe(2);
    expect(array11([11, 5, 11], 0)).toBe(2);
  });
});
