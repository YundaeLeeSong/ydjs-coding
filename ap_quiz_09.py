#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Instructions to run the tests via the CLI:
    1. Open your terminal or command prompt.
    2. Run the tests by executing: `python _coding-pop_algo/ap_quiz_package09.py`

This is a list of quiz questions for practice, including:
1.  shiftLeft: Return a list left-shifted by one position (first element moves to end).
2.  tenRun: Change values after each multiple of 10 to be that multiple until next one.
3.  pre4: Return a list containing elements before the first occurrence of 4.
4.  blackjack: Return the value closest to 21 without going over, or 0 if both exceed.
5.  maxBlock: Return the length of the largest block (run of identical consecutive chars).
6.  seriesUp: Create a list with sequence 1, 1,2, 1,2,3, ... up to 1,2,...,n.
7.  oneTwo: Transform string by moving first char of each 3-char group after next two.
8.  zipZap: Remove middle letter from patterns like "zip" or "zap" (z?p -> zp).
9.  post4: Return a list containing elements after the last occurrence of 4.
10. notAlone: Replace "alone" occurrences of a value with the larger of its neighbors.
11. groupNoAdj: Recursively determine if elements can sum to target, with constraint that adjacent elements cannot both be chosen.
12. groupSum5: Recursively determine if elements can sum to target, with constraints on multiples of 5.
13. groupSumClump: Recursively determine if elements can sum to target, with constraint that adjacent identical values must all be chosen or none.
14. splitArray: Recursively determine if an array can be split into two groups with equal sums.
"""

# Import the unittest module, needed for creating test cases.
# We only need to import it once at the top of the file.
import unittest

# Import List from the typing module for type hinting (e.g., List[str])
# This is preferred for compatibility with Python versions < 3.10
from typing import List











# -----------------------------------------------------------------
# Question 1: shiftLeft
# -----------------------------------------------------------------
def shiftLeft(nums: list[int]) -> list[int]:
    """
    Description:
        Return a list that is "left shifted" by one position.
        That is, the first element moves to the end, and all other elements shift left.
        You may modify and return the given list, or return a new list.

    Examples:
        shiftLeft([6, 2, 5, 3]) -> [2, 5, 3, 6]
        shiftLeft([1, 2]) -> [2, 1]
        shiftLeft([]) -> []
        shiftLeft([1, 1, 2, 2, 4]) -> [1, 2, 2, 4, 1]

    Args:
        nums (list[int]): The list of integers to shift.

    Returns:
        list[int]: The left-shifted list.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 2: tenRun
# -----------------------------------------------------------------
def tenRun(nums: list[int]) -> list[int]:
    """
    Description:
        For each multiple of 10 in the given list, change all the values following it
        to be that multiple of 10, until encountering another multiple of 10.
        Values before the first multiple of 10 remain unchanged.

    Examples:
        tenRun([2, 10, 3, 4, 20, 5]) -> [2, 10, 10, 10, 20, 20]
        tenRun([10, 1, 20, 2]) -> [10, 10, 20, 20]
        tenRun([10, 1, 9, 20]) -> [10, 10, 10, 20]

    Args:
        nums (list[int]): The list of integers to process.

    Returns:
        list[int]: A new list after applying the ten-run transformation.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 3: pre4
# -----------------------------------------------------------------
def pre4(nums: list[int]) -> list[int]:
    """
    Description:
        Given a non-empty list of integers `nums`, return a new list containing the elements
        from `nums` that appear before the first `4`. You may assume that `nums` contains at
        least one `4`.

    Examples:
        pre4([1, 2, 4, 1]) -> [1, 2]
        pre4([3, 1, 4]) -> [3, 1]
        pre4([1, 4, 4]) -> [1]

    Args:
        nums (list[int]): A non-empty list of integers containing at least one 4.

    Returns:
        list[int]: A list of the elements before the first 4 in `nums`.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 4: blackjack
# -----------------------------------------------------------------
def blackjack(a: int, b: int) -> int:
    """
    Description:
        Given two positive integers `a` and `b`, return whichever value is closest to 21 without going over.
        If both values exceed 21, return 0.

    Examples:
        blackjack(19, 21) -> 21
        blackjack(21, 19) -> 21
        blackjack(19, 22) -> 19

    Args:
        a (int): First card value (greater than 0).
        b (int): Second card value (greater than 0).

    Returns:
        int: The value closest to 21 without going over, or 0 if both exceed 21.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 5: maxBlock
# -----------------------------------------------------------------
def maxBlock(s: str) -> int:
    """
    Description:
        Given a string `s`, return the length of the largest "block" in the string.
        A block is a run of adjacent characters that are the same.

    Examples:
        maxBlock("hoopla") -> 2
        maxBlock("XXBBBbbxxXXXX") -> 4
        maxBlock("XX2222BBBbbXX2222") -> 4

    Args:
        s (str): The input string.

    Returns:
        int: The length of the longest block of identical consecutive chars.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 6: seriesUp
# -----------------------------------------------------------------
def seriesUp(n: int) -> list[int]:
    """
    Description:
        Given a non-negative integer `n`, create and return a list containing
        the sequence 1, then 1,2, then 1,2,3, … up to 1,2,...,n. The total length
        of the list will be n*(n+1)/2.

    Examples:
        seriesUp(3) -> [1, 1, 2, 1, 2, 3]
        seriesUp(4) -> [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) -> [1, 1, 2]

    Args:
        n (int): The non-negative integer up to which to build the sequence.

    Returns:
        list[int]: The expanded series list.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 7: oneTwo
# -----------------------------------------------------------------
def oneTwo(s: str) -> str:
    """
    Description:
        Given a string, compute a new string by moving the first char of each
        consecutive group of 3 chars to come after the next two chars.
        Ignore any group of fewer than 3 chars at the end.

    Examples:
        oneTwo("abc") -> "bca"
        oneTwo("tca") -> "cat"
        oneTwo("tcagdo") -> "catdog"

    Args:
        s (str): The input string.

    Returns:
        str: The transformed string after applying the oneTwo rule.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 8: zipZap
# -----------------------------------------------------------------
def zipZap(s: str) -> str:
    """
    Description:
        Look for patterns like "zip" and "zap" in the string — length-3 substrings 
        that start with 'z' and end with 'p'. Remove the middle letter of each such 
        substring, leaving just "zp".

    Examples:
        zipZap("zipXzap") -> "zpXzp"
        zipZap("zopzop") -> "zpzp"
        zipZap("zzzopzop") -> "zzzpzp"

    Args:
        s (str): The input string.

    Returns:
        str: The string with all "z?p" patterns reduced to "zp".
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 9: post4
# -----------------------------------------------------------------
def post4(nums: list[int]) -> list[int]:
    """
    Description:
        Given a non-empty list of integers `nums`, return a new list containing 
        the elements that come after the last occurrence of 4 in `nums`. 
        You may assume there is at least one 4 in the list.

    Examples:
        post4([2, 4, 1, 2]) -> [1, 2]
        post4([4, 1, 4, 2]) -> [2]
        post4([4, 4, 1, 2, 3]) -> [1, 2, 3]

    Args:
        nums (list[int]): A non-empty list of integers containing at least one 4.

    Returns:
        list[int]: A new list of the elements after the last 4.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 10: notAlone
# -----------------------------------------------------------------
def notAlone(nums: list[int], val: int) -> list[int]:
    """
    Description:
        We'll say that an element in an array is "alone" if there are values before
        and after it, and those values are different from it. Return a version of the
        given array where every instance of the given value which is alone is replaced
        by whichever of its left or right neighbors is larger.

    Examples:
        notAlone([1, 2, 3], 2) -> [1, 3, 3]
        notAlone([1, 2, 3, 2, 5, 2], 2) -> [1, 3, 3, 5, 5, 2]
        notAlone([3, 4], 3) -> [3, 4]

    Args:
        nums (list[int]): The input list of integers.
        val (int): The value to check for "alone" occurrences.

    Returns:
        list[int]: A new list where each "alone" occurrence of `val` is replaced
                   by the larger of its two neighbors.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 11: groupNoAdj
# -----------------------------------------------------------------
def groupNoAdj(start: int, nums: list[int], target: int) -> bool:
    """
    Description:
        Given an array of integers `nums`, determine recursively 
        whether it's possible to choose a group 
        of some of the ints such that the group sums to the given 
        target with the additional constraint 
        that if a value in the array is chosen to be in the group, 
        the value immediately following it must 
        not be chosen.
        
        At each index, you have two choices:
          - Include nums[start] in the group (and skip the next element)
          - Exclude nums[start] from the group (and move to the next element)

    Examples:
        groupNoAdj(0, [2, 5, 10, 4], 12) -> True
        groupNoAdj(0, [2, 5, 10, 4], 14) -> False
        groupNoAdj(0, [2, 5, 10, 4], 7)  -> False

    Args:
        start (int): The starting index from which to consider elements in `nums`.
        nums (list[int]): The list of integers.
        target (int): The target sum to achieve.

    Returns:
        bool: True if there is a valid group satisfying the conditions, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 12: groupSum5
# -----------------------------------------------------------------
def groupSum5(start: int, nums: list[int], target: int) -> bool:
    """
    Description:
        Given an array of integers `nums`, determine recursively 
        whether it's possible to choose 
        a group of some of the ints (starting at index `start`) such 
        that the group sums to the given 
        target with these additional constraints:
          - All multiples of 5 in the array must be included in the group.
          - If a value in the array is chosen and it is a multiple of 
            5, then if the value immediately 
            following it is 1, that 1 must not be chosen.
        
        This is solved using recursive backtracking. At each index:
          - If the current value is a multiple of 5, it must be included 
            in the sum. Also, if the next
            number is 1, skip it.
          - Otherwise, choose either to include the current value or not.
    
    Examples:
        groupSum5(0, [2, 5, 10, 4], 19) -> True
        groupSum5(0, [2, 5, 10, 4], 17) -> True
        groupSum5(0, [2, 5, 10, 4], 12) -> False

    Args:
        start (int): The starting index from which to consider elements in `nums`.
        nums (list[int]): The list of integers.
        target (int): The sum to achieve.

    Returns:
        bool: True if there is a valid group satisfying the constraints, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 13: groupSumClump
# -----------------------------------------------------------------
def groupSumClump(start: int, nums: list[int], target: int) -> bool:
    """
    Description:
        Given an array of ints, determine recursively whether it's 
        possible to choose a group 
        of some of the ints such that the group sums to the given 
        target, with the additional 
        constraint that if there are numbers in the array that are 
        adjacent and identical, they 
        must either all be chosen or none of them. (One loop can be 
        used to find the extent of 
        the identical values.)
        
    Examples:
        groupSumClump(0, [2,4,8], 10) -> True
        groupSumClump(0, [1,2,4,8,1], 14) -> True
        groupSumClump(0, [2,4,4,8], 14) -> False

    Args:
        start (int): The starting index to consider elements from `nums`.
        nums (list[int]): The list of integers.
        target (int): The sum to achieve.

    Returns:
        bool: True if a valid group exists that satisfies the conditions, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 14: splitArray
# -----------------------------------------------------------------
def splitArray(nums: list[int]) -> bool:
    """
    Description:
        Given an array of ints, determine recursively if it is possible to divide the ints 
        into two groups, so that the sums of the two groups are the same. Every int must be 
        in one group or the other. A recursive helper method is used to try all possibilities.

    Examples:
        splitArray([2,2]) -> True
        splitArray([2,3]) -> False
        splitArray([5,2,3]) -> True

    Args:
        nums (list[int]): The input list of integers.

    Returns:
        bool: True if it is possible to split the array into two groups with equal sum, 
              False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Unit Tests
# -----------------------------------------------------------------
class TestShiftLeft(unittest.TestCase):
    def test_shiftLeft(self):
        self.assertEqual(shiftLeft([6, 2, 5, 3]), [2, 5, 3, 6])
        self.assertEqual(shiftLeft([1, 2]), [2, 1])
        self.assertEqual(shiftLeft([1]), [1])
        self.assertEqual(shiftLeft([]), [])
        self.assertEqual(shiftLeft([1, 1, 2, 2, 4]), [1, 2, 2, 4, 1])
        self.assertEqual(shiftLeft([1, 1, 1]), [1, 1, 1])
        self.assertEqual(shiftLeft([1, 2, 3]), [2, 3, 1])

class TestTenRun(unittest.TestCase):
    def test_tenRun(self):
        self.assertEqual(tenRun([2, 10, 3, 4, 20, 5]), [2, 10, 10, 10, 20, 20])
        self.assertEqual(tenRun([10, 1, 20, 2]), [10, 10, 20, 20])
        self.assertEqual(tenRun([10, 1, 9, 20]), [10, 10, 10, 20])
        self.assertEqual(tenRun([1, 2, 50, 1]), [1, 2, 50, 50])
        self.assertEqual(tenRun([1, 20, 50, 1]), [1, 20, 50, 50])
        self.assertEqual(tenRun([10, 10]), [10, 10])
        self.assertEqual(tenRun([10, 2]), [10, 10])
        self.assertEqual(tenRun([0, 2]), [0, 0])
        self.assertEqual(tenRun([1, 2]), [1, 2])
        self.assertEqual(tenRun([1]), [1])
        self.assertEqual(tenRun([]), [])

class TestPre4(unittest.TestCase):
    def test_pre4(self):
        self.assertEqual(pre4([1, 2, 4, 1]), [1, 2])
        self.assertEqual(pre4([3, 1, 4]), [3, 1])
        self.assertEqual(pre4([1, 4, 4]), [1])
        self.assertEqual(pre4([1, 4, 4, 2]), [1])
        self.assertEqual(pre4([1, 3, 4, 2, 4]), [1, 3])
        self.assertEqual(pre4([4, 4]), [])
        self.assertEqual(pre4([3, 3, 4]), [3, 3])
        self.assertEqual(pre4([1, 2, 1, 4]), [1, 2, 1])
        self.assertEqual(pre4([2, 1, 4, 2]), [2, 1])
        self.assertEqual(pre4([2, 1, 2, 1, 4, 2]), [2, 1, 2, 1])

class TestBlackjack(unittest.TestCase):
    def test_blackjack(self):
        self.assertEqual(blackjack(19, 21), 21)
        self.assertEqual(blackjack(21, 19), 21)
        self.assertEqual(blackjack(19, 22), 19)
        self.assertEqual(blackjack(22, 19), 19)
        self.assertEqual(blackjack(22, 50), 0)
        self.assertEqual(blackjack(22, 22), 0)
        self.assertEqual(blackjack(33, 1), 1)
        self.assertEqual(blackjack(1, 2), 2)
        self.assertEqual(blackjack(34, 33), 0)
        self.assertEqual(blackjack(17, 19), 19)
        self.assertEqual(blackjack(18, 17), 18)
        self.assertEqual(blackjack(16, 23), 16)
        self.assertEqual(blackjack(3, 4), 4)
        self.assertEqual(blackjack(3, 2), 3)
        self.assertEqual(blackjack(21, 20), 21)

class TestMaxBlock(unittest.TestCase):
    def test_maxBlock(self):
        self.assertEqual(maxBlock("hoopla"), 2)
        self.assertEqual(maxBlock("abbCCCddBBBxx"), 3)
        self.assertEqual(maxBlock(""), 0)
        self.assertEqual(maxBlock("xyz"), 1)
        self.assertEqual(maxBlock("xxyz"), 2)
        self.assertEqual(maxBlock("xyzz"), 2)
        self.assertEqual(maxBlock("abbbcbbbxbbbx"), 3)
        self.assertEqual(maxBlock("XXBBBbbxx"), 3)
        self.assertEqual(maxBlock("XXBBBBbbxx"), 4)
        self.assertEqual(maxBlock("XXBBBbbxxXXXX"), 4)
        self.assertEqual(maxBlock("XX2222BBBbbXX2222"), 4)

class TestSeriesUp(unittest.TestCase):
    def test_seriesUp(self):
        self.assertEqual(seriesUp(3), [1, 1, 2, 1, 2, 3])
        self.assertEqual(seriesUp(4), [1, 1, 2, 1, 2, 3, 1, 2, 3, 4])
        self.assertEqual(seriesUp(2), [1, 1, 2])
        self.assertEqual(seriesUp(1), [1])
        self.assertEqual(seriesUp(0), [])
        self.assertEqual(seriesUp(6),
                         [1, 1, 2, 1, 2, 3, 1, 2, 3, 4,
                          1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6])

class TestOneTwo(unittest.TestCase):
    def test_oneTwo(self):
        self.assertEqual(oneTwo("abc"), "bca")
        self.assertEqual(oneTwo("tca"), "cat")
        self.assertEqual(oneTwo("tcagdo"), "catdog")
        self.assertEqual(oneTwo("chocolate"), "hocolctea")
        self.assertEqual(oneTwo("1234567890"), "231564897")
        self.assertEqual(oneTwo("xabxabxabxabxabxabxab"), "abxabxabxabxabxabxabx")
        self.assertEqual(oneTwo("abcdefx"), "bcaefd")
        self.assertEqual(oneTwo("abcdefxy"), "bcaefd")
        self.assertEqual(oneTwo("abcdefxyz"), "bcaefdyzx")
        self.assertEqual(oneTwo(""), "")
        self.assertEqual(oneTwo("x"), "")
        self.assertEqual(oneTwo("xy"), "")
        self.assertEqual(oneTwo("xyz"), "yzx")
        long_input = "abcdefghijklkmnopqrstuvwxyz1234567890"
        long_expected = "bcaefdhigkljmnkpqostrvwuyzx231564897"
        self.assertEqual(oneTwo(long_input), long_expected)
        # Also test inputs where length just under multiple of 3
        self.assertEqual(oneTwo(long_input[:-1]), long_expected)
        self.assertEqual(oneTwo(long_input[:-2]), long_expected[:-3])

class TestZipZap(unittest.TestCase):
    def test_zipZap(self):
        self.assertEqual(zipZap("zipXzap"), "zpXzp")
        self.assertEqual(zipZap("zopzop"), "zpzp")
        self.assertEqual(zipZap("zzzopzop"), "zzzpzp")
        self.assertEqual(zipZap("zibzap"), "zibzp")
        self.assertEqual(zipZap("zip"), "zp")
        self.assertEqual(zipZap("zi"), "zi")
        self.assertEqual(zipZap("z"), "z")
        self.assertEqual(zipZap(""), "")
        self.assertEqual(zipZap("zzp"), "zp")
        self.assertEqual(zipZap("abcppp"), "abcppp")
        self.assertEqual(zipZap("azbcppp"), "azbcppp")
        self.assertEqual(zipZap("azbcpzpp"), "azbcpzp")

class TestPost4(unittest.TestCase):
    def test_post4(self):
        self.assertEqual(post4([2, 4, 1, 2]), [1, 2])
        self.assertEqual(post4([4, 1, 4, 2]), [2])
        self.assertEqual(post4([4, 4, 1, 2, 3]), [1, 2, 3])
        self.assertEqual(post4([4, 2]), [2])
        self.assertEqual(post4([4, 4, 3]), [3])
        self.assertEqual(post4([4, 4]), [])
        self.assertEqual(post4([4]), [])
        self.assertEqual(post4([2, 4, 1, 4, 3, 2]), [3, 2])
        self.assertEqual(post4([4, 1, 4, 2, 2, 2]), [2, 2, 2])
        self.assertEqual(post4([3, 4, 3, 2]), [3, 2])

class TestNotAlone(unittest.TestCase):
    def test_notAlone(self):
        self.assertEqual(notAlone([1, 2, 3], 2), [1, 3, 3])
        self.assertEqual(notAlone([1, 2, 3, 2, 5, 2], 2), [1, 3, 3, 5, 5, 2])
        self.assertEqual(notAlone([3, 4], 3), [3, 4])
        self.assertEqual(notAlone([3, 3], 3), [3, 3])
        self.assertEqual(notAlone([1, 3, 1, 2], 1), [1, 3, 3, 2])
        self.assertEqual(notAlone([3], 3), [3])
        self.assertEqual(notAlone([], 3), [])
        self.assertEqual(notAlone([7, 1, 6], 1), [7, 7, 6])
        self.assertEqual(notAlone([1, 1, 1], 1), [1, 1, 1])
        self.assertEqual(notAlone([1, 1, 1, 2], 1), [1, 1, 1, 2])

class TestGroupNoAdj(unittest.TestCase):
    def test_groupNoAdj(self):
        self.assertTrue(groupNoAdj(0, [2, 5, 10, 4], 12))    # -> True
        self.assertFalse(groupNoAdj(0, [2, 5, 10, 4], 14))   # -> False
        self.assertFalse(groupNoAdj(0, [2, 5, 10, 4], 7))    # -> False
        self.assertTrue(groupNoAdj(0, [2, 5, 10, 4, 2], 7))  # -> True
        self.assertTrue(groupNoAdj(0, [2, 5, 10, 4], 9))     # -> True
        self.assertTrue(groupNoAdj(0, [10, 2, 2, 3, 3], 15)) # -> True
        self.assertFalse(groupNoAdj(0, [10, 2, 2, 3, 3], 7))  # -> False
        self.assertTrue(groupNoAdj(0, [], 0))                # -> True
        self.assertTrue(groupNoAdj(0, [1], 1))               # -> True
        self.assertFalse(groupNoAdj(0, [9], 1))              # -> False
        self.assertTrue(groupNoAdj(0, [9], 0))               # -> True
        self.assertTrue(groupNoAdj(0, [5, 10, 4, 1], 11))    # -> True

class TestGroupSum5(unittest.TestCase):
    def test_groupSum5(self):
        self.assertTrue(groupSum5(0, [2, 5, 10, 4], 19))   # -> True
        self.assertTrue(groupSum5(0, [2, 5, 10, 4], 17))   # -> True
        self.assertFalse(groupSum5(0, [2, 5, 10, 4], 12))  # -> False
        self.assertFalse(groupSum5(0, [2, 5, 4, 10], 12))  # -> False
        self.assertFalse(groupSum5(0, [3, 5, 1], 4))       # -> False
        self.assertTrue(groupSum5(0, [3, 5, 1], 5))        # -> True
        self.assertTrue(groupSum5(0, [1, 3, 5], 5))        # -> True
        self.assertFalse(groupSum5(0, [3, 5, 1], 9))       # -> False
        self.assertFalse(groupSum5(0, [2, 5, 10, 4], 7))    # -> False
        self.assertTrue(groupSum5(0, [2, 5, 10, 4], 15))    # -> True
        self.assertFalse(groupSum5(0, [2, 5, 10, 4], 11))   # -> False
        self.assertTrue(groupSum5(0, [1], 1))              # -> True
        self.assertFalse(groupSum5(0, [9], 1))             # -> False
        self.assertTrue(groupSum5(0, [9], 0))              # -> True
        self.assertTrue(groupSum5(0, [], 0))               # -> True

class TestGroupSumClump(unittest.TestCase):
    def test_groupSumClump(self):
        self.assertTrue(groupSumClump(0, [2, 4, 8], 10))         # -> True
        self.assertTrue(groupSumClump(0, [1, 2, 4, 8, 1], 14))     # -> True
        self.assertFalse(groupSumClump(0, [2, 4, 4, 8], 14))        # -> False
        self.assertTrue(groupSumClump(0, [8, 2, 2, 1], 9))          # -> True
        self.assertFalse(groupSumClump(0, [8, 2, 2, 1], 11))        # -> False
        self.assertTrue(groupSumClump(0, [1], 1))                  # -> True
        self.assertFalse(groupSumClump(0, [9], 1))                 # -> False

class TestSplitArray(unittest.TestCase):
    def test_splitArray(self):
        self.assertTrue(splitArray([2,2]))                # -> True
        self.assertFalse(splitArray([2,3]))               # -> False
        self.assertTrue(splitArray([5,2,3]))              # -> True
        self.assertFalse(splitArray([5,2,2]))             # -> False
        self.assertTrue(splitArray([1,1,1,1,1,1]))        # -> True
        self.assertFalse(splitArray([1,1,1,1,1]))         # -> False
        self.assertTrue(splitArray([]))                   # -> True
        self.assertFalse(splitArray([1]))                 # -> False
        self.assertFalse(splitArray([3,5]))               # -> False
        self.assertTrue(splitArray([5,3,2]))              # -> True
        self.assertTrue(splitArray([2,2,10,10,1,1]))      # -> True
        self.assertFalse(splitArray([1,2,2,10,10,1,1]))    # -> False
        self.assertTrue(splitArray([1,2,3,10,10,1,1]))     # -> True

# -----------------------------------------------------------------
# Main execution block
# -----------------------------------------------------------------

if __name__ == "__main__":
    """
    This conditional block checks if the script is being run directly.
    If it is, it calls `unittest.main()`.
    
    `unittest.main()` discovers all test cases (TestShiftLeft,
    TestTenRun, TestPre4, TestBlackjack, TestMaxBlock, TestSeriesUp,
    TestOneTwo, TestZipZap, TestPost4, TestNotAlone, TestGroupNoAdj,
    TestGroupSum5, TestGroupSumClump, and TestSplitArray) and runs them.
    
    `verbosity=2` is added to provide a more detailed output,
    showing the result of each test method individually, which
    satisfies the requirement for clear results for each function.
    """
    unittest.main(verbosity=2)
