const { twoSum } = require('../src/ap-quiz-00');

test('basic example', () => {
  expect(twoSum([2, 7, 11, 15], 9)).toEqual([0, 1]);
});

test('duplicates and negative numbers', () => {
  expect(twoSum([3, 2, 4], 6)).toEqual([1, 2]); // 2 + 4 = 6
  expect(twoSum([-3, 4, 3, 90], 0)).toEqual([0, 2]); // -3 + 3 = 0
});

test('no solution returns null', () => {
  expect(twoSum([1, 2, 3], 7)).toBeNull();
});

test('single element returns null', () => {
  expect(twoSum([5], 5)).toBeNull();
});

test('throws for invalid input', () => {
  expect(() => twoSum(null, 5)).toThrow();
});
