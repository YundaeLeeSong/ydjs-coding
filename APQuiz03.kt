/**
 * APQuiz03 contains various coding quiz problems for practice.
 * 
 * This class includes methods for:
 * 1. commonTwo: Counts unique common strings in two sorted arrays.
 * 2. doubleChar: Duplicates each character in a string.
 * 3. countHi: Counts occurrences of "hi" in a string.
 * 4. countEvens: Counts even integers in a list.
 * 5. bigDiff: Finds the difference between the largest and smallest integers in a list.
 * 6. centeredAverage: Calculates the centered average of a list of integers.
 * 7. makeBricks: Determines if a goal length can be achieved with given bricks.
 * 8. countYZ: Counts words ending in 'y' or 'z' in a string.
 * 9. maxSpan: Finds the largest span of identical values in a list.
 * 10. catDog: Checks if "cat" and "dog" appear the same number of times in a string.
 * 11. powerN: Computes base to the power of n recursively using exponentiation by squaring.
 * 12. countX: Counts occurrences of lowercase 'x' in a string recursively.
 * 13. countHiRecursive: Counts occurrences of "hi" in a string recursively.
 * 14. changeXY: Replaces all lowercase 'x' with 'y' in a string recursively.
 */
class APQuiz03 {
    companion object {
        /**
         * <h3>Q1</h3>
         * <p>
         * Description:
         *     Start with two arrays of strings, `a` and `b`, each in 
         *     alphabetical order, possibly with duplicates.
         *     Return the count of the number of unique strings which 
         *     appear in both arrays. Use a single-pass
         *     linear solution taking advantage of the sorted order.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) -> 2</li>
         *   <li>commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) -> 3</li>
         *   <li>commonTwo(["a", "b", "c"], ["a", "b", "c"]) -> 3</li>
         * </ul>
         * </p>
         *
         * @param a First sorted list of strings, may contain duplicates
         * @param b Second sorted list of strings, may contain duplicates
         * @return The count of unique strings that appear in both `a` and `b`
         */
        @JvmStatic
        fun commonTwo(a: Array<String>, b: Array<String>): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q2</h3>
         * <p>
         * Description:
         *     Given a string, return a new string where for every character in the original,
         *     there are two characters in the result.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>doubleChar("The") -> "TThhee"</li>
         *   <li>doubleChar("AAbb") -> "AAAAbbbb"</li>
         *   <li>doubleChar("Hi-There") -> "HHii--TThheerree"</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return A string where each character from `s` is repeated twice
         */
        @JvmStatic
        fun doubleChar(s: String): String {
            // TODO: Implement your solution here
            return ""
        }

        /**
         * <h3>Q3</h3>
         * <p>
         * Description:
         *     Return the number of times the string "hi" appears anywhere in the given string.
         *     The match is case-sensitive, so only lowercase "hi" counts.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>countHi("abc hi ho") -> 1</li>
         *   <li>countHi("ABChi hi") -> 2</li>
         *   <li>countHi("hihi") -> 2</li>
         * </ul>
         * </p>
         *
         * @param s Input string to search within
         * @return Number of times "hi" appears
         */
        @JvmStatic
        fun countHi(s: String): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q4</h3>
         * <p>
         * Description:
         *     Return the number of even integers in the given array.
         *     An integer is even if it has no remainder when divided by 2 (i.e., num % 2 == 0).
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>countEvens([2, 1, 2, 3, 4]) -> 3</li>
         *   <li>countEvens([2, 2, 0]) -> 3</li>
         *   <li>countEvens([1, 3, 5]) -> 0</li>
         * </ul>
         * </p>
         *
         * @param nums A list of integers
         * @return Count of even integers in the list
         */
        @JvmStatic
        fun countEvens(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q5</h3>
         * <p>
         * Description:
         *     Given a list of integers with length 1 or more, return the difference
         *     between the largest and smallest values in the list.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>bigDiff([10, 3, 5, 6]) -> 7</li>
         *   <li>bigDiff([7, 2, 10, 9]) -> 8</li>
         *   <li>bigDiff([2, 10, 7, 2]) -> 8</li>
         * </ul>
         * </p>
         *
         * @param nums A list of one or more integers
         * @return The difference between the maximum and minimum values in the list
         */
        @JvmStatic
        fun bigDiff(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q6</h3>
         * <p>
         * Description:
         *     Return the "centered" average of a list of integers.
         *     The centered average is the mean of the values, excluding the smallest
         *     and largest values (ignoring only one copy of each).
         *     Use integer division for the result.
         *     The input list is guaranteed to have a length of 3 or more.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>centeredAverage([1, 2, 3, 4, 100]) -> 3</li>
         *   <li>centeredAverage([1, 1, 5, 5, 10, 8, 7]) -> 5</li>
         *   <li>centeredAverage([-10, -4, -2, -4, -2, 0]) -> -3</li>
         * </ul>
         * </p>
         *
         * @param nums A list of integers with length 3 or more
         * @return The centered average of the list using integer division
         */
        @JvmStatic
        fun centeredAverage(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q7</h3>
         * <p>
         * Description:
         *     Determine if it is possible to reach the desired goal 
         *     length using a combination
         *     of small bricks (1 inch each) and big bricks (5 inches each). 
         *     The function returns True if the goal can be reached 
         *     exactly, otherwise False.
         *     No loops are needed for this solution.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>makeBricks(3, 1, 8) -> true</li>
         *   <li>makeBricks(3, 1, 9) -> false</li>
         *   <li>makeBricks(3, 2, 10) -> true</li>
         * </ul>
         * </p>
         *
         * @param small Number of small bricks (1 inch each)
         * @param big Number of big bricks (5 inches each)
         * @param goal The target length to achieve
         * @return true if the goal can be reached using the available bricks, false otherwise
         */
        @JvmStatic
        fun makeBricks(small: Int, big: Int, goal: Int): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q8</h3>
         * <p>
         * Description:
         *     Given a string, count the number of words ending in 'y' or 'z'.
         *     The character must appear at the end of a word — that is, it must not be
         *     immediately followed by another alphabetic letter. The comparison is
         *     case-insensitive.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>countYZ("fez day") -> 2</li>
         *   <li>countYZ("day fez") -> 2</li>
         *   <li>countYZ("day fyyyz") -> 2</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return The number of words ending in 'y' or 'z'
         */
        @JvmStatic
        fun countYZ(s: String): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q9</h3>
         * <p>
         * Description:
         *     Consider the leftmost and rightmost appearances of some value in an array.
         *     We'll say that the "span" is the number of elements between the two, inclusive.
         *     A single occurrence of a value has a span of 1.
         *     Return the largest span found in the given array.
         *     Note: Efficiency is not a priority.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>maxSpan([1, 2, 1, 1, 3]) -> 4</li>
         *   <li>maxSpan([1, 4, 2, 1, 4, 1, 4]) -> 6</li>
         *   <li>maxSpan([1, 4, 2, 1, 4, 4, 4]) -> 6</li>
         * </ul>
         * </p>
         *
         * @param nums The input list of integers
         * @return The largest span found in the array
         */
        @JvmStatic
        fun maxSpan(nums: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q10</h3>
         * <p>
         * Description:
         *     Return True if the strings "cat" and "dog" appear the 
         *     same number of times in the given string.
         *     The comparison is case-sensitive and counts non-overlapping 
         *     occurrences.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>catDog("catdog") -> true</li>
         *   <li>catDog("catcat") -> false</li>
         *   <li>catDog("1cat1cadodog") -> true</li>
         * </ul>
         * </p>
         *
         * @param s The input string to examine
         * @return true if "cat" and "dog" occur the same number of times, false otherwise
         */
        @JvmStatic
        fun catDog(s: String): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q11</h3>
         * <p>
         * Description:
         *     Given base and n that are both 1 or more, compute recursively (no loops) the value 
         *     of base to the n power. For example, powerN(3, 2) is 9 (3 squared).
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>powerN(3, 1) -> 3</li>
         *   <li>powerN(3, 2) -> 9</li>
         *   <li>powerN(3, 3) -> 27</li>
         * </ul>
         * </p>
         *
         * @param base The base number (1 or more)
         * @param n The exponent (1 or more)
         * @return The result of raising base to the power n
         */
        @JvmStatic
        fun powerN(base: Int, n: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q12</h3>
         * <p>
         * Description:
         *     Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>countX("xxhixx") -> 4</li>
         *   <li>countX("xhixhix") -> 3</li>
         *   <li>countX("hi") -> 0</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return The count of 'x' characters in the string
         */
        @JvmStatic
        fun countX(s: String): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q13</h3>
         * <p>
         * Description:
         *     Given a string, compute recursively (no loops) the number of 
         *     times lowercase "hi" appears in the string.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>countHiRecursive("xxhixx") -> 1</li>
         *   <li>countHiRecursive("xhixhix") -> 2</li>
         *   <li>countHiRecursive("hi") -> 1</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return The count of "hi" occurrences in the string
         */
        @JvmStatic
        fun countHiRecursive(s: String): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q14</h3>
         * <p>
         * Description:
         *     Given a string, compute recursively (no loops) a new string where all 
         *     the lowercase 'x' chars have been changed to 'y' chars.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>changeXY("codex") -> "codey"</li>
         *   <li>changeXY("xxhixx") -> "yyhiyy"</li>
         *   <li>changeXY("xhixhix") -> "yhiyhiy"</li>
         * </ul>
         * </p>
         *
         * @param s The input string
         * @return The modified string with 'x' replaced by 'y'
         */
        @JvmStatic
        fun changeXY(s: String): String {
            // TODO: Implement your solution here
            return ""
        }
    }
}
