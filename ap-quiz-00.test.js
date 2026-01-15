/**
 * ap-quiz-00.test.js
 *
 * JUnit-style tests in ap-quiz-00.js
 *
 * INSTRUCTIONS:
 *     The ap-quiz-00.test.js file provides Jest tests for the twoSum
 *     method in the ap-quiz-00.js module.
 *
 * DEPENDENCIES:
 *     This test file requires Jest testing framework.
 *     Install dependencies:
 *         npm init -y
 *         npm install --save-dev jest
 *
 * COMPILE & EXECUTE & CLEANUP:
 *
 *     Run all tests:
 *         npm test
 *         OR
 *         npx jest ap-quiz-00.test.js
 *
 *
 * TIP:
 *     - Make sure the require path matches your project structure
 *     - If the file is in the same directory, use: require('./ap-quiz-00')
 *     - If the file is in a src directory, use: require('../src/ap-quiz-00')
 *     - Jest automatically finds files ending in .test.js or .spec.js
 */
const {
  sleepIn,
  frontBack,
  mixStart,
  monkeyTrouble,
  front3,
  startOz,
  sumDouble,
  backAround,
  intMax,
  diff21
} = require('./ap-quiz-00');

describe('APQuiz00', () => {

  // Q1
  test('sleepIn', () => {
    expect(sleepIn(true, true)).toBe(true);
    expect(sleepIn(true, false)).toBe(false);
    expect(sleepIn(false, true)).toBe(true);
    expect(sleepIn(false, false)).toBe(true);
  });

  // Q2
  test('frontBack', () => {
    expect(frontBack("code")).toBe("eodc");
    expect(frontBack("a")).toBe("a");
    expect(frontBack("ab")).toBe("ba");
    expect(frontBack("abc")).toBe("cba");
    expect(frontBack("")).toBe("");
    expect(frontBack("Chocolate")).toBe("ehocolatC");
    expect(frontBack("aavj")).toBe("java");
    expect(frontBack("hello")).toBe("oellh");
  });

  // Q3
  test('mixStart', () => {
    expect(mixStart("mix snacks")).toBe(true);
    expect(mixStart("pix snacks")).toBe(true);
    expect(mixStart("piz snacks")).toBe(false);
    expect(mixStart("nix")).toBe(true);
    expect(mixStart("ni")).toBe(false);
    expect(mixStart("n")).toBe(false);
  });

  // Q4
  test('monkeyTrouble', () => {
    expect(monkeyTrouble(true, true)).toBe(true);
    expect(monkeyTrouble(false, false)).toBe(true);
    expect(monkeyTrouble(true, false)).toBe(false);
    expect(monkeyTrouble(false, true)).toBe(false);
  });

  // Q5
  test('front3', () => {
    expect(front3("Java")).toBe("JavJavJav");
    expect(front3("Chocolate")).toBe("ChoChoCho");
    expect(front3("abc")).toBe("abcabcabc");
    expect(front3("abcXYZ")).toBe("abcabcabc");
    expect(front3("ab")).toBe("ababab");
    expect(front3("a")).toBe("aaa");
    expect(front3("")).toBe("");
  });

  // Q6
  test('startOz', () => {
    expect(startOz("ozymandias")).toBe("oz");
    expect(startOz("bzoo")).toBe("z");
    expect(startOz("oxx")).toBe("o");
    expect(startOz("ounce")).toBe("o");
    expect(startOz("o")).toBe("o");
    expect(startOz("abc")).toBe("");
    expect(startOz("")).toBe("");
    expect(startOz("zoo")).toBe("");
    expect(startOz("aztec")).toBe("z");
    expect(startOz("zzzz")).toBe("z");
    expect(startOz("oznic")).toBe("oz");
  });

  // Q7
  test('sumDouble', () => {
    expect(sumDouble(1, 2)).toBe(3);
    expect(sumDouble(3, 2)).toBe(5);
    expect(sumDouble(2, 2)).toBe(8);
    expect(sumDouble(-1, 0)).toBe(-1);
    expect(sumDouble(3, 3)).toBe(12);
    expect(sumDouble(0, 0)).toBe(0);
    expect(sumDouble(0, 1)).toBe(1);
    expect(sumDouble(3, 4)).toBe(7);
  });

  // Q8
  test('backAround', () => {
    expect(backAround("cat")).toBe("tcatt");
    expect(backAround("Hello")).toBe("oHelloo");
    expect(backAround("a")).toBe("aaa");
    expect(backAround("abc")).toBe("cabcc");
    expect(backAround("read")).toBe("dreadd");
    expect(backAround("boo")).toBe("obooo");
  });

  // Q9
  test('intMax', () => {
    expect(intMax(1, 2, 3)).toBe(3);
    expect(intMax(1, 3, 2)).toBe(3);
    expect(intMax(3, 2, 1)).toBe(3);
    expect(intMax(9, 3, 3)).toBe(9);
    expect(intMax(3, 9, 3)).toBe(9);
    expect(intMax(3, 3, 9)).toBe(9);
    expect(intMax(8, 2, 3)).toBe(8);
    expect(intMax(-3, -1, -2)).toBe(-1);
    expect(intMax(6, 2, 5)).toBe(6);
    expect(intMax(5, 6, 2)).toBe(6);
    expect(intMax(5, 2, 6)).toBe(6);
  });

  // Q10
  test('diff21', () => {
    expect(diff21(19)).toBe(2);
    expect(diff21(10)).toBe(11);
    expect(diff21(21)).toBe(0);
    expect(diff21(22)).toBe(2);
    expect(diff21(25)).toBe(8);
    expect(diff21(30)).toBe(18);
    expect(diff21(0)).toBe(21);
    expect(diff21(1)).toBe(20);
    expect(diff21(2)).toBe(19);
    expect(diff21(-1)).toBe(22);
    expect(diff21(-2)).toBe(23);
    expect(diff21(50)).toBe(58);
  });

});
