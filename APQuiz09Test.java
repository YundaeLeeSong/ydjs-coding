/**
INSTRUCTIONS: 
    The APQuiz09Test class provides JUnit tests for the methods 
    in the APQuiz09 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz09*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz09*.java
     kotlinc    -d out                                  APQuiz09*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz09Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz09Test {
    
    /**
     * < Q1 >
     * Tests the shiftLeft method.
     */
    @Test
    public void testShiftLeft() {
        assertArrayEquals(new int[]{2, 5, 3, 6}, APQuiz09.shiftLeft(new int[]{6, 2, 5, 3}));
        assertArrayEquals(new int[]{2, 1}, APQuiz09.shiftLeft(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, APQuiz09.shiftLeft(new int[]{1}));
        assertArrayEquals(new int[]{}, APQuiz09.shiftLeft(new int[]{}));
        assertArrayEquals(new int[]{1, 2, 2, 4, 1}, APQuiz09.shiftLeft(new int[]{1, 1, 2, 2, 4}));
        assertArrayEquals(new int[]{1, 1, 1}, APQuiz09.shiftLeft(new int[]{1, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 1}, APQuiz09.shiftLeft(new int[]{1, 2, 3}));
    }

    /**
     * < Q2 >
     * Tests the tenRun method.
     */
    @Test
    public void testTenRun() {
        assertArrayEquals(new int[]{2, 10, 10, 10, 20, 20}, APQuiz09.tenRun(new int[]{2, 10, 3, 4, 20, 5}));
        assertArrayEquals(new int[]{10, 10, 20, 20}, APQuiz09.tenRun(new int[]{10, 1, 20, 2}));
        assertArrayEquals(new int[]{10, 10, 10, 20}, APQuiz09.tenRun(new int[]{10, 1, 9, 20}));
        assertArrayEquals(new int[]{1, 2, 50, 50}, APQuiz09.tenRun(new int[]{1, 2, 50, 1}));
        assertArrayEquals(new int[]{1, 20, 50, 50}, APQuiz09.tenRun(new int[]{1, 20, 50, 1}));
        assertArrayEquals(new int[]{10, 10}, APQuiz09.tenRun(new int[]{10, 10}));
        assertArrayEquals(new int[]{10, 10}, APQuiz09.tenRun(new int[]{10, 2}));
        assertArrayEquals(new int[]{0, 0}, APQuiz09.tenRun(new int[]{0, 2}));
        assertArrayEquals(new int[]{1, 2}, APQuiz09.tenRun(new int[]{1, 2}));
        assertArrayEquals(new int[]{1}, APQuiz09.tenRun(new int[]{1}));
        assertArrayEquals(new int[]{}, APQuiz09.tenRun(new int[]{}));
    }

    /**
     * < Q3 >
     * Tests the pre4 method.
     */
    @Test
    public void testPre4() {
        assertArrayEquals(new int[]{1, 2}, APQuiz09.pre4(new int[]{1, 2, 4, 1}));
        assertArrayEquals(new int[]{3, 1}, APQuiz09.pre4(new int[]{3, 1, 4}));
        assertArrayEquals(new int[]{1}, APQuiz09.pre4(new int[]{1, 4, 4}));
        assertArrayEquals(new int[]{1}, APQuiz09.pre4(new int[]{1, 4, 4, 2}));
        assertArrayEquals(new int[]{1, 3}, APQuiz09.pre4(new int[]{1, 3, 4, 2, 4}));
        assertArrayEquals(new int[]{}, APQuiz09.pre4(new int[]{4, 4}));
        assertArrayEquals(new int[]{3, 3}, APQuiz09.pre4(new int[]{3, 3, 4}));
        assertArrayEquals(new int[]{1, 2, 1}, APQuiz09.pre4(new int[]{1, 2, 1, 4}));
        assertArrayEquals(new int[]{2, 1}, APQuiz09.pre4(new int[]{2, 1, 4, 2}));
        assertArrayEquals(new int[]{2, 1, 2, 1}, APQuiz09.pre4(new int[]{2, 1, 2, 1, 4, 2}));
    }

    /**
     * < Q4 >
     * Tests the blackjack method.
     */
    @Test
    public void testBlackjack() {
        assertEquals(21, APQuiz09.blackjack(19, 21));
        assertEquals(21, APQuiz09.blackjack(21, 19));
        assertEquals(19, APQuiz09.blackjack(19, 22));
        assertEquals(19, APQuiz09.blackjack(22, 19));
        assertEquals(0, APQuiz09.blackjack(22, 50));
        assertEquals(0, APQuiz09.blackjack(22, 22));
        assertEquals(1, APQuiz09.blackjack(33, 1));
        assertEquals(2, APQuiz09.blackjack(1, 2));
        assertEquals(0, APQuiz09.blackjack(34, 33));
        assertEquals(19, APQuiz09.blackjack(17, 19));
        assertEquals(18, APQuiz09.blackjack(18, 17));
        assertEquals(16, APQuiz09.blackjack(16, 23));
        assertEquals(4, APQuiz09.blackjack(3, 4));
        assertEquals(3, APQuiz09.blackjack(3, 2));
        assertEquals(21, APQuiz09.blackjack(21, 20));
    }

    /**
     * < Q5 >
     * Tests the maxBlock method.
     */
    @Test
    public void testMaxBlock() {
        assertEquals(2, APQuiz09.maxBlock("hoopla"));
        assertEquals(3, APQuiz09.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, APQuiz09.maxBlock(""));
        assertEquals(1, APQuiz09.maxBlock("xyz"));
        assertEquals(2, APQuiz09.maxBlock("xxyz"));
        assertEquals(2, APQuiz09.maxBlock("xyzz"));
        assertEquals(3, APQuiz09.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, APQuiz09.maxBlock("XXBBBbbxx"));
        assertEquals(4, APQuiz09.maxBlock("XXBBBBbbxx"));
        assertEquals(4, APQuiz09.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, APQuiz09.maxBlock("XX2222BBBbbXX2222"));
    }

    /**
     * < Q6 >
     * Tests the seriesUp method.
     */
    @Test
    public void testSeriesUp() {
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3}, APQuiz09.seriesUp(3));
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}, APQuiz09.seriesUp(4));
        assertArrayEquals(new int[]{1, 1, 2}, APQuiz09.seriesUp(2));
        assertArrayEquals(new int[]{1}, APQuiz09.seriesUp(1));
        assertArrayEquals(new int[]{}, APQuiz09.seriesUp(0));
        assertArrayEquals(new int[]{
            1, 1, 2, 1, 2, 3, 1, 2, 3, 4,
            1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6
        }, APQuiz09.seriesUp(6));
    }

    /**
     * < Q7 >
     * Tests the oneTwo method.
     */
    @Test
    public void testOneTwo() {
        assertEquals("bca", APQuiz09.oneTwo("abc"));
        assertEquals("cat", APQuiz09.oneTwo("tca"));
        assertEquals("catdog", APQuiz09.oneTwo("tcagdo"));
        assertEquals("hocolctea", APQuiz09.oneTwo("chocolate"));
        assertEquals("231564897", APQuiz09.oneTwo("1234567890"));
        assertEquals("abxabxabxabxabxabxabx", APQuiz09.oneTwo("xabxabxabxabxabxabxab"));
        assertEquals("bcaefd", APQuiz09.oneTwo("abcdefx"));
        assertEquals("bcaefd", APQuiz09.oneTwo("abcdefxy"));
        assertEquals("bcaefdyzx", APQuiz09.oneTwo("abcdefxyz"));
        assertEquals("", APQuiz09.oneTwo(""));
        assertEquals("", APQuiz09.oneTwo("x"));
        assertEquals("", APQuiz09.oneTwo("xy"));
        assertEquals("yzx", APQuiz09.oneTwo("xyz"));
        String longInput = "abcdefghijklkmnopqrstuvwxyz1234567890";
        String longExpected = "bcaefdhigkljmnkpqostrvwuyzx231564897";
        assertEquals(longExpected, APQuiz09.oneTwo(longInput));
        assertEquals(longExpected, APQuiz09.oneTwo(longInput.substring(0, longInput.length() - 1)));
        assertEquals(longExpected.substring(0, longExpected.length() - 3), APQuiz09.oneTwo(longInput.substring(0, longInput.length() - 2)));
    }

    /**
     * < Q8 >
     * Tests the zipZap method.
     */
    @Test
    public void testZipZap() {
        assertEquals("zpXzp", APQuiz09.zipZap("zipXzap"));
        assertEquals("zpzp", APQuiz09.zipZap("zopzop"));
        assertEquals("zzzpzp", APQuiz09.zipZap("zzzopzop"));
        assertEquals("zibzp", APQuiz09.zipZap("zibzap"));
        assertEquals("zp", APQuiz09.zipZap("zip"));
        assertEquals("zi", APQuiz09.zipZap("zi"));
        assertEquals("z", APQuiz09.zipZap("z"));
        assertEquals("", APQuiz09.zipZap(""));
        assertEquals("zp", APQuiz09.zipZap("zzp"));
        assertEquals("abcppp", APQuiz09.zipZap("abcppp"));
        assertEquals("azbcppp", APQuiz09.zipZap("azbcppp"));
        assertEquals("azbcpzp", APQuiz09.zipZap("azbcpzpp"));
    }

    /**
     * < Q9 >
     * Tests the post4 method.
     */
    @Test
    public void testPost4() {
        assertArrayEquals(new int[]{1, 2}, APQuiz09.post4(new int[]{2, 4, 1, 2}));
        assertArrayEquals(new int[]{2}, APQuiz09.post4(new int[]{4, 1, 4, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, APQuiz09.post4(new int[]{4, 4, 1, 2, 3}));
        assertArrayEquals(new int[]{2}, APQuiz09.post4(new int[]{4, 2}));
        assertArrayEquals(new int[]{3}, APQuiz09.post4(new int[]{4, 4, 3}));
        assertArrayEquals(new int[]{}, APQuiz09.post4(new int[]{4, 4}));
        assertArrayEquals(new int[]{}, APQuiz09.post4(new int[]{4}));
        assertArrayEquals(new int[]{3, 2}, APQuiz09.post4(new int[]{2, 4, 1, 4, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, APQuiz09.post4(new int[]{4, 1, 4, 2, 2, 2}));
        assertArrayEquals(new int[]{3, 2}, APQuiz09.post4(new int[]{3, 4, 3, 2}));
    }

    /**
     * < Q10 >
     * Tests the notAlone method.
     */
    @Test
    public void testNotAlone() {
        assertArrayEquals(new int[]{1, 3, 3}, APQuiz09.notAlone(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 3, 3, 5, 5, 2}, APQuiz09.notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2));
        assertArrayEquals(new int[]{3, 4}, APQuiz09.notAlone(new int[]{3, 4}, 3));
        assertArrayEquals(new int[]{3, 3}, APQuiz09.notAlone(new int[]{3, 3}, 3));
        assertArrayEquals(new int[]{1, 3, 3, 2}, APQuiz09.notAlone(new int[]{1, 3, 1, 2}, 1));
        assertArrayEquals(new int[]{3}, APQuiz09.notAlone(new int[]{3}, 3));
        assertArrayEquals(new int[]{}, APQuiz09.notAlone(new int[]{}, 3));
        assertArrayEquals(new int[]{7, 7, 6}, APQuiz09.notAlone(new int[]{7, 1, 6}, 1));
        assertArrayEquals(new int[]{1, 1, 1}, APQuiz09.notAlone(new int[]{1, 1, 1}, 1));
        assertArrayEquals(new int[]{1, 1, 1, 2}, APQuiz09.notAlone(new int[]{1, 1, 1, 2}, 1));
    }

    /**
     * < Q11 >
     * Tests the groupNoAdj method.
     */
    @Test
    public void testGroupNoAdj() {
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        assertFalse(APQuiz09.groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        assertFalse(APQuiz09.groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{2, 5, 10, 4}, 9));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 15));
        assertFalse(APQuiz09.groupNoAdj(0, new int[]{10, 2, 2, 3, 3}, 7));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{}, 0));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{1}, 1));
        assertFalse(APQuiz09.groupNoAdj(0, new int[]{9}, 1));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{9}, 0));
        assertTrue(APQuiz09.groupNoAdj(0, new int[]{5, 10, 4, 1}, 11));
    }

    /**
     * < Q12 >
     * Tests the groupSum5 method.
     */
    @Test
    public void testGroupSum5() {
        assertTrue(APQuiz09.groupSum5(0, new int[]{2, 5, 10, 4}, 19));
        assertTrue(APQuiz09.groupSum5(0, new int[]{2, 5, 10, 4}, 17));
        assertFalse(APQuiz09.groupSum5(0, new int[]{2, 5, 10, 4}, 12));
        assertFalse(APQuiz09.groupSum5(0, new int[]{2, 5, 4, 10}, 12));
        assertFalse(APQuiz09.groupSum5(0, new int[]{3, 5, 1}, 4));
        assertTrue(APQuiz09.groupSum5(0, new int[]{3, 5, 1}, 5));
        assertTrue(APQuiz09.groupSum5(0, new int[]{1, 3, 5}, 5));
        assertFalse(APQuiz09.groupSum5(0, new int[]{3, 5, 1}, 9));
        assertFalse(APQuiz09.groupSum5(0, new int[]{2, 5, 10, 4}, 7));
        assertTrue(APQuiz09.groupSum5(0, new int[]{2, 5, 10, 4}, 15));
        assertFalse(APQuiz09.groupSum5(0, new int[]{2, 5, 10, 4}, 11));
        assertTrue(APQuiz09.groupSum5(0, new int[]{1}, 1));
        assertFalse(APQuiz09.groupSum5(0, new int[]{9}, 1));
        assertTrue(APQuiz09.groupSum5(0, new int[]{9}, 0));
        assertTrue(APQuiz09.groupSum5(0, new int[]{}, 0));
    }

    /**
     * < Q13 >
     * Tests the groupSumClump method.
     */
    @Test
    public void testGroupSumClump() {
        assertTrue(APQuiz09.groupSumClump(0, new int[]{2, 4, 8}, 10));
        assertTrue(APQuiz09.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        assertFalse(APQuiz09.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
        assertTrue(APQuiz09.groupSumClump(0, new int[]{8, 2, 2, 1}, 9));
        assertFalse(APQuiz09.groupSumClump(0, new int[]{8, 2, 2, 1}, 11));
        assertTrue(APQuiz09.groupSumClump(0, new int[]{1}, 1));
        assertFalse(APQuiz09.groupSumClump(0, new int[]{9}, 1));
    }

    /**
     * < Q14 >
     * Tests the splitArray method.
     */
    @Test
    public void testSplitArray() {
        assertTrue(APQuiz09.splitArray(new int[]{2, 2}));
        assertFalse(APQuiz09.splitArray(new int[]{2, 3}));
        assertTrue(APQuiz09.splitArray(new int[]{5, 2, 3}));
        assertFalse(APQuiz09.splitArray(new int[]{5, 2, 2}));
        assertTrue(APQuiz09.splitArray(new int[]{1, 1, 1, 1, 1, 1}));
        assertFalse(APQuiz09.splitArray(new int[]{1, 1, 1, 1, 1}));
        assertTrue(APQuiz09.splitArray(new int[]{}));
        assertFalse(APQuiz09.splitArray(new int[]{1}));
        assertFalse(APQuiz09.splitArray(new int[]{3, 5}));
        assertTrue(APQuiz09.splitArray(new int[]{5, 3, 2}));
        assertTrue(APQuiz09.splitArray(new int[]{2, 2, 10, 10, 1, 1}));
        assertFalse(APQuiz09.splitArray(new int[]{1, 2, 2, 10, 10, 1, 1}));
        assertTrue(APQuiz09.splitArray(new int[]{1, 2, 3, 10, 10, 1, 1}));
    }
}
