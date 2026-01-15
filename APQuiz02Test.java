/**
INSTRUCTIONS: 
    The APQuiz02Test class provides JUnit tests for the methods 
    in the APQuiz02 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz02*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz02*.java
     kotlinc    -d out                                  APQuiz02*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz02Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz02Test {
    
    /**
     * < Q1 >
     * Tests the copyEndy method.
     */
    @Test
    public void testCopyEndy() {
        assertArrayEquals(new int[]{9, 90}, APQuiz02.copyEndy(new int[]{9, 11, 90, 22, 6}, 2));
        assertArrayEquals(new int[]{9, 90, 6}, APQuiz02.copyEndy(new int[]{9, 11, 90, 22, 6}, 3));
        assertArrayEquals(new int[]{1, 1}, APQuiz02.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 2));
        assertArrayEquals(new int[]{1, 1, 0}, APQuiz02.copyEndy(new int[]{12, 1, 1, 13, 0, 20}, 3));
        assertArrayEquals(new int[]{0}, APQuiz02.copyEndy(new int[]{0}, 1));
        assertArrayEquals(new int[]{10, 90}, APQuiz02.copyEndy(new int[]{10, 11, 90}, 2));
        assertArrayEquals(new int[]{90, 100}, APQuiz02.copyEndy(new int[]{90, 22, 100}, 2));
        assertArrayEquals(new int[]{10}, APQuiz02.copyEndy(new int[]{12, 11, 10, 89, 101, 4}, 1));
        assertArrayEquals(new int[]{2, 2}, APQuiz02.copyEndy(new int[]{13, 2, 2, 0}, 2));
        assertArrayEquals(new int[]{2, 2, 0}, APQuiz02.copyEndy(new int[]{13, 2, 2, 0}, 3));
        assertArrayEquals(new int[]{2, 2}, APQuiz02.copyEndy(new int[]{13, 2, 13, 2, 0, 30}, 2));
        assertArrayEquals(new int[]{2, 2, 0}, APQuiz02.copyEndy(new int[]{13, 2, 13, 2, 0, 30}, 3));
    }

    /**
     * < Q2 >
     * Tests the matchUp method.
     */
    @Test
    public void testMatchUp() {
        assertEquals(1, APQuiz02.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}));
        assertEquals(2, APQuiz02.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}));
        assertEquals(1, APQuiz02.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}));
        assertEquals(1, APQuiz02.matchUp(new String[]{"", "", "ccc"}, new String[]{"aa", "bb", "cc"}));
        assertEquals(0, APQuiz02.matchUp(new String[]{"", "", ""}, new String[]{"", "bb", "cc"}));
        assertEquals(0, APQuiz02.matchUp(new String[]{"aa", "bb", "cc"}, new String[]{"", "", ""}));
        assertEquals(1, APQuiz02.matchUp(new String[]{"aa", "", "ccc"}, new String[]{"", "bb", "cc"}));
        assertEquals(0, APQuiz02.matchUp(new String[]{"x", "y", "z"}, new String[]{"y", "z", "x"}));
        assertEquals(1, APQuiz02.matchUp(new String[]{"", "y", "z"}, new String[]{"", "y", "x"}));
        assertEquals(3, APQuiz02.matchUp(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", "zzz"}));
        assertEquals(2, APQuiz02.matchUp(new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", ""}));
        assertEquals(3, APQuiz02.matchUp(new String[]{"b", "x", "y", "z"}, new String[]{"a", "xx", "yyy", "zzz"}));
        assertEquals(1, APQuiz02.matchUp(new String[]{"aaa", "bb", "c"}, new String[]{"aaa", "xx", "bb"}));
    }

    /**
     * < Q3 >
     * Tests the scoreUp method.
     */
    @Test
    public void testScoreUp() {
        assertEquals(6, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}));
        assertEquals(11, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}));
        assertEquals(16, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}));
        assertEquals(3, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "b", "?"}));
        assertEquals(-1, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "?", "?"}));
        assertEquals(7, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"c", "?", "b", "b"}));
        assertEquals(3, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b"}, new String[]{"c", "?", "b", "?"}));
        assertEquals(2, APQuiz02.scoreUp(new String[]{"a", "b", "c"}, new String[]{"a", "c", "b"}));
        assertEquals(4, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "a", "c", "a", "c"}));
        assertEquals(6, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "?", "?", "a", "c"}));
        assertEquals(11, APQuiz02.scoreUp(new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "?", "?", "c", "c"}));
        assertEquals(12, APQuiz02.scoreUp(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }

    /**
     * < Q4 >
     * Tests the wordsWithout method.
     */
    @Test
    public void testWordsWithout() {
        assertArrayEquals(new String[]{"b", "c"}, APQuiz02.wordsWithout(new String[]{"a", "b", "c", "a"}, "a"));
        assertArrayEquals(new String[]{"a", "c", "a"}, APQuiz02.wordsWithout(new String[]{"a", "b", "c", "a"}, "b"));
        assertArrayEquals(new String[]{"a", "b", "a"}, APQuiz02.wordsWithout(new String[]{"a", "b", "c", "a"}, "c"));
        assertArrayEquals(new String[]{"c", "a", "a"}, APQuiz02.wordsWithout(new String[]{"b", "c", "a", "a"}, "b"));
        assertArrayEquals(new String[]{"xx", "yyy", "yy"}, APQuiz02.wordsWithout(new String[]{"xx", "yyy", "x", "yy", "x"}, "x"));
        assertArrayEquals(new String[]{"xx", "yyy", "x", "x"}, APQuiz02.wordsWithout(new String[]{"xx", "yyy", "x", "yy", "x"}, "yy"));
        assertArrayEquals(new String[]{"ab", "ac"}, APQuiz02.wordsWithout(new String[]{"aa", "ab", "ac", "aa"}, "aa"));
    }

    /**
     * < Q5 >
     * Tests the scoresSpecial method.
     */
    @Test
    public void testScoresSpecial() {
        assertEquals(40, APQuiz02.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        assertEquals(40, APQuiz02.scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
        assertEquals(20, APQuiz02.scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
        assertEquals(50, APQuiz02.scoresSpecial(new int[]{1, 20, 2, 50}, new int[]{3, 4, 5}));
        assertEquals(50, APQuiz02.scoresSpecial(new int[]{3, 4, 5}, new int[]{1, 50, 2, 20}));
        assertEquals(50, APQuiz02.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{20}));
        assertEquals(50, APQuiz02.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{3, 20, 99}));
        assertEquals(60, APQuiz02.scoresSpecial(new int[]{10, 4, 20, 30}, new int[]{30, 20, 99}));
        assertEquals(0, APQuiz02.scoresSpecial(new int[]{}, new int[]{2}));
        assertEquals(20, APQuiz02.scoresSpecial(new int[]{}, new int[]{20}));
        assertEquals(40, APQuiz02.scoresSpecial(new int[]{14, 10, 4}, new int[]{4, 20, 30}));
    }

    /**
     * < Q6 >
     * Tests the sumHeights method.
     */
    @Test
    public void testSumHeights() {
        assertEquals(6, APQuiz02.sumHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, APQuiz02.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(11, APQuiz02.sumHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
        assertEquals(0, APQuiz02.sumHeights(new int[]{5, 3, 6, 7, 2}, 1, 1));
        assertEquals(3, APQuiz02.sumHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
    }

    /**
     * < Q7 >
     * Tests the sumHeights2 method.
     */
    @Test
    public void testSumHeights2() {
        assertEquals(7, APQuiz02.sumHeights2(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, APQuiz02.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(15, APQuiz02.sumHeights2(new int[]{5, 3, 6, 7, 2}, 0, 4));
        assertEquals(0, APQuiz02.sumHeights2(new int[]{5, 3, 6, 7, 2}, 1, 1));
        assertEquals(6, APQuiz02.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
        assertEquals(19, APQuiz02.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
        assertEquals(16, APQuiz02.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8));
        assertEquals(0, APQuiz02.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8));
        assertEquals(0, APQuiz02.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2));
        assertEquals(4, APQuiz02.sumHeights2(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6));
        assertEquals(1, APQuiz02.sumHeights2(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 4));
        assertEquals(2, APQuiz02.sumHeights2(new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 5));
    }

    /**
     * < Q8 >
     * Tests the bigHeights method.
     */
    @Test
    public void testBigHeights() {
        assertEquals(1, APQuiz02.bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));
        assertEquals(0, APQuiz02.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1));
        assertEquals(1, APQuiz02.bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4));
        assertEquals(0, APQuiz02.bigHeights(new int[]{5, 3, 6, 7, 3}, 0, 4));
        assertEquals(0, APQuiz02.bigHeights(new int[]{5, 3, 6, 7, 2}, 1, 1));
        assertEquals(1, APQuiz02.bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 2));
        assertEquals(2, APQuiz02.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 2));
        assertEquals(2, APQuiz02.bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 4));
        assertEquals(3, APQuiz02.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 4));
        assertEquals(2, APQuiz02.bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 3));
        assertEquals(0, APQuiz02.bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
        assertEquals(1, APQuiz02.bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
        assertEquals(1, APQuiz02.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3));
        assertEquals(1, APQuiz02.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8));
        assertEquals(2, APQuiz02.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8));
        assertEquals(3, APQuiz02.bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8));
    }

    /**
     * < Q9 >
     * Tests the userCompare method.
     */
    @Test
    public void testUserCompare() {
        assertEquals(-1, APQuiz02.userCompare("bb", 1, "zz", 2));
        assertEquals(1, APQuiz02.userCompare("bb", 1, "aa", 2));
        assertEquals(0, APQuiz02.userCompare("bb", 1, "bb", 1));
        assertEquals(1, APQuiz02.userCompare("bb", 5, "bb", 1));
        assertEquals(-1, APQuiz02.userCompare("bb", 5, "bb", 10));
        assertEquals(-1, APQuiz02.userCompare("adam", 1, "bob", 2));
        assertEquals(-1, APQuiz02.userCompare("bob", 1, "bob", 2));
        assertEquals(1, APQuiz02.userCompare("bzb", 1, "bob", 2));
    }

    /**
     * < Q10 >
     * Tests the mergeTwo method.
     */
    @Test
    public void testMergeTwo() {
        assertArrayEquals(new String[]{"a", "b", "c"}, APQuiz02.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3));
        assertArrayEquals(new String[]{"a", "c", "f"}, APQuiz02.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3));
        assertArrayEquals(new String[]{"c", "f", "g"}, APQuiz02.mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3));
        assertArrayEquals(new String[]{"a", "c", "z"}, APQuiz02.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c"}, APQuiz02.mergeTwo(new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3));
        assertArrayEquals(new String[]{"a", "b", "c"}, APQuiz02.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3));
        assertArrayEquals(new String[]{"a", "c"}, APQuiz02.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2));
        assertArrayEquals(new String[]{"a", "c", "y"}, APQuiz02.mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3));
        assertArrayEquals(new String[]{"a", "b", "x"}, APQuiz02.mergeTwo(new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3));
    }

    /**
     * < Q11 >
     * Tests the triangle method.
     */
    @Test
    public void testTriangle() {
        assertEquals(0, APQuiz02.triangle(0));
        assertEquals(1, APQuiz02.triangle(1));
        assertEquals(3, APQuiz02.triangle(2));
        assertEquals(6, APQuiz02.triangle(3));
        assertEquals(10, APQuiz02.triangle(4));
        assertEquals(15, APQuiz02.triangle(5));
        assertEquals(21, APQuiz02.triangle(6));
        assertEquals(28, APQuiz02.triangle(7));
    }

    /**
     * < Q12 >
     * Tests the sumDigits method.
     */
    @Test
    public void testSumDigits() {
        assertEquals(9, APQuiz02.sumDigits(126));
        assertEquals(13, APQuiz02.sumDigits(49));
        assertEquals(3, APQuiz02.sumDigits(12));
        assertEquals(1, APQuiz02.sumDigits(10));
        assertEquals(1, APQuiz02.sumDigits(1));
        assertEquals(0, APQuiz02.sumDigits(0));
        assertEquals(10, APQuiz02.sumDigits(730));
        assertEquals(4, APQuiz02.sumDigits(1111));
        assertEquals(5, APQuiz02.sumDigits(11111));
        assertEquals(3, APQuiz02.sumDigits(10110));
        assertEquals(10, APQuiz02.sumDigits(235));
    }

    /**
     * < Q13 >
     * Tests the count7 method.
     */
    @Test
    public void testCount7() {
        assertEquals(2, APQuiz02.count7(717));
        assertEquals(1, APQuiz02.count7(7));
        assertEquals(0, APQuiz02.count7(123));
        assertEquals(2, APQuiz02.count7(77));
        assertEquals(1, APQuiz02.count7(7123));
        assertEquals(3, APQuiz02.count7(771237));
        assertEquals(4, APQuiz02.count7(771737));
        assertEquals(2, APQuiz02.count7(47571));
        assertEquals(6, APQuiz02.count7(777777));
        assertEquals(4, APQuiz02.count7(70701277));
        assertEquals(5, APQuiz02.count7(777576197));
        assertEquals(0, APQuiz02.count7(99999));
        assertEquals(1, APQuiz02.count7(99799));
    }

    /**
     * < Q14 >
     * Tests the count8 method.
     */
    @Test
    public void testCount8() {
        assertEquals(1, APQuiz02.count8(8));
        assertEquals(2, APQuiz02.count8(818));
        assertEquals(4, APQuiz02.count8(8818));
        assertEquals(4, APQuiz02.count8(8088));
        assertEquals(0, APQuiz02.count8(123));
        assertEquals(2, APQuiz02.count8(81238));
        assertEquals(6, APQuiz02.count8(88788));
        assertEquals(1, APQuiz02.count8(8234));
        assertEquals(1, APQuiz02.count8(2348));
        assertEquals(3, APQuiz02.count8(23884));
        assertEquals(0, APQuiz02.count8(0));
        assertEquals(5, APQuiz02.count8(1818188));
        assertEquals(5, APQuiz02.count8(8818181));
        assertEquals(1, APQuiz02.count8(1080));
        assertEquals(3, APQuiz02.count8(188));
        assertEquals(9, APQuiz02.count8(88888));
        assertEquals(2, APQuiz02.count8(9898));
        assertEquals(1, APQuiz02.count8(78));
    }
}
