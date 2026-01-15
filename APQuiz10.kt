/**
 * APQuiz10 contains various coding quiz problems for practice.
 * 
 * This class includes methods for:
 * 1. evenlySpaced: Check if three integers are evenly spaced.
 * 2. makeChocolate: Calculate small bars needed to make goal kilos using big and small bars.
 * 3. sumNumbers: Sum all numbers (sequences of digits) appearing in a string.
 * 4. maxMirror: Find the length of the largest mirror section in a list.
 * 5. starOut: Remove stars and adjacent characters from a string.
 * 6. notReplace: Replace standalone "is" with "is not" using regex.
 * 7. countClumps: Count the number of clumps (2+ adjacent equal values) in a list.
 * 8. evenOdd: Rearrange a list so evens come before odds.
 * 9. fizzBuzz: Generate FizzBuzz sequence as strings.
 * 10. longestConsecutive: Find length of longest consecutive integer sequence in O(n) time.
 * 11. splitOdd10: Recursively determine if array can be split into two groups where one sum is multiple of 10 and other is odd.
 * 12. split53: Recursively determine if array can be split into two equal-sum groups with constraints on multiples of 5 and 3.
 * 13. power: Compute base raised to power using exponentiation by squaring (O(log n)).
 * 14. fibonacci: Compute the nth Fibonacci number using recursion.
 * 15. climbStairs: Find number of distinct ways to climb n stairs (1 or 2 steps at a time).
 * 16. quickSort: Sort a list using the quick sort algorithm (divide-and-conquer).
 * 17. mergeSort: Sort a list using the merge sort algorithm (divide-and-conquer with merging).
 * 18. merge: Helper function for merge sort to combine two sorted lists.
 */
class APQuiz10 {
    companion object {
        /**
         * <h3>Q1</h3>
         * <p>
         * Description:
         *     Given three ints, one of them is small, one is medium, and one is large.
         *     Return true if the three values are evenly spaced, so the difference
         *     between small and medium is the same as the difference between medium and large.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>evenlySpaced(2, 4, 6) -> true</li>
         *   <li>evenlySpaced(4, 6, 2) -> true</li>
         *   <li>evenlySpaced(4, 6, 3) -> false</li>
         * </ul>
         * </p>
         *
         * @param a First integer
         * @param b Second integer
         * @param c Third integer
         * @return true if the numbers are evenly spaced, false otherwise
         */
        @JvmStatic
        fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q2</h3>
         * <p>
         * Description:
         *     We want to make a package of `goal` kilos of chocolate. We have small bars
         *     (1 kilo each) and big bars (5 kilos each). Return the number of small bars
         *     to use, assuming we always use big bars before small bars. Return -1 if it
         *     can't be done.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>makeChocolate(4, 1, 9) -> 4</li>
         *   <li>makeChocolate(4, 1, 10) -> -1</li>
         *   <li>makeChocolate(4, 1, 7) -> 2</li>
         * </ul>
         * </p>
         *
         * @param small Number of small 1-kg bars available
         * @param big Number of big 5-kg bars available
         * @param goal Target weight in kilos
         * @return The number of small bars to use, or -1 if the goal cannot be met
         */
        @JvmStatic
        fun makeChocolate(small: Int, big: Int, goal: Int): Int {
            // TODO: Implement your solution here
            return -1
        }

        /**
         * <h3>Q3</h3>
         * <p>
         * Description:
         *     Given a string, return the sum of the numbers appearing in the string,
         *     ignoring all other characters. A number is a series of one or more digit
         *     characters in a row.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>sumNumbers("abc123xyz") -> 123</li>
         *   <li>sumNumbers("aa11b33") -> 44</li>
         *   <li>sumNumbers("7 11") -> 18</li>
         * </ul>
         * </p>
         *
         * @param s The input string containing digits and other characters
         * @return The sum of all numbers found in the string
         */
        @JvmStatic
        fun sumNumbers(s: String): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q4</h3>
         * <p>
         * Description:
         *     We'll say that a "mirror" section in an array is a group of contiguous elements
         *     such that somewhere in the array, the same group appears in reverse order.
         *     Return the size of the largest mirror section found in the given array.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) -> 3</li>
         *   <li>maxMirror([1, 2, 1, 4]) -> 3</li>
         *   <li>maxMirror([7, 1, 2, 9, 7, 2, 1]) -> 2</li>
         * </ul>
         * </p>
         *
         * @param nums The list of integers to examine
         * @return The length of the largest mirror section
         */
        @JvmStatic
        fun maxMirror(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q5</h3>
         * <p>
         * Description:
         *     Return a version of the given string where for every star (*) in the string,
         *     the star and the characters immediately to its left and right are removed.
         *     So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>starOut("ab*cd") -> "ad"</li>
         *   <li>starOut("ab**cd") -> "ad"</li>
         *   <li>starOut("sm*eilly") -> "silly"</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return The processed string with stars and adjacent chars removed
         */
        @JvmStatic
        fun starOut(s: String): String {
            // TODO: Implement your solution here
            return ""
        }

        /**
         * <h3>Q6</h3>
         * <p>
         * Description:
         *     Given a string, return a new string where every appearance of the lowercase word "is"
         *     has been replaced with "is not". The word "is" should not be immediately preceded or
         *     followed by a letter — so for example the "is" in "this" does not count.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>notReplace("is test") -> "is not test"</li>
         *   <li>notReplace("is-is") -> "is not-is not"</li>
         *   <li>notReplace("This is right") -> "This is not right"</li>
         *   <li>notReplace("This is isabell") -> "This is not isabell"</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return The modified string with standalone "is" replaced by "is not"
         */
        @JvmStatic
        fun notReplace(s: String): String {
            // TODO: Implement your solution here
            return ""
        }

        /**
         * <h3>Q7</h3>
         * <p>
         * Description:
         *     Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
         *     Return the number of clumps in the given array.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>countClumps([1, 2, 2, 3, 4, 4]) -> 2</li>
         *   <li>countClumps([1, 1, 2, 1, 1]) -> 2</li>
         *   <li>countClumps([1, 1, 1, 1, 1]) -> 1</li>
         * </ul>
         * </p>
         *
         * @param nums The input list of integers
         * @return The number of clumps in the list
         */
        @JvmStatic
        fun countClumps(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q8</h3>
         * <p>
         * Description:
         *     Return a list containing the same numbers as the given list `nums`, 
         *     but rearranged so that all even numbers come before all odd numbers.
         *     The relative order among evens or among odds does not matter.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>evenOdd([1, 0, 1, 0, 0, 1, 1]) -> [0, 0, 0, 1, 1, 1, 1]</li>
         *   <li>evenOdd([3, 3, 2]) -> [2, 3, 3]</li>
         *   <li>evenOdd([2, 2, 2]) -> [2, 2, 2]</li>
         * </ul>
         * </p>
         *
         * @param nums The input list of integers
         * @return A list with evens first followed by odds
         */
        @JvmStatic
        fun evenOdd(nums: IntArray): IntArray {
            // TODO: Implement your solution here
            return intArrayOf()
        }

        /**
         * <h3>Q9</h3>
         * <p>
         * Description:
         *     Generate the FizzBuzz sequence as strings for numbers from `start` up to but not including `end`.
         *     - For multiples of 3, use "Fizz".
         *     - For multiples of 5, use "Buzz".
         *     - For multiples of both 3 and 5, use "FizzBuzz".
         *     - Otherwise, use the number itself.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>fizzBuzz(1, 6) -> ["1", "2", "Fizz", "4", "Buzz"]</li>
         *   <li>fizzBuzz(1, 8) -> ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]</li>
         *   <li>fizzBuzz(1, 11) -> ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]</li>
         * </ul>
         * </p>
         *
         * @param start The starting integer (inclusive)
         * @param end The ending integer (exclusive)
         * @return The FizzBuzz sequence as a list of strings
         */
        @JvmStatic
        fun fizzBuzz(start: Int, end: Int): Array<String> {
            // TODO: Implement your solution here
            return emptyArray<String>()
        }

        /**
         * <h3>Q10</h3>
         * <p>
         * Description:
         *     Find the length of the longest run of consecutive integers in an unsorted list,
         *     in O(n) time by leveraging a set for uniqueness and constant-time membership tests.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>longestConsecutive([100, 4, 200, 1, 3, 2]) -> 4   # sequence is [1,2,3,4]</li>
         *   <li>longestConsecutive([0, -1, 1, 2, -2, 5]) -> 5   # sequence is [-2,-1,0,1,2]</li>
         * </ul>
         * </p>
         *
         * @param nums Unsorted list of integers
         * @return Length of the longest run of consecutive integers
         */
        @JvmStatic
        fun longestConsecutive(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q11</h3>
         * <p>
         * Description:
         *     Given an array of ints, determine recursively if it is 
         *     possible to divide the ints into two groups,
         *     such that the sum of one group is a multiple of 10 and 
         *     the sum of the other group is odd.
         *     Every int must be in one group or the other. This is 
         *     solved by recursively assigning each number
         *     to one of two groups and then checking if one group's 
         *     sum is divisible by 10 and the other's sum is odd.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>splitOdd10([5,5,5]) -> true</li>
         *   <li>splitOdd10([5,5,6]) -> false</li>
         *   <li>splitOdd10([5,5,6,1]) -> true</li>
         * </ul>
         * </p>
         *
         * @param nums The input list of integers
         * @return true if it is possible to split the array into two groups meeting the conditions, false otherwise
         */
        @JvmStatic
        fun splitOdd10(nums: IntArray): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q12</h3>
         * <p>
         * Description:
         *     Given an array of ints, determine recursively if it is 
         *     possible to divide the ints into 
         *     two groups such that the sum of the two groups is the same, 
         *     with these constraints:
         *       - All multiples of 5 must be in one group.
         *       - All multiples of 3 (that are not multiples of 5) must 
         *       be in the other group.
         *     Every int must be in one group or the other.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>split53([1, 1]) -> true</li>
         *   <li>split53([1, 1, 1]) -> false</li>
         *   <li>split53([2, 4, 2]) -> true</li>
         * </ul>
         * </p>
         *
         * @param nums The input list of integers
         * @return true if the array can be split according to the conditions, otherwise false
         */
        @JvmStatic
        fun split53(nums: IntArray): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q13</h3>
         * <p>
         * Description:
         *     Compute base raised to the power of exp using the exponentiation by squaring algorithm.
         *     This is an efficient recursive method that reduces the number of multiplications from O(n)
         *     (naive approach) to O(log n) by repeatedly squaring the base and halving the exponent.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>power(2, 0) -> 1       # Any number to the power of 0 is 1</li>
         *   <li>power(2, 1) -> 2       # Base case: return base</li>
         *   <li>power(2, 4) -> 16      # 2^4 = 16</li>
         *   <li>power(3, 5) -> 243    # 3^5 = 243</li>
         *   <li>power(5, 3) -> 125    # 5^3 = 125</li>
         * </ul>
         * </p>
         *
         * @param base The base number to be raised to a power
         * @param exp The exponent (non-negative integer)
         * @return The result of base raised to the power of exp
         */
        @JvmStatic
        fun power(base: Int, exp: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q14</h3>
         * <p>
         * Description:
         *     Compute the nth Fibonacci number using recursion. The Fibonacci sequence
         *     is defined as: F(0) = 0, F(1) = 1, and F(n) = F(n-1) + F(n-2) for n > 1.
         *     Each number is the sum of the two preceding ones.
         *     
         *     Note: This recursive implementation has exponential time complexity O(2^n).
         *     For production code, use memoization or iteration for better performance.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>fibonacci(0) -> 0</li>
         *   <li>fibonacci(1) -> 1</li>
         *   <li>fibonacci(2) -> 1</li>
         *   <li>fibonacci(5) -> 5</li>
         *   <li>fibonacci(10) -> 55</li>
         * </ul>
         * </p>
         *
         * @param n A non-negative integer representing the position in the Fibonacci sequence
         * @return The nth Fibonacci number
         */
        @JvmStatic
        fun fibonacci(n: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q15</h3>
         * <p>
         * Description:
         *     Find the number of distinct ways to climb a staircase with n steps,
         *     where you can take either 1 step or 2 steps at a time.
         *     
         *     This problem is similar to the Fibonacci sequence because:
         *     - To reach step n, you can come from step (n-1) or step (n-2)
         *     - Number of ways to reach n = ways to reach (n-1) + ways to reach (n-2)
         *     - Base cases: 1 way to reach step 1, 2 ways to reach step 2
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>climbStairs(1) -> 1   # [1]</li>
         *   <li>climbStairs(2) -> 2   # [1,1] or [2]</li>
         *   <li>climbStairs(3) -> 3   # [1,1,1], [1,2], or [2,1]</li>
         *   <li>climbStairs(4) -> 5   # [1,1,1,1], [1,1,2], [1,2,1], [2,1,1], [2,2]</li>
         *   <li>climbStairs(5) -> 8   # Similar pattern</li>
         * </ul>
         * </p>
         *
         * @param n The number of steps in the staircase (n >= 1)
         * @return The number of distinct ways to climb the staircase
         */
        @JvmStatic
        fun climbStairs(n: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q16</h3>
         * <p>
         * Description:
         *     Sort a list of integers using the Quick Sort algorithm.
         *     Quick Sort is a divide-and-conquer algorithm that works by:
         *     1. Selecting a pivot element
         *     2. Partitioning the array into three parts:
         *        - Elements less than the pivot
         *        - Elements equal to the pivot
         *        - Elements greater than the pivot
         *     3. Recursively sorting the left and right parts
         *     4. Combining: left + middle + right
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>quickSort([3, 6, 8, 10, 1, 2, 1]) -> [1, 1, 2, 3, 6, 8, 10]</li>
         *   <li>quickSort([38, 27, 43, 3, 9, 82, 10]) -> [3, 9, 10, 27, 38, 43, 82]</li>
         *   <li>quickSort([5, 2, 8, 1, 9]) -> [1, 2, 5, 8, 9]</li>
         * </ul>
         * </p>
         *
         * @param arr The list of integers to sort
         * @return A new sorted list containing all elements from arr
         */
        @JvmStatic
        fun quickSort(arr: IntArray): IntArray {
            // TODO: Implement your solution here
            return intArrayOf()
        }

        /**
         * <h3>Q17</h3>
         * <p>
         * Description:
         *     Sort a list of integers using the Merge Sort algorithm.
         *     Merge Sort is a divide-and-conquer algorithm that works by:
         *     1. Dividing the array into two halves
         *     2. Recursively sorting each half
         *     3. Merging the two sorted halves into a single sorted array
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>mergeSort([38, 27, 43, 3, 9, 82, 10]) -> [3, 9, 10, 27, 38, 43, 82]</li>
         *   <li>mergeSort([3, 6, 8, 10, 1, 2, 1]) -> [1, 1, 2, 3, 6, 8, 10]</li>
         *   <li>mergeSort([5, 2, 8, 1, 9]) -> [1, 2, 5, 8, 9]</li>
         * </ul>
         * </p>
         *
         * @param arr The list of integers to sort
         * @return A new sorted list containing all elements from arr
         */
        @JvmStatic
        fun mergeSort(arr: IntArray): IntArray {
            // TODO: Implement your solution here
            return intArrayOf()
        }

        /**
         * <h3>Q18</h3>
         * <p>
         * Description:
         *     Merge two sorted lists into a single sorted list.
         *     This is a helper function used by mergeSort to combine two
         *     sorted halves of an array.
         *     
         *     Algorithm:
         *     1. Compare the first elements of both lists
         *     2. Append the smaller element to the result
         *     3. Remove it from its list
         *     4. Repeat until one list is empty
         *     5. Append remaining elements from the non-empty list
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>merge([1, 3, 5], [2, 4, 6]) -> [1, 2, 3, 4, 5, 6]</li>
         *   <li>merge([2, 4], [1, 3, 5]) -> [1, 2, 3, 4, 5]</li>
         *   <li>merge([1, 2, 3], []) -> [1, 2, 3]</li>
         *   <li>merge([], [4, 5, 6]) -> [4, 5, 6]</li>
         * </ul>
         * </p>
         *
         * @param left A sorted list of integers
         * @param right A sorted list of integers
         * @return A new sorted list containing all elements from both lists
         */
        @JvmStatic
        fun merge(left: IntArray, right: IntArray): IntArray {
            // TODO: Implement your solution here
            return intArrayOf()
        }
    }
}
