/**
INSTRUCTIONS: 
    The APQuiz05Test class provides JUnit tests for the methods 
    in the APQuiz05 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz05*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz05*.java
     kotlinc    -d out                                  APQuiz05*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz05Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz05Test {
    
    /**
     * < Q1 >
     * Tests the more14 method.
     */
    @Test
    public void testMore14() {
        assertTrue(APQuiz05.more14(new int[]{1, 4, 1}));
        assertFalse(APQuiz05.more14(new int[]{1, 4, 1, 4}));
        assertTrue(APQuiz05.more14(new int[]{1, 1}));
        assertTrue(APQuiz05.more14(new int[]{1, 6, 6}));
        assertTrue(APQuiz05.more14(new int[]{1}));
        assertFalse(APQuiz05.more14(new int[]{1, 4}));
        assertTrue(APQuiz05.more14(new int[]{6, 1, 1}));
        assertFalse(APQuiz05.more14(new int[]{1, 6, 4}));
        assertTrue(APQuiz05.more14(new int[]{1, 1, 4, 4, 1}));
        assertTrue(APQuiz05.more14(new int[]{1, 1, 6, 4, 4, 1}));
        assertFalse(APQuiz05.more14(new int[]{}));
        assertFalse(APQuiz05.more14(new int[]{4, 1, 4, 6}));
        assertFalse(APQuiz05.more14(new int[]{4, 1, 4, 6, 1}));
        assertTrue(APQuiz05.more14(new int[]{1, 4, 1, 4, 1, 6}));
    }

    /**
     * < Q2 >
     * Tests the luckySum method.
     */
    @Test
    public void testLuckySum() {
        assertEquals(6, APQuiz05.luckySum(1, 2, 3));
        assertEquals(3, APQuiz05.luckySum(1, 2, 13));
        assertEquals(1, APQuiz05.luckySum(1, 13, 3));
        assertEquals(1, APQuiz05.luckySum(1, 13, 13));
        assertEquals(13, APQuiz05.luckySum(6, 5, 2));
        assertEquals(0, APQuiz05.luckySum(13, 2, 3));
        assertEquals(0, APQuiz05.luckySum(13, 2, 13));
        assertEquals(0, APQuiz05.luckySum(13, 13, 2));
        assertEquals(13, APQuiz05.luckySum(9, 4, 13));
        assertEquals(8, APQuiz05.luckySum(8, 13, 2));
        assertEquals(10, APQuiz05.luckySum(7, 2, 1));
        assertEquals(6, APQuiz05.luckySum(3, 3, 13));
    }

    /**
     * < Q3 >
     * Tests the equalIsNot method.
     */
    @Test
    public void testEqualIsNot() {
        assertFalse(APQuiz05.equalIsNot("This is not"));
        assertTrue(APQuiz05.equalIsNot("This is notnot"));
        assertTrue(APQuiz05.equalIsNot("noisxxnotyynotxisi"));
        assertFalse(APQuiz05.equalIsNot("noisxxnotyynotxsi"));
        assertTrue(APQuiz05.equalIsNot("xxxyyyzzzintint"));
        assertTrue(APQuiz05.equalIsNot(""));
        assertTrue(APQuiz05.equalIsNot("isisnotnot"));
        assertFalse(APQuiz05.equalIsNot("isisnotno7Not"));
        assertFalse(APQuiz05.equalIsNot("isnotis"));
        assertFalse(APQuiz05.equalIsNot("mis3notpotbotis"));
    }

    /**
     * < Q4 >
     * Tests the fix45 method.
     */
    @Test
    public void testFix45() {
        assertArrayEquals(new int[]{9, 4, 5, 4, 5, 9}, APQuiz05.fix45(new int[]{5, 4, 9, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1}, APQuiz05.fix45(new int[]{1, 4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5, 1, 1, 4, 5}, APQuiz05.fix45(new int[]{1, 4, 1, 5, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 9, 9, 4, 5, 9}, APQuiz05.fix45(new int[]{4, 9, 4, 9, 5, 5, 4, 9, 5}));
        assertArrayEquals(new int[]{1, 1, 4, 5, 4, 5}, APQuiz05.fix45(new int[]{5, 5, 4, 1, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 2, 2}, APQuiz05.fix45(new int[]{4, 2, 2, 5}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2, 2}, APQuiz05.fix45(new int[]{4, 2, 4, 2, 5, 5}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 2}, APQuiz05.fix45(new int[]{4, 2, 4, 5, 5}));
        assertArrayEquals(new int[]{1, 1, 1}, APQuiz05.fix45(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{4, 5}, APQuiz05.fix45(new int[]{4, 5}));
        assertArrayEquals(new int[]{1, 4, 5}, APQuiz05.fix45(new int[]{5, 4, 1}));
        assertArrayEquals(new int[]{}, APQuiz05.fix45(new int[]{}));
        assertArrayEquals(new int[]{1, 4, 5, 4, 5}, APQuiz05.fix45(new int[]{5, 4, 5, 4, 1}));
        assertArrayEquals(new int[]{4, 5, 4, 5, 1}, APQuiz05.fix45(new int[]{4, 5, 4, 1, 5}));
        assertArrayEquals(new int[]{3, 4, 5}, APQuiz05.fix45(new int[]{3, 4, 5}));
        assertArrayEquals(new int[]{4, 5, 1}, APQuiz05.fix45(new int[]{4, 1, 5}));
        assertArrayEquals(new int[]{1, 4, 5}, APQuiz05.fix45(new int[]{5, 4, 1}));
        assertArrayEquals(new int[]{2, 4, 5, 2}, APQuiz05.fix45(new int[]{2, 4, 2, 5}));
    }

    /**
     * < Q5 >
     * Tests the repeatSeparator method.
     */
    @Test
    public void testRepeatSeparator() {
        assertEquals("WordXWordXWord", APQuiz05.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", APQuiz05.repeatSeparator("This", "And", 2));
        assertEquals("This", APQuiz05.repeatSeparator("This", "And", 1));
        assertEquals("Hi-n-Hi", APQuiz05.repeatSeparator("Hi", "-n-", 2));
        assertEquals("AAA", APQuiz05.repeatSeparator("AAA", "", 1));
        assertEquals("", APQuiz05.repeatSeparator("AAA", "", 0));
        assertEquals("ABABABABA", APQuiz05.repeatSeparator("A", "B", 5));
        assertEquals("abcXXabcXXabc", APQuiz05.repeatSeparator("abc", "XX", 3));
        assertEquals("abcXXabc", APQuiz05.repeatSeparator("abc", "XX", 2));
        assertEquals("abc", APQuiz05.repeatSeparator("abc", "XX", 1));
        assertEquals("XYZaXYZ", APQuiz05.repeatSeparator("XYZ", "a", 2));
    }

    /**
     * < Q6 >
     * Tests the repeatFront method.
     */
    @Test
    public void testRepeatFront() {
        assertEquals("ChocChoChC", APQuiz05.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", APQuiz05.repeatFront("Chocolate", 3));
        assertEquals("IcI", APQuiz05.repeatFront("Ice Cream", 2));
        assertEquals("I", APQuiz05.repeatFront("Ice Cream", 1));
        assertEquals("", APQuiz05.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", APQuiz05.repeatFront("xyz", 3));
        assertEquals("", APQuiz05.repeatFront("", 0));
        assertEquals("JavaJavJaJ", APQuiz05.repeatFront("Java", 4));
        assertEquals("J", APQuiz05.repeatFront("Java", 1));
    }

    /**
     * < Q7 >
     * Tests the fizzArray method.
     */
    @Test
    public void testFizzArray() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, APQuiz05.fizzArray(4));
        assertArrayEquals(new int[]{0}, APQuiz05.fizzArray(1));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, APQuiz05.fizzArray(10));
        assertArrayEquals(new int[]{}, APQuiz05.fizzArray(0));
        assertArrayEquals(new int[]{0, 1}, APQuiz05.fizzArray(2));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, APQuiz05.fizzArray(7));
    }

    /**
     * < Q8 >
     * Tests the only14 method.
     */
    @Test
    public void testOnly14() {
        assertTrue(APQuiz05.only14(new int[]{1, 4, 1, 4}));
        assertFalse(APQuiz05.only14(new int[]{1, 4, 2, 4}));
        assertTrue(APQuiz05.only14(new int[]{1, 1}));
        assertTrue(APQuiz05.only14(new int[]{4, 1}));
        assertFalse(APQuiz05.only14(new int[]{2}));
        assertTrue(APQuiz05.only14(new int[]{}));
        assertFalse(APQuiz05.only14(new int[]{1, 4, 1, 3}));
        assertFalse(APQuiz05.only14(new int[]{3, 1, 3}));
        assertTrue(APQuiz05.only14(new int[]{1}));
        assertTrue(APQuiz05.only14(new int[]{4}));
        assertFalse(APQuiz05.only14(new int[]{3, 4}));
        assertFalse(APQuiz05.only14(new int[]{1, 3, 4}));
        assertTrue(APQuiz05.only14(new int[]{1, 1, 1}));
        assertFalse(APQuiz05.only14(new int[]{1, 1, 1, 5}));
        assertTrue(APQuiz05.only14(new int[]{4, 1, 4, 1}));
    }

    /**
     * < Q9 >
     * Tests the fizzArray2 method.
     */
    @Test
    public void testFizzArray2() {
        assertArrayEquals(new String[]{"0", "1", "2", "3"}, APQuiz05.fizzArray2(4));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}, APQuiz05.fizzArray2(10));
        assertArrayEquals(new String[]{"0", "1"}, APQuiz05.fizzArray2(2));
        assertArrayEquals(new String[]{"0"}, APQuiz05.fizzArray2(1));
        assertArrayEquals(new String[]{}, APQuiz05.fizzArray2(0));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6"}, APQuiz05.fizzArray2(7));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"}, APQuiz05.fizzArray2(9));
        assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, APQuiz05.fizzArray2(11));
    }

    /**
     * < Q10 >
     * Tests the noTeenSum method.
     */
    @Test
    public void testNoTeenSum() {
        assertEquals(6, APQuiz05.noTeenSum(1, 2, 3));
        assertEquals(3, APQuiz05.noTeenSum(2, 13, 1));
        assertEquals(3, APQuiz05.noTeenSum(2, 1, 14));
        assertEquals(18, APQuiz05.noTeenSum(2, 1, 15));
        assertEquals(19, APQuiz05.noTeenSum(2, 1, 16));
        assertEquals(3, APQuiz05.noTeenSum(2, 1, 17));
        assertEquals(3, APQuiz05.noTeenSum(17, 1, 2));
        assertEquals(19, APQuiz05.noTeenSum(2, 15, 2));
        assertEquals(16, APQuiz05.noTeenSum(16, 17, 18));
        assertEquals(0, APQuiz05.noTeenSum(17, 18, 19));
        assertEquals(32, APQuiz05.noTeenSum(15, 16, 1));
        assertEquals(30, APQuiz05.noTeenSum(15, 15, 19));
        assertEquals(31, APQuiz05.noTeenSum(15, 19, 16));
        assertEquals(5, APQuiz05.noTeenSum(5, 17, 18));
        assertEquals(16, APQuiz05.noTeenSum(17, 18, 16));
        assertEquals(0, APQuiz05.noTeenSum(17, 19, 18));
    }

    /**
     * < Q11 >
     * Tests the array220 method.
     */
    @Test
    public void testArray220() {
        assertTrue(APQuiz05.array220(new int[]{1, 2, 20}, 0));
        assertTrue(APQuiz05.array220(new int[]{3, 30}, 0));
        assertFalse(APQuiz05.array220(new int[]{3}, 0));
        assertFalse(APQuiz05.array220(new int[]{}, 0));
        assertTrue(APQuiz05.array220(new int[]{3, 3, 30, 4}, 0));
        assertFalse(APQuiz05.array220(new int[]{2, 19, 4}, 0));
        assertFalse(APQuiz05.array220(new int[]{20, 2, 21}, 0));
        assertTrue(APQuiz05.array220(new int[]{20, 2, 21, 210}, 0));
        assertTrue(APQuiz05.array220(new int[]{2, 200, 2000}, 0));
        assertTrue(APQuiz05.array220(new int[]{0, 0}, 0));
        assertFalse(APQuiz05.array220(new int[]{1, 2, 3, 4, 5, 6}, 0));
        assertTrue(APQuiz05.array220(new int[]{1, 2, 3, 4, 5, 50, 6}, 0));
        assertFalse(APQuiz05.array220(new int[]{1, 2, 3, 4, 5, 51, 6}, 0));
        assertTrue(APQuiz05.array220(new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0));
    }

    /**
     * < Q12 >
     * Tests the allStar method.
     */
    @Test
    public void testAllStar() {
        assertEquals("h*e*l*l*o", APQuiz05.allStar("hello"));
        assertEquals("a*b*c", APQuiz05.allStar("abc"));
        assertEquals("a*b", APQuiz05.allStar("ab"));
        assertEquals("a", APQuiz05.allStar("a"));
        assertEquals("", APQuiz05.allStar(""));
        assertEquals("3*.*1*4", APQuiz05.allStar("3.14"));
        assertEquals("C*h*o*c*o*l*a*t*e", APQuiz05.allStar("Chocolate"));
        assertEquals("1*2*3*4", APQuiz05.allStar("1234"));
    }

    /**
     * < Q13 >
     * Tests the pairStar method.
     */
    @Test
    public void testPairStar() {
        assertEquals("hel*lo", APQuiz05.pairStar("hello"));
        assertEquals("x*xy*y", APQuiz05.pairStar("xxyy"));
        assertEquals("a*a*a*a", APQuiz05.pairStar("aaaa"));
        assertEquals("a*a*ab", APQuiz05.pairStar("aaab"));
        assertEquals("a*a", APQuiz05.pairStar("aa"));
        assertEquals("a", APQuiz05.pairStar("a"));
        assertEquals("", APQuiz05.pairStar(""));
        assertEquals("noadjacent", APQuiz05.pairStar("noadjacent"));
        assertEquals("ab*ba", APQuiz05.pairStar("abba"));
        assertEquals("ab*b*ba", APQuiz05.pairStar("abbba"));
    }

    /**
     * < Q14 >
     * Tests the endX method.
     */
    @Test
    public void testEndX() {
        assertEquals("rexx", APQuiz05.endX("xxre"));
        assertEquals("hixxxx", APQuiz05.endX("xxhixx"));
        assertEquals("hihixxx", APQuiz05.endX("xhixhix"));
        assertEquals("hiy", APQuiz05.endX("hiy"));
        assertEquals("h", APQuiz05.endX("h"));
        assertEquals("x", APQuiz05.endX("x"));
        assertEquals("xx", APQuiz05.endX("xx"));
        assertEquals("", APQuiz05.endX(""));
        assertEquals("bxx", APQuiz05.endX("bxx"));
        assertEquals("baxx", APQuiz05.endX("bxax"));
        assertEquals("aaaxxx", APQuiz05.endX("axaxax"));
        assertEquals("hixxx", APQuiz05.endX("xxhxi"));
    }
}
