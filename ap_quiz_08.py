#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Instructions to run the tests via the CLI:
    1. Open your terminal or command prompt.
    2. Run the tests by executing: `python _coding-pop_algo/ap_quiz_package08.py`

This is a list of quiz questions for practice, including:
1.  sameEnds: Find the longest non-overlapping substring that appears at both start and end of a string.
2.  mirrorEnds: Find the longest prefix that equals its reverse at the end of the string.
3.  squareUp: Generate a square-up pattern list of length n*n.
4.  getSandwich: Extract the filling between the first and last occurrence of "bread" in a string.
5.  sameStarChar: Check if every '*' has identical characters before and after it.
6.  haveThree: Check if the value 3 appears exactly three times with no adjacent 3's.
7.  twoTwo: Check if every 2 in the list is adjacent to at least one other 2.
8.  sameEnds: Check if the first `length` elements equal the last `length` elements in a list.
9.  tripleUp: Check if the list contains three increasing adjacent numbers.
10. fizzArray3: Generate a list of integers from start up to but not including end.
11. strCopies: Recursively determine if at least n copies of a substring appear in a string.
12. strDist: Recursively compute the length of the largest substring that starts and ends with a given substring.
13. groupSum: Recursively determine if it's possible to choose a group of elements that sum to a target.
14. groupSum6: Recursively determine if elements can sum to target, with constraint that all 6's must be chosen.
"""

# Import the unittest module, needed for creating test cases.
# We only need to import it once at the top of the file.
import unittest

# Import List from the typing module for type hinting (e.g., List[str])
# This is preferred for compatibility with Python versions < 3.10
from typing import List











# -----------------------------------------------------------------
# Question 1: sameEnds (string version)
# -----------------------------------------------------------------
def sameEnds(s: str) -> str:
    """
    Description:
        Return the longest non-overlapping substring that appears at both
        the start and end of the string `s`.

    Examples:
        sameEnds("abXYab") -> "ab"
        sameEnds("javaXYZjava") -> "java"
        sameEnds("javajava") -> "java"

    Args:
        s (str): The input string.

    Returns:
        str: The longest substring appearing at both start and end without overlap.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 2: mirrorEnds
# -----------------------------------------------------------------
def mirrorEnds(s: str) -> str:
    """
    Description:
        Given a string, look for a mirror-image (backwards) string at both the beginning
        and end of the string. Return the longest such prefix. In other words, find the
        largest prefix of `s` which equals its reverse at the end of `s`.

    Examples:
        mirrorEnds("abXYZba") -> "ab"
        mirrorEnds("abca") -> "a"
        mirrorEnds("123and then 321") -> "123"

    Args:
        s (str): The input string.

    Returns:
        str: The longest prefix which is the reverse of the corresponding suffix.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 3: squareUp
# -----------------------------------------------------------------
def squareUp(n: int) -> list[int]:
    """
    Description:
        Given a non-negative integer `n`, return a list of length `n*n` following a square-up pattern.
        For each i from 1 to n, you create a group of length n consisting of (n-i) zeros followed by the numbers
        i down to 1. Concatenate all groups in order.

    Examples:
        squareUp(3) -> [0, 0, 1, 0, 2, 1, 3, 2, 1]
        squareUp(2) -> [0, 1, 2, 1]
        squareUp(4) -> [0, 0, 0, 1,    0, 0, 2, 1,    0, 3, 2, 1,    4, 3, 2, 1]

    Args:
        n (int): The dimension of the square pattern (number of groups).

    Returns:
        list[int]: A flat list representing the square-up pattern of length n*n.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 4: getSandwich
# -----------------------------------------------------------------
def getSandwich(s: str) -> str:
    """
    Description:
        A "sandwich" is defined by two occurrences of the substring "bread" with
        some filling in between. Return the filling between the first and last
        appearance of "bread" in the input string `s`. If there are fewer than
        two occurrences of "bread", return an empty string "".

    Examples:
        getSandwich("breadjambread") -> "jam"
        getSandwich("xxbreadjambreadyy") -> "jam"
        getSandwich("xxbreadbreadjambreadyy") -> "breadjam"

    Args:
        s (str): The input string to search for "bread".

    Returns:
        str: The substring between the first and last "bread", or "" if none.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 5: sameStarChar
# -----------------------------------------------------------------
def sameStarChar(s: str) -> bool:
    """
    Description:
        Return True if for every '*' in the string, whenever there are characters
        immediately before and after the star, those characters are the same.

    Examples:
        sameStarChar("xy*yzz") -> True
        sameStarChar("xy*zzz") -> False
        sameStarChar("*xa*az") -> True

    Args:
        s (str): The input string to check.

    Returns:
        bool: True if all '*' that have neighbors are surrounded by identical chars.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 6: haveThree
# -----------------------------------------------------------------
def haveThree(nums: list[int]) -> bool:
    """
    Description:
        Given a list of integers, return True if the value 3 appears exactly three times
        and no two 3's are adjacent to each other.

    Examples:
        haveThree([3, 1, 3, 1, 3]) -> True
        haveThree([3, 1, 3, 3]) -> False
        haveThree([3, 4, 3, 3, 4]) -> False

    Args:
        nums (list[int]): The list of integers to check.

    Returns:
        bool: True if there are exactly three 3's and none are adjacent.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 7: twoTwo
# -----------------------------------------------------------------
def twoTwo(nums: list[int]) -> bool:
    """
    Description:
        Given a list of integers, return True if every 2 in the list is adjacent to
        at least one other 2. In other words, for each occurrence of 2, there must be
        another 2 either immediately before or after it.

    Examples:
        twoTwo([4, 2, 2, 3]) -> True
        twoTwo([2, 2, 4]) -> True
        twoTwo([2, 2, 4, 2]) -> False

    Args:
        nums (list[int]): The list of integers to check.

    Returns:
        bool: True if every 2 has at least one adjacent 2, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 8: sameEnds (list version)
# -----------------------------------------------------------------
def sameEnds(nums: list[int], length: int) -> bool:
    """
    Description:
        Return True if the group of `length` numbers at the start and end of the list are the same.
        You may assume that 0 <= length <= len(nums).

    Examples:
        sameEnds([5, 6, 45, 99, 13, 5, 6], 1) -> False
        sameEnds([5, 6, 45, 99, 13, 5, 6], 2) -> True
        sameEnds([5, 6, 45, 99, 13, 5, 6], 3) -> False

    Args:
        nums (list[int]): The list of integers to check.
        length (int): The number of elements to compare at both ends.

    Returns:
        bool: True if the first `length` elements and the last `length` elements are identical.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 9: tripleUp
# -----------------------------------------------------------------
def tripleUp(nums: list[int]) -> bool:
    """
    Description:
        Return True if the list contains, somewhere, three increasing adjacent numbers,
        like ...4, 5, 6... or 23, 24, 25.

    Examples:
        tripleUp([1, 4, 5, 6, 2]) -> True
        tripleUp([1, 2, 3]) -> True
        tripleUp([1, 2, 4]) -> False

    Args:
        nums (list[int]): The list of integers to check.

    Returns:
        bool: True if there is any run of three consecutive increasing ints.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 10: fizzArray3
# -----------------------------------------------------------------
def fizzArray3(start: int, end: int) -> list[int]:
    """
    Description:
        Given start and end numbers, return a new list containing the sequence of integers
        from start up to but not including end. The end number will be greater than or equal
        to the start number. A length-0 list is valid if start == end.

    Examples:
        fizzArray3(5, 10) -> [5, 6, 7, 8, 9]
        fizzArray3(11, 18) -> [11, 12, 13, 14, 15, 16, 17]
        fizzArray3(1, 1) -> []
        fizzArray3(1000, 1005) -> [1000, 1001, 1002, 1003, 1004]

    Args:
        start (int): The starting integer (inclusive).
        end   (int): The ending integer (exclusive).

    Returns:
        list[int]: A list of integers from start up to end-1.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return []


# -----------------------------------------------------------------
# Question 11: strCopies
# -----------------------------------------------------------------
def strCopies(s: str, sub: str, n: int) -> bool:
    """
    Description:
        Recursively determines if at least 'n' copies of a non-empty substring 'sub'
        appear in the given string 's', allowing overlapping occurrences.

    Examples:
        strCopies("catcowcat", "cat", 2) -> True
        strCopies("catcowcat", "cow", 2) -> False
        strCopies("catcowcat", "cow", 1) -> True

    Args:
        s (str): The input string.
        sub (str): The substring to search for.
        n (int): The required number of occurrences.

    Returns:
        bool: True if 'sub' appears at least 'n' times, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 12: strDist
# -----------------------------------------------------------------
def strDist(s: str, sub: str) -> int:
    """
    Description:
        Recursively computes the length of the largest substring in 's' that starts 
        and ends with the given non-empty substring 'sub'.

    Examples:
        strDist("catcowcat", "cat") -> 9
        strDist("catcowcat", "cow") -> 3
        strDist("cccatcowcatxx", "cat") -> 9

    Args:
        s (str): The input string.
        sub (str): The substring to find.

    Returns:
        int: The length of the largest substring that starts and ends with 'sub'.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 13: groupSum
# -----------------------------------------------------------------
def groupSum(start: int, nums: list[int], target: int) -> bool:
    """
    Description:
        Given an array of integers `nums`, determine recursively whether it's 
        possible to choose a group of elements starting from index `start` 
        such that their sum equals `target`.
        
        This is a classic backtracking problem. At each index, there are two choices:
        - Include nums[start] in the group
        - Exclude nums[start] from the group

    Examples:
        groupSum(0, [2, 4, 8], 10) -> True
        groupSum(0, [2, 4, 8], 14) -> True
        groupSum(0, [2, 4, 8], 9) -> False

    Args:
        start (int): The starting index to consider elements from `nums`.
        nums (list[int]): The list of integers.
        target (int): The sum to achieve.

    Returns:
        bool: True if a valid group exists, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 14: groupSum6
# -----------------------------------------------------------------
def groupSum6(start: int, nums: list[int], target: int) -> bool:
    """
    Description:
        Given an array of integers `nums`, determine recursively whether it's possible to choose
        a group of elements beginning at index `start` such that their sum equals `target`. However,
        there is an additional constraint: all 6's in the array must be chosen.
        
        At each step, if the current element is a 6, it must be included in the sum. Otherwise, you
        have the option to either include or exclude the current element.

    Examples:
        groupSum6(0, [5,6,2], 8) -> True
        groupSum6(0, [5,6,2], 9) -> False
        groupSum6(0, [5,6,2], 7) -> False

    Args:
        start (int): The starting index from which to consider elements in `nums`.
        nums (list[int]): The list of integers.
        target (int): The target sum to achieve.

    Returns:
        bool: True if a valid group (meeting the constraints) exists, False otherwise.
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
class TestSameEndsString(unittest.TestCase):
    def test_sameEnds(self):
        self.assertEqual(sameEnds("abXYab"), "ab")
        self.assertEqual(sameEnds("xx"), "x")
        self.assertEqual(sameEnds("xxx"), "x")
        self.assertEqual(sameEnds("xxxx"), "xx")
        self.assertEqual(sameEnds("javaXYZjava"), "java")
        self.assertEqual(sameEnds("javajava"), "java")
        self.assertEqual(sameEnds("xavaXYZjava"), "")
        self.assertEqual(sameEnds("Hello! and Hello!"), "Hello!")
        self.assertEqual(sameEnds("x"), "")
        self.assertEqual(sameEnds(""), "")
        self.assertEqual(sameEnds("abcb"), "")
        self.assertEqual(sameEnds("mymmy"), "my")

class TestMirrorEnds(unittest.TestCase):
    def test_mirrorEnds(self):
        self.assertEqual(mirrorEnds("abXYZba"), "ab")
        self.assertEqual(mirrorEnds("abca"), "a")
        self.assertEqual(mirrorEnds("aba"), "aba")
        self.assertEqual(mirrorEnds("abab"), "")
        self.assertEqual(mirrorEnds("xxx"), "xxx")
        self.assertEqual(mirrorEnds("xxYxx"), "xxYxx")
        self.assertEqual(mirrorEnds("Hi and iH"), "Hi")
        self.assertEqual(mirrorEnds(" x "), " x ")
        self.assertEqual(mirrorEnds(""), "")
        self.assertEqual(mirrorEnds("123and then 321"), "123")
        self.assertEqual(mirrorEnds("band andab"), "ba")

class TestSquareUp(unittest.TestCase):
    def test_squareUp(self):
        self.assertEqual(squareUp(3), [0, 0, 1, 0, 2, 1, 3, 2, 1])
        self.assertEqual(squareUp(2), [0, 1, 2, 1])
        self.assertEqual(
            squareUp(4),
            [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
        )
        self.assertEqual(squareUp(1), [1])
        self.assertEqual(squareUp(0), [])
        self.assertEqual(
            squareUp(6),
            [
                0, 0, 0, 0, 0, 1,
                0, 0, 0, 0, 2, 1,
                0, 0, 0, 3, 2, 1,
                0, 0, 4, 3, 2, 1,
                0, 5, 4, 3, 2, 1,
                6, 5, 4, 3, 2, 1
            ]
        )

class TestGetSandwich(unittest.TestCase):
    def test_getSandwich(self):
        self.assertEqual(getSandwich("breadjambread"), "jam")
        self.assertEqual(getSandwich("xxbreadjambreadyy"), "jam")
        self.assertEqual(getSandwich("xxbreadyy"), "")
        self.assertEqual(getSandwich("xxbreadbreadjambreadyy"), "breadjam")
        self.assertEqual(getSandwich("breadAbread"), "A")
        self.assertEqual(getSandwich("breadbread"), "")
        self.assertEqual(getSandwich("abcbreaz"), "")
        self.assertEqual(getSandwich("xyz"), "")
        self.assertEqual(getSandwich(""), "")
        self.assertEqual(getSandwich("breadbreaxbread"), "breax")
        self.assertEqual(getSandwich("breaxbreadybread"), "y")
        self.assertEqual(getSandwich("breadbreadbreadbread"), "breadbread")

class TestSameStarChar(unittest.TestCase):
    def test_sameStarChar(self):
        self.assertTrue(sameStarChar("xy*yzz"))
        self.assertFalse(sameStarChar("xy*zzz"))
        self.assertTrue(sameStarChar("*xa*az"))
        self.assertFalse(sameStarChar("*xa*bz"))
        self.assertTrue(sameStarChar("*xa*a*"))
        self.assertTrue(sameStarChar(""))
        self.assertTrue(sameStarChar("*xa*a*a"))
        self.assertFalse(sameStarChar("*xa*a*b"))
        self.assertTrue(sameStarChar("*12*2*2"))
        self.assertFalse(sameStarChar("12*2*3*"))
        self.assertTrue(sameStarChar("abcDEF"))
        self.assertFalse(sameStarChar("XY*YYYY*Z*"))
        self.assertTrue(sameStarChar("*"))
        self.assertTrue(sameStarChar("**"))

class TestHaveThree(unittest.TestCase):
    def test_haveThree(self):
        self.assertTrue(haveThree([3, 1, 3, 1, 3]))
        self.assertFalse(haveThree([3, 1, 3, 3]))
        self.assertFalse(haveThree([3, 4, 3, 3, 4]))
        self.assertFalse(haveThree([1, 3, 1, 3, 1, 2]))
        self.assertTrue(haveThree([1, 3, 1, 3, 1, 3]))
        self.assertFalse(haveThree([1, 3, 3, 1, 3]))
        self.assertFalse(haveThree([1, 3, 1, 3, 1, 3, 4, 3]))
        self.assertTrue(haveThree([3, 4, 3, 4, 3, 4, 4]))
        self.assertFalse(haveThree([3, 3, 3]))
        self.assertFalse(haveThree([1, 3]))
        self.assertFalse(haveThree([3]))
        self.assertFalse(haveThree([1]))

class TestTwoTwo(unittest.TestCase):
    def test_twoTwo(self):
        self.assertTrue(twoTwo([4, 2, 2, 3]))
        self.assertTrue(twoTwo([2, 2, 4]))
        self.assertFalse(twoTwo([2, 2, 4, 2]))
        self.assertTrue(twoTwo([1, 3, 4]))
        self.assertTrue(twoTwo([1, 2, 2, 3, 4]))
        self.assertFalse(twoTwo([1, 2, 3, 4]))
        self.assertTrue(twoTwo([2, 2]))
        self.assertTrue(twoTwo([2, 2, 7]))
        self.assertFalse(twoTwo([2, 2, 7, 2, 1]))
        self.assertTrue(twoTwo([4, 2, 2, 2]))
        self.assertTrue(twoTwo([2, 2, 2]))
        self.assertFalse(twoTwo([1, 2]))
        self.assertFalse(twoTwo([2]))
        self.assertTrue(twoTwo([1]))
        self.assertTrue(twoTwo([]))
        self.assertTrue(twoTwo([5, 2, 2, 3]))
        self.assertFalse(twoTwo([2, 2, 5, 2]))

class TestSameEndsList(unittest.TestCase):
    def test_sameEnds(self):
        self.assertFalse(sameEnds([5, 6, 45, 99, 13, 5, 6], 1))
        self.assertTrue(sameEnds([5, 6, 45, 99, 13, 5, 6], 2))
        self.assertFalse(sameEnds([5, 6, 45, 99, 13, 5, 6], 3))
        self.assertTrue(sameEnds([1, 2, 5, 2, 1], 1))
        self.assertFalse(sameEnds([1, 2, 5, 2, 1], 2))
        self.assertTrue(sameEnds([1, 2, 5, 2, 1], 0))
        self.assertTrue(sameEnds([1, 2, 5, 2, 1], 5))
        self.assertTrue(sameEnds([1, 1, 1], 0))
        self.assertTrue(sameEnds([1, 1, 1], 1))
        self.assertTrue(sameEnds([1, 1, 1], 2))
        self.assertTrue(sameEnds([1, 1, 1], 3))
        self.assertTrue(sameEnds([1], 1))
        self.assertTrue(sameEnds([], 0))
        self.assertFalse(sameEnds([4, 2, 4, 5], 1))

class TestTripleUp(unittest.TestCase):
    def test_tripleUp(self):
        self.assertTrue(tripleUp([1, 4, 5, 6, 2]))
        self.assertTrue(tripleUp([1, 2, 3]))
        self.assertFalse(tripleUp([1, 2, 4]))
        self.assertTrue(tripleUp([1, 2, 4, 5, 7, 6, 5, 6, 7, 6]))
        self.assertFalse(tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]))
        self.assertFalse(tripleUp([1, 2]))
        self.assertFalse(tripleUp([1]))
        self.assertFalse(tripleUp([]))
        self.assertTrue(tripleUp([10, 9, 8, -100, -99, -98, 100]))
        self.assertFalse(tripleUp([10, 9, 8, -100, -99, 99, 100]))
        self.assertTrue(tripleUp([-100, -99, -99, 100, 101, 102]))
        self.assertFalse(tripleUp([2, 3, 5, 6, 8, 9, 2, 3]))

class TestFizzArray3(unittest.TestCase):
    def test_fizzArray3(self):
        self.assertEqual(fizzArray3(5, 10), [5, 6, 7, 8, 9])
        self.assertEqual(fizzArray3(11, 18), [11, 12, 13, 14, 15, 16, 17])
        self.assertEqual(fizzArray3(1, 3), [1, 2])
        self.assertEqual(fizzArray3(1, 2), [1])
        self.assertEqual(fizzArray3(1, 1), [])
        self.assertEqual(fizzArray3(1000, 1005), [1000, 1001, 1002, 1003, 1004])

class TestStrCopies(unittest.TestCase):
    def test_strCopies(self):
        self.assertTrue(strCopies("catcowcat", "cat", 2))  # strCopies("catcowcat", "cat", 2) -> True
        self.assertFalse(strCopies("catcowcat", "cow", 2))  # strCopies("catcowcat", "cow", 2) -> False
        self.assertTrue(strCopies("catcowcat", "cow", 1))  # strCopies("catcowcat", "cow", 1) -> True
        self.assertTrue(strCopies("iiijjj", "i", 3))  # strCopies("iiijjj", "i", 3) -> True
        self.assertFalse(strCopies("iiijjj", "i", 4))  # strCopies("iiijjj", "i", 4) -> False
        self.assertTrue(strCopies("iiijjj", "ii", 2))  # strCopies("iiijjj", "ii", 2) -> True
        self.assertFalse(strCopies("iiijjj", "ii", 3))  # strCopies("iiijjj", "ii", 3) -> False
        self.assertFalse(strCopies("iiijjj", "x", 3))  # strCopies("iiijjj", "x", 3) -> False
        self.assertTrue(strCopies("iiijjj", "x", 0))  # strCopies("iiijjj", "x", 0) -> True
        self.assertTrue(strCopies("iiiiij", "iii", 3))  # strCopies("iiiiij", "iii", 3) -> True
        self.assertFalse(strCopies("iiiiij", "iii", 4))  # strCopies("iiiiij", "iii", 4) -> False
        self.assertTrue(strCopies("ijiiiiij", "iiii", 2))  # strCopies("ijiiiiij", "iiii", 2) -> True
        self.assertFalse(strCopies("ijiiiiij", "iiii", 3))  # strCopies("ijiiiiij", "iiii", 3) -> False
        self.assertTrue(strCopies("dogcatdogcat", "dog", 2))  # strCopies("dogcatdogcat", "dog", 2) -> True

class TestStrDist(unittest.TestCase):
    def test_strDist(self):
        self.assertEqual(strDist("catcowcat", "cat"), 9)  # strDist("catcowcat", "cat") -> 9
        self.assertEqual(strDist("catcowcat", "cow"), 3)  # strDist("catcowcat", "cow") -> 3
        self.assertEqual(strDist("cccatcowcatxx", "cat"), 9)  # strDist("cccatcowcatxx", "cat") -> 9
        self.assertEqual(strDist("abccatcowcatcatxyz", "cat"), 12)  # strDist("abccatcowcatcatxyz", "cat") -> 12
        self.assertEqual(strDist("xyx", "x"), 3)  # strDist("xyx", "x") -> 3
        self.assertEqual(strDist("xyx", "y"), 1)  # strDist("xyx", "y") -> 1
        self.assertEqual(strDist("xyx", "z"), 0)  # strDist("xyx", "z") -> 0
        self.assertEqual(strDist("z", "z"), 1)  # strDist("z", "z") -> 1
        self.assertEqual(strDist("x", "z"), 0)  # strDist("x", "z") -> 0
        self.assertEqual(strDist("", "z"), 0)  # strDist("", "z") -> 0
        self.assertEqual(strDist("hiHellohihihi", "hi"), 13)  # strDist("hiHellohihihi", "hi") -> 13
        self.assertEqual(strDist("hiHellohihihi", "hih"), 5)  # strDist("hiHellohihihi", "hih") -> 5
        self.assertEqual(strDist("hiHellohihihi", "o"), 1)  # strDist("hiHellohihihi", "o") -> 1
        self.assertEqual(strDist("hiHellohihihi", "II"), 2)  # strDist("hiHellohihihi", "II") -> 2

class TestGroupSum(unittest.TestCase):
    def test_groupSum(self):
        self.assertTrue(groupSum(0, [2, 4, 8], 10))     # -> True
        self.assertTrue(groupSum(0, [2, 4, 8], 14))     # -> True
        self.assertFalse(groupSum(0, [2, 4, 8], 9))     # -> False
        self.assertTrue(groupSum(0, [2, 4, 8], 8))      # -> True
        self.assertTrue(groupSum(1, [2, 4, 8], 8))      # -> True
        self.assertFalse(groupSum(1, [2, 4, 8], 2))     # -> False
        self.assertTrue(groupSum(0, [1], 1))            # -> True
        self.assertFalse(groupSum(0, [9], 1))           # -> False
        self.assertTrue(groupSum(1, [9], 0))            # -> True
        self.assertTrue(groupSum(0, [], 0))             # -> True
        self.assertTrue(groupSum(0, [10, 2, 2, 5], 17)) # -> True
        self.assertTrue(groupSum(0, [10, 2, 2, 5], 15)) # -> True
        self.assertTrue(groupSum(0, [10, 2, 2, 5], 9))  # -> True

class TestGroupSum6(unittest.TestCase):
    def test_groupSum6(self):
        self.assertTrue(groupSum6(0, [5, 6, 2], 8))         # -> True
        self.assertFalse(groupSum6(0, [5, 6, 2], 9))         # -> False
        self.assertFalse(groupSum6(0, [5, 6, 2], 7))         # -> False
        self.assertTrue(groupSum6(0, [1], 1))                # -> True
        self.assertFalse(groupSum6(0, [9], 1))               # -> False
        self.assertTrue(groupSum6(0, [], 0))                 # -> True
        self.assertTrue(groupSum6(0, [3,2,4,6], 8))          # -> True
        self.assertTrue(groupSum6(0, [6,2,4,3], 8))          # -> True
        self.assertFalse(groupSum6(0, [5,2,4,6], 9))         # -> False
        self.assertFalse(groupSum6(0, [6,2,4,5], 9))         # -> False
        self.assertFalse(groupSum6(0, [3,2,4,6], 3))         # -> False
        self.assertTrue(groupSum6(0, [1,6,2,6,4], 12))       # -> True
        self.assertTrue(groupSum6(0, [1,6,2,6,4], 13))       # -> True
        self.assertFalse(groupSum6(0, [1,6,2,6,4], 4))       # -> False
        self.assertFalse(groupSum6(0, [1,6,2,6,4], 9))       # -> False
        self.assertTrue(groupSum6(0, [1,6,2,6,5], 14))       # -> True
        self.assertTrue(groupSum6(0, [1,6,2,6,5], 15))       # -> True
        self.assertFalse(groupSum6(0, [1,6,2,6,5], 16))      # -> False

# -----------------------------------------------------------------
# Main execution block
# -----------------------------------------------------------------

if __name__ == "__main__":
    """
    This conditional block checks if the script is being run directly.
    If it is, it calls `unittest.main()`.
    
    `unittest.main()` discovers all test cases (TestSameEndsString,
    TestMirrorEnds, TestSquareUp, TestGetSandwich, TestSameStarChar,
    TestHaveThree, TestTwoTwo, TestSameEndsList, TestTripleUp,
    TestFizzArray3, TestStrCopies, TestStrDist, TestGroupSum,
    and TestGroupSum6) and runs them.
    
    `verbosity=2` is added to provide a more detailed output,
    showing the result of each test method individually, which
    satisfies the requirement for clear results for each function.
    """
    unittest.main(verbosity=2)
