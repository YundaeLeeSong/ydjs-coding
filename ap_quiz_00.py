#!/usr/bin/env python3
# -*- coding: utf-8 -*-

# https://the-winter.github.io/codingjs/

"""
Instructions to run the tests via the CLI:
    1. Open your terminal or command prompt.
    2. Run the tests by executing: `python _coding-pop_algo/ap_quiz_package00.py`

This is a list of quiz questions for practice, including:
1.  sleepIn: Determine if we sleep in based on weekday and vacation status.
2.  frontBack: Return a new string where the first and last chars have been exchanged.
3.  mixStart: Return true if the given string begins with pattern like 'mix' (any char + 'ix').
4.  monkeyTrouble: Return true if both monkeys are smiling or neither is smiling.
5.  front3: Return a new string which is 3 copies of the first 3 chars (or less if shorter).
6.  startOz: Return a string made of the first 2 chars where first is included only if 'o' and second only if 'z'.
7.  sumDouble: Return the sum of two ints, but double it if the two values are the same.
8.  backAround: Return a new string with the last char added at the front and back.
9.  intMax: Return the largest of three int values.
10. diff21: Return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
"""
# Import the unittest module, needed for creating test cases.
# We only need to import it once at the top of the file.
import unittest

# Import List from the typing module for type hinting (e.g., List[str])
# This is preferred for compatibility with Python versions < 3.10
from typing import List




# -----------------------------------------------------------------
# Question 1: sleepIn
# -----------------------------------------------------------------
def sleepIn(weekday: bool, vacation: bool) -> bool:
    """
    Description:
        The parameter weekday is True if it is a weekday, and the parameter 
        vacation is True if we are on vacation. We sleep in if it is not a 
        weekday or we're on vacation. Return True if we sleep in.

    Examples:
        sleepIn(True, True) -> True
        sleepIn(True, False) -> False
        sleepIn(False, True) -> True

    Args:
        weekday (bool): True if it is a weekday, False otherwise.
        vacation (bool): True if we are on vacation, False otherwise.

    Returns:
        bool: True if we sleep in (not a weekday or on vacation), False otherwise.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 2: frontBack
# -----------------------------------------------------------------
def frontBack(s: str) -> str:
    """
    Description:
        Given a string, return a new string where the first and last chars 
        have been exchanged.

    Examples:
        frontBack('code') -> 'eodc'
        frontBack('a') -> 'a'
        frontBack('ab') -> 'ba'

    Args:
        s (str): A string of any length.

    Returns:
        str: A new string with the first and last characters exchanged.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 3: mixStart
# -----------------------------------------------------------------
def mixStart(s: str) -> bool:
    """
    Description:
        Return True if the given string begins with 'mix', except the 'm' can 
        be anything, so 'pix', '9ix' .. all count. The string must have at 
        least 3 characters and match the pattern: any character + 'ix'.

    Examples:
        mixStart('mix snacks') -> True
        mixStart('pix snacks') -> True
        mixStart('piz snacks') -> False

    Args:
        s (str): A string to check.

    Returns:
        bool: True if the string begins with pattern (any char + 'ix'), False otherwise.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 4: monkeyTrouble
# -----------------------------------------------------------------
def monkeyTrouble(aSmile: bool, bSmile: bool) -> bool:
    """
    Description:
        We have two monkeys, a and b, and the parameters aSmile and bSmile 
        indicate if each is smiling. We are in trouble if they are both smiling 
        or if neither of them is smiling. Return True if we are in trouble.

    Examples:
        monkeyTrouble(True, True) -> True
        monkeyTrouble(False, False) -> True
        monkeyTrouble(True, False) -> False

    Args:
        aSmile (bool): True if monkey a is smiling, False otherwise.
        bSmile (bool): True if monkey b is smiling, False otherwise.

    Returns:
        bool: True if we are in trouble (both smiling or neither smiling), False otherwise.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return False


# -----------------------------------------------------------------
# Question 5: front3
# -----------------------------------------------------------------
def front3(s: str) -> str:
    """
    Description:
        Given a string, we'll say that the front is the first 3 chars of the string. 
        If the string length is less than 3, the front is whatever is there. 
        Return a new string which is 3 copies of the front.

    Examples:
        front3('Chocolate') -> 'ChoChoCho'
        front3('a') -> 'aaa'
        front3('') -> ''

    Args:
        s (str): A string of any length.

    Returns:
        str: A new string which is 3 copies of the front (first 3 chars, or less if string is shorter).
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 6: startOz
# -----------------------------------------------------------------
def startOz(s: str) -> str:
    """
    Description:
        Given a string, return a string made of the first 2 chars (if present), 
        however include first char only if it is 'o' and include the second only 
        if it is 'z', so 'ozymandias' yields 'oz'.

    Examples:
        startOz('ozymandias') -> 'oz'
        startOz('bzoo') -> 'z'
        startOz('oxx') -> 'o'

    Args:
        s (str): A string of any length.

    Returns:
        str: A string made of 'o' (if first char is 'o') and/or 'z' (if second char is 'z').
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 7: sumDouble
# -----------------------------------------------------------------
def sumDouble(a: int, b: int) -> int:
    """
    Description:
        Given two int values, return their sum. Unless the two values are the same, 
        then return double their sum.

    Examples:
        sumDouble(1, 2) -> 3
        sumDouble(3, 2) -> 5
        sumDouble(-1, 0) -> -1

    Args:
        a (int): First integer value.
        b (int): Second integer value.

    Returns:
        int: The sum of a and b, or double the sum if a == b.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 8: backAround
# -----------------------------------------------------------------
def backAround(s: str) -> str:
    """
    Description:
        Given a string, take the last char and return a new string with the last char 
        added at the front and back, so 'cat' yields 'tcatt'. The original string 
        will be length 1 or more.

    Examples:
        backAround('cat') -> 'tcatt'
        backAround('Hello') -> 'oHelloo'
        backAround('a') -> 'aaa'

    Args:
        s (str): A string of length 1 or more.

    Returns:
        str: A new string with the last char added at the front and back.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return ""


# -----------------------------------------------------------------
# Question 9: intMax
# -----------------------------------------------------------------
def intMax(a: int, b: int, c: int) -> int:
    """
    Description:
        Given three int values, a b c, return the largest.

    Examples:
        intMax(1, 2, 3) -> 3
        intMax(3, 9, 3) -> 9
        intMax(-3, -1, -2) -> -1

    Args:
        a (int): First integer value.
        b (int): Second integer value.
        c (int): Third integer value.

    Returns:
        int: The largest of the three integers.
    """
    ### [Your Implementation Here]

    # Case-1. If the question can be solved with 'iteration (for/while)', 
    # design the most efficient algorithm.
    
    # Case-2. If the question can be solved with 'recursion', design a 
    # correct algorithm. Since the recursion can be inefficient, use 
    # either 'tabulation' or 'memorization' to break it down into 'iteration'.
    return 0


# -----------------------------------------------------------------
# Question 10: diff21
# -----------------------------------------------------------------
def diff21(n: int) -> int:
    """
    Description:
        Given an int n, return the absolute difference between n and 21, 
        except return double the absolute difference if n is over 21.

    Examples:
        diff21(19) -> 2
        diff21(10) -> 11
        diff21(21) -> 0
        diff21(22) -> 2
        diff21(25) -> 8

    Args:
        n (int): An integer value.

    Returns:
        int: The absolute difference between n and 21, or double the absolute difference if n > 21.
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
class TestSleepIn(unittest.TestCase):
    def test_sleepIn(self):
        self.assertTrue(sleepIn(True, True))       # -> True
        self.assertFalse(sleepIn(True, False))    # -> False
        self.assertTrue(sleepIn(False, True))     # -> True
        self.assertTrue(sleepIn(False, False))    # -> True

class TestFrontBack(unittest.TestCase):
    def test_frontBack(self):
        self.assertEqual(frontBack('code'), 'eodc')            # -> 'eodc'
        self.assertEqual(frontBack('a'), 'a')                  # -> 'a'
        self.assertEqual(frontBack('ab'), 'ba')                # -> 'ba'
        self.assertEqual(frontBack('abc'), 'cba')              # -> 'cba'
        self.assertEqual(frontBack(''), '')                     # -> ''
        self.assertEqual(frontBack('Chocolate'), 'ehocolatC')   # -> 'ehocolatC'
        self.assertEqual(frontBack('aavj'), 'java')            # -> 'java'
        self.assertEqual(frontBack('hello'), 'oellh')          # -> 'oellh'

class TestMixStart(unittest.TestCase):
    def test_mixStart(self):
        self.assertTrue(mixStart('mix snacks'))      # -> True
        self.assertTrue(mixStart('pix snacks'))       # -> True
        self.assertFalse(mixStart('piz snacks'))     # -> False
        self.assertTrue(mixStart('nix'))             # -> True
        self.assertFalse(mixStart('ni'))              # -> False
        self.assertFalse(mixStart('n'))               # -> False

class TestMonkeyTrouble(unittest.TestCase):
    def test_monkeyTrouble(self):
        self.assertTrue(monkeyTrouble(True, True))      # -> True
        self.assertTrue(monkeyTrouble(False, False))    # -> True
        self.assertFalse(monkeyTrouble(True, False))    # -> False
        self.assertFalse(monkeyTrouble(False, True))    # -> False

class TestFront3(unittest.TestCase):
    def test_front3(self):
        self.assertEqual(front3('Java'), 'JavJavJav')           # -> 'JavJavJav'
        self.assertEqual(front3('Chocolate'), 'ChoChoCho')      # -> 'ChoChoCho'
        self.assertEqual(front3('abc'), 'abcabcabc')            # -> 'abcabcabc'
        self.assertEqual(front3('abcXYZ'), 'abcabcabc')         # -> 'abcabcabc'
        self.assertEqual(front3('ab'), 'ababab')                 # -> 'ababab'
        self.assertEqual(front3('a'), 'aaa')                    # -> 'aaa'
        self.assertEqual(front3(''), '')                        # -> ''

class TestStartOz(unittest.TestCase):
    def test_startOz(self):
        self.assertEqual(startOz('ozymandias'), 'oz')           # -> 'oz'
        self.assertEqual(startOz('bzoo'), 'z')                 # -> 'z'
        self.assertEqual(startOz('oxx'), 'o')                  # -> 'o'
        self.assertEqual(startOz('ounce'), 'o')                 # -> 'o'
        self.assertEqual(startOz('o'), 'o')                    # -> 'o'
        self.assertEqual(startOz('abc'), '')                    # -> ''
        self.assertEqual(startOz(''), '')                      # -> ''
        self.assertEqual(startOz('zoo'), '')                   # -> ''
        self.assertEqual(startOz('aztec'), 'z')                # -> 'z'
        self.assertEqual(startOz('zzzz'), 'z')                 # -> 'z'
        self.assertEqual(startOz('oznic'), 'oz')               # -> 'oz'

class TestSumDouble(unittest.TestCase):
    def test_sumDouble(self):
        self.assertEqual(sumDouble(1, 2), 3)                    # -> 3
        self.assertEqual(sumDouble(3, 2), 5)                  # -> 5
        self.assertEqual(sumDouble(2, 2), 8)                  # -> 8
        self.assertEqual(sumDouble(-1, 0), -1)                 # -> -1
        self.assertEqual(sumDouble(3, 3), 12)                 # -> 12
        self.assertEqual(sumDouble(0, 0), 0)                  # -> 0
        self.assertEqual(sumDouble(0, 1), 1)                  # -> 1
        self.assertEqual(sumDouble(3, 4), 7)                  # -> 7

class TestBackAround(unittest.TestCase):
    def test_backAround(self):
        self.assertEqual(backAround('cat'), 'tcatt')            # -> 'tcatt'
        self.assertEqual(backAround('Hello'), 'oHelloo')        # -> 'oHelloo'
        self.assertEqual(backAround('a'), 'aaa')               # -> 'aaa'
        self.assertEqual(backAround('abc'), 'cabcc')           # -> 'cabcc'
        self.assertEqual(backAround('read'), 'dreadd')         # -> 'dreadd'
        self.assertEqual(backAround('boo'), 'obooo')           # -> 'obooo'

class TestIntMax(unittest.TestCase):
    def test_intMax(self):
        self.assertEqual(intMax(1, 2, 3), 3)                    # -> 3
        self.assertEqual(intMax(1, 3, 2), 3)                  # -> 3
        self.assertEqual(intMax(3, 2, 1), 3)                  # -> 3
        self.assertEqual(intMax(9, 3, 3), 9)                  # -> 9
        self.assertEqual(intMax(3, 9, 3), 9)                  # -> 9
        self.assertEqual(intMax(3, 3, 9), 9)                  # -> 9
        self.assertEqual(intMax(8, 2, 3), 8)                  # -> 8
        self.assertEqual(intMax(-3, -1, -2), -1)              # -> -1
        self.assertEqual(intMax(6, 2, 5), 6)                  # -> 6
        self.assertEqual(intMax(5, 6, 2), 6)                  # -> 6
        self.assertEqual(intMax(5, 2, 6), 6)                  # -> 6

class TestDiff21(unittest.TestCase):
    def test_diff21(self):
        self.assertEqual(diff21(19), 2)                         # -> 2
        self.assertEqual(diff21(10), 11)                       # -> 11
        self.assertEqual(diff21(21), 0)                        # -> 0
        self.assertEqual(diff21(22), 2)                        # -> 2
        self.assertEqual(diff21(25), 8)                        # -> 8
        self.assertEqual(diff21(30), 18)                       # -> 18
        self.assertEqual(diff21(0), 21)                        # -> 21
        self.assertEqual(diff21(1), 20)                        # -> 20
        self.assertEqual(diff21(2), 19)                        # -> 19
        self.assertEqual(diff21(-1), 22)                       # -> 22
        self.assertEqual(diff21(-2), 23)                       # -> 23
        self.assertEqual(diff21(50), 58)                       # -> 58


# -----------------------------------------------------------------
# Main execution block
# -----------------------------------------------------------------

if __name__ == "__main__":
    """
    This conditional block checks if the script is being run directly.
    If it is, it calls `unittest.main()`.
    
    `unittest.main()` discovers all test cases and runs them.
    
    `verbosity=2` is added to provide a more detailed output,
    showing the result of each test method individually, which
    satisfies the requirement for clear results for each function.
    """
    unittest.main(verbosity=2)
