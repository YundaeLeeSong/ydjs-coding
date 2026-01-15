/**
INSTRUCTIONS: 
    The APQuiz07Test class provides JUnit tests for the methods 
    in the APQuiz07 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz07*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz07*.java
     kotlinc    -d out                                  APQuiz07*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz07Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz07Test {
    
    /**
     * < Q1 >
     * Tests the sumDigits method.
     */
    @Test
    public void testSumDigits() {
        assertEquals(6, APQuiz07.sumDigits("aa1bc2d3"));
        assertEquals(8, APQuiz07.sumDigits("aa11b33"));
        assertEquals(0, APQuiz07.sumDigits("Chocolate"));
        assertEquals(7, APQuiz07.sumDigits("5hoco1a1e"));
        assertEquals(12, APQuiz07.sumDigits("123abc123"));
        assertEquals(0, APQuiz07.sumDigits(""));
        assertEquals(0, APQuiz07.sumDigits("Hello"));
        assertEquals(12, APQuiz07.sumDigits("X1z9b2"));
        assertEquals(14, APQuiz07.sumDigits("5432a"));
    }

    /**
     * < Q2 >
     * Tests the linearIn method.
     */
    @Test
    public void testLinearIn() {
        assertTrue(APQuiz07.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 4}));
        assertFalse(APQuiz07.linearIn(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}));
        assertTrue(APQuiz07.linearIn(new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}));
        assertTrue(APQuiz07.linearIn(new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4}));
        assertTrue(APQuiz07.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 2}));
        assertFalse(APQuiz07.linearIn(new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}));
        assertTrue(APQuiz07.linearIn(new int[]{2, 2, 2, 2, 4}, new int[]{2, 4}));
        assertTrue(APQuiz07.linearIn(new int[]{1, 2, 3}, new int[]{2}));
        assertFalse(APQuiz07.linearIn(new int[]{1, 2, 3}, new int[]{-1}));
        assertTrue(APQuiz07.linearIn(new int[]{1, 2, 3}, new int[]{}));
        assertTrue(APQuiz07.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}));
        assertFalse(APQuiz07.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14}));
        assertFalse(APQuiz07.linearIn(new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11}));
    }

    /**
     * < Q3 >
     * Tests the either24 method.
     */
    @Test
    public void testEither24() {
        assertTrue(APQuiz07.either24(new int[]{1, 2, 2}));
        assertTrue(APQuiz07.either24(new int[]{4, 4, 1}));
        assertFalse(APQuiz07.either24(new int[]{4, 4, 1, 2, 2}));
        assertFalse(APQuiz07.either24(new int[]{1, 2, 3, 4}));
        assertFalse(APQuiz07.either24(new int[]{3, 5, 9}));
        assertTrue(APQuiz07.either24(new int[]{1, 2, 3, 4, 4}));
        assertTrue(APQuiz07.either24(new int[]{2, 2, 3, 4}));
        assertTrue(APQuiz07.either24(new int[]{1, 2, 3, 2, 2, 4}));
        assertFalse(APQuiz07.either24(new int[]{1, 2, 3, 2, 2, 4, 4}));
        assertFalse(APQuiz07.either24(new int[]{1, 2}));
        assertTrue(APQuiz07.either24(new int[]{2, 2}));
        assertTrue(APQuiz07.either24(new int[]{4, 4}));
        assertFalse(APQuiz07.either24(new int[]{2}));
        assertFalse(APQuiz07.either24(new int[]{}));
    }

    /**
     * < Q4 >
     * Tests the matchUp method.
     */
    @Test
    public void testMatchUp() {
        assertEquals(2, APQuiz07.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
        assertEquals(3, APQuiz07.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
        assertEquals(2, APQuiz07.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
        assertEquals(1, APQuiz07.matchUp(new int[]{5, 3}, new int[]{5, 5}));
        assertEquals(2, APQuiz07.matchUp(new int[]{5, 3}, new int[]{4, 4}));
        assertEquals(1, APQuiz07.matchUp(new int[]{5, 3}, new int[]{3, 3}));
        assertEquals(1, APQuiz07.matchUp(new int[]{5, 3}, new int[]{2, 2}));
        assertEquals(1, APQuiz07.matchUp(new int[]{5, 3}, new int[]{1, 1}));
        assertEquals(0, APQuiz07.matchUp(new int[]{5, 3}, new int[]{0, 0}));
        assertEquals(0, APQuiz07.matchUp(new int[]{4}, new int[]{4}));
        assertEquals(1, APQuiz07.matchUp(new int[]{4}, new int[]{5}));
    }

    /**
     * < Q5 >
     * Tests the has77 method.
     */
    @Test
    public void testHas77() {
        assertTrue(APQuiz07.has77(new int[]{1, 7, 7}));
        assertTrue(APQuiz07.has77(new int[]{1, 7, 1, 7}));
        assertFalse(APQuiz07.has77(new int[]{1, 7, 1, 1, 7}));
        assertTrue(APQuiz07.has77(new int[]{7, 7, 1, 1, 7}));
        assertFalse(APQuiz07.has77(new int[]{2, 7, 2, 2, 7, 2}));
        assertTrue(APQuiz07.has77(new int[]{2, 7, 2, 2, 7, 7}));
        assertTrue(APQuiz07.has77(new int[]{7, 2, 7, 2, 2, 7}));
        assertFalse(APQuiz07.has77(new int[]{7, 2, 6, 2, 2, 7}));
        assertTrue(APQuiz07.has77(new int[]{7, 7, 7}));
        assertTrue(APQuiz07.has77(new int[]{7, 1, 7}));
        assertFalse(APQuiz07.has77(new int[]{7, 1, 1}));
        assertFalse(APQuiz07.has77(new int[]{1, 2}));
        assertFalse(APQuiz07.has77(new int[]{1, 7}));
        assertFalse(APQuiz07.has77(new int[]{7}));
    }

    /**
     * < Q6 >
     * Tests the has12 method.
     */
    @Test
    public void testHas12() {
        assertTrue(APQuiz07.has12(new int[]{1, 3, 2}));
        assertTrue(APQuiz07.has12(new int[]{3, 1, 2}));
        assertTrue(APQuiz07.has12(new int[]{3, 1, 4, 5, 2}));
        assertFalse(APQuiz07.has12(new int[]{3, 1, 4, 5, 6}));
        assertTrue(APQuiz07.has12(new int[]{3, 1, 4, 1, 6, 2}));
        assertTrue(APQuiz07.has12(new int[]{2, 1, 4, 1, 6, 2}));
        assertFalse(APQuiz07.has12(new int[]{2, 1, 4, 1, 6}));
        assertFalse(APQuiz07.has12(new int[]{1}));
        assertFalse(APQuiz07.has12(new int[]{2, 1, 3}));
        assertTrue(APQuiz07.has12(new int[]{2, 1, 3, 2}));
        assertFalse(APQuiz07.has12(new int[]{2}));
        assertFalse(APQuiz07.has12(new int[]{3, 2}));
        assertTrue(APQuiz07.has12(new int[]{3, 1, 3, 2}));
        assertFalse(APQuiz07.has12(new int[]{3, 5, 9}));
        assertFalse(APQuiz07.has12(new int[]{3, 5, 1}));
        assertFalse(APQuiz07.has12(new int[]{3, 2, 1}));
        assertTrue(APQuiz07.has12(new int[]{1, 2}));
    }

    /**
     * < Q7 >
     * Tests the modThree method.
     */
    @Test
    public void testModThree() {
        assertTrue(APQuiz07.modThree(new int[]{2, 1, 3, 5}));
        assertFalse(APQuiz07.modThree(new int[]{2, 1, 2, 5}));
        assertTrue(APQuiz07.modThree(new int[]{2, 4, 2, 5}));
        assertFalse(APQuiz07.modThree(new int[]{1, 2, 1, 2, 1}));
        assertTrue(APQuiz07.modThree(new int[]{9, 9, 9}));
        assertFalse(APQuiz07.modThree(new int[]{1, 2, 1}));
        assertFalse(APQuiz07.modThree(new int[]{1, 2}));
        assertFalse(APQuiz07.modThree(new int[]{1}));
        assertFalse(APQuiz07.modThree(new int[]{}));
        assertFalse(APQuiz07.modThree(new int[]{9, 7, 2, 9}));
        assertFalse(APQuiz07.modThree(new int[]{9, 7, 2, 9, 2, 2}));
        assertTrue(APQuiz07.modThree(new int[]{9, 7, 2, 9, 2, 2, 6}));
    }

    /**
     * < Q8 >
     * Tests the prefixAgain method.
     */
    @Test
    public void testPrefixAgain() {
        assertTrue(APQuiz07.prefixAgain("abXYabc", 1));
        assertTrue(APQuiz07.prefixAgain("abXYabc", 2));
        assertFalse(APQuiz07.prefixAgain("abXYabc", 3));
        assertTrue(APQuiz07.prefixAgain("xyzxyxyxy", 2));
        assertFalse(APQuiz07.prefixAgain("xyzxyxyxy", 3));
        assertTrue(APQuiz07.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertTrue(APQuiz07.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertTrue(APQuiz07.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertFalse(APQuiz07.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertFalse(APQuiz07.prefixAgain("a", 1));
        assertTrue(APQuiz07.prefixAgain("aa", 1));
        assertFalse(APQuiz07.prefixAgain("ab", 1));
    }

    /**
     * < Q9 >
     * Tests the xyzMiddle method.
     */
    @Test
    public void testXyzMiddle() {
        assertTrue(APQuiz07.xyzMiddle("AAxyzBB"));
        assertTrue(APQuiz07.xyzMiddle("AxyzBB"));
        assertFalse(APQuiz07.xyzMiddle("AxyzBBB"));
        assertFalse(APQuiz07.xyzMiddle("AxyzBBBB"));
        assertFalse(APQuiz07.xyzMiddle("AAAxyzB"));
        assertTrue(APQuiz07.xyzMiddle("AAAxyzBB"));
        assertFalse(APQuiz07.xyzMiddle("AAAAxyzBB"));
        assertFalse(APQuiz07.xyzMiddle("AAAAAxyzBBB"));
        assertTrue(APQuiz07.xyzMiddle("1x345xyz12x4"));
        assertTrue(APQuiz07.xyzMiddle("xyzAxyzBBB"));
        assertTrue(APQuiz07.xyzMiddle("xyzAxyzBxyz"));
        assertTrue(APQuiz07.xyzMiddle("xyzxyzAxyzBxyzxyz"));
        assertTrue(APQuiz07.xyzMiddle("xyzxyzxyzBxyzxyz"));
        assertTrue(APQuiz07.xyzMiddle("xyzxyzAxyzxyzxyz"));
        assertFalse(APQuiz07.xyzMiddle("xyzxyzAxyzxyzxy"));
        assertFalse(APQuiz07.xyzMiddle("AxyzxyzBB"));
        assertFalse(APQuiz07.xyzMiddle(""));
        assertFalse(APQuiz07.xyzMiddle("x"));
        assertFalse(APQuiz07.xyzMiddle("xy"));
        assertTrue(APQuiz07.xyzMiddle("xyz"));
        assertTrue(APQuiz07.xyzMiddle("xyzz"));
    }

    /**
     * < Q10 >
     * Tests the closeFar method.
     */
    @Test
    public void testCloseFar() {
        assertTrue(APQuiz07.closeFar(1, 2, 10));
        assertFalse(APQuiz07.closeFar(1, 2, 3));
        assertTrue(APQuiz07.closeFar(4, 1, 3));
        assertFalse(APQuiz07.closeFar(4, 5, 3));
        assertFalse(APQuiz07.closeFar(4, 3, 5));
        assertTrue(APQuiz07.closeFar(-1, 10, 0));
        assertTrue(APQuiz07.closeFar(0, -1, 10));
        assertTrue(APQuiz07.closeFar(10, 10, 8));
        assertFalse(APQuiz07.closeFar(10, 8, 9));
        assertFalse(APQuiz07.closeFar(8, 9, 10));
        assertFalse(APQuiz07.closeFar(8, 9, 7));
        assertTrue(APQuiz07.closeFar(8, 6, 9));
    }

    /**
     * < Q11 >
     * Tests the countHi2 method.
     */
    @Test
    public void testCountHi2() {
        assertEquals(1, APQuiz07.countHi2("ahixhi"));
        assertEquals(2, APQuiz07.countHi2("ahibhi"));
        assertEquals(0, APQuiz07.countHi2("xhixhi"));
        assertEquals(1, APQuiz07.countHi2("hixhi"));
        assertEquals(2, APQuiz07.countHi2("hixhhi"));
        assertEquals(3, APQuiz07.countHi2("hihihi"));
        assertEquals(3, APQuiz07.countHi2("hihihix"));
        assertEquals(2, APQuiz07.countHi2("xhihihix"));
        assertEquals(0, APQuiz07.countHi2("xxhi"));
        assertEquals(1, APQuiz07.countHi2("hixxhi"));
        assertEquals(1, APQuiz07.countHi2("hi"));
        assertEquals(0, APQuiz07.countHi2("xxxx"));
        assertEquals(0, APQuiz07.countHi2("h"));
        assertEquals(0, APQuiz07.countHi2("x"));
        assertEquals(0, APQuiz07.countHi2(""));
        assertEquals(1, APQuiz07.countHi2("Hellohi"));
    }

    /**
     * < Q12 >
     * Tests the parenBit method.
     */
    @Test
    public void testParenBit() {
        assertEquals("(abc)", APQuiz07.parenBit("xyz(abc)123"));
        assertEquals("(hello)", APQuiz07.parenBit("x(hello)"));
        assertEquals("(xy)", APQuiz07.parenBit("(xy)1"));
        assertEquals("(possible)", APQuiz07.parenBit("not really (possible)"));
        assertEquals("(abc)", APQuiz07.parenBit("(abc)"));
        assertEquals("(abc)", APQuiz07.parenBit("(abc)xyz"));
        assertEquals("(abc)", APQuiz07.parenBit("(abc)x"));
        assertEquals("(x)", APQuiz07.parenBit("(x)"));
        assertEquals("()", APQuiz07.parenBit("()"));
        assertEquals("(ipsa)", APQuiz07.parenBit("res (ipsa) loquitor"));
        assertEquals("(not really)", APQuiz07.parenBit("hello(not really)there"));
        assertEquals("(ab)", APQuiz07.parenBit("ab(ab)ab"));
    }

    /**
     * < Q13 >
     * Tests the nestParen method.
     */
    @Test
    public void testNestParen() {
        assertTrue(APQuiz07.nestParen("(())"));
        assertTrue(APQuiz07.nestParen("((()))"));
        assertFalse(APQuiz07.nestParen("(((x))"));
        assertFalse(APQuiz07.nestParen("((())"));
        assertTrue(APQuiz07.nestParen("()"));
        assertTrue(APQuiz07.nestParen(""));
        assertFalse(APQuiz07.nestParen("(yy)"));
        assertTrue(APQuiz07.nestParen("(())"));
        assertFalse(APQuiz07.nestParen("(((y))"));
        assertFalse(APQuiz07.nestParen("((y)))"));
        assertTrue(APQuiz07.nestParen("((()))"));
        assertFalse(APQuiz07.nestParen("(())))"));
        assertFalse(APQuiz07.nestParen("((yy())))"));
        assertTrue(APQuiz07.nestParen("(((())))"));
    }

    /**
     * < Q14 >
     * Tests the strCount method.
     */
    @Test
    public void testStrCount() {
        assertEquals(2, APQuiz07.strCount("catcowcat", "cat"));
        assertEquals(1, APQuiz07.strCount("catcowcat", "cow"));
        assertEquals(0, APQuiz07.strCount("catcowcat", "dog"));
        assertEquals(2, APQuiz07.strCount("cacatcowcat", "cat"));
        assertEquals(2, APQuiz07.strCount("xyx", "x"));
        assertEquals(4, APQuiz07.strCount("iiiijj", "i"));
        assertEquals(2, APQuiz07.strCount("iiiijj", "ii"));
        assertEquals(1, APQuiz07.strCount("iiiijj", "iii"));
        assertEquals(2, APQuiz07.strCount("iiiijj", "j"));
        assertEquals(1, APQuiz07.strCount("iiiijj", "jj"));
        assertEquals(4, APQuiz07.strCount("aaabababab", "ab"));
        assertEquals(1, APQuiz07.strCount("aaabababab", "aa"));
        assertEquals(6, APQuiz07.strCount("aaabababab", "a"));
        assertEquals(4, APQuiz07.strCount("aaabababab", "b"));
    }
}
