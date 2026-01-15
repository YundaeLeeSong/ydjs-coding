/**
INSTRUCTIONS: 
    The APQuiz10Test class provides JUnit tests for the methods 
    in the APQuiz10 class.



COMPILE & EXECUTE & CLEANUP (Java):

     javac     -d out           -cp junit-1.9.3.jar     APQuiz10*.java
     java -jar junit-1.9.3.jar  --class-path "out"      --scan-classpath
     rm -rf out/

COMPILE & EXECUTE & CLEANUP (Java x Kotlin):

     javac     -d out   -cp junit-1.9.3.jar             APQuiz10*.java
     kotlinc    -d out                                  APQuiz10*.kt
     java -jar junit-1.9.3.jar --class-path "./out:$KOTLIN_HOME/lib/kotlin-stdlib.jar" --scan-classpath
     rm -rf out/


TIP:
     - On Windows, use ';' as the classpath separator
     - On Mac/Linux, use ':' as the classpath separator
     - java   `-cp` (Mac/Linux) flag must sepcify absolute paths.
     - kotlin `-cp` (Windows) flag accepts relative paths.
 */

// File: APQuiz10Test.java
// JDK-17: https://developers.redhat.com/products/openjdk/download?sc_cid=701f2000000RWTnAAO
// JUnit: https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter/5.10.0
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class APQuiz10Test {
    
    /**
     * < Q1 >
     * Tests the evenlySpaced method.
     */
    @Test
    public void testEvenlySpaced() {
        assertTrue(APQuiz10.evenlySpaced(2, 4, 6));
        assertTrue(APQuiz10.evenlySpaced(4, 6, 2));
        assertFalse(APQuiz10.evenlySpaced(4, 6, 3));
        assertTrue(APQuiz10.evenlySpaced(6, 2, 4));
        assertFalse(APQuiz10.evenlySpaced(6, 2, 8));
        assertTrue(APQuiz10.evenlySpaced(2, 2, 2));
        assertFalse(APQuiz10.evenlySpaced(2, 2, 3));
        assertTrue(APQuiz10.evenlySpaced(9, 10, 11));
        assertTrue(APQuiz10.evenlySpaced(10, 9, 11));
        assertFalse(APQuiz10.evenlySpaced(10, 9, 9));
        assertFalse(APQuiz10.evenlySpaced(2, 4, 4));
        assertFalse(APQuiz10.evenlySpaced(2, 2, 4));
        assertFalse(APQuiz10.evenlySpaced(3, 6, 12));
        assertFalse(APQuiz10.evenlySpaced(12, 3, 6));
    }

    /**
     * < Q2 >
     * Tests the makeChocolate method.
     */
    @Test
    public void testMakeChocolate() {
        assertEquals(4, APQuiz10.makeChocolate(4, 1, 9));
        assertEquals(-1, APQuiz10.makeChocolate(4, 1, 10));
        assertEquals(2, APQuiz10.makeChocolate(4, 1, 7));
        assertEquals(2, APQuiz10.makeChocolate(6, 2, 7));
        assertEquals(0, APQuiz10.makeChocolate(4, 1, 5));
        assertEquals(4, APQuiz10.makeChocolate(4, 1, 4));
        assertEquals(4, APQuiz10.makeChocolate(5, 4, 9));
        assertEquals(3, APQuiz10.makeChocolate(9, 3, 18));
        assertEquals(-1, APQuiz10.makeChocolate(3, 1, 9));
        assertEquals(-1, APQuiz10.makeChocolate(1, 2, 7));
        assertEquals(1, APQuiz10.makeChocolate(1, 2, 6));
        assertEquals(0, APQuiz10.makeChocolate(1, 2, 5));
        assertEquals(5, APQuiz10.makeChocolate(6, 1, 10));
        assertEquals(6, APQuiz10.makeChocolate(6, 1, 11));
        assertEquals(-1, APQuiz10.makeChocolate(6, 1, 12));
        assertEquals(-1, APQuiz10.makeChocolate(6, 1, 13));
        assertEquals(0, APQuiz10.makeChocolate(6, 2, 10));
        assertEquals(1, APQuiz10.makeChocolate(6, 2, 11));
        assertEquals(2, APQuiz10.makeChocolate(6, 2, 12));
        assertEquals(50, APQuiz10.makeChocolate(60, 100, 550));
        assertEquals(6, APQuiz10.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, APQuiz10.makeChocolate(7, 1, 12));
        assertEquals(-1, APQuiz10.makeChocolate(7, 1, 13));
        assertEquals(3, APQuiz10.makeChocolate(7, 2, 13));
    }

    /**
     * < Q3 >
     * Tests the sumNumbers method.
     */
    @Test
    public void testSumNumbers() {
        assertEquals(123, APQuiz10.sumNumbers("abc123xyz"));
        assertEquals(44, APQuiz10.sumNumbers("aa11b33"));
        assertEquals(18, APQuiz10.sumNumbers("7 11"));
        assertEquals(0, APQuiz10.sumNumbers("Chocolate"));
        assertEquals(7, APQuiz10.sumNumbers("5hoco1a1e"));
        assertEquals(7, APQuiz10.sumNumbers("5$1; ;1!!"));
        assertEquals(1245, APQuiz10.sumNumbers("a1234bb11"));
        assertEquals(0, APQuiz10.sumNumbers(""));
        assertEquals(25, APQuiz10.sumNumbers("a22bbb3"));
    }

    /**
     * < Q4 >
     * Tests the maxMirror method.
     */
    @Test
    public void testMaxMirror() {
        assertEquals(3, APQuiz10.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
        assertEquals(3, APQuiz10.maxMirror(new int[]{1, 2, 1, 4}));
        assertEquals(2, APQuiz10.maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1}));
        assertEquals(4, APQuiz10.maxMirror(new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
        assertEquals(4, APQuiz10.maxMirror(new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}));
        assertEquals(5, APQuiz10.maxMirror(new int[]{1, 2, 3, 2, 1}));
        assertEquals(2, APQuiz10.maxMirror(new int[]{1, 2, 3, 3, 8}));
        assertEquals(2, APQuiz10.maxMirror(new int[]{1, 2, 7, 8, 1, 7, 2}));
        assertEquals(3, APQuiz10.maxMirror(new int[]{1, 1, 1}));
        assertEquals(1, APQuiz10.maxMirror(new int[]{1}));
        assertEquals(0, APQuiz10.maxMirror(new int[]{}));
        assertEquals(3, APQuiz10.maxMirror(new int[]{9, 1, 1, 4, 2, 1, 1, 1}));
        assertEquals(7, APQuiz10.maxMirror(new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2}));
        assertEquals(2, APQuiz10.maxMirror(new int[]{5, 9, 9, 6, 5, 4, 9, 9, 2}));
        assertEquals(3, APQuiz10.maxMirror(new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5}));
    }

    /**
     * < Q5 >
     * Tests the starOut method.
     */
    @Test
    public void testStarOut() {
        assertEquals("ad", APQuiz10.starOut("ab*cd"));
        assertEquals("ad", APQuiz10.starOut("ab**cd"));
        assertEquals("silly", APQuiz10.starOut("sm*eilly"));
        assertEquals("siy", APQuiz10.starOut("sm*eil*ly"));
        assertEquals("siy", APQuiz10.starOut("sm**eil*ly"));
        assertEquals("siy", APQuiz10.starOut("sm***eil*ly"));
        assertEquals("string", APQuiz10.starOut("stringy*"));
        assertEquals("tringy", APQuiz10.starOut("*stringy"));
        assertEquals("ty", APQuiz10.starOut("*str*in*gy"));
        assertEquals("abc", APQuiz10.starOut("abc"));
        assertEquals("c", APQuiz10.starOut("a*bc"));
        assertEquals("ab", APQuiz10.starOut("ab"));
        assertEquals("", APQuiz10.starOut("a*b"));
        assertEquals("a", APQuiz10.starOut("a"));
        assertEquals("", APQuiz10.starOut("a*"));
        assertEquals("", APQuiz10.starOut("*a"));
        assertEquals("", APQuiz10.starOut("*"));
        assertEquals("", APQuiz10.starOut(""));
    }

    /**
     * < Q6 >
     * Tests the notReplace method.
     */
    @Test
    public void testNotReplace() {
        assertEquals("is not test", APQuiz10.notReplace("is test"));
        assertEquals("is not-is not", APQuiz10.notReplace("is-is"));
        assertEquals("This is not right", APQuiz10.notReplace("This is right"));
        assertEquals("This is not isabell", APQuiz10.notReplace("This is isabell"));
        assertEquals("", APQuiz10.notReplace(""));
        assertEquals("is not", APQuiz10.notReplace("is"));
        assertEquals("isis", APQuiz10.notReplace("isis"));
        assertEquals("Dis is not bliss is not", APQuiz10.notReplace("Dis is bliss is"));
        assertEquals("is not his", APQuiz10.notReplace("is his"));
        assertEquals("xis yis", APQuiz10.notReplace("xis yis"));
        assertEquals("AAAis is not", APQuiz10.notReplace("AAAis is"));
    }

    /**
     * < Q7 >
     * Tests the countClumps method.
     */
    @Test
    public void testCountClumps() {
        assertEquals(2, APQuiz10.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        assertEquals(2, APQuiz10.countClumps(new int[]{1, 1, 2, 1, 1}));
        assertEquals(1, APQuiz10.countClumps(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, APQuiz10.countClumps(new int[]{1, 2, 3}));
        assertEquals(4, APQuiz10.countClumps(new int[]{2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(4, APQuiz10.countClumps(new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(5, APQuiz10.countClumps(new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(5, APQuiz10.countClumps(new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}));
        assertEquals(0, APQuiz10.countClumps(new int[]{}));
    }

    /**
     * < Q8 >
     * Tests the evenOdd method.
     */
    @Test
    public void testEvenOdd() {
        assertArrayEquals(new int[]{0, 0, 0, 1, 1, 1, 1}, APQuiz10.evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}));
        assertArrayEquals(new int[]{2, 3, 3}, APQuiz10.evenOdd(new int[]{3, 3, 2}));
        assertArrayEquals(new int[]{2, 2, 2}, APQuiz10.evenOdd(new int[]{2, 2, 2}));
        assertArrayEquals(new int[]{2, 2, 3}, APQuiz10.evenOdd(new int[]{3, 2, 2}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 1}, APQuiz10.evenOdd(new int[]{1, 1, 0, 1, 0}));
        assertArrayEquals(new int[]{1}, APQuiz10.evenOdd(new int[]{1}));
        assertArrayEquals(new int[]{2, 1}, APQuiz10.evenOdd(new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 1}, APQuiz10.evenOdd(new int[]{2, 1}));
        assertArrayEquals(new int[]{}, APQuiz10.evenOdd(new int[]{}));
    }

    /**
     * < Q9 >
     * Tests the fizzBuzz method.
     */
    @Test
    public void testFizzBuzz() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, APQuiz10.fizzBuzz(1, 6));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, APQuiz10.fizzBuzz(1, 8));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, APQuiz10.fizzBuzz(1, 11));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, APQuiz10.fizzBuzz(1, 16));
        assertArrayEquals(new String[]{"1", "2", "Fizz"}, APQuiz10.fizzBuzz(1, 4));
        assertArrayEquals(new String[]{"1"}, APQuiz10.fizzBuzz(1, 2));
        assertArrayEquals(new String[]{"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}, APQuiz10.fizzBuzz(50, 56));
        assertArrayEquals(new String[]{"FizzBuzz", "16"}, APQuiz10.fizzBuzz(15, 17));
        assertArrayEquals(new String[]{"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}, APQuiz10.fizzBuzz(30, 36));
        assertArrayEquals(new String[]{"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}, APQuiz10.fizzBuzz(1000, 1006));
        assertArrayEquals(new String[]{"Fizz", "Buzz", "101"}, APQuiz10.fizzBuzz(99, 102));
        assertArrayEquals(new String[]{"14", "FizzBuzz", "16", "17", "Fizz", "19"}, APQuiz10.fizzBuzz(14, 20));
    }

    /**
     * < Q10 >
     * Tests the longestConsecutive method.
     */
    @Test
    public void testLongestConsecutive() {
        assertEquals(0, APQuiz10.longestConsecutive(new int[]{}));
        assertEquals(1, APQuiz10.longestConsecutive(new int[]{42}));
        assertEquals(4, APQuiz10.longestConsecutive(new int[]{1, 2, 3, 4}));
        assertEquals(4, APQuiz10.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        assertEquals(5, APQuiz10.longestConsecutive(new int[]{0, -1, 1, 2, -2, 5}));
        assertEquals(3, APQuiz10.longestConsecutive(new int[]{1, 1, 2, 2, 3, 3}));
        assertEquals(3, APQuiz10.longestConsecutive(new int[]{10, 5, 6, 7, 100}));
    }

    /**
     * < Q11 >
     * Tests the splitOdd10 method.
     */
    @Test
    public void testSplitOdd10() {
        assertTrue(APQuiz10.splitOdd10(new int[]{5, 5, 5}));
        assertFalse(APQuiz10.splitOdd10(new int[]{5, 5, 6}));
        assertTrue(APQuiz10.splitOdd10(new int[]{5, 5, 6, 1}));
        assertTrue(APQuiz10.splitOdd10(new int[]{6, 5, 5, 1}));
        assertTrue(APQuiz10.splitOdd10(new int[]{6, 5, 5, 1, 10}));
        assertFalse(APQuiz10.splitOdd10(new int[]{6, 5, 5, 5, 1}));
        assertTrue(APQuiz10.splitOdd10(new int[]{1}));
        assertFalse(APQuiz10.splitOdd10(new int[]{}));
        assertTrue(APQuiz10.splitOdd10(new int[]{10, 7, 5, 5}));
        assertFalse(APQuiz10.splitOdd10(new int[]{10, 0, 5, 5}));
        assertTrue(APQuiz10.splitOdd10(new int[]{10, 7, 5, 5, 2}));
        assertFalse(APQuiz10.splitOdd10(new int[]{10, 7, 5, 5, 1}));
    }

    /**
     * < Q12 >
     * Tests the split53 method.
     */
    @Test
    public void testSplit53() {
        assertTrue(APQuiz10.split53(new int[]{1, 1}));
        assertFalse(APQuiz10.split53(new int[]{1, 1, 1}));
        assertTrue(APQuiz10.split53(new int[]{2, 4, 2}));
        assertFalse(APQuiz10.split53(new int[]{2, 2, 2, 1}));
        assertTrue(APQuiz10.split53(new int[]{3, 3, 5, 1}));
        assertFalse(APQuiz10.split53(new int[]{3, 5, 8}));
        assertTrue(APQuiz10.split53(new int[]{2, 4, 6}));
        assertTrue(APQuiz10.split53(new int[]{3, 5, 6, 10, 3, 3}));
    }

    /**
     * < Q13 >
     * Tests the power method.
     */
    @Test
    public void testPower() {
        assertEquals(1, APQuiz10.power(2, 0));
        assertEquals(1, APQuiz10.power(5, 0));
        assertEquals(1, APQuiz10.power(100, 0));
        assertEquals(2, APQuiz10.power(2, 1));
        assertEquals(7, APQuiz10.power(7, 1));
        assertEquals(42, APQuiz10.power(42, 1));
        assertEquals(4, APQuiz10.power(2, 2));
        assertEquals(8, APQuiz10.power(2, 3));
        assertEquals(16, APQuiz10.power(2, 4));
        assertEquals(9, APQuiz10.power(3, 2));
        assertEquals(27, APQuiz10.power(3, 3));
        assertEquals(125, APQuiz10.power(5, 3));
        assertEquals(256, APQuiz10.power(2, 8));
        assertEquals(1024, APQuiz10.power(2, 10));
        assertEquals(81, APQuiz10.power(3, 4));
        assertEquals(15625, APQuiz10.power(5, 6));
        assertEquals(128, APQuiz10.power(2, 7));
        assertEquals(512, APQuiz10.power(2, 9));
        assertEquals(243, APQuiz10.power(3, 5));
        assertEquals(78125, APQuiz10.power(5, 7));
        assertEquals(65536, APQuiz10.power(2, 16));
        assertEquals(1048576, APQuiz10.power(2, 20));
        assertEquals(59049, APQuiz10.power(3, 10));
        assertEquals(1000000, APQuiz10.power(10, 6));
        assertEquals(1, APQuiz10.power(0, 0));
        assertEquals(0, APQuiz10.power(0, 1));
        assertEquals(0, APQuiz10.power(0, 5));
        assertEquals(1, APQuiz10.power(1, 0));
        assertEquals(1, APQuiz10.power(1, 100));
        assertEquals(1, APQuiz10.power(-1, 0));
        assertEquals(-1, APQuiz10.power(-1, 1));
        assertEquals(1, APQuiz10.power(-1, 2));
        assertEquals(-1, APQuiz10.power(-1, 3));
        assertEquals(4, APQuiz10.power(-2, 2));
        assertEquals(-8, APQuiz10.power(-2, 3));
        assertEquals(81, APQuiz10.power(-3, 4));
        assertEquals(-243, APQuiz10.power(-3, 5));
    }

    /**
     * < Q14 >
     * Tests the fibonacci method.
     */
    @Test
    public void testFibonacci() {
        assertEquals(0, APQuiz10.fibonacci(0));
        assertEquals(1, APQuiz10.fibonacci(1));
        assertEquals(1, APQuiz10.fibonacci(2));
        assertEquals(2, APQuiz10.fibonacci(3));
        assertEquals(3, APQuiz10.fibonacci(4));
        assertEquals(5, APQuiz10.fibonacci(5));
        assertEquals(8, APQuiz10.fibonacci(6));
        assertEquals(13, APQuiz10.fibonacci(7));
        assertEquals(55, APQuiz10.fibonacci(10));
        assertEquals(610, APQuiz10.fibonacci(15));
    }

    /**
     * < Q15 >
     * Tests the climbStairs method.
     */
    @Test
    public void testClimbStairs() {
        assertEquals(1, APQuiz10.climbStairs(1));
        assertEquals(2, APQuiz10.climbStairs(2));
        assertEquals(3, APQuiz10.climbStairs(3));
        assertEquals(5, APQuiz10.climbStairs(4));
        assertEquals(8, APQuiz10.climbStairs(5));
        assertEquals(13, APQuiz10.climbStairs(6));
        assertEquals(21, APQuiz10.climbStairs(7));
        assertEquals(34, APQuiz10.climbStairs(8));
        assertEquals(89, APQuiz10.climbStairs(10));
        assertEquals(0, APQuiz10.climbStairs(0));
        assertEquals(10946, APQuiz10.climbStairs(20));
    }

    /**
     * < Q16 >
     * Tests the quickSort method.
     */
    @Test
    public void testQuickSort() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 6, 8, 10}, APQuiz10.quickSort(new int[]{3, 6, 8, 10, 1, 2, 1}));
        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, APQuiz10.quickSort(new int[]{38, 27, 43, 3, 9, 82, 10}));
        assertArrayEquals(new int[]{1, 2, 5, 8, 9}, APQuiz10.quickSort(new int[]{5, 2, 8, 1, 9}));
        assertArrayEquals(new int[]{}, APQuiz10.quickSort(new int[]{}));
        assertArrayEquals(new int[]{1}, APQuiz10.quickSort(new int[]{1}));
        assertArrayEquals(new int[]{5, 5, 5, 5}, APQuiz10.quickSort(new int[]{5, 5, 5, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, APQuiz10.quickSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, APQuiz10.quickSort(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, APQuiz10.quickSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{7, 8, 9, 10}, APQuiz10.quickSort(new int[]{10, 9, 8, 7}));
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1}, APQuiz10.quickSort(new int[]{-3, -1, -2, 0, 1}));
        assertArrayEquals(new int[]{-3, -1, 0, 2, 5}, APQuiz10.quickSort(new int[]{5, -3, 2, -1, 0}));
    }

    /**
     * < Q17 >
     * Tests the mergeSort method.
     */
    @Test
    public void testMergeSort() {
        assertArrayEquals(new int[]{3, 9, 10, 27, 38, 43, 82}, APQuiz10.mergeSort(new int[]{38, 27, 43, 3, 9, 82, 10}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 6, 8, 10}, APQuiz10.mergeSort(new int[]{3, 6, 8, 10, 1, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 5, 8, 9}, APQuiz10.mergeSort(new int[]{5, 2, 8, 1, 9}));
        assertArrayEquals(new int[]{}, APQuiz10.mergeSort(new int[]{}));
        assertArrayEquals(new int[]{1}, APQuiz10.mergeSort(new int[]{1}));
        assertArrayEquals(new int[]{5, 5, 5, 5}, APQuiz10.mergeSort(new int[]{5, 5, 5, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, APQuiz10.mergeSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, APQuiz10.mergeSort(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, APQuiz10.mergeSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{7, 8, 9, 10}, APQuiz10.mergeSort(new int[]{10, 9, 8, 7}));
        assertArrayEquals(new int[]{-3, -2, -1, 0, 1}, APQuiz10.mergeSort(new int[]{-3, -1, -2, 0, 1}));
        assertArrayEquals(new int[]{-3, -1, 0, 2, 5}, APQuiz10.mergeSort(new int[]{5, -3, 2, -1, 0}));
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = 100 - i;
        }
        int[] expected = new int[100];
        for (int i = 0; i < 100; i++) {
            expected[i] = i + 1;
        }
        assertArrayEquals(expected, APQuiz10.mergeSort(arr));
    }

    /**
     * < Q18 >
     * Tests the merge method.
     */
    @Test
    public void testMerge() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, APQuiz10.merge(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, APQuiz10.merge(new int[]{2, 4}, new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, APQuiz10.merge(new int[]{1, 3, 5}, new int[]{2, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, APQuiz10.merge(new int[]{}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, APQuiz10.merge(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{}, APQuiz10.merge(new int[]{}, new int[]{}));
        assertArrayEquals(new int[]{1, 2}, APQuiz10.merge(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2}, APQuiz10.merge(new int[]{2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, APQuiz10.merge(new int[]{1}, new int[]{}));
        assertArrayEquals(new int[]{1}, APQuiz10.merge(new int[]{}, new int[]{1}));
        assertArrayEquals(new int[]{1, 1, 1, 2, 2, 2}, APQuiz10.merge(new int[]{1, 1, 2}, new int[]{1, 2, 2}));
        assertArrayEquals(new int[]{1, 1, 2, 2}, APQuiz10.merge(new int[]{2, 2}, new int[]{1, 1}));
        assertArrayEquals(new int[]{-3, -2, -1, 0}, APQuiz10.merge(new int[]{-3, -1}, new int[]{-2, 0}));
        assertArrayEquals(new int[]{-2, -1, 0, 1, 2}, APQuiz10.merge(new int[]{-1, 1}, new int[]{-2, 0, 2}));
    }
}
