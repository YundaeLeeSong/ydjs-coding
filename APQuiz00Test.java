/**
INSTRUCTIONS: 
    The APQuiz01Test class provides JUnit tests for the recursive 
    methods in the APQuiz01 class.



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

public class APQuiz00Test {
    
    /**
     * < Q1 >
     * Tests the sleepIn method.
     */
    @Test
    public void testSleepIn() {
        assertTrue(APQuiz00.sleepIn(true, true));       // -> true
        assertFalse(APQuiz00.sleepIn(true, false));    // -> false
        assertTrue(APQuiz00.sleepIn(false, true));     // -> true
        assertTrue(APQuiz00.sleepIn(false, false));     // -> true
    }

    /**
     * < Q2 >
     * Tests the frontBack method.
     */
    @Test
    public void testFrontBack() {
        assertEquals("eodc", APQuiz00.frontBack("code"));            // -> "eodc"
        assertEquals("a", APQuiz00.frontBack("a"));                   // -> "a"
        assertEquals("ba", APQuiz00.frontBack("ab"));                // -> "ba"
        assertEquals("cba", APQuiz00.frontBack("abc"));              // -> "cba"
        assertEquals("", APQuiz00.frontBack(""));                    // -> ""
        assertEquals("ehocolatC", APQuiz00.frontBack("Chocolate"));   // -> "ehocolatC"
        assertEquals("java", APQuiz00.frontBack("aavj"));            // -> "java"
        assertEquals("oellh", APQuiz00.frontBack("hello"));           // -> "oellh"
    }

    /**
     * < Q3 >
     * Tests the mixStart method.
     */
    @Test
    public void testMixStart() {
        assertTrue(APQuiz00.mixStart("mix snacks"));      // -> true
        assertTrue(APQuiz00.mixStart("pix snacks"));      // -> true
        assertFalse(APQuiz00.mixStart("piz snacks"));     // -> false
        assertTrue(APQuiz00.mixStart("nix"));              // -> true
        assertFalse(APQuiz00.mixStart("ni"));              // -> false
        assertFalse(APQuiz00.mixStart("n"));               // -> false
    }

    /**
     * < Q4 >
     * Tests the monkeyTrouble method.
     */
    @Test
    public void testMonkeyTrouble() {
        assertTrue(APQuiz00.monkeyTrouble(true, true));      // -> true
        assertTrue(APQuiz00.monkeyTrouble(false, false));  // -> true
        assertFalse(APQuiz00.monkeyTrouble(true, false));    // -> false
        assertFalse(APQuiz00.monkeyTrouble(false, true));   // -> false
    }

    /**
     * < Q5 >
     * Tests the front3 method.
     */
    @Test
    public void testFront3() {
        assertEquals("JavJavJav", APQuiz00.front3("Java"));           // -> "JavJavJav"
        assertEquals("ChoChoCho", APQuiz00.front3("Chocolate"));      // -> "ChoChoCho"
        assertEquals("abcabcabc", APQuiz00.front3("abc"));            // -> "abcabcabc"
        assertEquals("abcabcabc", APQuiz00.front3("abcXYZ"));        // -> "abcabcabc"
        assertEquals("ababab", APQuiz00.front3("ab"));                 // -> "ababab"
        assertEquals("aaa", APQuiz00.front3("a"));                    // -> "aaa"
        assertEquals("", APQuiz00.front3(""));                        // -> ""
    }

    /**
     * < Q6 >
     * Tests the startOz method.
     */
    @Test
    public void testStartOz() {
        assertEquals("oz", APQuiz00.startOz("ozymandias"));           // -> "oz"
        assertEquals("z", APQuiz00.startOz("bzoo"));                  // -> "z"
        assertEquals("o", APQuiz00.startOz("oxx"));                   // -> "o"
        assertEquals("o", APQuiz00.startOz("ounce"));                 // -> "o"
        assertEquals("o", APQuiz00.startOz("o"));                     // -> "o"
        assertEquals("", APQuiz00.startOz("abc"));                    // -> ""
        assertEquals("", APQuiz00.startOz(""));                       // -> ""
        assertEquals("", APQuiz00.startOz("zoo"));                   // -> ""
        assertEquals("z", APQuiz00.startOz("aztec"));                 // -> "z"
        assertEquals("z", APQuiz00.startOz("zzzz"));                 // -> "z"
        assertEquals("oz", APQuiz00.startOz("oznic"));                // -> "oz"
    }

    /**
     * < Q7 >
     * Tests the sumDouble method.
     */
    @Test
    public void testSumDouble() {
        assertEquals(3, APQuiz00.sumDouble(1, 2));                    // -> 3
        assertEquals(5, APQuiz00.sumDouble(3, 2));                    // -> 5
        assertEquals(8, APQuiz00.sumDouble(2, 2));                    // -> 8
        assertEquals(-1, APQuiz00.sumDouble(-1, 0));                  // -> -1
        assertEquals(12, APQuiz00.sumDouble(3, 3));                  // -> 12
        assertEquals(0, APQuiz00.sumDouble(0, 0));                    // -> 0
        assertEquals(1, APQuiz00.sumDouble(0, 1));                    // -> 1
        assertEquals(7, APQuiz00.sumDouble(3, 4));                    // -> 7
    }

    /**
     * < Q8 >
     * Tests the backAround method.
     */
    @Test
    public void testBackAround() {
        assertEquals("tcatt", APQuiz00.backAround("cat"));            // -> "tcatt"
        assertEquals("oHelloo", APQuiz00.backAround("Hello"));        // -> "oHelloo"
        assertEquals("aaa", APQuiz00.backAround("a"));                // -> "aaa"
        assertEquals("cabcc", APQuiz00.backAround("abc"));            // -> "cabcc"
        assertEquals("dreadd", APQuiz00.backAround("read"));          // -> "dreadd"
        assertEquals("obooo", APQuiz00.backAround("boo"));           // -> "obooo"
    }

    /**
     * < Q9 >
     * Tests the intMax method.
     */
    @Test
    public void testIntMax() {
        assertEquals(3, APQuiz00.intMax(1, 2, 3));                    // -> 3
        assertEquals(3, APQuiz00.intMax(1, 3, 2));                    // -> 3
        assertEquals(3, APQuiz00.intMax(3, 2, 1));                    // -> 3
        assertEquals(9, APQuiz00.intMax(9, 3, 3));                   // -> 9
        assertEquals(9, APQuiz00.intMax(3, 9, 3));                    // -> 9
        assertEquals(9, APQuiz00.intMax(3, 3, 9));                   // -> 9
        assertEquals(8, APQuiz00.intMax(8, 2, 3));                   // -> 8
        assertEquals(-1, APQuiz00.intMax(-3, -1, -2));               // -> -1
        assertEquals(6, APQuiz00.intMax(6, 2, 5));                    // -> 6
        assertEquals(6, APQuiz00.intMax(5, 6, 2));                    // -> 6
        assertEquals(6, APQuiz00.intMax(5, 2, 6));                    // -> 6
    }

    /**
     * < Q10 >
     * Tests the diff21 method.
     */
    @Test
    public void testDiff21() {
        assertEquals(2, APQuiz00.diff21(19));                         // -> 2
        assertEquals(11, APQuiz00.diff21(10));                       // -> 11
        assertEquals(0, APQuiz00.diff21(21));                        // -> 0
        assertEquals(2, APQuiz00.diff21(22));                        // -> 2
        assertEquals(8, APQuiz00.diff21(25));                         // -> 8
        assertEquals(18, APQuiz00.diff21(30));                        // -> 18
        assertEquals(21, APQuiz00.diff21(0));                         // -> 21
        assertEquals(20, APQuiz00.diff21(1));                         // -> 20
        assertEquals(19, APQuiz00.diff21(2));                        // -> 19
        assertEquals(22, APQuiz00.diff21(-1));                        // -> 22
        assertEquals(23, APQuiz00.diff21(-2));                        // -> 23
        assertEquals(58, APQuiz00.diff21(50));                        // -> 58
    }
}
