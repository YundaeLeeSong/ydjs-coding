/**
INSTRUCTIONS: 
    The APQuiz01Test class provides JUnit tests for the methods 
    in the APQuiz01 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz01*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz01*.java
     kotlinc    -d out                                  APQuiz01*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz01Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz01Test {
    
    /**
     * < Q1 >
     * Tests the scoresIncreasing method.
     */
    @Test
    public void testScoresIncreasing() {
        assertTrue(APQuiz01.scoresIncreasing(new int[]{1, 3, 4}));            // -> true
        assertFalse(APQuiz01.scoresIncreasing(new int[]{1, 3, 2}));           // -> false
        assertTrue(APQuiz01.scoresIncreasing(new int[]{1, 1, 4}));            // -> true
        assertTrue(APQuiz01.scoresIncreasing(new int[]{1, 1, 2, 4, 4, 7}));   // -> true
        assertFalse(APQuiz01.scoresIncreasing(new int[]{1, 1, 2, 4, 3, 7}));  // -> false
        assertTrue(APQuiz01.scoresIncreasing(new int[]{-5, 4, 11}));          // -> true
    }

    /**
     * < Q2 >
     * Tests the scores100 method.
     */
    @Test
    public void testScores100() {
        assertTrue(APQuiz01.scores100(new int[]{1, 100, 100}));             // -> true
        assertFalse(APQuiz01.scores100(new int[]{1, 100, 99, 100}));        // -> false
        assertTrue(APQuiz01.scores100(new int[]{100, 1, 100, 100}));        // -> true
        assertFalse(APQuiz01.scores100(new int[]{100, 1, 100, 1}));         // -> false
        assertFalse(APQuiz01.scores100(new int[]{1, 2, 3, 4, 5}));          // -> false
        assertFalse(APQuiz01.scores100(new int[]{1, 2, 100, 4, 5}));        // -> false
    }

    /**
     * < Q3 >
     * Tests the scoresClump method.
     */
    @Test
    public void testScoresClump() {
        assertTrue(APQuiz01.scoresClump(new int[]{3, 4, 5}));           // -> true
        assertFalse(APQuiz01.scoresClump(new int[]{3, 4, 6}));          // -> false
        assertTrue(APQuiz01.scoresClump(new int[]{1, 3, 5, 5}));         // -> true
        assertTrue(APQuiz01.scoresClump(new int[]{2, 4, 5, 6}));         // -> true
        assertFalse(APQuiz01.scoresClump(new int[]{2, 4, 5, 7}));         // -> false
        assertTrue(APQuiz01.scoresClump(new int[]{2, 4, 4, 7}));         // -> true
        assertFalse(APQuiz01.scoresClump(new int[]{3, 3, 6, 7, 9}));      // -> false
        assertTrue(APQuiz01.scoresClump(new int[]{3, 3, 7, 7, 9}));       // -> true
        assertFalse(APQuiz01.scoresClump(new int[]{4, 5, 8}));            // -> false
    }

    /**
     * < Q4 >
     * Tests the scoresAverage method.
     */
    @Test
    public void testScoresAverage() {
        assertEquals(4, APQuiz01.scoresAverage(new int[]{2, 2, 4, 4}));
        assertEquals(4, APQuiz01.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        assertEquals(4, APQuiz01.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
        assertEquals(6, APQuiz01.scoresAverage(new int[]{5, 6}));
        assertEquals(5, APQuiz01.scoresAverage(new int[]{5, 4}));
        assertEquals(5, APQuiz01.scoresAverage(new int[]{5, 4, 5, 6, 2, 1, 2, 3}));
    }

    /**
     * < Q5 >
     * Tests the wordsCount method.
     */
    @Test
    public void testWordsCount() {
        assertEquals(2, APQuiz01.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(1, APQuiz01.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(0, APQuiz01.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
        assertEquals(2, APQuiz01.wordsCount(new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
        assertEquals(2, APQuiz01.wordsCount(new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
        assertEquals(1, APQuiz01.wordsCount(new String[]{"xx", "yyy", "x", "yy", "z"}, 3));
    }

    /**
     * < Q6 >
     * Tests the wordsFront method.
     */
    @Test
    public void testWordsFront() {
        assertArrayEquals(new String[]{"a"}, APQuiz01.wordsFront(new String[]{"a", "b", "c", "d"}, 1));
        assertArrayEquals(new String[]{"a", "b"}, APQuiz01.wordsFront(new String[]{"a", "b", "c", "d"}, 2));
        assertArrayEquals(new String[]{"a", "b", "c"}, APQuiz01.wordsFront(new String[]{"a", "b", "c", "d"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c", "d"}, APQuiz01.wordsFront(new String[]{"a", "b", "c", "d"}, 4));
        assertArrayEquals(new String[]{"Hi"}, APQuiz01.wordsFront(new String[]{"Hi", "There"}, 1));
        assertArrayEquals(new String[]{"Hi", "There"}, APQuiz01.wordsFront(new String[]{"Hi", "There"}, 2));
    }

    /**
     * < Q7 >
     * Tests the wordsWithoutList method.
     */
    @Test
    public void testWordsWithoutList() {
        assertArrayEquals(new String[]{"bb", "ccc"}, APQuiz01.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertArrayEquals(new String[]{"a", "bb", "b"}, APQuiz01.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertArrayEquals(new String[]{"a", "bb", "b", "ccc"}, APQuiz01.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
        assertArrayEquals(new String[]{"xx", "yyy", "yy"}, APQuiz01.wordsWithoutList(new String[]{"xx", "yyy", "x", "yy", "z"}, 1));
        assertArrayEquals(new String[]{"yyy", "x", "z"}, APQuiz01.wordsWithoutList(new String[]{"xx", "yyy", "x", "yy", "z"}, 2));
    }

    /**
     * < Q8 >
     * Tests the hasOne method.
     */
    @Test
    public void testHasOne() {
        assertTrue(APQuiz01.hasOne(10));
        assertFalse(APQuiz01.hasOne(22));
        assertFalse(APQuiz01.hasOne(220));
        assertTrue(APQuiz01.hasOne(212));
        assertTrue(APQuiz01.hasOne(1));
        assertFalse(APQuiz01.hasOne(9));
        assertTrue(APQuiz01.hasOne(211112));
        assertTrue(APQuiz01.hasOne(121121));
        assertFalse(APQuiz01.hasOne(222222));
        assertTrue(APQuiz01.hasOne(56156));
        assertFalse(APQuiz01.hasOne(56556));
    }

    /**
     * < Q9 >
     * Tests the dividesSelf method.
     */
    @Test
    public void testDividesSelf() {
        assertTrue(APQuiz01.dividesSelf(128));
        assertTrue(APQuiz01.dividesSelf(12));
        assertFalse(APQuiz01.dividesSelf(120));
        assertTrue(APQuiz01.dividesSelf(122));
        assertFalse(APQuiz01.dividesSelf(13));
        assertFalse(APQuiz01.dividesSelf(32));
        assertTrue(APQuiz01.dividesSelf(22));
        assertFalse(APQuiz01.dividesSelf(42));
        assertTrue(APQuiz01.dividesSelf(212));
        assertFalse(APQuiz01.dividesSelf(213));
        assertTrue(APQuiz01.dividesSelf(162));
    }

    /**
     * < Q10 >
     * Tests the copyEvens method.
     */
    @Test
    public void testCopyEvens() {
        assertArrayEquals(new int[]{2, 4}, APQuiz01.copyEvens(new int[]{3, 2, 4, 5, 8}, 2));
        assertArrayEquals(new int[]{2, 4, 8}, APQuiz01.copyEvens(new int[]{3, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4}, APQuiz01.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4, 8}, APQuiz01.copyEvens(new int[]{6, 1, 2, 4, 5, 8}, 4));
        assertArrayEquals(new int[]{4}, APQuiz01.copyEvens(new int[]{3, 1, 4, 1, 5}, 1));
        assertArrayEquals(new int[]{2}, APQuiz01.copyEvens(new int[]{2}, 1));
        assertArrayEquals(new int[]{6, 2}, APQuiz01.copyEvens(new int[]{6, 2, 4, 8}, 2));
        assertArrayEquals(new int[]{6, 2, 4}, APQuiz01.copyEvens(new int[]{6, 2, 4, 8}, 3));
        assertArrayEquals(new int[]{6, 2, 4, 8}, APQuiz01.copyEvens(new int[]{6, 2, 4, 8}, 4));
        assertArrayEquals(new int[]{8}, APQuiz01.copyEvens(new int[]{1, 8, 4}, 1));
        assertArrayEquals(new int[]{8, 4}, APQuiz01.copyEvens(new int[]{1, 8, 4}, 2));
        assertArrayEquals(new int[]{2, 8}, APQuiz01.copyEvens(new int[]{2, 8, 4}, 2));
    }

    /**
     * < Q11 >
     * Tests the factorial method.
     */
    @Test
    public void testFactorial() {
        assertEquals(1, APQuiz01.factorial(1));
        assertEquals(2, APQuiz01.factorial(2));
        assertEquals(6, APQuiz01.factorial(3));
        assertEquals(24, APQuiz01.factorial(4));
        assertEquals(120, APQuiz01.factorial(5));
        assertEquals(720, APQuiz01.factorial(6));
        assertEquals(5040, APQuiz01.factorial(7));
        assertEquals(40320, APQuiz01.factorial(8));
        assertEquals(479001600, APQuiz01.factorial(12));
    }

    /**
     * < Q12 >
     * Tests the bunnyEars method.
     */
    @Test
    public void testBunnyEars() {
        assertEquals(0, APQuiz01.bunnyEars(0));
        assertEquals(2, APQuiz01.bunnyEars(1));
        assertEquals(4, APQuiz01.bunnyEars(2));
        assertEquals(6, APQuiz01.bunnyEars(3));
        assertEquals(8, APQuiz01.bunnyEars(4));
        assertEquals(10, APQuiz01.bunnyEars(5));
        assertEquals(24, APQuiz01.bunnyEars(12));
        assertEquals(100, APQuiz01.bunnyEars(50));
        assertEquals(468, APQuiz01.bunnyEars(234));
    }

    /**
     * < Q13 >
     * Tests the fibonacci method.
     */
    @Test
    public void testFibonacci() {
        assertEquals(0, APQuiz01.fibonacci(0));
        assertEquals(1, APQuiz01.fibonacci(1));
        assertEquals(1, APQuiz01.fibonacci(2));
        assertEquals(2, APQuiz01.fibonacci(3));
        assertEquals(3, APQuiz01.fibonacci(4));
        assertEquals(5, APQuiz01.fibonacci(5));
        assertEquals(8, APQuiz01.fibonacci(6));
        assertEquals(13, APQuiz01.fibonacci(7));
    }

    /**
     * < Q14 >
     * Tests the bunnyEars2 method.
     */
    @Test
    public void testBunnyEars2() {
        assertEquals(0, APQuiz01.bunnyEars2(0));
        assertEquals(2, APQuiz01.bunnyEars2(1));
        assertEquals(5, APQuiz01.bunnyEars2(2));
        assertEquals(7, APQuiz01.bunnyEars2(3));
        assertEquals(10, APQuiz01.bunnyEars2(4));
        assertEquals(12, APQuiz01.bunnyEars2(5));
        assertEquals(15, APQuiz01.bunnyEars2(6));
        assertEquals(25, APQuiz01.bunnyEars2(10));
    }
}
