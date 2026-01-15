/**
INSTRUCTIONS: 
    The APQuiz08Test class provides JUnit tests for the methods 
    in the APQuiz08 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz08*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz08*.java
     kotlinc    -d out                                  APQuiz08*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz08Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz08Test {
    
    /**
     * < Q1 >
     * Tests the sameEnds method (string version).
     */
    @Test
    public void testSameEndsString() {
        assertEquals("ab", APQuiz08.sameEnds("abXYab"));
        assertEquals("x", APQuiz08.sameEnds("xx"));
        assertEquals("x", APQuiz08.sameEnds("xxx"));
        assertEquals("xx", APQuiz08.sameEnds("xxxx"));
        assertEquals("java", APQuiz08.sameEnds("javaXYZjava"));
        assertEquals("java", APQuiz08.sameEnds("javajava"));
        assertEquals("", APQuiz08.sameEnds("xavaXYZjava"));
        assertEquals("Hello!", APQuiz08.sameEnds("Hello! and Hello!"));
        assertEquals("", APQuiz08.sameEnds("x"));
        assertEquals("", APQuiz08.sameEnds(""));
        assertEquals("", APQuiz08.sameEnds("abcb"));
        assertEquals("my", APQuiz08.sameEnds("mymmy"));
    }

    /**
     * < Q2 >
     * Tests the mirrorEnds method.
     */
    @Test
    public void testMirrorEnds() {
        assertEquals("ab", APQuiz08.mirrorEnds("abXYZba"));
        assertEquals("a", APQuiz08.mirrorEnds("abca"));
        assertEquals("aba", APQuiz08.mirrorEnds("aba"));
        assertEquals("", APQuiz08.mirrorEnds("abab"));
        assertEquals("xxx", APQuiz08.mirrorEnds("xxx"));
        assertEquals("xxYxx", APQuiz08.mirrorEnds("xxYxx"));
        assertEquals("Hi", APQuiz08.mirrorEnds("Hi and iH"));
        assertEquals(" x ", APQuiz08.mirrorEnds(" x "));
        assertEquals("", APQuiz08.mirrorEnds(""));
        assertEquals("123", APQuiz08.mirrorEnds("123and then 321"));
        assertEquals("ba", APQuiz08.mirrorEnds("band andab"));
    }

    /**
     * < Q3 >
     * Tests the squareUp method.
     */
    @Test
    public void testSquareUp() {
        assertArrayEquals(new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}, APQuiz08.squareUp(3));
        assertArrayEquals(new int[]{0, 1, 2, 1}, APQuiz08.squareUp(2));
        assertArrayEquals(new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}, APQuiz08.squareUp(4));
        assertArrayEquals(new int[]{1}, APQuiz08.squareUp(1));
        assertArrayEquals(new int[]{}, APQuiz08.squareUp(0));
        assertArrayEquals(new int[]{
            0, 0, 0, 0, 0, 1,
            0, 0, 0, 0, 2, 1,
            0, 0, 0, 3, 2, 1,
            0, 0, 4, 3, 2, 1,
            0, 5, 4, 3, 2, 1,
            6, 5, 4, 3, 2, 1
        }, APQuiz08.squareUp(6));
    }

    /**
     * < Q4 >
     * Tests the getSandwich method.
     */
    @Test
    public void testGetSandwich() {
        assertEquals("jam", APQuiz08.getSandwich("breadjambread"));
        assertEquals("jam", APQuiz08.getSandwich("xxbreadjambreadyy"));
        assertEquals("", APQuiz08.getSandwich("xxbreadyy"));
        assertEquals("breadjam", APQuiz08.getSandwich("xxbreadbreadjambreadyy"));
        assertEquals("A", APQuiz08.getSandwich("breadAbread"));
        assertEquals("", APQuiz08.getSandwich("breadbread"));
        assertEquals("", APQuiz08.getSandwich("abcbreaz"));
        assertEquals("", APQuiz08.getSandwich("xyz"));
        assertEquals("", APQuiz08.getSandwich(""));
        assertEquals("breax", APQuiz08.getSandwich("breadbreaxbread"));
        assertEquals("y", APQuiz08.getSandwich("breaxbreadybread"));
        assertEquals("breadbread", APQuiz08.getSandwich("breadbreadbreadbread"));
    }

    /**
     * < Q5 >
     * Tests the sameStarChar method.
     */
    @Test
    public void testSameStarChar() {
        assertTrue(APQuiz08.sameStarChar("xy*yzz"));
        assertFalse(APQuiz08.sameStarChar("xy*zzz"));
        assertTrue(APQuiz08.sameStarChar("*xa*az"));
        assertFalse(APQuiz08.sameStarChar("*xa*bz"));
        assertTrue(APQuiz08.sameStarChar("*xa*a*"));
        assertTrue(APQuiz08.sameStarChar(""));
        assertTrue(APQuiz08.sameStarChar("*xa*a*a"));
        assertFalse(APQuiz08.sameStarChar("*xa*a*b"));
        assertTrue(APQuiz08.sameStarChar("*12*2*2"));
        assertFalse(APQuiz08.sameStarChar("12*2*3*"));
        assertTrue(APQuiz08.sameStarChar("abcDEF"));
        assertFalse(APQuiz08.sameStarChar("XY*YYYY*Z*"));
        assertTrue(APQuiz08.sameStarChar("*"));
        assertTrue(APQuiz08.sameStarChar("**"));
    }

    /**
     * < Q6 >
     * Tests the haveThree method.
     */
    @Test
    public void testHaveThree() {
        assertTrue(APQuiz08.haveThree(new int[]{3, 1, 3, 1, 3}));
        assertFalse(APQuiz08.haveThree(new int[]{3, 1, 3, 3}));
        assertFalse(APQuiz08.haveThree(new int[]{3, 4, 3, 3, 4}));
        assertFalse(APQuiz08.haveThree(new int[]{1, 3, 1, 3, 1, 2}));
        assertTrue(APQuiz08.haveThree(new int[]{1, 3, 1, 3, 1, 3}));
        assertFalse(APQuiz08.haveThree(new int[]{1, 3, 3, 1, 3}));
        assertFalse(APQuiz08.haveThree(new int[]{1, 3, 1, 3, 1, 3, 4, 3}));
        assertTrue(APQuiz08.haveThree(new int[]{3, 4, 3, 4, 3, 4, 4}));
        assertFalse(APQuiz08.haveThree(new int[]{3, 3, 3}));
        assertFalse(APQuiz08.haveThree(new int[]{1, 3}));
        assertFalse(APQuiz08.haveThree(new int[]{3}));
        assertFalse(APQuiz08.haveThree(new int[]{1}));
    }

    /**
     * < Q7 >
     * Tests the twoTwo method.
     */
    @Test
    public void testTwoTwo() {
        assertTrue(APQuiz08.twoTwo(new int[]{4, 2, 2, 3}));
        assertTrue(APQuiz08.twoTwo(new int[]{2, 2, 4}));
        assertFalse(APQuiz08.twoTwo(new int[]{2, 2, 4, 2}));
        assertTrue(APQuiz08.twoTwo(new int[]{1, 3, 4}));
        assertTrue(APQuiz08.twoTwo(new int[]{1, 2, 2, 3, 4}));
        assertFalse(APQuiz08.twoTwo(new int[]{1, 2, 3, 4}));
        assertTrue(APQuiz08.twoTwo(new int[]{2, 2}));
        assertTrue(APQuiz08.twoTwo(new int[]{2, 2, 7}));
        assertFalse(APQuiz08.twoTwo(new int[]{2, 2, 7, 2, 1}));
        assertTrue(APQuiz08.twoTwo(new int[]{4, 2, 2, 2}));
        assertTrue(APQuiz08.twoTwo(new int[]{2, 2, 2}));
        assertFalse(APQuiz08.twoTwo(new int[]{1, 2}));
        assertFalse(APQuiz08.twoTwo(new int[]{2}));
        assertTrue(APQuiz08.twoTwo(new int[]{1}));
        assertTrue(APQuiz08.twoTwo(new int[]{}));
        assertTrue(APQuiz08.twoTwo(new int[]{5, 2, 2, 3}));
        assertFalse(APQuiz08.twoTwo(new int[]{2, 2, 5, 2}));
    }

    /**
     * < Q8 >
     * Tests the sameEnds method (list version).
     */
    @Test
    public void testSameEndsList() {
        assertFalse(APQuiz08.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1));
        assertTrue(APQuiz08.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2));
        assertFalse(APQuiz08.sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 2, 5, 2, 1}, 1));
        assertFalse(APQuiz08.sameEnds(new int[]{1, 2, 5, 2, 1}, 2));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 2, 5, 2, 1}, 0));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 2, 5, 2, 1}, 5));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 1, 1}, 0));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 1, 1}, 1));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 1, 1}, 2));
        assertTrue(APQuiz08.sameEnds(new int[]{1, 1, 1}, 3));
        assertTrue(APQuiz08.sameEnds(new int[]{1}, 1));
        assertTrue(APQuiz08.sameEnds(new int[]{}, 0));
        assertFalse(APQuiz08.sameEnds(new int[]{4, 2, 4, 5}, 1));
    }

    /**
     * < Q9 >
     * Tests the tripleUp method.
     */
    @Test
    public void testTripleUp() {
        assertTrue(APQuiz08.tripleUp(new int[]{1, 4, 5, 6, 2}));
        assertTrue(APQuiz08.tripleUp(new int[]{1, 2, 3}));
        assertFalse(APQuiz08.tripleUp(new int[]{1, 2, 4}));
        assertTrue(APQuiz08.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
        assertFalse(APQuiz08.tripleUp(new int[]{1, 2, 4, 5, 7, 6, 5, 7, 7, 6}));
        assertFalse(APQuiz08.tripleUp(new int[]{1, 2}));
        assertFalse(APQuiz08.tripleUp(new int[]{1}));
        assertFalse(APQuiz08.tripleUp(new int[]{}));
        assertTrue(APQuiz08.tripleUp(new int[]{10, 9, 8, -100, -99, -98, 100}));
        assertFalse(APQuiz08.tripleUp(new int[]{10, 9, 8, -100, -99, 99, 100}));
        assertTrue(APQuiz08.tripleUp(new int[]{-100, -99, -99, 100, 101, 102}));
        assertFalse(APQuiz08.tripleUp(new int[]{2, 3, 5, 6, 8, 9, 2, 3}));
    }

    /**
     * < Q10 >
     * Tests the fizzArray3 method.
     */
    @Test
    public void testFizzArray3() {
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, APQuiz08.fizzArray3(5, 10));
        assertArrayEquals(new int[]{11, 12, 13, 14, 15, 16, 17}, APQuiz08.fizzArray3(11, 18));
        assertArrayEquals(new int[]{1, 2}, APQuiz08.fizzArray3(1, 3));
        assertArrayEquals(new int[]{1}, APQuiz08.fizzArray3(1, 2));
        assertArrayEquals(new int[]{}, APQuiz08.fizzArray3(1, 1));
        assertArrayEquals(new int[]{1000, 1001, 1002, 1003, 1004}, APQuiz08.fizzArray3(1000, 1005));
    }

    /**
     * < Q11 >
     * Tests the strCopies method.
     */
    @Test
    public void testStrCopies() {
        assertTrue(APQuiz08.strCopies("catcowcat", "cat", 2));
        assertFalse(APQuiz08.strCopies("catcowcat", "cow", 2));
        assertTrue(APQuiz08.strCopies("catcowcat", "cow", 1));
        assertTrue(APQuiz08.strCopies("iiijjj", "i", 3));
        assertFalse(APQuiz08.strCopies("iiijjj", "i", 4));
        assertTrue(APQuiz08.strCopies("iiijjj", "ii", 2));
        assertFalse(APQuiz08.strCopies("iiijjj", "ii", 3));
        assertFalse(APQuiz08.strCopies("iiijjj", "x", 3));
        assertTrue(APQuiz08.strCopies("iiijjj", "x", 0));
        assertTrue(APQuiz08.strCopies("iiiiij", "iii", 3));
        assertFalse(APQuiz08.strCopies("iiiiij", "iii", 4));
        assertTrue(APQuiz08.strCopies("ijiiiiij", "iiii", 2));
        assertFalse(APQuiz08.strCopies("ijiiiiij", "iiii", 3));
        assertTrue(APQuiz08.strCopies("dogcatdogcat", "dog", 2));
    }

    /**
     * < Q12 >
     * Tests the strDist method.
     */
    @Test
    public void testStrDist() {
        assertEquals(9, APQuiz08.strDist("catcowcat", "cat"));
        assertEquals(3, APQuiz08.strDist("catcowcat", "cow"));
        assertEquals(9, APQuiz08.strDist("cccatcowcatxx", "cat"));
        assertEquals(12, APQuiz08.strDist("abccatcowcatcatxyz", "cat"));
        assertEquals(3, APQuiz08.strDist("xyx", "x"));
        assertEquals(1, APQuiz08.strDist("xyx", "y"));
        assertEquals(0, APQuiz08.strDist("xyx", "z"));
        assertEquals(1, APQuiz08.strDist("z", "z"));
        assertEquals(0, APQuiz08.strDist("x", "z"));
        assertEquals(0, APQuiz08.strDist("", "z"));
        assertEquals(13, APQuiz08.strDist("hiHellohihihi", "hi"));
        assertEquals(5, APQuiz08.strDist("hiHellohihihi", "hih"));
        assertEquals(1, APQuiz08.strDist("hiHellohihihi", "o"));
        assertEquals(2, APQuiz08.strDist("hiHellohihihi", "II"));
    }

    /**
     * < Q13 >
     * Tests the groupSum method.
     */
    @Test
    public void testGroupSum() {
        assertTrue(APQuiz08.groupSum(0, new int[]{2, 4, 8}, 10));
        assertTrue(APQuiz08.groupSum(0, new int[]{2, 4, 8}, 14));
        assertFalse(APQuiz08.groupSum(0, new int[]{2, 4, 8}, 9));
        assertTrue(APQuiz08.groupSum(0, new int[]{2, 4, 8}, 8));
        assertTrue(APQuiz08.groupSum(1, new int[]{2, 4, 8}, 8));
        assertFalse(APQuiz08.groupSum(1, new int[]{2, 4, 8}, 2));
        assertTrue(APQuiz08.groupSum(0, new int[]{1}, 1));
        assertFalse(APQuiz08.groupSum(0, new int[]{9}, 1));
        assertTrue(APQuiz08.groupSum(1, new int[]{9}, 0));
        assertTrue(APQuiz08.groupSum(0, new int[]{}, 0));
        assertTrue(APQuiz08.groupSum(0, new int[]{10, 2, 2, 5}, 17));
        assertTrue(APQuiz08.groupSum(0, new int[]{10, 2, 2, 5}, 15));
        assertTrue(APQuiz08.groupSum(0, new int[]{10, 2, 2, 5}, 9));
    }

    /**
     * < Q14 >
     * Tests the groupSum6 method.
     */
    @Test
    public void testGroupSum6() {
        assertTrue(APQuiz08.groupSum6(0, new int[]{5, 6, 2}, 8));
        assertFalse(APQuiz08.groupSum6(0, new int[]{5, 6, 2}, 9));
        assertFalse(APQuiz08.groupSum6(0, new int[]{5, 6, 2}, 7));
        assertTrue(APQuiz08.groupSum6(0, new int[]{1}, 1));
        assertFalse(APQuiz08.groupSum6(0, new int[]{9}, 1));
        assertTrue(APQuiz08.groupSum6(0, new int[]{}, 0));
        assertTrue(APQuiz08.groupSum6(0, new int[]{3, 2, 4, 6}, 8));
        assertTrue(APQuiz08.groupSum6(0, new int[]{6, 2, 4, 3}, 8));
        assertFalse(APQuiz08.groupSum6(0, new int[]{5, 2, 4, 6}, 9));
        assertFalse(APQuiz08.groupSum6(0, new int[]{6, 2, 4, 5}, 9));
        assertFalse(APQuiz08.groupSum6(0, new int[]{3, 2, 4, 6}, 3));
        assertTrue(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 12));
        assertTrue(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 13));
        assertFalse(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 4));
        assertFalse(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 4}, 9));
        assertTrue(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 14));
        assertTrue(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 15));
        assertFalse(APQuiz08.groupSum6(0, new int[]{1, 6, 2, 6, 5}, 16));
    }
}
