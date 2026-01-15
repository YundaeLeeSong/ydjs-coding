/**
INSTRUCTIONS: 
    The APQuiz03Test class provides JUnit tests for the methods 
    in the APQuiz03 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz03*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz03*.java
     kotlinc    -d out                                  APQuiz03*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz03Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz03Test {
    
    /**
     * < Q1 >
     * Tests the commonTwo method.
     */
    @Test
    public void testCommonTwo() {
        assertEquals(2, APQuiz03.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
        assertEquals(3, APQuiz03.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
        assertEquals(3, APQuiz03.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
        assertEquals(3, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"}));
        assertEquals(3, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
        assertEquals(3, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "c", "c"}));
        assertEquals(2, APQuiz03.commonTwo(new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
        assertEquals(4, APQuiz03.commonTwo(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"}));
        assertEquals(1, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b"}));
        assertEquals(1, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"}));
        assertEquals(1, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b", "x"}));
        assertEquals(1, APQuiz03.commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"}));
        assertEquals(1, APQuiz03.commonTwo(new String[]{"a"}, new String[]{"a", "b"}));
        assertEquals(0, APQuiz03.commonTwo(new String[]{"a"}, new String[]{"b"}));
        assertEquals(0, APQuiz03.commonTwo(new String[]{"a", "a"}, new String[]{"b", "b"}));
        assertEquals(2, APQuiz03.commonTwo(new String[]{"a", "b"}, new String[]{"a", "b"}));
    }

    /**
     * < Q2 >
     * Tests the doubleChar method.
     */
    @Test
    public void testDoubleChar() {
        assertEquals("TThhee", APQuiz03.doubleChar("The"));
        assertEquals("AAAAbbbb", APQuiz03.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", APQuiz03.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", APQuiz03.doubleChar("Word!"));
        assertEquals("!!!!", APQuiz03.doubleChar("!!"));
        assertEquals("))", APQuiz03.doubleChar(")"));
        assertEquals("aa", APQuiz03.doubleChar("a"));
        assertEquals("..", APQuiz03.doubleChar("."));
        assertEquals("aaaa", APQuiz03.doubleChar("aa"));
    }

    /**
     * < Q3 >
     * Tests the countHi method.
     */
    @Test
    public void testCountHi() {
        assertEquals(1, APQuiz03.countHi("abc hi ho"));
        assertEquals(2, APQuiz03.countHi("ABChi hi"));
        assertEquals(2, APQuiz03.countHi("hihi"));
        assertEquals(2, APQuiz03.countHi("hiHIhi"));
        assertEquals(0, APQuiz03.countHi(""));
        assertEquals(0, APQuiz03.countHi("h"));
        assertEquals(1, APQuiz03.countHi("hi"));
        assertEquals(0, APQuiz03.countHi("Hi is no HI on ahI"));
        assertEquals(2, APQuiz03.countHi("hiho not HOHIhi"));
    }

    /**
     * < Q4 >
     * Tests the countEvens method.
     */
    @Test
    public void testCountEvens() {
        assertEquals(3, APQuiz03.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, APQuiz03.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, APQuiz03.countEvens(new int[]{1, 3, 5}));
        assertEquals(0, APQuiz03.countEvens(new int[]{}));
        assertEquals(1, APQuiz03.countEvens(new int[]{11, 9, 0, 1}));
        assertEquals(2, APQuiz03.countEvens(new int[]{2, 11, 9, 0}));
        assertEquals(1, APQuiz03.countEvens(new int[]{2}));
        assertEquals(2, APQuiz03.countEvens(new int[]{2, 5, 12}));
    }

    /**
     * < Q5 >
     * Tests the bigDiff method.
     */
    @Test
    public void testBigDiff() {
        assertEquals(7, APQuiz03.bigDiff(new int[]{10, 3, 5, 6}));
        assertEquals(8, APQuiz03.bigDiff(new int[]{7, 2, 10, 9}));
        assertEquals(8, APQuiz03.bigDiff(new int[]{2, 10, 7, 2}));
        assertEquals(8, APQuiz03.bigDiff(new int[]{2, 10}));
        assertEquals(8, APQuiz03.bigDiff(new int[]{10, 2}));
        assertEquals(10, APQuiz03.bigDiff(new int[]{10, 0}));
        assertEquals(1, APQuiz03.bigDiff(new int[]{2, 3}));
        assertEquals(0, APQuiz03.bigDiff(new int[]{2, 2}));
        assertEquals(0, APQuiz03.bigDiff(new int[]{2}));
        assertEquals(8, APQuiz03.bigDiff(new int[]{5, 1, 6, 1, 9, 9}));
        assertEquals(3, APQuiz03.bigDiff(new int[]{7, 6, 8, 5}));
        assertEquals(3, APQuiz03.bigDiff(new int[]{7, 7, 6, 8, 5, 5, 6}));
    }

    /**
     * < Q6 >
     * Tests the centeredAverage method.
     */
    @Test
    public void testCenteredAverage() {
        assertEquals(3, APQuiz03.centeredAverage(new int[]{1, 2, 3, 4, 100}));
        assertEquals(5, APQuiz03.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7}));
        assertEquals(-3, APQuiz03.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0}));
        assertEquals(4, APQuiz03.centeredAverage(new int[]{5, 3, 4, 6, 2}));
        assertEquals(4, APQuiz03.centeredAverage(new int[]{5, 3, 4, 0, 100}));
        assertEquals(4, APQuiz03.centeredAverage(new int[]{100, 0, 5, 3, 4}));
        assertEquals(4, APQuiz03.centeredAverage(new int[]{4, 0, 100}));
        assertEquals(3, APQuiz03.centeredAverage(new int[]{0, 2, 3, 4, 100}));
        assertEquals(1, APQuiz03.centeredAverage(new int[]{1, 1, 100}));
        assertEquals(7, APQuiz03.centeredAverage(new int[]{7, 7, 7}));
        assertEquals(7, APQuiz03.centeredAverage(new int[]{1, 7, 8}));
        assertEquals(50, APQuiz03.centeredAverage(new int[]{1, 1, 99, 99}));
        assertEquals(50, APQuiz03.centeredAverage(new int[]{1000, 0, 1, 99}));
        assertEquals(4, APQuiz03.centeredAverage(new int[]{4, 4, 4, 4, 5}));
        assertEquals(4, APQuiz03.centeredAverage(new int[]{4, 4, 4, 1, 5}));
        assertEquals(6, APQuiz03.centeredAverage(new int[]{6, 4, 8, 12, 3}));
    }

    /**
     * < Q7 >
     * Tests the makeBricks method.
     */
    @Test
    public void testMakeBricks() {
        assertTrue(APQuiz03.makeBricks(3, 1, 8));
        assertFalse(APQuiz03.makeBricks(3, 1, 9));
        assertTrue(APQuiz03.makeBricks(3, 2, 10));
        assertTrue(APQuiz03.makeBricks(3, 2, 8));
        assertFalse(APQuiz03.makeBricks(3, 2, 9));
        assertTrue(APQuiz03.makeBricks(6, 1, 11));
        assertFalse(APQuiz03.makeBricks(6, 0, 11));
        assertTrue(APQuiz03.makeBricks(1, 4, 11));
        assertTrue(APQuiz03.makeBricks(0, 3, 10));
        assertFalse(APQuiz03.makeBricks(1, 4, 12));
        assertTrue(APQuiz03.makeBricks(3, 1, 7));
        assertFalse(APQuiz03.makeBricks(1, 1, 7));
        assertTrue(APQuiz03.makeBricks(2, 1, 7));
        assertTrue(APQuiz03.makeBricks(7, 1, 11));
        assertTrue(APQuiz03.makeBricks(7, 1, 8));
        assertFalse(APQuiz03.makeBricks(7, 1, 13));
        assertTrue(APQuiz03.makeBricks(43, 1, 46));
        assertFalse(APQuiz03.makeBricks(40, 1, 46));
        assertTrue(APQuiz03.makeBricks(40, 2, 47));
        assertTrue(APQuiz03.makeBricks(40, 2, 50));
        assertFalse(APQuiz03.makeBricks(40, 2, 52));
        assertFalse(APQuiz03.makeBricks(22, 2, 33));
        assertTrue(APQuiz03.makeBricks(0, 2, 10));
        assertTrue(APQuiz03.makeBricks(1000000, 1000, 1000100));
        assertFalse(APQuiz03.makeBricks(2, 1000000, 100003));
        assertTrue(APQuiz03.makeBricks(20, 0, 19));
        assertFalse(APQuiz03.makeBricks(20, 0, 21));
        assertFalse(APQuiz03.makeBricks(20, 4, 51));
        assertTrue(APQuiz03.makeBricks(20, 4, 39));
    }

    /**
     * < Q8 >
     * Tests the countYZ method.
     */
    @Test
    public void testCountYZ() {
        assertEquals(2, APQuiz03.countYZ("fez day"));
        assertEquals(2, APQuiz03.countYZ("day fez"));
        assertEquals(2, APQuiz03.countYZ("day fyyyz"));
        assertEquals(1, APQuiz03.countYZ("day yak"));
        assertEquals(1, APQuiz03.countYZ("day:yak"));
        assertEquals(2, APQuiz03.countYZ("!!day--yaz!!"));
        assertEquals(0, APQuiz03.countYZ("yak zak"));
        assertEquals(2, APQuiz03.countYZ("DAY abc XYZ"));
        assertEquals(3, APQuiz03.countYZ("aaz yyz my"));
        assertEquals(2, APQuiz03.countYZ("y2bz"));
        assertEquals(0, APQuiz03.countYZ("zxyx"));
    }

    /**
     * < Q9 >
     * Tests the maxSpan method.
     */
    @Test
    public void testMaxSpan() {
        assertEquals(4, APQuiz03.maxSpan(new int[]{1, 2, 1, 1, 3}));
        assertEquals(6, APQuiz03.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, APQuiz03.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        assertEquals(3, APQuiz03.maxSpan(new int[]{3, 3, 3}));
        assertEquals(3, APQuiz03.maxSpan(new int[]{3, 9, 3}));
        assertEquals(2, APQuiz03.maxSpan(new int[]{3, 9, 9}));
        assertEquals(1, APQuiz03.maxSpan(new int[]{3, 9}));
        assertEquals(2, APQuiz03.maxSpan(new int[]{3, 3}));
        assertEquals(0, APQuiz03.maxSpan(new int[]{}));
        assertEquals(1, APQuiz03.maxSpan(new int[]{1}));
    }

    /**
     * < Q10 >
     * Tests the catDog method.
     */
    @Test
    public void testCatDog() {
        assertTrue(APQuiz03.catDog("catdog"));
        assertFalse(APQuiz03.catDog("catcat"));
        assertTrue(APQuiz03.catDog("1cat1cadodog"));
        assertFalse(APQuiz03.catDog("catxxdogxxxdog"));
        assertTrue(APQuiz03.catDog("catxdogxdogxcat"));
        assertFalse(APQuiz03.catDog("catxdogxdogxca"));
        assertFalse(APQuiz03.catDog("dogdogcat"));
        assertTrue(APQuiz03.catDog("dogogcat"));
        assertFalse(APQuiz03.catDog("dog"));
        assertFalse(APQuiz03.catDog("cat"));
        assertTrue(APQuiz03.catDog("ca"));
        assertTrue(APQuiz03.catDog("c"));
        assertTrue(APQuiz03.catDog(""));
    }

    /**
     * < Q11 >
     * Tests the powerN method.
     */
    @Test
    public void testPowerN() {
        assertEquals(3, APQuiz03.powerN(3, 1));
        assertEquals(9, APQuiz03.powerN(3, 2));
        assertEquals(27, APQuiz03.powerN(3, 3));
        assertEquals(2, APQuiz03.powerN(2, 1));
        assertEquals(4, APQuiz03.powerN(2, 2));
        assertEquals(8, APQuiz03.powerN(2, 3));
        assertEquals(16, APQuiz03.powerN(2, 4));
        assertEquals(32, APQuiz03.powerN(2, 5));
        assertEquals(10, APQuiz03.powerN(10, 1));
        assertEquals(100, APQuiz03.powerN(10, 2));
        assertEquals(1000, APQuiz03.powerN(10, 3));
    }

    /**
     * < Q12 >
     * Tests the countX method.
     */
    @Test
    public void testCountX() {
        assertEquals(4, APQuiz03.countX("xxhixx"));
        assertEquals(3, APQuiz03.countX("xhixhix"));
        assertEquals(0, APQuiz03.countX("hi"));
        assertEquals(0, APQuiz03.countX("h"));
        assertEquals(1, APQuiz03.countX("x"));
        assertEquals(0, APQuiz03.countX(""));
        assertEquals(0, APQuiz03.countX("hihi"));
        assertEquals(0, APQuiz03.countX("hiAAhi12hi"));
    }

    /**
     * < Q13 >
     * Tests the countHiRecursive method.
     */
    @Test
    public void testCountHiRecursive() {
        assertEquals(1, APQuiz03.countHiRecursive("xxhixx"));
        assertEquals(2, APQuiz03.countHiRecursive("xhixhix"));
        assertEquals(1, APQuiz03.countHiRecursive("hi"));
        assertEquals(2, APQuiz03.countHiRecursive("hihih"));
        assertEquals(0, APQuiz03.countHiRecursive("h"));
        assertEquals(0, APQuiz03.countHiRecursive(""));
        assertEquals(4, APQuiz03.countHiRecursive("ihihihihih"));
        assertEquals(5, APQuiz03.countHiRecursive("ihihihihihi"));
        assertEquals(3, APQuiz03.countHiRecursive("hiAAhi12hi"));
        assertEquals(3, APQuiz03.countHiRecursive("xhixhxihihhhih"));
        assertEquals(1, APQuiz03.countHiRecursive("ship"));
    }

    /**
     * < Q14 >
     * Tests the changeXY method.
     */
    @Test
    public void testChangeXY() {
        assertEquals("codey", APQuiz03.changeXY("codex"));
        assertEquals("yyhiyy", APQuiz03.changeXY("xxhixx"));
        assertEquals("yhiyhiy", APQuiz03.changeXY("xhixhix"));
        assertEquals("hiy", APQuiz03.changeXY("hiy"));
        assertEquals("h", APQuiz03.changeXY("h"));
        assertEquals("y", APQuiz03.changeXY("x"));
        assertEquals("", APQuiz03.changeXY(""));
        assertEquals("yyy", APQuiz03.changeXY("xxx"));
        assertEquals("yyhyyi", APQuiz03.changeXY("yyhxyi"));
        assertEquals("hihi", APQuiz03.changeXY("hihi"));
    }
}
