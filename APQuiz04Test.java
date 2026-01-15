/**
INSTRUCTIONS: 
    The APQuiz04Test class provides JUnit tests for the methods 
    in the APQuiz04 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz04*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz04*.java
     kotlinc    -d out                                  APQuiz04*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz04Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz04Test {
    
    /**
     * < Q1 >
     * Tests the countCode method.
     */
    @Test
    public void testCountCode() {
        assertEquals(1, APQuiz04.countCode("aaacodebbb"));
        assertEquals(2, APQuiz04.countCode("codexxcode"));
        assertEquals(2, APQuiz04.countCode("cozexxcope"));
        assertEquals(1, APQuiz04.countCode("cozfxxcope"));
        assertEquals(1, APQuiz04.countCode("xxcozeyycop"));
        assertEquals(0, APQuiz04.countCode("cozcop"));
        assertEquals(0, APQuiz04.countCode("abcxyz"));
        assertEquals(1, APQuiz04.countCode("code"));
        assertEquals(0, APQuiz04.countCode("ode"));
        assertEquals(0, APQuiz04.countCode("c"));
        assertEquals(0, APQuiz04.countCode(""));
        assertEquals(3, APQuiz04.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, APQuiz04.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, APQuiz04.countCode("coAcodeBcoleccoreDD"));
    }

    /**
     * < Q2 >
     * Tests the sum13 method.
     */
    @Test
    public void testSum13() {
        assertEquals(6, APQuiz04.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(2, APQuiz04.sum13(new int[]{1, 1}));
        assertEquals(6, APQuiz04.sum13(new int[]{1, 2, 2, 1, 13}));
        assertEquals(4, APQuiz04.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        assertEquals(3, APQuiz04.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
        assertEquals(0, APQuiz04.sum13(new int[]{}));
        assertEquals(0, APQuiz04.sum13(new int[]{13}));
        assertEquals(0, APQuiz04.sum13(new int[]{13, 13}));
        assertEquals(0, APQuiz04.sum13(new int[]{13, 0, 13}));
        assertEquals(0, APQuiz04.sum13(new int[]{13, 1, 13}));
        assertEquals(14, APQuiz04.sum13(new int[]{5, 7, 2}));
        assertEquals(5, APQuiz04.sum13(new int[]{5, 13, 2}));
        assertEquals(0, APQuiz04.sum13(new int[]{0}));
        assertEquals(0, APQuiz04.sum13(new int[]{13, 0}));
    }

    /**
     * < Q3 >
     * Tests the has22 method.
     */
    @Test
    public void testHas22() {
        assertTrue(APQuiz04.has22(new int[]{1, 2, 2}));
        assertFalse(APQuiz04.has22(new int[]{1, 2, 1, 2}));
        assertFalse(APQuiz04.has22(new int[]{2, 1, 2}));
        assertTrue(APQuiz04.has22(new int[]{2, 2, 1, 2}));
        assertFalse(APQuiz04.has22(new int[]{1, 3, 2}));
        assertTrue(APQuiz04.has22(new int[]{1, 3, 2, 2}));
        assertTrue(APQuiz04.has22(new int[]{2, 3, 2, 2}));
        assertTrue(APQuiz04.has22(new int[]{4, 2, 4, 2, 2, 5}));
        assertFalse(APQuiz04.has22(new int[]{1, 2}));
        assertTrue(APQuiz04.has22(new int[]{2, 2}));
        assertFalse(APQuiz04.has22(new int[]{2}));
        assertFalse(APQuiz04.has22(new int[]{}));
        assertTrue(APQuiz04.has22(new int[]{3, 3, 2, 2}));
        assertFalse(APQuiz04.has22(new int[]{5, 2, 5, 2}));
    }

    /**
     * < Q4 >
     * Tests the loneSum method.
     */
    @Test
    public void testLoneSum() {
        assertEquals(6, APQuiz04.loneSum(1, 2, 3));
        assertEquals(2, APQuiz04.loneSum(3, 2, 3));
        assertEquals(0, APQuiz04.loneSum(3, 3, 3));
        assertEquals(9, APQuiz04.loneSum(9, 2, 2));
        assertEquals(9, APQuiz04.loneSum(2, 2, 9));
        assertEquals(9, APQuiz04.loneSum(2, 9, 2));
        assertEquals(14, APQuiz04.loneSum(2, 9, 3));
        assertEquals(9, APQuiz04.loneSum(4, 2, 3));
        assertEquals(3, APQuiz04.loneSum(1, 3, 1));
    }

    /**
     * < Q5 >
     * Tests the withoutString method.
     */
    @Test
    public void testWithoutString() {
        assertEquals("He there", APQuiz04.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", APQuiz04.withoutString("Hello there", "e"));
        assertEquals("Hello there", APQuiz04.withoutString("Hello there", "x"));
        assertEquals("Th  a FH", APQuiz04.withoutString("This is a FISH", "IS"));
        assertEquals("TH  a FH", APQuiz04.withoutString("THIS is a FISH", "is"));
        assertEquals("abab", APQuiz04.withoutString("abxxxxab", "xx"));
        assertEquals("abxab", APQuiz04.withoutString("abxxxab", "xx"));
        assertEquals("abab", APQuiz04.withoutString("abxxxab", "x"));
        assertEquals("", APQuiz04.withoutString("xxx", "x"));
        assertEquals("x", APQuiz04.withoutString("xxx", "xx"));
        assertEquals("xzz", APQuiz04.withoutString("xyzzy", "Y"));
        assertEquals("", APQuiz04.withoutString("", "x"));
        assertEquals("acac", APQuiz04.withoutString("abcabc", "b"));
        assertEquals("AAbb", APQuiz04.withoutString("AA22bb", "2"));
        assertEquals("", APQuiz04.withoutString("1111", "1"));
        assertEquals("", APQuiz04.withoutString("1111", "11"));
        assertEquals("jtx", APQuiz04.withoutString("MkjtMkx", "Mk"));
        assertEquals("Hi ", APQuiz04.withoutString("Hi HoHo", "Ho"));
    }

    /**
     * < Q6 >
     * Tests the fix34 method.
     */
    @Test
    public void testFix34() {
        assertArrayEquals(new int[]{1, 3, 4, 1}, APQuiz04.fix34(new int[]{1, 3, 1, 4}));
        assertArrayEquals(new int[]{1, 3, 4, 1, 1, 3, 4}, APQuiz04.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));
        assertArrayEquals(new int[]{3, 4, 2, 2}, APQuiz04.fix34(new int[]{3, 2, 2, 4}));
        assertArrayEquals(new int[]{3, 4, 3, 4, 2, 2}, APQuiz04.fix34(new int[]{3, 2, 3, 2, 4, 4}));
        assertArrayEquals(new int[]{2, 3, 4, 3, 4, 2, 2}, APQuiz04.fix34(new int[]{2, 3, 2, 3, 2, 4, 4}));
        assertArrayEquals(new int[]{5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}, APQuiz04.fix34(new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5}));
        assertArrayEquals(new int[]{3, 4, 1}, APQuiz04.fix34(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{3, 4, 1}, APQuiz04.fix34(new int[]{3, 4, 1}));
        assertArrayEquals(new int[]{1, 1, 1}, APQuiz04.fix34(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{1}, APQuiz04.fix34(new int[]{1}));
        assertArrayEquals(new int[]{}, APQuiz04.fix34(new int[]{}));
        assertArrayEquals(new int[]{7, 3, 4, 7, 7}, APQuiz04.fix34(new int[]{7, 3, 7, 7, 4}));
        assertArrayEquals(new int[]{3, 4, 1, 3, 4, 1}, APQuiz04.fix34(new int[]{3, 1, 4, 3, 1, 4}));
        assertArrayEquals(new int[]{3, 4, 1, 3, 4, 1}, APQuiz04.fix34(new int[]{3, 1, 1, 3, 4, 4}));
    }

    /**
     * < Q7 >
     * Tests the endOther method.
     */
    @Test
    public void testEndOther() {
        assertTrue(APQuiz04.endOther("Hiabc", "abc"));
        assertTrue(APQuiz04.endOther("AbC", "HiaBc"));
        assertTrue(APQuiz04.endOther("abc", "abXabc"));
        assertFalse(APQuiz04.endOther("Hiabc", "abcd"));
        assertTrue(APQuiz04.endOther("Hiabc", "bc"));
        assertFalse(APQuiz04.endOther("Hiabcx", "bc"));
        assertTrue(APQuiz04.endOther("abc", "abc"));
        assertTrue(APQuiz04.endOther("xyz", "12xyz"));
        assertFalse(APQuiz04.endOther("yz", "12xz"));
        assertTrue(APQuiz04.endOther("Z", "12xz"));
        assertTrue(APQuiz04.endOther("12", "12"));
        assertFalse(APQuiz04.endOther("abcXYZ", "abcDEF"));
        assertFalse(APQuiz04.endOther("ab", "ab12"));
        assertTrue(APQuiz04.endOther("ab", "12ab"));
    }

    /**
     * < Q8 >
     * Tests the xyzThere method.
     */
    @Test
    public void testXyzThere() {
        assertTrue(APQuiz04.xyzThere("abcxyz"));
        assertFalse(APQuiz04.xyzThere("abc.xyz"));
        assertTrue(APQuiz04.xyzThere("xyz.abc"));
        assertFalse(APQuiz04.xyzThere("abcxy"));
        assertTrue(APQuiz04.xyzThere("xyz"));
        assertFalse(APQuiz04.xyzThere("xy"));
        assertFalse(APQuiz04.xyzThere("x"));
        assertFalse(APQuiz04.xyzThere(""));
        assertTrue(APQuiz04.xyzThere("abc.xyzxyz"));
        assertTrue(APQuiz04.xyzThere("abc.xxyz"));
        assertFalse(APQuiz04.xyzThere(".xyz"));
        assertFalse(APQuiz04.xyzThere("12.xyz"));
        assertTrue(APQuiz04.xyzThere("12xyz"));
        assertFalse(APQuiz04.xyzThere("1.xyz.xyz2.xyz"));
    }

    /**
     * < Q9 >
     * Tests the lucky13 method.
     */
    @Test
    public void testLucky13() {
        assertTrue(APQuiz04.lucky13(new int[]{0, 2, 4}));
        assertFalse(APQuiz04.lucky13(new int[]{1, 2, 3}));
        assertFalse(APQuiz04.lucky13(new int[]{1, 2, 4}));
        assertTrue(APQuiz04.lucky13(new int[]{2, 7, 2, 8}));
        assertFalse(APQuiz04.lucky13(new int[]{2, 7, 1, 8}));
        assertFalse(APQuiz04.lucky13(new int[]{3, 7, 2, 8}));
        assertFalse(APQuiz04.lucky13(new int[]{2, 7, 2, 1}));
        assertFalse(APQuiz04.lucky13(new int[]{1, 2}));
        assertTrue(APQuiz04.lucky13(new int[]{2, 2}));
        assertTrue(APQuiz04.lucky13(new int[]{2}));
        assertFalse(APQuiz04.lucky13(new int[]{3}));
        assertTrue(APQuiz04.lucky13(new int[]{}));
    }

    /**
     * < Q10 >
     * Tests the sum28 method.
     */
    @Test
    public void testSum28() {
        assertTrue(APQuiz04.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertFalse(APQuiz04.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertFalse(APQuiz04.sum28(new int[]{1, 2, 3, 4}));
        assertTrue(APQuiz04.sum28(new int[]{2, 2, 2, 2}));
        assertTrue(APQuiz04.sum28(new int[]{1, 2, 2, 2, 2, 4}));
        assertFalse(APQuiz04.sum28(new int[]{}));
        assertFalse(APQuiz04.sum28(new int[]{2}));
        assertFalse(APQuiz04.sum28(new int[]{8}));
        assertFalse(APQuiz04.sum28(new int[]{2, 2, 2}));
        assertFalse(APQuiz04.sum28(new int[]{2, 2, 2, 2, 2}));
        assertTrue(APQuiz04.sum28(new int[]{1, 2, 2, 1, 2, 2}));
        assertTrue(APQuiz04.sum28(new int[]{5, 2, 2, 2, 4, 2}));
    }

    /**
     * < Q11 >
     * Tests the changePi method.
     */
    @Test
    public void testChangePi() {
        assertEquals("x3.14x", APQuiz04.changePi("xpix"));
        assertEquals("3.143.14", APQuiz04.changePi("pipi"));
        assertEquals("3.14p", APQuiz04.changePi("pip"));
        assertEquals("3.14", APQuiz04.changePi("pi"));
        assertEquals("hip", APQuiz04.changePi("hip"));
        assertEquals("p", APQuiz04.changePi("p"));
        assertEquals("x", APQuiz04.changePi("x"));
        assertEquals("", APQuiz04.changePi(""));
        assertEquals("3.14xx", APQuiz04.changePi("pixx"));
        assertEquals("xyzzy", APQuiz04.changePi("xyzzy"));
    }

    /**
     * < Q12 >
     * Tests the noX method.
     */
    @Test
    public void testNoX() {
        assertEquals("ab", APQuiz04.noX("xaxb"));
        assertEquals("abc", APQuiz04.noX("abc"));
        assertEquals("", APQuiz04.noX("xx"));
        assertEquals("", APQuiz04.noX(""));
        assertEquals("ab", APQuiz04.noX("axxbxx"));
        assertEquals("Hello", APQuiz04.noX("Hellox"));
    }

    /**
     * < Q13 >
     * Tests the array6 method.
     */
    @Test
    public void testArray6() {
        assertTrue(APQuiz04.array6(new int[]{1, 6, 4}, 0));
        assertFalse(APQuiz04.array6(new int[]{1, 4}, 0));
        assertTrue(APQuiz04.array6(new int[]{6}, 0));
        assertFalse(APQuiz04.array6(new int[]{}, 0));
        assertTrue(APQuiz04.array6(new int[]{6, 2, 2}, 0));
        assertFalse(APQuiz04.array6(new int[]{2, 5}, 0));
        assertTrue(APQuiz04.array6(new int[]{1, 9, 4, 6, 6}, 0));
        assertTrue(APQuiz04.array6(new int[]{2, 5, 6}, 0));
    }

    /**
     * < Q14 >
     * Tests the array11 method.
     */
    @Test
    public void testArray11() {
        assertEquals(1, APQuiz04.array11(new int[]{1, 2, 11}, 0));
        assertEquals(2, APQuiz04.array11(new int[]{11, 11}, 0));
        assertEquals(0, APQuiz04.array11(new int[]{1, 2, 3, 4}, 0));
        assertEquals(3, APQuiz04.array11(new int[]{1, 11, 3, 11, 11}, 0));
        assertEquals(1, APQuiz04.array11(new int[]{11}, 0));
        assertEquals(0, APQuiz04.array11(new int[]{1}, 0));
        assertEquals(0, APQuiz04.array11(new int[]{}, 0));
        assertEquals(2, APQuiz04.array11(new int[]{11, 2, 3, 4, 11, 5}, 0));
        assertEquals(2, APQuiz04.array11(new int[]{11, 5, 11}, 0));
    }
}
