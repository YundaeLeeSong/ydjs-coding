/**
 * APQuiz01 contains various coding quiz problems for practice.
 * 
 * This class includes methods for:
 * 1. scoresIncreasing: Checks if scores are in non-decreasing order.
 * 2. scores100: Checks if there are consecutive 100's in the scores.
 * 3. scoresClump: Checks for 3 adjacent scores differing by at most 2.
 * 4. scoresAverage: Computes the average of the scores.
 * 5. wordsCount: Counts the number of strings of a given length.
 * 6. wordsFront: Returns the first 'n' strings from a list.
 * 7. wordsWithoutList: Returns a list with strings of a specific length removed.
 * 8. hasOne: Checks if a number contains the digit '1'.
 * 9. dividesSelf: Checks if a number divides itself.
 * 10. copyEvens: Returns the first 'count' even numbers from a list.
 * 11. factorial: Compute factorial recursively (n * (n-1) * ... * 1).
 * 12. bunnyEars: Count total ears for n bunnies (each has 2 ears), recursively.
 * 13. fibonacci: Compute nth Fibonacci number recursively (F(n) = F(n-1) + F(n-2)).
 * 14. bunnyEars2: Count ears where odd bunnies have 2 ears, even bunnies have 3 ears.
 */
class APQuiz01 {
    companion object {
        /**
         * <h3>Q1</h3>
         * <p>
         * Description:
         *     Given a list of scores (integers), return True if the scores are 
         *     in non-decreasing order — that is, each score is equal to or 
         *     greater than the one before.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>scoresIncreasing([1, 3, 4]) -> true</li>
         *   <li>scoresIncreasing([1, 3, 2]) -> false</li>
         *   <li>scoresIncreasing([1, 1, 4]) -> true</li>
         * </ul>
         * </p>
         *
         * @param scores A list of integers, length 2 or more
         * @return true if each score is equal or greater than the previous one, false otherwise
         */
        @JvmStatic
        fun scoresIncreasing(scores: IntArray): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q2</h3>
         * <p>
         * Description:
         *     Given an array of scores, return True if there are scores 
         *     of 100 next to each other
         *     in the array. The array length will be at least 2.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>scores100([1, 100, 100]) -> true</li>
         *   <li>scores100([1, 100, 99, 100]) -> false</li>
         *   <li>scores100([100, 1, 100, 100]) -> true</li>
         * </ul>
         * </p>
         *
         * @param scores A list of integer scores
         * @return true if there is at least one occurrence of consecutive 100's, false otherwise
         */
        @JvmStatic
        fun scores100(scores: IntArray): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q3</h3>
         * <p>
         * Description:
         *     Given an array of scores sorted in increasing order, 
         *     return True if the array contains 
         *     3 adjacent scores that differ from each other by at 
         *     most 2. In other words, if any 
         *     consecutive triplet of scores has a maximum difference 
         *     (between the highest and lowest) 
         *     of 2 or less, the function returns True.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>scoresClump([3, 4, 5]) -> true</li>
         *   <li>scoresClump([3, 4, 6]) -> false</li>
         *   <li>scoresClump([1, 3, 5, 5]) -> true</li>
         * </ul>
         * </p>
         *
         * @param scores A list of integer scores, sorted in increasing order
         * @return true if there exists a triplet of adjacent scores with a max difference of 2 or less, false otherwise
         */
        @JvmStatic
        fun scoresClump(scores: IntArray): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q4</h3>
         * <p>
         * Description:
         *     Given an array of scores, compute the integer average 
         *     of the first half and the second half,
         *     and return whichever is larger. The second half begins 
         *     at index len(scores)//2.
         *     You must use a helper function that computes the average 
         *     of the values between two indices.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>scoresAverage([2, 2, 4, 4]) -> 4</li>
         *   <li>scoresAverage([4, 4, 4, 2, 2, 2]) -> 4</li>
         *   <li>scoresAverage([3, 4, 5, 1, 2, 3]) -> 4</li>
         * </ul>
         * </p>
         *
         * @param scores A list of scores (at least 2 elements long)
         * @return The higher integer average between the first and second half of the list
         */
        @JvmStatic
        fun scoresAverage(scores: IntArray): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q5</h3>
         * <p>
         * Description:
         *     Given an array of strings, return the count of the 
         *     number of strings that have the given length.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>wordsCount(["a", "bb", "b", "ccc"], 1) -> 2</li>
         *   <li>wordsCount(["a", "bb", "b", "ccc"], 3) -> 1</li>
         *   <li>wordsCount(["a", "bb", "b", "ccc"], 4) -> 0</li>
         * </ul>
         * </p>
         *
         * @param words A list of words (strings)
         * @param length The length of the strings to count
         * @return The number of strings that have the given length
         */
        @JvmStatic
        fun wordsCount(words: Array<String>, length: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q6</h3>
         * <p>
         * Description:
         *     Given an array of strings, return a new array containing the first N strings.
         *     N will be in the range 1..length of the input array.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>wordsFront(["a", "b", "c", "d"], 1) -> ["a"]</li>
         *   <li>wordsFront(["a", "b", "c", "d"], 2) -> ["a", "b"]</li>
         *   <li>wordsFront(["a", "b", "c", "d"], 3) -> ["a", "b", "c"]</li>
         * </ul>
         * </p>
         *
         * @param words A list of strings
         * @param n The number of strings to return from the start of the list
         * @return A list containing the first N strings from the input array
         */
        @JvmStatic
        fun wordsFront(words: Array<String>, n: Int): Array<String> {
            // TODO: Implement your solution here
            return emptyArray()
        }

        /**
         * <h3>Q7</h3>
         * <p>
         * Description:
         *     Given an array of strings, return a new list where all the 
         *     strings of the given length are omitted.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>wordsWithoutList(["a", "bb", "b", "ccc"], 1) -> ["bb", "ccc"]</li>
         *   <li>wordsWithoutList(["a", "bb", "b", "ccc"], 3) -> ["a", "bb", "b"]</li>
         *   <li>wordsWithoutList(["a", "bb", "b", "ccc"], 4) -> ["a", "bb", "b", "ccc"]</li>
         * </ul>
         * </p>
         *
         * @param words A list of strings
         * @param length The length of the strings to omit from the list
         * @return A new list with all strings of the given length omitted
         */
        @JvmStatic
        fun wordsWithoutList(words: Array<String>, length: Int): Array<String> {
            // TODO: Implement your solution here
            return emptyArray()
        }

        /**
         * <h3>Q8</h3>
         * <p>
         * Description:
         *     Given a positive integer n, return true if it contains a digit '1'. 
         *     Note: Use % to get the rightmost digit, and / to discard the rightmost digit.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>hasOne(10) -> true</li>
         *   <li>hasOne(22) -> false</li>
         *   <li>hasOne(220) -> false</li>
         * </ul>
         * </p>
         *
         * @param n A positive integer
         * @return true if the number contains at least one digit '1', false otherwise
         */
        @JvmStatic
        fun hasOne(n: Int): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q9</h3>
         * <p>
         * Description:
         *     A positive integer divides itself if every digit in the number 
         *     divides into the number evenly.
         *     For example, 128 divides itself since 1, 2, and 8 all divide 
         *     into 128 evenly.
         *     A number with a 0 digit does not divide itself, as 0 does not 
         *     divide into any number.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>dividesSelf(128) -> true</li>
         *   <li>dividesSelf(12) -> true</li>
         *   <li>dividesSelf(120) -> false</li>
         * </ul>
         * </p>
         *
         * @param n A positive integer
         * @return true if the number divides itself, false otherwise
         */
        @JvmStatic
        fun dividesSelf(n: Int): Boolean {
            // TODO: Implement your solution here
            return false
        }

        /**
         * <h3>Q10</h3>
         * <p>
         * Description:
         *     Given an array of positive integers, return a new list containing 
         *     the first `count` even numbers from the original array.
         *     The original array will contain at least `count` even numbers.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>copyEvens([3, 2, 4, 5, 8], 2) -> [2, 4]</li>
         *   <li>copyEvens([3, 2, 4, 5, 8], 3) -> [2, 4, 8]</li>
         *   <li>copyEvens([6, 1, 2, 4, 5, 8], 3) -> [6, 2, 4]</li>
         * </ul>
         * </p>
         *
         * @param nums A list of positive integers
         * @param count The number of even integers to return
         * @return A list of the first `count` even integers from the original array
         */
        @JvmStatic
        fun copyEvens(nums: IntArray, count: Int): IntArray {
            // TODO: Implement your solution here
            return intArrayOf()
        }

        /**
         * <h3>Q11</h3>
         * <p>
         * Description:
         *     Given n of 1 or more, return the factorial of n, which is 
         *     n * (n-1) * (n-2) ... 1. Compute the result recursively 
         *     (without loops).
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>factorial(1) -> 1</li>
         *   <li>factorial(2) -> 2</li>
         *   <li>factorial(3) -> 6</li>
         * </ul>
         * </p>
         *
         * @param n A positive integer for which to compute the factorial
         * @return The factorial of n
         */
        @JvmStatic
        fun factorial(n: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q12</h3>
         * <p>
         * Description:
         *     We have a number of bunnies and each bunny has two big floppy ears. 
         *     We want to compute the total number of ears across all the bunnies 
         *     recursively (without loops or multiplication).
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>bunnyEars(0) -> 0</li>
         *   <li>bunnyEars(1) -> 2</li>
         *   <li>bunnyEars(2) -> 4</li>
         * </ul>
         * </p>
         *
         * @param bunnies The number of bunnies
         * @return The total number of ears across all the bunnies
         */
        @JvmStatic
        fun bunnyEars(bunnies: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q13</h3>
         * <p>
         * Description:
         *     The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
         *     The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum
         *     of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
         *     Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start
         *     of the sequence.
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>fibonacci(0) -> 0</li>
         *   <li>fibonacci(1) -> 1</li>
         *   <li>fibonacci(2) -> 1</li>
         * </ul>
         * </p>
         *
         * @param n The position in the fibonacci sequence, with fibonacci(0)=0
         * @return The nth fibonacci number
         */
        @JvmStatic
        fun fibonacci(n: Int): Int {
            // TODO: Implement your solution here
            return 0
        }

        /**
         * <h3>Q14</h3>
         * <p>
         * Description:
         *     We have bunnies standing in a line, numbered 1, 2, ... 
         *     The odd bunnies (1, 3, ...) have the normal 2 ears. 
         *     The even bunnies (2, 4, ...) we'll say have 3 ears, because they each have a raised foot.
         *     Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
         * </p>
         * <p>
         * Examples:
         * <ul>
         *   <li>bunnyEars2(0) -> 0</li>
         *   <li>bunnyEars2(1) -> 2</li>
         *   <li>bunnyEars2(2) -> 5</li>
         * </ul>
         * </p>
         *
         * @param bunnies The number of bunnies
         * @return The total number of ears in the bunny line
         */
        @JvmStatic
        fun bunnyEars2(bunnies: Int): Int {
            // TODO: Implement your solution here
            return 0
        }
    }
}
