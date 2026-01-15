/**
INSTRUCTIONS: 
    The APQuiz06Test class provides JUnit tests for the methods 
    in the APQuiz06 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz06*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz06*.java
     kotlinc    -d out                                  APQuiz06*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz06Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz06Test {
    
    /**
     * < Q1 >
     * Tests the gHappy method.
     */
    @Test
    public void testGHappy() {
        assertTrue(APQuiz06.gHappy("xxggxx"));
        assertFalse(APQuiz06.gHappy("xxgxx"));
        assertFalse(APQuiz06.gHappy("xxggyygxx"));
        assertFalse(APQuiz06.gHappy("g"));
        assertTrue(APQuiz06.gHappy("gg"));
        assertTrue(APQuiz06.gHappy(""));
        assertTrue(APQuiz06.gHappy("xxgggxyz"));
        assertFalse(APQuiz06.gHappy("xxgggxyg"));
        assertTrue(APQuiz06.gHappy("xxgggxygg"));
        assertFalse(APQuiz06.gHappy("mgm"));
        assertTrue(APQuiz06.gHappy("mggm"));
        assertTrue(APQuiz06.gHappy("yyygggxyy"));
    }

    /**
     * < Q2 >
     * Tests the canBalance method.
     */
    @Test
    public void testCanBalance() {
        assertTrue(APQuiz06.canBalance(new int[]{1, 1, 1, 2, 1}));
        assertFalse(APQuiz06.canBalance(new int[]{2, 1, 1, 2, 1}));
        assertTrue(APQuiz06.canBalance(new int[]{10, 10}));
        assertTrue(APQuiz06.canBalance(new int[]{10, 0, 1, -1, 10}));
        assertTrue(APQuiz06.canBalance(new int[]{1, 1, 1, 1, 4}));
        assertFalse(APQuiz06.canBalance(new int[]{2, 1, 1, 1, 4}));
        assertFalse(APQuiz06.canBalance(new int[]{2, 3, 4, 1, 2}));
        assertTrue(APQuiz06.canBalance(new int[]{1, 2, 3, 1, 0, 2, 3}));
        assertFalse(APQuiz06.canBalance(new int[]{1, 2, 3, 1, 0, 1, 3}));
        assertFalse(APQuiz06.canBalance(new int[]{1}));
    }

    /**
     * < Q3 >
     * Tests the no14 method.
     */
    @Test
    public void testNo14() {
        assertTrue(APQuiz06.no14(new int[]{1, 2, 3}));
        assertFalse(APQuiz06.no14(new int[]{1, 2, 3, 4}));
        assertTrue(APQuiz06.no14(new int[]{2, 3, 4}));
        assertFalse(APQuiz06.no14(new int[]{1, 1, 4, 4}));
        assertTrue(APQuiz06.no14(new int[]{2, 2, 4, 4}));
        assertFalse(APQuiz06.no14(new int[]{2, 3, 4, 1}));
        assertTrue(APQuiz06.no14(new int[]{2, 1, 1}));
        assertFalse(APQuiz06.no14(new int[]{1, 4}));
        assertTrue(APQuiz06.no14(new int[]{2}));
        assertTrue(APQuiz06.no14(new int[]{2, 1}));
        assertTrue(APQuiz06.no14(new int[]{1}));
        assertTrue(APQuiz06.no14(new int[]{4}));
        assertTrue(APQuiz06.no14(new int[]{}));
        assertTrue(APQuiz06.no14(new int[]{1, 1, 1, 1}));
        assertFalse(APQuiz06.no14(new int[]{9, 4, 4, 1}));
        assertFalse(APQuiz06.no14(new int[]{4, 2, 3, 1}));
        assertTrue(APQuiz06.no14(new int[]{4, 2, 3, 5}));
        assertTrue(APQuiz06.no14(new int[]{4, 4, 2}));
        assertFalse(APQuiz06.no14(new int[]{1, 4, 4}));
    }

    /**
     * < Q4 >
     * Tests the isEverywhere method.
     */
    @Test
    public void testIsEverywhere() {
        assertTrue(APQuiz06.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(APQuiz06.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(APQuiz06.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
        assertTrue(APQuiz06.isEverywhere(new int[]{2, 1, 2, 1}, 1));
        assertTrue(APQuiz06.isEverywhere(new int[]{2, 1, 2, 1}, 2));
        assertFalse(APQuiz06.isEverywhere(new int[]{2, 1, 2, 3, 1}, 2));
        assertTrue(APQuiz06.isEverywhere(new int[]{3, 1}, 3));
        assertFalse(APQuiz06.isEverywhere(new int[]{3, 1}, 2));
        assertTrue(APQuiz06.isEverywhere(new int[]{3}, 1));
        assertTrue(APQuiz06.isEverywhere(new int[]{}, 1));
        assertTrue(APQuiz06.isEverywhere(new int[]{1, 2, 1, 2, 3, 2, 5}, 2));
        assertFalse(APQuiz06.isEverywhere(new int[]{1, 2, 1, 1, 1, 2}, 2));
        assertFalse(APQuiz06.isEverywhere(new int[]{2, 1, 2, 1, 1, 2}, 2));
        assertFalse(APQuiz06.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2));
        assertTrue(APQuiz06.isEverywhere(new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2));
        assertTrue(APQuiz06.isEverywhere(new int[]{2, 1, 2, 1, 2}, 2));
    }

    /**
     * < Q5 >
     * Tests the repeatEnd method.
     */
    @Test
    public void testRepeatEnd() {
        assertEquals("llollollo", APQuiz06.repeatEnd("Hello", 3));
        assertEquals("lolo", APQuiz06.repeatEnd("Hello", 2));
        assertEquals("o", APQuiz06.repeatEnd("Hello", 1));
        assertEquals("", APQuiz06.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", APQuiz06.repeatEnd("abc", 3));
        assertEquals("3434", APQuiz06.repeatEnd("1234", 2));
        assertEquals("234234234", APQuiz06.repeatEnd("1234", 3));
        assertEquals("", APQuiz06.repeatEnd("", 0));
    }

    /**
     * < Q6 >
     * Tests the mixString method.
     */
    @Test
    public void testMixString() {
        assertEquals("axbycz", APQuiz06.mixString("abc", "xyz"));
        assertEquals("HTihere", APQuiz06.mixString("Hi", "There"));
        assertEquals("xTxhxexre", APQuiz06.mixString("xxxx", "There"));
        assertEquals("xXxx", APQuiz06.mixString("xxx", "X"));
        assertEquals("22/7 around", APQuiz06.mixString("2/", "27 around"));
        assertEquals("Hello", APQuiz06.mixString("", "Hello"));
        assertEquals("Abc", APQuiz06.mixString("Abc", ""));
        assertEquals("", APQuiz06.mixString("", ""));
        assertEquals("ab", APQuiz06.mixString("a", "b"));
        assertEquals("abx", APQuiz06.mixString("ax", "b"));
        assertEquals("abx", APQuiz06.mixString("a", "bx"));
        assertEquals("SLoong", APQuiz06.mixString("So", "Long"));
        assertEquals("LSoong", APQuiz06.mixString("Long", "So"));
    }

    /**
     * < Q7 >
     * Tests the xyBalance method.
     */
    @Test
    public void testXyBalance() {
        assertTrue(APQuiz06.xyBalance("aaxbby"));
        assertFalse(APQuiz06.xyBalance("aaxbb"));
        assertFalse(APQuiz06.xyBalance("yaaxbb"));
        assertTrue(APQuiz06.xyBalance("yaaxbby"));
        assertTrue(APQuiz06.xyBalance("xaxxbby"));
        assertFalse(APQuiz06.xyBalance("xaxxbbyx"));
        assertTrue(APQuiz06.xyBalance("xxbxy"));
        assertFalse(APQuiz06.xyBalance("xxbx"));
        assertTrue(APQuiz06.xyBalance("bbb"));
        assertFalse(APQuiz06.xyBalance("bxbb"));
        assertTrue(APQuiz06.xyBalance("bxyb"));
        assertTrue(APQuiz06.xyBalance("xy"));
        assertTrue(APQuiz06.xyBalance("y"));
        assertFalse(APQuiz06.xyBalance("x"));
        assertTrue(APQuiz06.xyBalance(""));
        assertFalse(APQuiz06.xyBalance("yxyxyxyx"));
        assertTrue(APQuiz06.xyBalance("yxyxyxyxy"));
        assertTrue(APQuiz06.xyBalance("12xabxxydxyxyzz"));
    }

    /**
     * < Q8 >
     * Tests the bobThere method.
     */
    @Test
    public void testBobThere() {
        assertTrue(APQuiz06.bobThere("abcbob"));
        assertTrue(APQuiz06.bobThere("b9b"));
        assertFalse(APQuiz06.bobThere("bac"));
        assertTrue(APQuiz06.bobThere("bbb"));
        assertFalse(APQuiz06.bobThere("abcdefb"));
        assertTrue(APQuiz06.bobThere("123abcbcdbabxyz"));
        assertFalse(APQuiz06.bobThere("b12"));
        assertTrue(APQuiz06.bobThere("b1b"));
        assertTrue(APQuiz06.bobThere("b12b1b"));
        assertFalse(APQuiz06.bobThere("bbc"));
        assertFalse(APQuiz06.bobThere("bb"));
        assertFalse(APQuiz06.bobThere("b"));
    }

    /**
     * < Q9 >
     * Tests the roundSum method.
     */
    @Test
    public void testRoundSum() {
        assertEquals(60, APQuiz06.roundSum(16, 17, 18));
        assertEquals(30, APQuiz06.roundSum(12, 13, 14));
        assertEquals(10, APQuiz06.roundSum(6, 4, 4));
        assertEquals(20, APQuiz06.roundSum(4, 6, 5));
        assertEquals(10, APQuiz06.roundSum(4, 4, 6));
        assertEquals(10, APQuiz06.roundSum(9, 4, 4));
        assertEquals(0, APQuiz06.roundSum(0, 0, 1));
        assertEquals(10, APQuiz06.roundSum(0, 9, 0));
        assertEquals(40, APQuiz06.roundSum(10, 10, 19));
        assertEquals(90, APQuiz06.roundSum(20, 30, 40));
        assertEquals(100, APQuiz06.roundSum(45, 21, 30));
        assertEquals(60, APQuiz06.roundSum(23, 11, 26));
        assertEquals(70, APQuiz06.roundSum(23, 24, 25));
        assertEquals(80, APQuiz06.roundSum(25, 24, 25));
        assertEquals(70, APQuiz06.roundSum(23, 24, 29));
        assertEquals(70, APQuiz06.roundSum(11, 24, 36));
        assertEquals(90, APQuiz06.roundSum(24, 36, 32));
        assertEquals(50, APQuiz06.roundSum(14, 12, 26));
        assertEquals(40, APQuiz06.roundSum(12, 10, 24));
    }

    /**
     * < Q10 >
     * Tests the countTriple method.
     */
    @Test
    public void testCountTriple() {
        assertEquals(1, APQuiz06.countTriple("abcXXXabc"));
        assertEquals(3, APQuiz06.countTriple("xxxabyyyycd"));
        assertEquals(0, APQuiz06.countTriple("a"));
        assertEquals(0, APQuiz06.countTriple(""));
        assertEquals(1, APQuiz06.countTriple("XXXabc"));
        assertEquals(2, APQuiz06.countTriple("XXXXabc"));
        assertEquals(3, APQuiz06.countTriple("XXXXXabc"));
        assertEquals(3, APQuiz06.countTriple("222abyyycdXXX"));
        assertEquals(4, APQuiz06.countTriple("abYYYabXXXXXab"));
        assertEquals(0, APQuiz06.countTriple("abYYXabXXYXXab"));
        assertEquals(1, APQuiz06.countTriple("122abhhh2"));
    }

    /**
     * < Q11 >
     * Tests the countPairs method.
     */
    @Test
    public void testCountPairs() {
        assertEquals(1, APQuiz06.countPairs("axa"));
        assertEquals(2, APQuiz06.countPairs("axax"));
        assertEquals(1, APQuiz06.countPairs("axbx"));
        assertEquals(0, APQuiz06.countPairs("hi"));
        assertEquals(3, APQuiz06.countPairs("hihih"));
        assertEquals(3, APQuiz06.countPairs("ihihhh"));
        assertEquals(0, APQuiz06.countPairs("ihjxhh"));
        assertEquals(0, APQuiz06.countPairs(""));
        assertEquals(0, APQuiz06.countPairs("a"));
        assertEquals(0, APQuiz06.countPairs("aa"));
        assertEquals(1, APQuiz06.countPairs("aaa"));
    }

    /**
     * < Q12 >
     * Tests the countAbc method.
     */
    @Test
    public void testCountAbc() {
        assertEquals(1, APQuiz06.countAbc("abc"));
        assertEquals(2, APQuiz06.countAbc("abcxxabc"));
        assertEquals(2, APQuiz06.countAbc("abaxxaba"));
        assertEquals(2, APQuiz06.countAbc("ababc"));
        assertEquals(0, APQuiz06.countAbc("abxbc"));
        assertEquals(1, APQuiz06.countAbc("aaabc"));
        assertEquals(0, APQuiz06.countAbc("hello"));
        assertEquals(0, APQuiz06.countAbc(""));
        assertEquals(0, APQuiz06.countAbc("ab"));
        assertEquals(1, APQuiz06.countAbc("aba"));
        assertEquals(0, APQuiz06.countAbc("aca"));
        assertEquals(0, APQuiz06.countAbc("aaa"));
    }

    /**
     * < Q13 >
     * Tests the count11 method.
     */
    @Test
    public void testCount11() {
        assertEquals(2, APQuiz06.count11("11abc11"));
        assertEquals(3, APQuiz06.count11("abc11x11x11"));
        assertEquals(1, APQuiz06.count11("111"));
        assertEquals(2, APQuiz06.count11("1111"));
        assertEquals(0, APQuiz06.count11("1"));
        assertEquals(0, APQuiz06.count11(""));
        assertEquals(0, APQuiz06.count11("hi"));
        assertEquals(4, APQuiz06.count11("11x111x1111"));
        assertEquals(1, APQuiz06.count11("1x111"));
        assertEquals(0, APQuiz06.count11("1Hello1"));
        assertEquals(0, APQuiz06.count11("Hello"));
    }

    /**
     * < Q14 >
     * Tests the stringClean method.
     */
    @Test
    public void testStringClean() {
        assertEquals("yza", APQuiz06.stringClean("yyzzza"));
        assertEquals("abcd", APQuiz06.stringClean("abbbcdd"));
        assertEquals("Helo", APQuiz06.stringClean("Hello"));
        assertEquals("XabcY", APQuiz06.stringClean("XXabcYY"));
        assertEquals("12ab45", APQuiz06.stringClean("112ab445"));
        assertEquals("Helo Bokeper", APQuiz06.stringClean("Hello Bookkeeper"));
    }
}
