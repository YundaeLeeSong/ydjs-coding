#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Instructions to run the tests via the CLI:
    1. Open your terminal or command prompt.
    2. Run the tests by executing: `python _coding-pop_algo/ap_quiz_package10.py`

This is a list of quiz questions for practice, including:
1.  evenlySpaced: Check if three integers are evenly spaced.
2.  makeChocolate: Calculate small bars needed to make goal kilos using big and small bars.
3.  sumNumbers: Sum all numbers (sequences of digits) appearing in a string.
4.  maxMirror: Find the length of the largest mirror section in a list.
5.  starOut: Remove stars and adjacent characters from a string.
6.  notReplace: Replace standalone "is" with "is not" using regex.
7.  countClumps: Count the number of clumps (2+ adjacent equal values) in a list.
8.  evenOdd: Rearrange a list so evens come before odds.
9.  fizzBuzz: Generate FizzBuzz sequence as strings.
10. longest_consecutive: Find length of longest consecutive integer sequence in O(n) time.
11. splitOdd10: Recursively determine if array can be split into two groups where one sum is multiple of 10 and other is odd.
12. split53: Recursively determine if array can be split into two equal-sum groups with constraints on multiples of 5 and 3.
13. power: Compute base raised to power using exponentiation by squaring (O(log n)).
14. fibonacci: Compute the nth Fibonacci number using recursion.
15. climbStairs: Find number of distinct ways to climb n stairs (1 or 2 steps at a time).
16. quickSort: Sort a list using the quick sort algorithm (divide-and-conquer).
17. mergeSort: Sort a list using the merge sort algorithm (divide-and-conquer with merging).
18. merge: Helper function for merge sort to combine two sorted lists.
"""

# Import the unittest module, needed for creating test cases.
# We only need to import it once at the top of the file.
import unittest

# Import re module for regex operations (used in notReplace)
import re

# Import List from the typing module for type hinting (e.g., List[str])
# This is preferred for compatibility with Python versions < 3.10
from typing import List











# -----------------------------------------------------------------
# Question 1: evenlySpaced
# -----------------------------------------------------------------
def evenlySpaced(a: int, b: int, c: int) -> bool:
    """
    Description:
        Given three ints, one of them is small, one is medium, and one is large.
        Return true if the three values are evenly spaced, so the difference
        between small and medium is the same as the difference between medium and large.

    Examples:
        evenlySpaced(2, 4, 6) -> True
        evenlySpaced(4, 6, 2) -> True
        evenlySpaced(4, 6, 3) -> False

    Args:
        a (int): First integer.
        b (int): Second integer.
        c (int): Third integer.

    Returns:
        bool: True if the numbers are evenly spaced, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 2: makeChocolate
# -----------------------------------------------------------------
def makeChocolate(small: int, big: int, goal: int) -> int:
    """
    Description:
        We want to make a package of `goal` kilos of chocolate. We have small bars
        (1 kilo each) and big bars (5 kilos each). Return the number of small bars
        to use, assuming we always use big bars before small bars. Return -1 if it
        can't be done.

    Examples:
        makeChocolate(4, 1, 9) -> 4
        makeChocolate(4, 1, 10) -> -1
        makeChocolate(4, 1, 7) -> 2

    Args:
        small (int): Number of small 1-kg bars available.
        big   (int): Number of big 5-kg bars available.
        goal  (int): Target weight in kilos.

    Returns:
        int: The number of small bars to use, or -1 if the goal cannot be met.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return -1


# -----------------------------------------------------------------
# Question 3: sumNumbers
# -----------------------------------------------------------------
def sumNumbers(s: str) -> int:
    """
    Description:
        Given a string, return the sum of the numbers appearing in the string,
        ignoring all other characters. A number is a series of one or more digit
        characters in a row.

    Examples:
        sumNumbers("abc123xyz") -> 123
        sumNumbers("aa11b33") -> 44
        sumNumbers("7 11") -> 18

    Args:
        s (str): The input string containing digits and other characters.

    Returns:
        int: The sum of all numbers found in the string.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 4: maxMirror
# -----------------------------------------------------------------
def maxMirror(nums: list[int]) -> int:
    """
    Description:
        We'll say that a "mirror" section in an array is a group of contiguous elements
        such that somewhere in the array, the same group appears in reverse order.
        Return the size of the largest mirror section found in the given array.

    Examples:
        maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) -> 3
        maxMirror([1, 2, 1, 4]) -> 3
        maxMirror([7, 1, 2, 9, 7, 2, 1]) -> 2

    Args:
        nums (list[int]): The list of integers to examine.

    Returns:
        int: The length of the largest mirror section.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 5: starOut
# -----------------------------------------------------------------
def starOut(s: str) -> str:
    """
    Description:
        Return a version of the given string where for every star (*) in the string,
        the star and the characters immediately to its left and right are removed.
        So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    Examples:
        starOut("ab*cd") -> "ad"
        starOut("ab**cd") -> "ad"
        starOut("sm*eilly") -> "silly"

    Args:
        s (str): The input string.

    Returns:
        str: The processed string with stars and adjacent chars removed.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 6: notReplace
# -----------------------------------------------------------------
def notReplace(s: str) -> str:
    """
    Description:
        Given a string, return a new string where every appearance of the lowercase word "is"
        has been replaced with "is not". The word "is" should not be immediately preceded or
        followed by a letter — so for example the "is" in "this" does not count.

    Examples:
        notReplace("is test") -> "is not test"
        notReplace("is-is") -> "is not-is not"
        notReplace("This is right") -> "This is not right"
        notReplace("This is isabell") -> "This is not isabell"

    Args:
        s (str): The input string.

    Returns:
        str: The modified string with standalone "is" replaced by "is not".
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    # Note: Can use regex with negative lookbehind/lookahead to ensure "is" is not part of a larger word
    # return re.sub(r'(?<![A-Za-z])is(?![A-Za-z])', 'is not', s)
    return ""


# -----------------------------------------------------------------
# Question 7: countClumps
# -----------------------------------------------------------------
def countClumps(nums: list[int]) -> int:
    """
    Description:
        Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
        Return the number of clumps in the given array.

    Examples:
        countClumps([1, 2, 2, 3, 4, 4]) -> 2
        countClumps([1, 1, 2, 1, 1]) -> 2
        countClumps([1, 1, 1, 1, 1]) -> 1

    Args:
        nums (list[int]): The input list of integers.

    Returns:
        int: The number of clumps in the list.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 8: evenOdd
# -----------------------------------------------------------------
def evenOdd(nums: list[int]) -> list[int]:
    """
    Description:
        Return a list containing the same numbers as the given list `nums`, 
        but rearranged so that all even numbers come before all odd numbers.
        The relative order among evens or among odds does not matter.

    Examples:
        evenOdd([1, 0, 1, 0, 0, 1, 1]) -> [0, 0, 0, 1, 1, 1, 1]
        evenOdd([3, 3, 2]) -> [2, 3, 3]
        evenOdd([2, 2, 2]) -> [2, 2, 2]

    Args:
        nums (list[int]): The input list of integers.

    Returns:
        list[int]: A list with evens first followed by odds.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 9: fizzBuzz
# -----------------------------------------------------------------
def fizzBuzz(start: int, end: int) -> list[str]:
    """
    Description:
        Generate the FizzBuzz sequence as strings for numbers from `start` up to but not including `end`.
        - For multiples of 3, use "Fizz".
        - For multiples of 5, use "Buzz".
        - For multiples of both 3 and 5, use "FizzBuzz".
        - Otherwise, use the number itself.

    Examples:
        fizzBuzz(1, 6) -> ["1", "2", "Fizz", "4", "Buzz"]
        fizzBuzz(1, 8) -> ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        fizzBuzz(1, 11) -> ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

    Args:
        start (int): The starting integer (inclusive).
        end (int): The ending integer (exclusive).

    Returns:
        list[str]: The FizzBuzz sequence as a list of strings.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 10: longest_consecutive
# -----------------------------------------------------------------
def longest_consecutive(nums: list) -> int:
    """
    Description:
        Find the length of the longest run of consecutive integers in an unsorted list,
        in O(n) time by leveraging a set for uniqueness and constant-time membership tests.

    Examples:
        longest_consecutive([100, 4, 200, 1, 3, 2]) -> 4   # sequence is [1,2,3,4]
        longest_consecutive([0, -1, 1, 2, -2, 5]) -> 5   # sequence is [-2,-1,0,1,2]

    Args:
        nums (list): Unsorted list of integers.
    
    Returns:
        int: Length of the longest run of consecutive integers.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 11: splitOdd10
# -----------------------------------------------------------------
def splitOdd10(nums: list[int]) -> bool:
    """
    Description:
        Given an array of ints, determine recursively if it is 
        possible to divide the ints into two groups,
        such that the sum of one group is a multiple of 10 and 
        the sum of the other group is odd.
        Every int must be in one group or the other. This is 
        solved by recursively assigning each number
        to one of two groups and then checking if one group's 
        sum is divisible by 10 and the other's sum is odd.

    Examples:
        splitOdd10([5,5,5]) -> True
        splitOdd10([5,5,6]) -> False
        splitOdd10([5,5,6,1]) -> True

    Args:
        nums (list[int]): The input list of integers.

    Returns:
        bool: True if it is possible to split the array into two 
              groups meeting the conditions, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 12: split53
# -----------------------------------------------------------------
def split53(nums: list[int]) -> bool:
    """
    Description:
        Given an array of ints, determine recursively if it is 
        possible to divide the ints into 
        two groups such that the sum of the two groups is the same, 
        with these constraints:
          - All multiples of 5 must be in one group.
          - All multiples of 3 (that are not multiples of 5) must 
          be in the other group.
        Every int must be in one group or the other.

    Examples:
        split53([1, 1]) -> True
        split53([1, 1, 1]) -> False
        split53([2, 4, 2]) -> True

    Args:
        nums (list[int]): The input list of integers.

    Returns:
        bool: True if the array can be split according to the conditions, otherwise False.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 13: power
# -----------------------------------------------------------------
def power(base: int, exp: int) -> int:
    """
    Description:
        Compute base raised to the power of exp using the exponentiation by squaring algorithm.
        This is an efficient recursive method that reduces the number of multiplications from O(n)
        (naive approach) to O(log n) by repeatedly squaring the base and halving the exponent.

    Examples:
        power(2, 0) -> 1       # Any number to the power of 0 is 1
        power(2, 1) -> 2       # Base case: return base
        power(2, 4) -> 16      # 2^4 = 16
        power(3, 5) -> 243    # 3^5 = 243
        power(5, 3) -> 125    # 5^3 = 125

    Args:
        base (int): The base number to be raised to a power.
        exp  (int): The exponent (non-negative integer).

    Returns:
        int: The result of base raised to the power of exp.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 14: fibonacci
# -----------------------------------------------------------------
def fibonacci(n: int) -> int:
    """
    Description:
        Compute the nth Fibonacci number using recursion. The Fibonacci sequence
        is defined as: F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1.
        Each number is the sum of the two preceding ones.
        
        Note: This recursive implementation has exponential time complexity O(2^n).
        For production code, use memoization or iteration for better performance.

    Examples:
        fibonacci(0) -> 0
        fibonacci(1) -> 1
        fibonacci(2) -> 1
        fibonacci(5) -> 5
        fibonacci(10) -> 55

    Args:
        n (int): A non-negative integer representing the position in the Fibonacci sequence.

    Returns:
        int: The nth Fibonacci number.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 15: climbStairs
# -----------------------------------------------------------------
def climbStairs(n: int) -> int:
    """
    Description:
        Find the number of distinct ways to climb a staircase with n steps,
        where you can take either 1 step or 2 steps at a time.
        
        This problem is similar to the Fibonacci sequence because:
        - To reach step n, you can come from step (n-1) or step (n-2)
        - Number of ways to reach n = ways to reach (n-1) + ways to reach (n-2)
        - Base cases: 1 way to reach step 1, 2 ways to reach step 2

    Examples:
        climbStairs(1) -> 1   # [1]
        climbStairs(2) -> 2   # [1,1] or [2]
        climbStairs(3) -> 3   # [1,1,1], [1,2], or [2,1]
        climbStairs(4) -> 5   # [1,1,1,1], [1,1,2], [1,2,1], [2,1,1], [2,2]
        climbStairs(5) -> 8   # Similar pattern

    Args:
        n (int): The number of steps in the staircase (n >= 1).

    Returns:
        int: The number of distinct ways to climb the staircase.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 16: quickSort
# -----------------------------------------------------------------
def quickSort(arr: List[int]) -> List[int]:
    """
    Description:
        Sort a list of integers using the Quick Sort algorithm.
        Quick Sort is a divide-and-conquer algorithm that works by:
        1. Selecting a pivot element
        2. Partitioning the array into three parts:
           - Elements less than the pivot
           - Elements equal to the pivot
           - Elements greater than the pivot
        3. Recursively sorting the left and right parts
        4. Combining: left + middle + right

    Examples:
        quickSort([3, 6, 8, 10, 1, 2, 1]) -> [1, 1, 2, 3, 6, 8, 10]
        quickSort([38, 27, 43, 3, 9, 82, 10]) -> [3, 9, 10, 27, 38, 43, 82]
        quickSort([5, 2, 8, 1, 9]) -> [1, 2, 5, 8, 9]

    Args:
        arr (List[int]): The list of integers to sort.

    Returns:
        List[int]: A new sorted list containing all elements from arr.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 17: mergeSort
# -----------------------------------------------------------------
def mergeSort(arr: List[int]) -> List[int]:
    """
    Description:
        Sort a list of integers using the Merge Sort algorithm.
        Merge Sort is a divide-and-conquer algorithm that works by:
        1. Dividing the array into two halves
        2. Recursively sorting each half
        3. Merging the two sorted halves into a single sorted array

    Examples:
        mergeSort([38, 27, 43, 3, 9, 82, 10]) -> [3, 9, 10, 27, 38, 43, 82]
        mergeSort([3, 6, 8, 10, 1, 2, 1]) -> [1, 1, 2, 3, 6, 8, 10]
        mergeSort([5, 2, 8, 1, 9]) -> [1, 2, 5, 8, 9]

    Args:
        arr (List[int]): The list of integers to sort.

    Returns:
        List[int]: A new sorted list containing all elements from arr.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 18: merge (Helper Function for Merge Sort)
# -----------------------------------------------------------------
def merge(left: List[int], right: List[int]) -> List[int]:
    """
    Description:
        Merge two sorted lists into a single sorted list.
        This is a helper function used by mergeSort to combine two
        sorted halves of an array.
        
        Algorithm:
        1. Compare the first elements of both lists
        2. Append the smaller element to the result
        3. Remove it from its list
        4. Repeat until one list is empty
        5. Append remaining elements from the non-empty list

    Examples:
        merge([1, 3, 5], [2, 4, 6]) -> [1, 2, 3, 4, 5, 6]
        merge([2, 4], [1, 3, 5]) -> [1, 2, 3, 4, 5]
        merge([1, 2, 3], []) -> [1, 2, 3]
        merge([], [4, 5, 6]) -> [4, 5, 6]

    Args:
        left (List[int]): A sorted list of integers.
        right (List[int]): A sorted list of integers.

    Returns:
        List[int]: A new sorted list containing all elements from both lists.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Unit Tests
# -----------------------------------------------------------------
class TestEvenlySpaced(unittest.TestCase):
    def test_evenlySpaced(self):
        self.assertTrue(evenlySpaced(2, 4, 6))
        self.assertTrue(evenlySpaced(4, 6, 2))
        self.assertFalse(evenlySpaced(4, 6, 3))
        self.assertTrue(evenlySpaced(6, 2, 4))
        self.assertFalse(evenlySpaced(6, 2, 8))
        self.assertTrue(evenlySpaced(2, 2, 2))
        self.assertFalse(evenlySpaced(2, 2, 3))
        self.assertTrue(evenlySpaced(9, 10, 11))
        self.assertTrue(evenlySpaced(10, 9, 11))
        self.assertFalse(evenlySpaced(10, 9, 9))
        self.assertFalse(evenlySpaced(2, 4, 4))
        self.assertFalse(evenlySpaced(2, 2, 4))
        self.assertFalse(evenlySpaced(3, 6, 12))
        self.assertFalse(evenlySpaced(12, 3, 6))

class TestMakeChocolate(unittest.TestCase):
    def test_makeChocolate(self):
        self.assertEqual(makeChocolate(4, 1, 9), 4)
        self.assertEqual(makeChocolate(4, 1, 10), -1)
        self.assertEqual(makeChocolate(4, 1, 7), 2)
        self.assertEqual(makeChocolate(6, 2, 7), 2)
        self.assertEqual(makeChocolate(4, 1, 5), 0)
        self.assertEqual(makeChocolate(4, 1, 4), 4)
        self.assertEqual(makeChocolate(5, 4, 9), 4)
        self.assertEqual(makeChocolate(9, 3, 18), 3)
        self.assertEqual(makeChocolate(3, 1, 9), -1)
        self.assertEqual(makeChocolate(1, 2, 7), -1)
        self.assertEqual(makeChocolate(1, 2, 6), 1)
        self.assertEqual(makeChocolate(1, 2, 5), 0)
        self.assertEqual(makeChocolate(6, 1, 10), 5)
        self.assertEqual(makeChocolate(6, 1, 11), 6)
        self.assertEqual(makeChocolate(6, 1, 12), -1)
        self.assertEqual(makeChocolate(6, 1, 13), -1)
        self.assertEqual(makeChocolate(6, 2, 10), 0)
        self.assertEqual(makeChocolate(6, 2, 11), 1)
        self.assertEqual(makeChocolate(6, 2, 12), 2)
        self.assertEqual(makeChocolate(60, 100, 550), 50)
        self.assertEqual(makeChocolate(1000, 1000000, 5000006), 6)
        self.assertEqual(makeChocolate(7, 1, 12), 7)
        self.assertEqual(makeChocolate(7, 1, 13), -1)
        self.assertEqual(makeChocolate(7, 2, 13), 3)

class TestSumNumbers(unittest.TestCase):
    def test_sumNumbers(self):
        self.assertEqual(sumNumbers("abc123xyz"), 123)
        self.assertEqual(sumNumbers("aa11b33"), 44)
        self.assertEqual(sumNumbers("7 11"), 18)
        self.assertEqual(sumNumbers("Chocolate"), 0)
        self.assertEqual(sumNumbers("5hoco1a1e"), 7)
        self.assertEqual(sumNumbers("5$1; ;1!!"), 7)
        self.assertEqual(sumNumbers("a1234bb11"), 1245)
        self.assertEqual(sumNumbers(""), 0)
        self.assertEqual(sumNumbers("a22bbb3"), 25)

class TestMaxMirror(unittest.TestCase):
    def test_maxMirror(self):
        self.assertEqual(maxMirror([1, 2, 3, 8, 9, 3, 2, 1]), 3)
        self.assertEqual(maxMirror([1, 2, 1, 4]), 3)
        self.assertEqual(maxMirror([7, 1, 2, 9, 7, 2, 1]), 2)
        self.assertEqual(maxMirror([21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9]), 4)
        self.assertEqual(maxMirror([1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25]), 4)
        self.assertEqual(maxMirror([1, 2, 3, 2, 1]), 5)
        self.assertEqual(maxMirror([1, 2, 3, 3, 8]), 2)
        self.assertEqual(maxMirror([1, 2, 7, 8, 1, 7, 2]), 2)
        self.assertEqual(maxMirror([1, 1, 1]), 3)
        self.assertEqual(maxMirror([1]), 1)
        self.assertEqual(maxMirror([]), 0)
        self.assertEqual(maxMirror([9, 1, 1, 4, 2, 1, 1, 1]), 3)
        self.assertEqual(maxMirror([5, 9, 9, 4, 5, 4, 9, 9, 2]), 7)
        self.assertEqual(maxMirror([5, 9, 9, 6, 5, 4, 9, 9, 2]), 2)
        self.assertEqual(maxMirror([5, 9, 1, 6, 5, 4, 1, 9, 5]), 3)

class TestStarOut(unittest.TestCase):
    def test_starOut(self):
        self.assertEqual(starOut("ab*cd"), "ad")
        self.assertEqual(starOut("ab**cd"), "ad")
        self.assertEqual(starOut("sm*eilly"), "silly")
        self.assertEqual(starOut("sm*eil*ly"), "siy")
        self.assertEqual(starOut("sm**eil*ly"), "siy")
        self.assertEqual(starOut("sm***eil*ly"), "siy")
        self.assertEqual(starOut("stringy*"), "string")
        self.assertEqual(starOut("*stringy"), "tringy")
        self.assertEqual(starOut("*str*in*gy"), "ty")
        self.assertEqual(starOut("abc"), "abc")
        self.assertEqual(starOut("a*bc"), "c")
        self.assertEqual(starOut("ab"), "ab")
        self.assertEqual(starOut("a*b"), "")
        self.assertEqual(starOut("a"), "a")
        self.assertEqual(starOut("a*"), "")
        self.assertEqual(starOut("*a"), "")
        self.assertEqual(starOut("*"), "")
        self.assertEqual(starOut(""), "")

class TestNotReplace(unittest.TestCase):
    def test_notReplace(self):
        self.assertEqual(notReplace("is test"), "is not test")
        self.assertEqual(notReplace("is-is"), "is not-is not")
        self.assertEqual(notReplace("This is right"), "This is not right")
        self.assertEqual(notReplace("This is isabell"), "This is not isabell")
        self.assertEqual(notReplace(""), "")
        self.assertEqual(notReplace("is"), "is not")
        self.assertEqual(notReplace("isis"), "isis")
        self.assertEqual(notReplace("Dis is bliss is"), "Dis is not bliss is not")
        self.assertEqual(notReplace("is his"), "is not his")
        self.assertEqual(notReplace("xis yis"), "xis yis")
        self.assertEqual(notReplace("AAAis is"), "AAAis is not")

class TestCountClumps(unittest.TestCase):
    def test_countClumps(self):
        self.assertEqual(countClumps([1, 2, 2, 3, 4, 4]), 2)
        self.assertEqual(countClumps([1, 1, 2, 1, 1]), 2)
        self.assertEqual(countClumps([1, 1, 1, 1, 1]), 1)
        self.assertEqual(countClumps([1, 2, 3]), 0)
        self.assertEqual(countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]), 4)
        self.assertEqual(countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]), 4)
        self.assertEqual(countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]), 5)
        self.assertEqual(countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]), 5)
        self.assertEqual(countClumps([]), 0)

class TestEvenOdd(unittest.TestCase):
    def test_evenOdd(self):
        self.assertEqual(evenOdd([1, 0, 1, 0, 0, 1, 1]), [0, 0, 0, 1, 1, 1, 1])
        self.assertEqual(evenOdd([3, 3, 2]), [2, 3, 3])
        self.assertEqual(evenOdd([2, 2, 2]), [2, 2, 2])
        self.assertEqual(evenOdd([3, 2, 2]), [2, 2, 3])
        self.assertEqual(evenOdd([1, 1, 0, 1, 0]), [0, 0, 1, 1, 1])
        self.assertEqual(evenOdd([1]), [1])
        self.assertEqual(evenOdd([1, 2]), [2, 1])
        self.assertEqual(evenOdd([2, 1]), [2, 1])
        self.assertEqual(evenOdd([]), [])

class TestFizzBuzz(unittest.TestCase):
    def test_fizzBuzz(self):
        self.assertEqual(fizzBuzz(1, 6), ["1", "2", "Fizz", "4", "Buzz"])
        self.assertEqual(fizzBuzz(1, 8), ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"])
        self.assertEqual(
            fizzBuzz(1, 11),
            ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
        )
        self.assertEqual(
            fizzBuzz(1, 16),
            ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
             "11", "Fizz", "13", "14", "FizzBuzz"]
        )
        self.assertEqual(fizzBuzz(1, 4), ["1", "2", "Fizz"])
        self.assertEqual(fizzBuzz(1, 2), ["1"])
        self.assertEqual(
            fizzBuzz(50, 56),
            ["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]
        )
        self.assertEqual(fizzBuzz(15, 17), ["FizzBuzz", "16"])
        self.assertEqual(
            fizzBuzz(30, 36),
            ["FizzBuzz", "31", "32", "Fizz", "34", "Buzz"]
        )
        self.assertEqual(
            fizzBuzz(1000, 1006),
            ["Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"]
        )
        self.assertEqual(fizzBuzz(99, 102), ["Fizz", "Buzz", "101"])
        self.assertEqual(
            fizzBuzz(14, 20),
            ["14", "FizzBuzz", "16", "17", "Fizz", "19"]
        )

class TestLongestConsecutive(unittest.TestCase):
    def test_empty(self):
        self.assertEqual(longest_consecutive([]), 0)

    def test_single(self):
        self.assertEqual(longest_consecutive([42]), 1)

    def test_simple(self):
        self.assertEqual(longest_consecutive([1,2,3,4]), 4)

    def test_unsorted(self):
        self.assertEqual(longest_consecutive([100,4,200,1,3,2]), 4)

    def test_with_negatives(self):
        self.assertEqual(longest_consecutive([0,-1,1,2,-2,5]), 5)

    def test_duplicates(self):
        self.assertEqual(longest_consecutive([1,1,2,2,3,3]), 3)

    def test_disjoint(self):
        self.assertEqual(longest_consecutive([10,5,6,7,100]), 3)

class TestSplitOdd10(unittest.TestCase):
    def test_splitOdd10(self):
        self.assertTrue(splitOdd10([5, 5, 5]))           # → True
        self.assertFalse(splitOdd10([5, 5, 6]))           # → False
        self.assertTrue(splitOdd10([5, 5, 6, 1]))         # → True
        self.assertTrue(splitOdd10([6, 5, 5, 1]))         # → True
        self.assertTrue(splitOdd10([6, 5, 5, 1, 10]))     # → True
        self.assertFalse(splitOdd10([6, 5, 5, 5, 1]))     # → False
        self.assertTrue(splitOdd10([1]))                  # → True  (group1: 0, group2: 1 → 0 is multiple of 10, 1 is odd)
        self.assertFalse(splitOdd10([]))                  # → False (cannot split an empty list)
        self.assertTrue(splitOdd10([10, 7, 5, 5]))        # → True
        self.assertFalse(splitOdd10([10, 0, 5, 5]))      # → False
        self.assertTrue(splitOdd10([10, 7, 5, 5, 2]))     # → True
        self.assertFalse(splitOdd10([10, 7, 5, 5, 1]))    # → False

class TestSplit53(unittest.TestCase):
    def test_split53(self):
        self.assertTrue(split53([1, 1]))                  # → True
        self.assertFalse(split53([1, 1, 1]))               # → False
        self.assertTrue(split53([2, 4, 2]))                # → True
        self.assertFalse(split53([2, 2, 2, 1]))            # → False
        self.assertTrue(split53([3, 3, 5, 1]))             # → True
        self.assertFalse(split53([3, 5, 8]))               # → False
        self.assertTrue(split53([2, 4, 6]))                # → True
        self.assertTrue(split53([3, 5, 6, 10, 3, 3]))     # → True

class TestPower(unittest.TestCase):
    def test_base_cases(self):
        """Test fundamental base cases"""
        self.assertEqual(power(2, 0), 1)
        self.assertEqual(power(5, 0), 1)
        self.assertEqual(power(100, 0), 1)
        self.assertEqual(power(2, 1), 2)
        self.assertEqual(power(7, 1), 7)
        self.assertEqual(power(42, 1), 42)
    
    def test_small_powers(self):
        """Test small powers to verify correctness"""
        self.assertEqual(power(2, 2), 4)
        self.assertEqual(power(2, 3), 8)
        self.assertEqual(power(2, 4), 16)
        self.assertEqual(power(3, 2), 9)
        self.assertEqual(power(3, 3), 27)
        self.assertEqual(power(5, 3), 125)
    
    def test_even_exponents(self):
        """Test powers with even exponents (uses the even branch)"""
        self.assertEqual(power(2, 8), 256)
        self.assertEqual(power(2, 10), 1024)
        self.assertEqual(power(3, 4), 81)
        self.assertEqual(power(5, 6), 15625)
    
    def test_odd_exponents(self):
        """Test powers with odd exponents (uses the odd branch)"""
        self.assertEqual(power(2, 7), 128)
        self.assertEqual(power(2, 9), 512)
        self.assertEqual(power(3, 5), 243)
        self.assertEqual(power(5, 7), 78125)
    
    def test_large_exponents(self):
        """Test larger exponents to verify efficiency"""
        self.assertEqual(power(2, 16), 65536)
        self.assertEqual(power(2, 20), 1048576)
        self.assertEqual(power(3, 10), 59049)
        self.assertEqual(power(10, 6), 1000000)
    
    def test_edge_cases(self):
        """Test edge cases and special values"""
        self.assertEqual(power(0, 0), 1)
        self.assertEqual(power(0, 1), 0)
        self.assertEqual(power(0, 5), 0)
        self.assertEqual(power(1, 0), 1)
        self.assertEqual(power(1, 100), 1)
        self.assertEqual(power(-1, 0), 1)
        self.assertEqual(power(-1, 1), -1)
        self.assertEqual(power(-1, 2), 1)
        self.assertEqual(power(-1, 3), -1)
    
    def test_negative_bases(self):
        """Test powers with negative bases"""
        self.assertEqual(power(-2, 2), 4)
        self.assertEqual(power(-2, 3), -8)
        self.assertEqual(power(-3, 4), 81)
        self.assertEqual(power(-3, 5), -243)

class TestFibonacci(unittest.TestCase):
    def test_fibonacci(self):
        """Test Fibonacci sequence computation"""
        self.assertEqual(fibonacci(0), 0)
        self.assertEqual(fibonacci(1), 1)
        self.assertEqual(fibonacci(2), 1)
        self.assertEqual(fibonacci(3), 2)
        self.assertEqual(fibonacci(4), 3)
        self.assertEqual(fibonacci(5), 5)
        self.assertEqual(fibonacci(6), 8)
        self.assertEqual(fibonacci(7), 13)
        self.assertEqual(fibonacci(10), 55)
        self.assertEqual(fibonacci(15), 610)
    
    def test_fibonacci_negative(self):
        """Test that negative input raises ValueError"""
        with self.assertRaises(ValueError):
            fibonacci(-1)
        with self.assertRaises(ValueError):
            fibonacci(-10)

class TestClimbStairs(unittest.TestCase):
    def test_climbStairs(self):
        """Test stair climbing problem"""
        self.assertEqual(climbStairs(1), 1)
        self.assertEqual(climbStairs(2), 2)
        self.assertEqual(climbStairs(3), 3)
        self.assertEqual(climbStairs(4), 5)
        self.assertEqual(climbStairs(5), 8)
        self.assertEqual(climbStairs(6), 13)
        self.assertEqual(climbStairs(7), 21)
        self.assertEqual(climbStairs(8), 34)
        self.assertEqual(climbStairs(10), 89)
    
    def test_climbStairs_edge_cases(self):
        """Test edge cases for stair climbing"""
        self.assertEqual(climbStairs(0), 0)
    
    def test_climbStairs_large(self):
        """Test larger values"""
        self.assertEqual(climbStairs(20), 10946)

class TestQuickSort(unittest.TestCase):
    def test_quickSort_basic(self):
        """Test basic sorting scenarios"""
        self.assertEqual(quickSort([3, 6, 8, 10, 1, 2, 1]), [1, 1, 2, 3, 6, 8, 10])
        self.assertEqual(quickSort([38, 27, 43, 3, 9, 82, 10]), [3, 9, 10, 27, 38, 43, 82])
        self.assertEqual(quickSort([5, 2, 8, 1, 9]), [1, 2, 5, 8, 9])
    
    def test_quickSort_edge_cases(self):
        """Test edge cases"""
        self.assertEqual(quickSort([]), [])
        self.assertEqual(quickSort([1]), [1])
        self.assertEqual(quickSort([5, 5, 5, 5]), [5, 5, 5, 5])
    
    def test_quickSort_already_sorted(self):
        """Test with already sorted arrays"""
        self.assertEqual(quickSort([1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(quickSort([1, 2, 3]), [1, 2, 3])
    
    def test_quickSort_reverse_sorted(self):
        """Test with reverse sorted arrays"""
        self.assertEqual(quickSort([5, 4, 3, 2, 1]), [1, 2, 3, 4, 5])
        self.assertEqual(quickSort([10, 9, 8, 7]), [7, 8, 9, 10])
    
    def test_quickSort_negative_numbers(self):
        """Test with negative numbers"""
        self.assertEqual(quickSort([-3, -1, -2, 0, 1]), [-3, -2, -1, 0, 1])
        self.assertEqual(quickSort([5, -3, 2, -1, 0]), [-3, -1, 0, 2, 5])

class TestMergeSort(unittest.TestCase):
    def test_mergeSort_basic(self):
        """Test basic sorting scenarios"""
        self.assertEqual(mergeSort([38, 27, 43, 3, 9, 82, 10]), [3, 9, 10, 27, 38, 43, 82])
        self.assertEqual(mergeSort([3, 6, 8, 10, 1, 2, 1]), [1, 1, 2, 3, 6, 8, 10])
        self.assertEqual(mergeSort([5, 2, 8, 1, 9]), [1, 2, 5, 8, 9])
    
    def test_mergeSort_edge_cases(self):
        """Test edge cases"""
        self.assertEqual(mergeSort([]), [])
        self.assertEqual(mergeSort([1]), [1])
        self.assertEqual(mergeSort([5, 5, 5, 5]), [5, 5, 5, 5])
    
    def test_mergeSort_already_sorted(self):
        """Test with already sorted arrays"""
        self.assertEqual(mergeSort([1, 2, 3, 4, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(mergeSort([1, 2, 3]), [1, 2, 3])
    
    def test_mergeSort_reverse_sorted(self):
        """Test with reverse sorted arrays"""
        self.assertEqual(mergeSort([5, 4, 3, 2, 1]), [1, 2, 3, 4, 5])
        self.assertEqual(mergeSort([10, 9, 8, 7]), [7, 8, 9, 10])
    
    def test_mergeSort_negative_numbers(self):
        """Test with negative numbers"""
        self.assertEqual(mergeSort([-3, -1, -2, 0, 1]), [-3, -2, -1, 0, 1])
        self.assertEqual(mergeSort([5, -3, 2, -1, 0]), [-3, -1, 0, 2, 5])
    
    def test_mergeSort_large(self):
        """Test with larger arrays"""
        arr = list(range(100, 0, -1))
        self.assertEqual(mergeSort(arr), list(range(1, 101)))

class TestMerge(unittest.TestCase):
    def test_merge_basic(self):
        """Test basic merging scenarios"""
        self.assertEqual(merge([1, 3, 5], [2, 4, 6]), [1, 2, 3, 4, 5, 6])
        self.assertEqual(merge([2, 4], [1, 3, 5]), [1, 2, 3, 4, 5])
        self.assertEqual(merge([1, 3, 5], [2, 4]), [1, 2, 3, 4, 5])
    
    def test_merge_edge_cases(self):
        """Test edge cases for merging"""
        self.assertEqual(merge([], [1, 2, 3]), [1, 2, 3])
        self.assertEqual(merge([1, 2, 3], []), [1, 2, 3])
        self.assertEqual(merge([], []), [])
    
    def test_merge_single_elements(self):
        """Test merging single elements"""
        self.assertEqual(merge([1], [2]), [1, 2])
        self.assertEqual(merge([2], [1]), [1, 2])
        self.assertEqual(merge([1], []), [1])
        self.assertEqual(merge([], [1]), [1])
    
    def test_merge_duplicates(self):
        """Test merging with duplicate values"""
        self.assertEqual(merge([1, 1, 2], [1, 2, 2]), [1, 1, 1, 2, 2, 2])
        self.assertEqual(merge([2, 2], [1, 1]), [1, 1, 2, 2])
    
    def test_merge_negative_numbers(self):
        """Test merging with negative numbers"""
        self.assertEqual(merge([-3, -1], [-2, 0]), [-3, -2, -1, 0])
        self.assertEqual(merge([-1, 1], [-2, 0, 2]), [-2, -1, 0, 1, 2])

# -----------------------------------------------------------------
# Main execution block
# -----------------------------------------------------------------

if __name__ == "__main__":
    """
    This conditional block checks if the script is being run directly.
    If it is, it calls `unittest.main()`.
    
    `unittest.main()` discovers all test cases (TestEvenlySpaced,
    TestMakeChocolate, TestSumNumbers, TestMaxMirror, TestStarOut,
    TestNotReplace, TestCountClumps, TestEvenOdd, TestFizzBuzz,
    TestLongestConsecutive, TestSplitOdd10, TestSplit53, TestPower,
    TestFibonacci, TestClimbStairs, TestQuickSort, TestMergeSort,
    and TestMerge) and runs them.
    
    `verbosity=2` is added to provide a more detailed output,
    showing the result of each test method individually, which
    satisfies the requirement for clear results for each function.
    """
    unittest.main(verbosity=2)