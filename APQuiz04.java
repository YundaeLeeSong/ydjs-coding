/**
 * APQuiz04 contains various coding quiz problems for practice.
 * 
 * This class includes methods for:
 * 1. countCode: Count occurrences of "co_e" patterns in a string.
 * 2. sum13: Sum numbers in a list, ignoring 13 and the number after it.
 * 3. has22: Check if a list contains two consecutive 2's.
 * 4. loneSum: Sum three integers, ignoring duplicates.
 * 5. withoutString: Remove all instances of a substring from a base string, case-insensitively.
 * 6. fix34: Rearrange a list so every 3 is followed by a 4.
 * 7. endOther: Check if one string ends with another, case-insensitively.
 * 8. xyzThere: Check if "xyz" appears in a string not preceded by a period.
 * 9. lucky13: Check if a list contains no 1's and no 3's.
 * 10. sum28: Check if the sum of all 2's in a list is exactly 8.
 * 11. changePi: Replace all occurrences of "pi" with "3.14" recursively.
 * 12. noX: Remove all 'x' characters from a string recursively.
 * 13. array6: Check if an array contains a 6 recursively.
 * 14. array11: Count the number of times 11 appears in an array recursively.
 */
public class APQuiz04 {
    
    /**
     * <h3>Q1</h3>
     * <p>
     * Description:
     *     Return the number of times that the string "code" appears anywhere in the given string,
     *     except we'll accept any letter for the 'd' position—so "cope" and "cooe" count as well.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>countCode("aaacodebbb") -> 1</li>
     *   <li>countCode("codexxcode") -> 2</li>
     *   <li>countCode("cozexxcope") -> 2</li>
     * </ul>
     * </p>
     *
     * @param s The input string to search within
     * @return The count of substrings matching the pattern "co_e"
     */
    public static int countCode(String s) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * <h3>Q2</h3>
     * <p>
     * Description:
     *     Return the sum of the numbers in the list, returning 0 for an empty list.
     *     The number 13 is unlucky—it does not count toward the sum, and any number
     *     immediately following a 13 also does not count.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>sum13([1, 2, 2, 1]) -> 6</li>
     *   <li>sum13([1, 1]) -> 2</li>
     *   <li>sum13([1, 2, 2, 1, 13]) -> 6</li>
     * </ul>
     * </p>
     *
     * @param nums A list of integers
     * @return The sum according to the "13" rules described above
     */
    public static int sum13(int[] nums) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * <h3>Q3</h3>
     * <p>
     * Description:
     *     Given a list of integers, return True if the list contains a 2 next to a 2 somewhere.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>has22([1, 2, 2]) -> true</li>
     *   <li>has22([1, 2, 1, 2]) -> false</li>
     *   <li>has22([2, 1, 2]) -> false</li>
     * </ul>
     * </p>
     *
     * @param nums The list of integers to check
     * @return true if there is at least one occurrence of two consecutive 2's, false otherwise
     */
    public static boolean has22(int[] nums) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * <h3>Q4</h3>
     * <p>
     * Description:
     *     Given 3 integer values, a, b, and c, return their sum. However, if one of the values
     *     is the same as another value, that value does not count toward the sum.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>loneSum(1, 2, 3) -> 6</li>
     *   <li>loneSum(3, 2, 3) -> 2</li>
     *   <li>loneSum(3, 3, 3) -> 0</li>
     * </ul>
     * </p>
     *
     * @param a First integer
     * @param b Second integer
     * @param c Third integer
     * @return The sum of the values that are not duplicated
     */
    public static int loneSum(int a, int b, int c) {
        // TODO: Implement your solution here
        return 0;
    }

    /**
     * <h3>Q5</h3>
     * <p>
     * Description:
     *     Given two strings, `base` and `remove`, return a version of the `base` string where all
     *     non-overlapping instances of the `remove` string have been removed. Removal is not case
     *     sensitive (e.g. removing "is" will remove "IS", "Is", etc.), but the remaining characters
     *     keep their original case. You may assume `remove` has length 1 or more.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>withoutString("Hello there", "llo") -> "He there"</li>
     *   <li>withoutString("Hello there", "e") -> "Hllo thr"</li>
     *   <li>withoutString("Hello there", "x") -> "Hello there"</li>
     * </ul>
     * </p>
     *
     * @param base The original string
     * @param remove The substring to remove (case-insensitive)
     * @return The resulting string after all instances of `remove` have been removed
     */
    public static String withoutString(String base, String remove) {
        // TODO: Implement your solution here
        return "";
    }

    /**
     * <h3>Q6</h3>
     * <p>
     * Description:
     *     Return a list containing exactly the same numbers as the given list, 
     *     but rearranged so that every 3 
     *     is immediately followed by a 4. Do not move the 3's themselves, but 
     *     every other number may move (specifically, may be swapped).
     *     You may assume:
     *       - The list contains the same number of 3's and 4's.
     *       - Every 3 has a non-3 immediately after it.
     *       - No 4 appears before the first 3.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>fix34([1, 3, 1, 4]) -> [1, 3, 4, 1]</li>
     *   <li>fix34([1, 3, 1, 4, 4, 3, 1]) -> [1, 3, 4, 1, 1, 3, 4]</li>
     *   <li>fix34([3, 2, 2, 4]) -> [3, 4, 2, 2]</li>
     * </ul>
     * </p>
     *
     * @param nums The input list of integers containing matching numbers of 3's and 4's
     * @return A new list where each 3 is immediately followed by a 4
     */
    public static int[] fix34(int[] nums) {
        // TODO: Implement your solution here
        return new int[0];
    }

    /**
     * <h3>Q7</h3>
     * <p>
     * Description:
     *     Given two strings, return True if either of the strings appears at the very end
     *     of the other string, ignoring upper/lower case differences.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>endOther("Hiabc", "abc") -> true</li>
     *   <li>endOther("AbC", "HiaBc") -> true</li>
     *   <li>endOther("abc", "abXabc") -> true</li>
     * </ul>
     * </p>
     *
     * @param a First input string
     * @param b Second input string
     * @return true if one string appears at the end of the other (case-insensitive), false otherwise
     */
    public static boolean endOther(String a, String b) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * <h3>Q8</h3>
     * <p>
     * Description:
     *     Return True if the given string contains an appearance of 
     *     "xyz" where the "xyz"
     *     is not directly preceded by a period ('.'). For example, 
     *     "xxyz" counts but "x.xyz" does not.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>xyzThere("abcxyz") -> true</li>
     *   <li>xyzThere("abc.xyz") -> false</li>
     *   <li>xyzThere("xyz.abc") -> true</li>
     * </ul>
     * </p>
     *
     * @param s The input string to check
     * @return true if "xyz" appears not preceded by '.', otherwise false
     */
    public static boolean xyzThere(String s) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * <h3>Q9</h3>
     * <p>
     * Description:
     *     Given a list of integers, return True if the list contains no 1's and no 3's.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>lucky13([0, 2, 4]) -> true</li>
     *   <li>lucky13([1, 2, 3]) -> false</li>
     *   <li>lucky13([1, 2, 4]) -> false</li>
     *   <li>lucky13([2, 7, 2, 8]) -> true</li>
     * </ul>
     * </p>
     *
     * @param nums The list of integers to check
     * @return true if there are no 1's and no 3's in the list, false otherwise
     */
    public static boolean lucky13(int[] nums) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * <h3>Q10</h3>
     * <p>
     * Description:
     *     Given a list of integers, return True if the sum of all the 2's in the list is exactly 8.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>sum28([2, 3, 2, 2, 4, 2]) -> true</li>
     *   <li>sum28([2, 3, 2, 2, 4, 2, 2]) -> false</li>
     *   <li>sum28([1, 2, 3, 4]) -> false</li>
     *   <li>sum28([2, 2, 2, 2]) -> true</li>
     *   <li>sum28([1, 2, 2, 2, 2, 4]) -> true</li>
     * </ul>
     * </p>
     *
     * @param nums The list of integers to examine
     * @return true if the sum of all 2's is exactly 8, false otherwise
     */
    public static boolean sum28(int[] nums) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * <h3>Q11</h3>
     * <p>
     * Description:
     *     Given a string, compute recursively (no loops) a new string where all appearances of "pi" 
     *     have been replaced by "3.14".
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>changePi("xpix") -> "x3.14x"</li>
     *   <li>changePi("pipi") -> "3.143.14"</li>
     *   <li>changePi("pip") -> "3.14p"</li>
     * </ul>
     * </p>
     *
     * @param s The input string
     * @return The modified string with "pi" replaced by "3.14"
     */
    public static String changePi(String s) {
        // TODO: Implement your solution here
        return "";
    }

    /**
     * <h3>Q12</h3>
     * <p>
     * Description:
     *     Given a string, compute recursively a new string where all 
     *     the 'x' chars have been removed.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>noX("xaxb") -> "ab"</li>
     *   <li>noX("abc") -> "abc"</li>
     *   <li>noX("xx") -> ""</li>
     * </ul>
     * </p>
     *
     * @param s The input string
     * @return The modified string with all 'x' characters removed
     */
    public static String noX(String s) {
        // TODO: Implement your solution here
        return "";
    }

    /**
     * <h3>Q13</h3>
     * <p>
     * Description:
     *     Given an array of ints, compute recursively if the array 
     *     contains a 6.
     *     The function considers only the part of the array 
     *     that begins at the given index.
     *     A recursive call moves forward by passing index+1.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>array6([1, 6, 4], 0) -> true</li>
     *   <li>array6([1, 4], 0) -> false</li>
     *   <li>array6([6], 0) -> true</li>
     * </ul>
     * </p>
     *
     * @param nums The input list of integers
     * @param index The current index to check
     * @return true if the array contains a 6, false otherwise
     */
    public static boolean array6(int[] nums, int index) {
        // TODO: Implement your solution here
        return false;
    }

    /**
     * <h3>Q14</h3>
     * <p>
     * Description:
     *     Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
     *     The function considers only the part of the array that begins at the given index.
     *     A recursive call moves forward by passing index+1.
     * </p>
     * <p>
     * Examples:
     * <ul>
     *   <li>array11([1, 2, 11], 0) -> 1</li>
     *   <li>array11([11, 11], 0) -> 2</li>
     *   <li>array11([1, 2, 3, 4], 0) -> 0</li>
     * </ul>
     * </p>
     *
     * @param nums The input list of integers
     * @param index The current index to check
     * @return The number of times 11 appears in the array
     */
    public static int array11(int[] nums, int index) {
        // TODO: Implement your solution here
        return 0;
    }
}
