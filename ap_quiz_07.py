#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Instructions to run the tests via the CLI:
    1. Open your terminal or command prompt.
    2. Run the tests by executing: `python _coding-pop_algo/ap_quiz_package07.py`

This is a list of quiz questions for practice, including:
1.  sumDigits: Sum all digits 0-9 that appear in a string, ignoring other characters.
2.  linearIn: Check if all elements in an inner sorted list appear in an outer sorted list.
3.  either24: Check if a list contains a 2-2 pair or a 4-4 pair, but not both.
4.  matchUp: Count positions where two lists differ by at most 2 but are not equal.
5.  has77: Check if a list contains two 7's next to each other or separated by one element.
6.  has12: Check if a list contains a 1 followed by a 2 somewhere later.
7.  modThree: Check if a list contains three consecutive even or odd values.
8.  prefixAgain: Check if the first n characters of a string appear again later.
9.  xyzMiddle: Check if "xyz" appears in the middle of a string (left/right differ by at most 1).
10. closeFar: Check if one of b or c is close to a while the other is far from both.
11. countHi2: Recursively count occurrences of "hi" in a string, excluding "xhi".
12. parenBit: Recursively extract the substring enclosed in parentheses.
13. nestParen: Recursively check if a string is a valid nesting of parentheses.
14. strCount: Recursively count non-overlapping occurrences of a substring.
"""

# Import the unittest module, needed for creating test cases.
# We only need to import it once at the top of the file.
import unittest

# Import List from the typing module for type hinting (e.g., List[str])
# This is preferred for compatibility with Python versions < 3.10
from typing import List











# -----------------------------------------------------------------
# Question 1: sumDigits
# -----------------------------------------------------------------
def sumDigits(s: str) -> int:
    """
    Description:
        Given a string, return the sum of the digits 0-9 that appear in the string,
        ignoring all other characters. Return 0 if there are no digits.
        (Note: str.isdigit() tests for '0'-'9'.)

    Examples:
        sumDigits("aa1bc2d3")   -> 6   # 1 + 2 + 3
        sumDigits("aa11b33")    -> 8   # 1 + 1 + 3 + 3
        sumDigits("123abc123")  -> 12  # 1+2+3 + 1+2+3

    Args:
        s (str): The input string potentially containing digits.

    Returns:
        int: The sum of all digit characters found in the string.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 2: linearIn
# -----------------------------------------------------------------
def linearIn(outer: list[int], inner: list[int]) -> bool:
    """
    Description:
        Given two lists of integers sorted in increasing order, `outer` and `inner`,
        return True if all of the numbers in `inner` appear in `outer`. The optimal
        solution makes a single linear pass through both lists, taking advantage
        of their sorted order.

    Examples:
        linearIn([1, 2, 4, 6], [2, 4]) -> True
        linearIn([1, 2, 4, 6], [2, 3, 4]) -> False
        linearIn([1, 2, 4, 4, 6], [2, 4]) -> True

    Args:
        outer (list[int]): A sorted list of integers (the superset).
        inner (list[int]): A sorted list of integers to check for membership in `outer`.

    Returns:
        bool: True if every element of `inner` appears in `outer`, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 3: either24
# -----------------------------------------------------------------
def either24(nums: list[int]) -> bool:
    """
    Description:
        Given a list of integers, return True if the list contains a 2 next to a 2
        or a 4 next to a 4, but not both.

    Examples:
        either24([1, 2, 2]) -> True
        either24([4, 4, 1]) -> True
        either24([4, 4, 1, 2, 2]) -> False

    Args:
        nums (list[int]): The list of integers to examine.

    Returns:
        bool: True if there's a 2-2 pair or a 4-4 pair (exclusively), False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 4: matchUp
# -----------------------------------------------------------------
def matchUp(nums1: list[int], nums2: list[int]) -> int:
    """
    Description:
        Given two lists of integers of the same length, for every element in `nums1`,
        consider the corresponding element in `nums2` at the same index. Count how many
        times the two elements differ by 2 or less, but are not equal.

    Examples:
        matchUp([1, 2, 3], [2, 3, 10]) -> 2   # pairs (1,2) and (2,3)
        matchUp([1, 2, 3], [2, 3, 5]) -> 3    # (1,2), (2,3), (3,5)
        matchUp([1, 2, 3], [2, 3, 3]) -> 2    # (1,2), (2,3)

    Args:
        nums1 (list[int]): First list of integers.
        nums2 (list[int]): Second list of integers, same length as nums1.

    Returns:
        int: The count of positions where the values differ by at most 2 but are not equal.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 5: has77
# -----------------------------------------------------------------
def has77(nums: list[int]) -> bool:
    """
    Description:
        Given a list of integers, return True if the list contains two 7's next to each other,
        or if there are two 7's separated by exactly one element (e.g. [7, x, 7]).

    Examples:
        has77([1, 7, 7]) -> True
        has77([1, 7, 1, 7]) -> True
        has77([1, 7, 1, 1, 7]) -> False

    Args:
        nums (list[int]): The list of integers to check.

    Returns:
        bool: True if there is a '77' pair or a '7_x_7' pattern, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 6: has12
# -----------------------------------------------------------------
def has12(nums: list[int]) -> bool:
    """
    Description:
        Given a list of integers, return True if there is a 1 in the list with a 2 somewhere later in the list.

    Examples:
        has12([1, 3, 2]) -> True    # 1 appears at index 0, 2 appears later
        has12([3, 1, 2]) -> True    # 1 at index 1, 2 at index 2
        has12([3, 1, 4, 1, 6, 2]) -> True # the second 1 has a 2 after
        has12([2, 1, 4, 1, 6, 2]) -> True # the 1 at index 1 has a 2 later

    Args:
        nums (list[int]): The list of integers to check.

    Returns:
        bool: True if a 1 is found with a 2 somewhere after it; otherwise False.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 7: modThree
# -----------------------------------------------------------------
def modThree(nums: list[int]) -> bool:
    """
    Description:
        Given a list of integers, return True if the list contains either
        three even values in a row or three odd values in a row.

    Examples:
        modThree([2, 1, 3, 5]) -> True    # 1,3,5 are three odds in a row
        modThree([2, 4, 2, 5]) -> True    # 2,4,2 are three evens in a row
        modThree([9, 9, 9]) -> True       # three odds
        modThree([2, 1, 2, 5]) -> False
        modThree([1, 2, 1, 2, 1]) -> False

    Args:
        nums (list[int]): The list of integers to examine.

    Returns:
        bool: True if there exists a run of three consecutive evens or three consecutive odds.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 8: prefixAgain
# -----------------------------------------------------------------
def prefixAgain(s: str, n: int) -> bool:
    """
    Description:
        Consider the prefix string made of the first `n` characters of `s`. 
        Return True if that prefix appears again somewhere else in `s`.
        You may assume `s` is non-empty and 1 <= n <= len(s).

    Examples:
        prefixAgain("abXYabc", 1) -> True   # prefix "a" appears later
        prefixAgain("abXYabc", 2) -> True   # prefix "ab" appears at index 4
        prefixAgain("Hi12345Hi6789Hi10", 3) -> True   # "Hi1"
        prefixAgain("Hi12345Hi6789Hi10", 4) -> False  # "Hi12" only at start

    Args:
        s (str): The input string.
        n (int): The length of the prefix to check.

    Returns:
        bool: True if the prefix of length `n` appears again in `s`, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 9: xyzMiddle
# -----------------------------------------------------------------
def xyzMiddle(s: str) -> bool:
    """
    Description:
        Given a string, return True if "xyz" appears in the middle of the string.
        To be in the middle, the number of characters to the left and right of "xyz"
        must differ by at most one.

    Examples:
        xyzMiddle("AAxyzBB") -> True    # left="AA", right="BB" (2 vs 2)
        xyzMiddle("AxyzBB") -> True     # left="A", right="BB" (1 vs 2) diff=1
        xyzMiddle("AxyzBBB") -> False   # left="A", right="BBB" (1 vs 3) diff=2

    Args:
        s (str): The input string.

    Returns:
        bool: True if "xyz" appears in the middle by the above definition, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 10: closeFar
# -----------------------------------------------------------------
def closeFar(a: int, b: int, c: int) -> bool:
    """
    Description:
        Given three integers a, b, c, return True if one of b or c is "close" to a
        (differing from a by at most 1), while the other is "far" from both of the others
        (differing by 2 or more from each).

    Examples:
        closeFar(1, 2, 10) -> True   # b is close to a, c is far from both
        closeFar(8, 9, 10) -> False  # both b and c are close
        closeFar(8, 9, 7) -> False   # b is close but c is not far from b
        closeFar(8, 6, 9) -> True    # c is far, b is far from c but close to a? actually b=6 is 2 away from a=8 -> far, c=9 is 1 away -> close

    Args:
        a (int): The reference integer.
        b (int): The first integer to compare.
        c (int): The second integer to compare.

    Returns:
        bool: True if exactly one of b or c is within 1 of a and the other differs by at least 2 from both.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 11: countHi2
# -----------------------------------------------------------------
def countHi2(s: str) -> int:
    """
    Description:
        Recursively computes the number of times the lowercase "hi" appears in the string,
        but does not count "hi" if it is immediately preceded by an 'x'.

    Examples:
        countHi2("ahixhi") -> 1
        countHi2("ahibhi") -> 2
        countHi2("xhixhi") -> 0

    Args:
        s (str): The input string.

    Returns:
        int: The count of valid "hi" occurrences.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 12: parenBit
# -----------------------------------------------------------------
def parenBit(s: str) -> str:
    """
    Description:
        Recursively extracts and returns the substring enclosed in parentheses
        from a given string containing exactly one pair of parentheses.

    Examples:
        parenBit("xyz(abc)123") -> "(abc)"
        parenBit("x(hello)") -> "(hello)"
        parenBit("(xy)1") -> "(xy)"

    Args:
        s (str): The input string.

    Returns:
        str: The substring enclosed within parentheses.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 13: nestParen
# -----------------------------------------------------------------
def nestParen(s: str) -> bool:
    """
    Description:
        Recursively checks if a string is a valid nesting of zero or more pairs
        of parentheses. A valid nesting consists only of matching '(' and ')' pairs.

    Examples:
        nestParen("(())") -> True
        nestParen("((()))") -> True
        nestParen("(((x))") -> False

    Args:
        s (str): The input string.

    Returns:
        bool: True if the string is a valid nesting of parentheses, False otherwise.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 14: strCount
# -----------------------------------------------------------------
def strCount(s: str, sub: str) -> int:
    """
    Description:
        Recursively computes the number of times a non-empty substring 'sub' appears
        in the given string 's', without overlapping occurrences.

    Examples:
        strCount("catcowcat", "cat") -> 2
        strCount("catcowcat", "cow") -> 1
        strCount("catcowcat", "dog") -> 0

    Args:
        s (str): The input string.
        sub (str): The substring to count.

    Returns:
        int: The number of non-overlapping occurrences of 'sub' in 's'.
    """
    ### [Your Implementation Here]
    
    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0



# -----------------------------------------------------------------
# Unit Tests
# -----------------------------------------------------------------
class TestSumDigits(unittest.TestCase):
    def test_sumDigits(self):
        self.assertEqual(sumDigits("aa1bc2d3"), 6)
        self.assertEqual(sumDigits("aa11b33"), 8)
        self.assertEqual(sumDigits("Chocolate"), 0)
        self.assertEqual(sumDigits("5hoco1a1e"), 7)
        self.assertEqual(sumDigits("123abc123"), 12)
        self.assertEqual(sumDigits(""), 0)
        self.assertEqual(sumDigits("Hello"), 0)
        self.assertEqual(sumDigits("X1z9b2"), 12)
        self.assertEqual(sumDigits("5432a"), 14)

class TestLinearIn(unittest.TestCase):
    def test_linearIn(self):
        self.assertTrue(linearIn([1, 2, 4, 6], [2, 4]))
        self.assertFalse(linearIn([1, 2, 4, 6], [2, 3, 4]))
        self.assertTrue(linearIn([1, 2, 4, 4, 6], [2, 4]))
        self.assertTrue(linearIn([2, 2, 4, 4, 6, 6], [2, 4]))
        self.assertTrue(linearIn([2,2,2,2,2], [2,2]))
        self.assertFalse(linearIn([2,2,2,2,2], [2,4]))
        self.assertTrue(linearIn([2,2,2,2,4], [2,4]))
        self.assertTrue(linearIn([1, 2, 3], [2]))
        self.assertFalse(linearIn([1,2,3], [-1]))
        self.assertTrue(linearIn([1, 2, 3], []))
        self.assertTrue(linearIn([-1,0,3,3,3,10,12], [-1,0,3,12]))
        self.assertFalse(linearIn([-1,0,3,3,3,10,12], [0,3,12,14]))
        self.assertFalse(linearIn([-1,0,3,3,3,10,12], [-1,10,11]))

class TestEither24(unittest.TestCase):
    def test_either24(self):
        self.assertTrue(either24([1, 2, 2]))
        self.assertTrue(either24([4, 4, 1]))
        self.assertFalse(either24([4, 4, 1, 2, 2]))
        self.assertFalse(either24([1, 2, 3, 4]))
        self.assertFalse(either24([3, 5, 9]))
        self.assertTrue(either24([1, 2, 3, 4, 4]))
        self.assertTrue(either24([2, 2, 3, 4]))
        self.assertTrue(either24([1, 2, 3, 2, 2, 4]))
        self.assertFalse(either24([1, 2, 3, 2, 2, 4, 4]))
        self.assertFalse(either24([1, 2]))
        self.assertTrue(either24([2, 2]))
        self.assertTrue(either24([4, 4]))
        self.assertFalse(either24([2]))
        self.assertFalse(either24([]))

class TestMatchUp(unittest.TestCase):
    def test_matchUp(self):
        self.assertEqual(matchUp([1,2,3], [2,3,10]), 2)
        self.assertEqual(matchUp([1, 2, 3], [2, 3, 5]), 3)
        self.assertEqual(matchUp([1, 2, 3], [2, 3, 3]), 2)
        self.assertEqual(matchUp([5, 3], [5, 5]), 1)
        self.assertEqual(matchUp([5, 3], [4, 4]), 2)
        self.assertEqual(matchUp([5, 3], [3, 3]), 1)
        self.assertEqual(matchUp([5, 3], [2, 2]), 1)
        self.assertEqual(matchUp([5, 3], [1, 1]), 1)
        self.assertEqual(matchUp([5, 3], [0, 0]), 0)
        self.assertEqual(matchUp([4], [4]), 0)
        self.assertEqual(matchUp([4], [5]), 1)

class TestHas77(unittest.TestCase):
    def test_has77(self):
        self.assertTrue(has77([1, 7, 7]))
        self.assertTrue(has77([1, 7, 1, 7]))
        self.assertFalse(has77([1, 7, 1, 1, 7]))
        self.assertTrue(has77([7, 7, 1, 1, 7]))
        self.assertFalse(has77([2, 7, 2, 2, 7, 2]))
        self.assertTrue(has77([2, 7, 2, 2, 7, 7]))
        self.assertTrue(has77([7, 2, 7, 2, 2, 7]))
        self.assertFalse(has77([7, 2, 6, 2, 2, 7]))
        self.assertTrue(has77([7, 7, 7]))
        self.assertTrue(has77([7, 1, 7]))
        self.assertFalse(has77([7, 1, 1]))
        self.assertFalse(has77([1, 2]))
        self.assertFalse(has77([1, 7]))
        self.assertFalse(has77([7]))

class TestHas12(unittest.TestCase):
    def test_has12(self):
        self.assertTrue(has12([1, 3, 2]))
        self.assertTrue(has12([3, 1, 2]))
        self.assertTrue(has12([3, 1, 4, 5, 2]))
        self.assertFalse(has12([3, 1, 4, 5, 6]))
        self.assertTrue(has12([3, 1, 4, 1, 6, 2]))
        self.assertTrue(has12([2, 1, 4, 1, 6, 2]))
        self.assertFalse(has12([2, 1, 4, 1, 6]))
        self.assertFalse(has12([1]))
        self.assertFalse(has12([2, 1, 3]))
        self.assertTrue(has12([2, 1, 3, 2]))
        self.assertFalse(has12([2]))
        self.assertFalse(has12([3, 2]))
        self.assertTrue(has12([3, 1, 3, 2]))
        self.assertFalse(has12([3, 5, 9]))
        self.assertFalse(has12([3, 5, 1]))
        self.assertFalse(has12([3, 2, 1]))
        self.assertTrue(has12([1, 2]))

class TestModThree(unittest.TestCase):
    def test_modThree(self):
        self.assertTrue(modThree([2, 1, 3, 5]))
        self.assertFalse(modThree([2, 1, 2, 5]))
        self.assertTrue(modThree([2, 4, 2, 5]))
        self.assertFalse(modThree([1, 2, 1, 2, 1]))
        self.assertTrue(modThree([9, 9, 9]))
        self.assertFalse(modThree([1, 2, 1]))
        self.assertFalse(modThree([1, 2]))
        self.assertFalse(modThree([1]))
        self.assertFalse(modThree([]))
        self.assertFalse(modThree([9, 7, 2, 9]))
        self.assertFalse(modThree([9, 7, 2, 9, 2, 2]))
        self.assertTrue(modThree([9, 7, 2, 9, 2, 2, 6]))

class TestPrefixAgain(unittest.TestCase):
    def test_prefixAgain(self):
        self.assertTrue(prefixAgain("abXYabc", 1))
        self.assertTrue(prefixAgain("abXYabc", 2))
        self.assertFalse(prefixAgain("abXYabc", 3))
        self.assertTrue(prefixAgain("xyzxyxyxy", 2))
        self.assertFalse(prefixAgain("xyzxyxyxy", 3))
        self.assertTrue(prefixAgain("Hi12345Hi6789Hi10", 1))
        self.assertTrue(prefixAgain("Hi12345Hi6789Hi10", 2))
        self.assertTrue(prefixAgain("Hi12345Hi6789Hi10", 3))
        self.assertFalse(prefixAgain("Hi12345Hi6789Hi10", 4))
        self.assertFalse(prefixAgain("a", 1))
        self.assertTrue(prefixAgain("aa", 1))
        self.assertFalse(prefixAgain("ab", 1))

class TestXyzMiddle(unittest.TestCase):
    def test_xyzMiddle(self):
        self.assertTrue(xyzMiddle("AAxyzBB"))
        self.assertTrue(xyzMiddle("AxyzBB"))
        self.assertFalse(xyzMiddle("AxyzBBB"))
        self.assertFalse(xyzMiddle("AxyzBBBB"))
        self.assertFalse(xyzMiddle("AAAxyzB"))
        self.assertTrue(xyzMiddle("AAAxyzBB"))
        self.assertFalse(xyzMiddle("AAAAxyzBB"))
        self.assertFalse(xyzMiddle("AAAAAxyzBBB"))
        self.assertTrue(xyzMiddle("1x345xyz12x4"))
        self.assertTrue(xyzMiddle("xyzAxyzBBB"))
        self.assertTrue(xyzMiddle("xyzAxyzBxyz"))
        self.assertTrue(xyzMiddle("xyzxyzAxyzBxyzxyz"))
        self.assertTrue(xyzMiddle("xyzxyzxyzBxyzxyz"))
        self.assertTrue(xyzMiddle("xyzxyzAxyzxyzxyz"))
        self.assertFalse(xyzMiddle("xyzxyzAxyzxyzxy"))
        self.assertFalse(xyzMiddle("AxyzxyzBB"))
        self.assertFalse(xyzMiddle(""))
        self.assertFalse(xyzMiddle("x"))
        self.assertFalse(xyzMiddle("xy"))
        self.assertTrue(xyzMiddle("xyz"))
        self.assertTrue(xyzMiddle("xyzz"))

class TestCloseFar(unittest.TestCase):
    def test_closeFar(self):
        self.assertTrue(closeFar(1, 2, 10))
        self.assertFalse(closeFar(1, 2, 3))
        self.assertTrue(closeFar(4, 1, 3))
        self.assertFalse(closeFar(4, 5, 3))
        self.assertFalse(closeFar(4, 3, 5))
        self.assertTrue(closeFar(-1, 10, 0))
        self.assertTrue(closeFar(0, -1, 10))
        self.assertTrue(closeFar(10, 10, 8))
        self.assertFalse(closeFar(10, 8, 9))
        self.assertFalse(closeFar(8, 9, 10))
        self.assertFalse(closeFar(8, 9, 7))
        self.assertTrue(closeFar(8, 6, 9))

class TestCountHi2(unittest.TestCase):
    def test_countHi2(self):
        self.assertEqual(countHi2("ahixhi"), 1)  # countHi2("ahixhi") -> 1
        self.assertEqual(countHi2("ahibhi"), 2)  # countHi2("ahibhi") -> 2
        self.assertEqual(countHi2("xhixhi"), 0)  # countHi2("xhixhi") -> 0
        self.assertEqual(countHi2("hixhi"), 1)  # countHi2("hixhi") -> 1
        self.assertEqual(countHi2("hixhhi"), 2)  # countHi2("hixhhi") -> 2
        self.assertEqual(countHi2("hihihi"), 3)  # countHi2("hihihi") -> 3
        self.assertEqual(countHi2("hihihix"), 3)  # countHi2("hihihix") -> 3
        self.assertEqual(countHi2("xhihihix"), 2)  # countHi2("xhihihix") -> 2
        self.assertEqual(countHi2("xxhi"), 0)  # countHi2("xxhi") -> 0
        self.assertEqual(countHi2("hixxhi"), 1)  # countHi2("hixxhi") -> 1
        self.assertEqual(countHi2("hi"), 1)  # countHi2("hi") -> 1
        self.assertEqual(countHi2("xxxx"), 0)  # countHi2("xxxx") -> 0
        self.assertEqual(countHi2("h"), 0)  # countHi2("h") -> 0
        self.assertEqual(countHi2("x"), 0)  # countHi2("x") -> 0
        self.assertEqual(countHi2(""), 0)  # countHi2("") -> 0
        self.assertEqual(countHi2("Hellohi"), 1)  # countHi2("Hellohi") -> 1

class TestParenBit(unittest.TestCase):
    def test_parenBit(self):
        self.assertEqual(parenBit("xyz(abc)123"), "(abc)")  # parenBit("xyz(abc)123") -> "(abc)"
        self.assertEqual(parenBit("x(hello)"), "(hello)")  # parenBit("x(hello)") -> "(hello)"
        self.assertEqual(parenBit("(xy)1"), "(xy)")  # parenBit("(xy)1") -> "(xy)"
        self.assertEqual(parenBit("not really (possible)"), "(possible)")  # parenBit("not really (possible)") -> "(possible)"
        self.assertEqual(parenBit("(abc)"), "(abc)")  # parenBit("(abc)") -> "(abc)"
        self.assertEqual(parenBit("(abc)xyz"), "(abc)")  # parenBit("(abc)xyz") -> "(abc)"
        self.assertEqual(parenBit("(abc)x"), "(abc)")  # parenBit("(abc)x") -> "(abc)"
        self.assertEqual(parenBit("(x)"), "(x)")  # parenBit("(x)") -> "(x)"
        self.assertEqual(parenBit("()"), "()")  # parenBit("()") -> "()"
        self.assertEqual(parenBit("res (ipsa) loquitor"), "(ipsa)")  # parenBit("res (ipsa) loquitor") -> "(ipsa)"
        self.assertEqual(parenBit("hello(not really)there"), "(not really)")  # parenBit("hello(not really)there") -> "(not really)"
        self.assertEqual(parenBit("ab(ab)ab"), "(ab)")  # parenBit("ab(ab)ab") -> "(ab)"

class TestNestParen(unittest.TestCase):
    def test_nestParen(self):
        self.assertTrue(nestParen("(())"))  # nestParen("(())") -> True
        self.assertTrue(nestParen("((()))"))  # nestParen("((()))") -> True
        self.assertFalse(nestParen("(((x))"))  # nestParen("(((x))") -> False
        self.assertFalse(nestParen("((())"))  # nestParen("((())") -> False
        self.assertTrue(nestParen("()"))  # nestParen("()") -> True
        self.assertTrue(nestParen(""))  # nestParen("") -> True
        self.assertFalse(nestParen("(yy)"))  # nestParen("(yy)") -> False
        self.assertTrue(nestParen("(())"))  # nestParen("(())") -> True
        self.assertFalse(nestParen("(((y))"))  # nestParen("(((y))") -> False
        self.assertFalse(nestParen("((y)))"))  # nestParen("((y)))") -> False
        self.assertTrue(nestParen("((()))"))  # nestParen("((()))") -> True
        self.assertFalse(nestParen("(())))"))  # nestParen("(())))") -> False
        self.assertFalse(nestParen("((yy())))"))  # nestParen("((yy())))") -> False
        self.assertTrue(nestParen("(((())))"))  # nestParen("(((())))") -> True

class TestStrCount(unittest.TestCase):
    def test_strCount(self):
        self.assertEqual(strCount("catcowcat", "cat"), 2)  # strCount("catcowcat", "cat") -> 2
        self.assertEqual(strCount("catcowcat", "cow"), 1)  # strCount("catcowcat", "cow") -> 1
        self.assertEqual(strCount("catcowcat", "dog"), 0)  # strCount("catcowcat", "dog") -> 0
        self.assertEqual(strCount("cacatcowcat", "cat"), 2)  # strCount("cacatcowcat", "cat") -> 2
        self.assertEqual(strCount("xyx", "x"), 2)  # strCount("xyx", "x") -> 2
        self.assertEqual(strCount("iiiijj", "i"), 4)  # strCount("iiiijj", "i") -> 4
        self.assertEqual(strCount("iiiijj", "ii"), 2)  # strCount("iiiijj", "ii") -> 2
        self.assertEqual(strCount("iiiijj", "iii"), 1)  # strCount("iiiijj", "iii") -> 1
        self.assertEqual(strCount("iiiijj", "j"), 2)  # strCount("iiiijj", "j") -> 2
        self.assertEqual(strCount("iiiijj", "jj"), 1)  # strCount("iiiijj", "jj") -> 1
        self.assertEqual(strCount("aaabababab", "ab"), 4)  # strCount("aaabababab", "ab") -> 4
        self.assertEqual(strCount("aaabababab", "aa"), 1)  # strCount("aaabababab", "aa") -> 1
        self.assertEqual(strCount("aaabababab", "a"), 6)  # strCount("aaabababab", "a") -> 6
        self.assertEqual(strCount("aaabababab", "b"), 4)  # strCount("aaabababab", "b") -> 4

# -----------------------------------------------------------------
# Main execution block
# -----------------------------------------------------------------

if __name__ == "__main__":
    """
    This conditional block checks if the script is being run directly.
    If it is, it calls `unittest.main()`.
    
    `unittest.main()` discovers all test cases (TestSumDigits,
    TestLinearIn, TestEither24, TestMatchUp, TestHas77, TestHas12,
    TestModThree, TestPrefixAgain, TestXyzMiddle, TestCloseFar,
    TestCountHi2, TestParenBit, TestNestParen, and TestStrCount)
    and runs them.
    
    `verbosity=2` is added to provide a more detailed output,
    showing the result of each test method individually, which
    satisfies the requirement for clear results for each function.
    """
    unittest.main(verbosity=2)
